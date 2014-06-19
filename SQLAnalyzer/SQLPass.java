
import java.io.Console;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SQLPass
{

    public SQLPass()
    {
        tempTableMap = new HashMap<String, TempTable>();
        tableHit = new HashMap<String, Boolean>();
        comps = new Vector<Compare>();
        row_count = 2000;
        insub = null;
    }

    public SQLPass(int row_count)
    {
        tempTableMap = new HashMap<String, TempTable>();
        tableHit = new HashMap<String, Boolean>();
        comps = new Vector<Compare>();
        this.row_count = row_count;
        insub = null;
    }

    public void AddAlia(String alia, String table)
    {
        table = table.toLowerCase();
        alia = alia.toLowerCase();
        if(table.contains("["))
            table = table.substring(1, table.length() - 1);
        if(table.contains("."))
        {
            String names[] = table.split("\\.");
            table = names[names.length - 1];
        }
        tableAlias.put(alia, table);
        tableHit.put(table, Boolean.valueOf(false));
    }

    public void AddTempTable(String tableName, TempTable tempTable)
    {
        tableName = tableName.toLowerCase();
        Map columns = tempTable.getColumns();
        String colName;
        TableColumn tableColumn;
        for(Iterator it = columns.entrySet().iterator(); it.hasNext(); tempTable.setColumn(colName, FindColumn(tableColumn)))
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)it.next();
            colName = (String)entry.getKey();
            tableColumn = (TableColumn)entry.getValue();
        }

        tempTableMap.put(tableName, tempTable);
    }

    int findPos(TableColumn col) throws IOException
	{
		String[] tables = FileUtils.readFile("create_table.sql").split(";");
		for(String table : tables)
		{
			String tablename = table.split(":")[0].split(" ")[2];
			if(tablename.toLowerCase().equals(col.GetTable()))
			{
				table = table.split("\\(")[1];
				table = table.substring(1, table.length() - 2);
				String[] columns = table.split(",\\n");
				for(int i = 0; i < columns.length; i++)
				{
					if(columns[i].split(" ")[0].toLowerCase().equals(col.GetColumn()))
					{
						return i;
					}
				}
			}
		}
		
		return -1;
	}

    boolean findInVal(TableColumn insub)
    {
        try
        {
            int key = findPos(insub);
            invalue = "";
            for(int i = 1; i <= 5; i++)
            {
            	String values[] = FileUtils.readLastNthLine((new StringBuilder(String.valueOf(insub.GetTable()))).append(".txt").toString(), i).split(",");
            	if(values == null || key == -1)
            		return false;
            	invalue += values[key];
            	if(i != 5)
            		invalue += ",";
            }
            return true;
        }
        catch(IOException e)
        {
            e.printStackTrace();
            return false;
        }
    }

    public void refrConsList()
    {
    	
    	for(Iterator it = consList.entrySet().iterator(); it.hasNext();)
    	{
    		java.util.Map.Entry entry = (java.util.Map.Entry)it.next();
            String tablecol = (String)entry.getKey();
            ConValues value = (ConValues)entry.getValue();
            TableColumn tabcol = new TableColumn(tablecol);
            
            if(value.checkRefresh())
            {
	            for(int j = 1; j <= row_count; j++)
	        	{
	            	Compare.writeConsList(tabcol, value, j);
	        	}
	            value.refreshed();
            }
    	}

    }
    
    public void ProcessOneSQL()
    {
    	if(refreshConsList)
    	{
    		refrConsList();
    		try {
				FileUtils.flushAll();
				FileUtils.clearFileMap();
	    		refreshConsList = false;
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
        if(comps.size() == 0)
            return;
        for(int i = 0; i < comps.size(); i++)
        {
        	
            for(Iterator it = consList.entrySet().iterator(); it.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)it.next();
                String tablecol = (String)entry.getKey();
                ConValues value = (ConValues)entry.getValue();
                TableColumn tabcol = new TableColumn(tablecol);
                if(((Compare)comps.get(i)).containsTable(tabcol))
                {
                    Compare comp = (Compare)comps.get(i);
                    comp.addCons(tabcol, value);
                    comps.set(i, comp);
                }
            }

        }

        try
        {
            for(int i = 0; i < comps.size(); i++)
            {
                HashMap tableHit_t = (HashMap)tableHit.clone();
                System.out.println("Processing constraint " + (i + 1) + "/" + comps.size());
                for(int j = 1; j <= row_count; j++)
                {
                    int f = GetCompStatus((Compare)comps.get(i));
                    ((Compare)comps.get(i)).process(f, j);
                    tableHit.put(((Compare)comps.get(i)).getCol1().GetTable(), Boolean.valueOf(true));
                    tableHit.put(((Compare)comps.get(i)).getCol2().GetTable(), Boolean.valueOf(true));
                }

                tableHit = (HashMap)tableHit_t.clone();
            }

            FileUtils.flushAll();
            FileUtils.clearFileMap();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        comps.clear();
    }

    public void rearrange()
    {
        int status[] = new int[comps.size()];
        for(int i = 0; i < comps.size(); i++)
        {
            status[i] = GetCompStatus((Compare)comps.get(i));
            tableHit.put(((Compare)comps.get(i)).getCol1().GetTable(), Boolean.valueOf(true));
            tableHit.put(((Compare)comps.get(i)).getCol2().GetTable(), Boolean.valueOf(true));
        }

        for(int i = 0; i < comps.size(); i++)
            if(status[i] == 3)
                break;

        comps1 = new Vector<Compare>();
    }

    public void findRelated(int pos)
    {
        comps1.add((Compare)comps.get(pos));
        comps.remove(pos);
    }

    public int GetCompStatus(Compare comp)
    {
    	if(!tableHit.containsKey(comp.getCol1().GetTable()) || !tableHit.containsKey(comp.getCol2().GetTable()))
    		return 0;
        if(((Boolean)tableHit.get(comp.getCol1().GetTable())).booleanValue() && ((Boolean)tableHit.get(comp.getCol2().GetTable())).booleanValue())
            return 3;
        if(!((Boolean)tableHit.get(comp.getCol1().GetTable())).booleanValue() && ((Boolean)tableHit.get(comp.getCol2().GetTable())).booleanValue())
            return 2;
        return !((Boolean)tableHit.get(comp.getCol1().GetTable())).booleanValue() || ((Boolean)tableHit.get(comp.getCol2().GetTable())).booleanValue() ? 0 : 1;
    }

    public String[] joinExpr(String col2String, String operator)
    {
        String res[] = new String[3];
        if(col2String.charAt(0) == '(')
            col2String = col2String.substring(1, col2String.length() - 1);
        if(col2String.contains("+"))
        {
            res[0] = col2String.split("\\+")[0].trim();
            res[1] = col2String.split("\\+")[1].trim();
            res[2] = ">";
            if(operator.equals("<"))
                res[1] = (new StringBuilder()).append(Integer.parseInt(res[1]) - 1).toString();
            else
            if(operator.equals(">"))
                res[1] = (new StringBuilder()).append(Integer.parseInt(res[1]) + 1).toString();
            else if(operator.equals("<>") || operator.equals("!="))
            	res[2] = "<>";
        } else
        if(col2String.contains("-"))
        {
            res[0] = col2String.split("-")[0].trim();
            res[1] = col2String.split("-")[1].trim();
            res[2] = "<";
            if(operator.equals("<"))
                res[1] = (new StringBuilder()).append(Integer.parseInt(res[1]) + 1).toString();
            else
            if(operator.equals(">"))
                res[1] = (new StringBuilder()).append(Integer.parseInt(res[1]) - 1).toString();
            else if(operator.equals("<>") || operator.equals("!="))
            	res[2] = "<>";
        } else
        if(col2String.contains("*"))
        {
            res[0] = col2String.split("\\*")[0].trim();
            res[1] = col2String.split("\\*")[1].trim();
            res[2] = "*";
            if(operator.equals("<"))
                res[1] = (new StringBuilder()).append(Integer.parseInt(res[1]) - 1).toString();
            else
            if(operator.equals(">"))
                res[1] = (new StringBuilder()).append(Integer.parseInt(res[1]) + 1).toString();
            else if(operator.equals("<>") || operator.equals("!="))
            	res[2] = "<>";
        } else
        if(col2String.contains("/"))
        {
            res[0] = col2String.split("/")[0].trim();
            res[1] = col2String.split("/")[1].trim();
            res[2] = "/";
            if(operator.equals("<"))
                res[1] = (new StringBuilder()).append(Integer.parseInt(res[1]) + 1).toString();
            else
            if(operator.equals(">"))
                res[1] = (new StringBuilder()).append(Integer.parseInt(res[1]) - 1).toString();
            else if(operator.equals("<>") || operator.equals("!="))
            	res[2] = "<>";
        }
        return res;
    }

    public String dealwithFunction(String func)
    {
        if(!func.contains("("))
            return func;
        if(func.charAt(0) == '(' || func.contains("select") || func.contains("Select") || func.contains("SELECT"))
        {
            return func;
        } else
        {
            func = func.substring(func.lastIndexOf('(', func.indexOf(')')) + 1, func.indexOf(')'));
            return func.split(",")[0];
        }
    }

    public static boolean isDouble(String str)
    {
        Pattern pattern = Pattern.compile("^[-\\+]?[.\\d]*$");
        return pattern.matcher(str).matches();
    }

    public String ProcessExpression(String operator, String expr)
    {
        int offset = 0;
        if(operator == null)
            return null;
        String col1String = expr.split(operator)[0].trim();
        String col2String = expr.split(operator)[1].trim();
        if(col1String.contains("sum") || col1String.contains("SUM"))
            return null;
        col1String = dealwithFunction(col1String);
        col2String = dealwithFunction(col2String);
        if(col1String.contains("+") || col1String.contains("-") || col1String.contains("*") || col1String.contains("/"))
        {
            String tmpString = col1String;
            col1String = col2String;
            col2String = tmpString;
            if(operator.equals(">"))
                operator = "<";
            else
            if(operator.equals("<"))
                operator = ">";
        }
        TableColumn col1 = new TableColumn(col1String);
        if(col2String.contains("select") || col2String.contains("Select") || col2String.contains("SELECT"))
        {
        	if(insub != null)
        	{
	            FileUtils.keepLastLine((new StringBuilder(String.valueOf(insub.GetTable()))).append(".txt").toString());
	            col2String = invalue.split(",")[0];
        	}
        	else if(exsub != null)
        	{
        		if(findInVal(exsub))
        		{
        			col2String = invalue.split(",")[0];
        			FileUtils.keepLastLine((new StringBuilder(String.valueOf(exsub.GetTable()))).append(".txt").toString());
        		}
       			exsub = null;
        	}
 //           return (new StringBuilder(String.valueOf(col1.toString()))).append(operator).append(col2String).toString();
        }
        if(col2String.contains("'"))
            col2String = col2String.replaceAll("'", "");
        if(col2String.contains("+") || (col2String.contains("-") && !col2String.matches("^\\d+(\\-|\\/|\\.)\\d+\\1\\d+$")) || col2String.contains("*") || col2String.contains("/"))
        {
            String res[] = joinExpr(col2String, operator);
            col2String = res[0];
            try {
            	 offset = Integer.parseInt(res[1]);
			} catch (Exception e) {
				// TODO: handle exception
			}
           
            operator = res[2];
        }
        TableColumn col2 = new TableColumn(col2String);
        if(col2.GetTable() == null || isDouble(col2String))
        {
            if(operator.equals("<>") || operator.equals("!="))
                return (new StringBuilder(String.valueOf(col1.toString()))).append(operator).append(col2.toString()).toString();
            col1 = FindColumn(col1);
            if(operator.contains(">") || operator.contains("!"))
            	try {
            		addToconsList(col1.toString(), AddOneDay(col2.toString()));
				} catch (Exception e) {
					// TODO: handle exception
				}
            else
            if(operator.equals("<"))
            	try {
            		if(col1 != null && col2 != null)
            			addToconsList(col1.toString(), minusOne(col2.toString()));
				} catch (Exception e) {
					// TODO: handle exception
				}
            else
            {
            	if(col1 != null && col2 != null)
            		addToconsList(col1.toString(), col2.toString());
            }
            return null;
        } else
        {
            col1 = FindColumn(col1);
            col2 = FindColumn(col2);
            
            if(col1 == null || col2 == null)
                return (new StringBuilder(String.valueOf(expr))).append(" is not processed!").toString();
            
            if(col1.isSameCol(col2))
            	return col1.toString() + operator + col2.toString();
            
            if(col1.GetColumn().contains("+") || col1.GetColumn().contains("-") || col1.GetColumn().contains("*") || col1.GetColumn().contains("/"))
            {
                TableColumn tmp = new TableColumn(col2.toString());
                col2 = new TableColumn(col1.toString());
                col1 = tmp;
                if(operator.equals(">"))
                    operator = "<";
                else
                if(operator.equals("<"))
                    operator = ">";
            }
            if(col2.GetColumn().contains("+") || col2.GetColumn().contains("-") || col2.GetColumn().contains("*") || col2.GetColumn().contains("/"))
            {
                String res[] = joinExpr(col2.GetColumn(), operator);
                col2.SetColumn(res[0]);
                offset = Integer.parseInt(res[1]);
                operator = res[2];
            }
            
            if(col1.isSameCol(col2))
            	return col1.toString() + operator + col2.toString();

            Compare comp = new Compare(col1, col2, operator);
            if(offset != 0)
                comp.setOffset(offset);
            comps.add(comp);
            if(operator.equals("<>") || operator.equals("!="))
                return (new StringBuilder(String.valueOf(col1.toString()))).append(operator).append(col2.toString()).toString();
            for(Iterator it = consList.entrySet().iterator(); it.hasNext();)
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)it.next();
                String tablecol = (String)entry.getKey();
                ConValues value = (ConValues)entry.getValue();
                if(col1.isSameString(tablecol).booleanValue())
                {
                    if(operator.contains("="))
                        addToconsList(col2.toString(), value.getValue(0));
                    else
                    if(operator.equals("<"))
                    	addToconsList(col2.toString(), AddOneDay(value.getValue(0)));
                    else
                    	addToconsList(col2.toString(), minusOne(value.getValue(0)));
                    break;
                }
                if(col2.isSameString(tablecol).booleanValue())
                {
                    if(operator.contains("=") && !operator.equals("!="))
                    	addToconsList(col1.toString(), value.getValue(0));
                    else
                    if(operator.contains(">"))
                    	addToconsList(col1.toString(), AddOneDay(value.getValue(0)));
                    else
                    	addToconsList(col1.toString(), minusOne(value.getValue(0)));
                    break;
                }
            }

        }
        return col1.toString() + operator + col2.toString();
    }

    public String minusOne(String data)
    {
        return (new StringBuilder()).append(Integer.parseInt(data) - 1).toString();
    }

    public void ProcessIn(String colString, String list)
    {
        if(list == null)
            list = invalue;
        System.out.println(colString + " in " + list);
        String[] lists = {list};
        TableColumn col = new TableColumn(colString);
        col = FindColumn(col);
        if(col == null)
        	return;
        if(list.contains(","))
            lists = list.split(",");
        for(int i = 0; i < lists.length; i++)
        {
        	if(lists[i].contains("'"))
        		lists[i] = lists[i].substring(lists[i].indexOf("'") + 1, lists[i].lastIndexOf("'"));
        }
        addToconsList(col.toString(), lists);
    }

    public String ProcessBetween(String expr)
    {
        TableColumn col1 = null;
        String values[];
        if(expr.contains("between"))
        {
            col1 = new TableColumn(expr.split("between")[0].trim());
            values = expr.split("between")[1].trim().split("and");
        } else
        if(expr.contains("BETWEEN"))
        {
            col1 = new TableColumn(expr.split("BETWEEN")[0].trim());
            values = expr.split("BETWEEN")[1].trim().split("AND");
        } else
        {
            return null;
        }
        if(values[0].contains("select") || values[0].contains("Select") || values[0].contains("SELECT") || values[1].contains("select") || values[1].contains("Select") || values[1].contains("SELECT"))
        {
        	col1 = FindColumn(col1);
        	FileUtils.keepLastLine((new StringBuilder(String.valueOf(exsub.GetTable()))).append(".txt").toString());
    		findInVal(exsub);
    		addToconsList(col1.toString(), invalue.split(",")[0]);
        }
        else
        {
	        values[0] = dealwithFunction(values[0]);
	        values[1] = dealwithFunction(values[1]);
	        col1 = FindColumn(col1);
	        if(values[0].trim().contains("'"))
	            addToconsList(col1.toString(), AddOneDay(values[0].trim().split("'")[1]));
	        else
	        	addToconsList(col1.toString(), AddOneDay(values[0].trim()));
        }
        return col1.toString();
    }
    
    private void addToconsList(String col, String value)
    {
    	ConValues values;
    	
    	if(consList.containsKey(col))
    	{
    		values = consList.get(col);
    		values.checkinValues(value);
    		consList.put(col, values);
    	}
    	else {
			values = new ConValues(value);
			consList.put(col, values);
		}
    	refreshConsList = values.checkRefresh() | refreshConsList;
    }
    
    private void addToconsList(String col, String[] v)
    {
    	ConValues values;
    	
    	if(consList.containsKey(col))
    	{
    		values = consList.get(col);
    		values.checkinValues(v);
    		consList.put(col, values);
    	}
    	else {
			values = new ConValues(v);
			consList.put(col, values);
		}
    	refreshConsList = values.checkRefresh() | refreshConsList;
    }

    public String AddOneDay(String date)
    {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
        try
        {
            cal.setTime(df.parse(date));
            cal.add(5, 1);
            return df.format(cal.getTime());
        }
        catch(ParseException e)
        {
            date = (new StringBuilder()).append(Integer.parseInt(date) + 1).toString();
        }
        return date;
    }

    public TableColumn FindColumn(TableColumn tabcol)
    {
        if(tabcol == null)
            return null;
        String table = tabcol.GetTable();
        String column = tabcol.GetColumn();
        if(table == null)
            return tabcol;
        if(tempTableMap.containsKey(table))
            return ((TempTable)tempTableMap.get(table)).getColumn(column);
        if(tableAlias.containsKey(table))
        {
            tabcol.SetTable((String)tableAlias.get(table));
            if(tempTableMap.containsKey(tabcol.GetTable()))
                return FindColumn(tabcol);
            if(tableAlias.containsKey(tabcol.GetTable()))
                return FindColumn(tabcol);
            else
                return tabcol;
        } else
        {
            return tabcol;
        }
    }

    public static Map <String, String> tableAlias = new HashMap<String, String>();
    private Map <String, TempTable>  tempTableMap;
    public static Map <String, ConValues> consList = new HashMap<String, ConValues>();
    private HashMap <String, Boolean> tableHit;
    private Vector <Compare> comps;
    private Vector <Compare> comps1;
    private int row_count;
    public static Stack <TempTable> tableStack = new Stack<TempTable>();
    public TableColumn insub;
    public static TableColumn exsub = null;
    public static String invalue = null;
    public static int tcount = 0;
    public static boolean refreshConsList = true;
}
