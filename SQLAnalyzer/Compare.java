
import java.io.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Compare {
	TableColumn col1,col2;
	String operator;
	private Map<TableColumn, ConValues> cons;
	int offset;
//	int row_count;
	
	Compare(TableColumn col1, TableColumn col2, String oper)
	{
		this.col1 = col1;
		this.col2 = col2;
		operator = oper;
		cons = new HashMap<TableColumn,ConValues>();
		offset = 1;
//		row_count = 20;
	}
	
	public void addCons(TableColumn col, ConValues values)
	{
		cons.put(col, values);
	}
	public TableColumn getCol1()
	{
		return col1;
	}
	
	public TableColumn getCol2()
	{
		return col2;
	}
	
	public String getOper()
	{
		return operator;
	}
	
	static int findPos(TableColumn col) throws IOException
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
	
	public static void writeConsList(TableColumn col, ConValues value, int row)
	{
		try {
			int colpos = findPos(col);
			String entry = FileUtils.readLastNthLine(col.GetTable() + ".txt", row);
			if(entry == null || colpos == -1)
				return;
			String[] values = entry.split(",");
			values[colpos] = value.getValue(row);
			
			String newrow = "";
			for(int i = 0; i < values.length; i++)
			{
				newrow += values[i];
				if(i != values.length - 1)
					newrow += ",";
			}
			FileUtils.writeLastNthLine(col.GetTable() + ".txt", row, newrow);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void process(int flag, int row) throws IOException
	{
//		String entry;
//		for(int i = 1; i <= row_count; i++)
//		{
		if(col1.isSameCol(col2))
			return;
//		String res1 = null, res2 = null;
		if(flag == 0 || flag == 1 || flag == 3)
		{
			writeEntry(col1, col2, row);
		}
		else if (flag == 2) {
			if(operator.equals(">"))
				operator = "<";
			else if(operator.equals("<"))
				operator = ">";
			writeEntry(col2, col1, row);
		}
/*		else if(flag == 3)
		{
			writeEntry(col1, col2, row);
			if(operator.equals(">"))
				operator = "<";
			else if(operator.equals("<"))
				operator = ">";
			else if(operator.equals("*"))
				operator = "/";
			else if(operator.equals("/"))
				operator = "*";
			writeEntry(col2, col1, row);
		}
/*		if(res1 != null)
		{
			String[] res = res1.split(";");
			FileUtils.appendLine(col1.GetTable() + "-1.txt", res[0]);
			FileUtils.appendLine(col1.GetTable() + "-1.txt", "\n");
			FileUtils.appendLine(col2.GetTable() + "-1.txt", res[1]);
			FileUtils.appendLine(col2.GetTable() + "-1.txt", "\n");
		}
		if(res2 != null)
		{
			String[] res = res2.split(";");
			FileUtils.appendLine(col2.GetTable() + "-1.txt", res[0]);
			FileUtils.appendLine(col2.GetTable() + "-1.txt", "\n");
			FileUtils.appendLine(col1.GetTable() + "-1.txt", res[1]);
			FileUtils.appendLine(col1.GetTable() + "-1.txt", "\n");
		}
//			entry = FileUtils.readNthLine(col1.GetTable() + ".txt", i);
//			if(entry == null)
//				System.out.println("The total entry number is less than " + row_count);
//			else
//				FileUtils.appendLine(col1.GetTable() + ".txt", entry);
//		}*/
	}
	
	public void writeEntry(TableColumn col1, TableColumn col2, int row) throws IOException
	{
		Iterator iter = cons.entrySet().iterator();
		int col1pos, col2pos;
		int modified;
		int size1, size2;
		String mvalue = "";
		Random random = new Random();
		
		if((size2 = FileUtils.tableSize(col2.GetTable() + ".txt")) < (size1 = FileUtils.tableSize(col1.GetTable() + ".txt")))
		{
			TableColumn tmp = new TableColumn(col1.toString());
			col1 = col2;
			col2 = tmp;
			
			if(row > size2 && Math.abs(random.nextInt())%10 != 1)
				return;
		}
		else
		{
			if(row > size1 && Math.abs(random.nextInt())%10 != 1)
				return;
		}
		
		col1pos = findPos(col1);
		col2pos = findPos(col2);
		
		String[] values = FileUtils.readLastNthLine(col1.GetTable() + ".txt", row).split(",");
		if(values.length <= col1pos)
			col1pos = 0;
		while (iter.hasNext()) {
		    Map.Entry entry = (Map.Entry) iter.next();
		    TableColumn key = (TableColumn) entry.getKey();
		    ConValues val = (ConValues) entry.getValue();
		    if(col1.GetTable().equals(key.GetTable()))
		    {
		    	int keypos = findPos(key);
		    	try {
		    		values[keypos] = val.getValue(row);
				} catch (Exception e) {
					e.printStackTrace();
				}
		    	
		    }
		} 
		String newrow = "";
		for(int i = 0; i < values.length; i++)
		{
			newrow += values[i];
			if(i != values.length - 1)
				newrow += ",";
		}
//		FileUtils.appendLine(col1.GetTable() + ".txt", newrow);
		FileUtils.writeLastNthLine(col1.GetTable() + ".txt", row, newrow);
		if(operator.contains(">") || operator.contains("!"))
		{
			mvalue = minusOffset(values[col1pos], offset);
		}
		else if(operator.equals("<"))
		{
			try {
				mvalue = addOffset(values[col1pos], offset);
			} catch (Exception e) {
				e.printStackTrace();
			}
			
		}
		else if(operator.equals("=") || operator.equals(">=") || operator.equals("<="))
		{
			mvalue = values[col1pos];
		}
		else if(operator.equals("*"))
		{
			try {
				modified = Integer.parseInt(values[col1pos]) * offset;
				mvalue += modified;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else if(operator.equals("/"))
		{
			try {
				modified = Integer.parseInt(values[col1pos]) / offset;
				mvalue += modified;
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		else {
			mvalue = null;
		}
		
		
		values = FileUtils.readLastNthLine(col2.GetTable() + ".txt", row).split(",");
		iter = cons.entrySet().iterator();
		while (iter.hasNext()) {
		    Map.Entry entry = (Map.Entry) iter.next();
		    TableColumn key = (TableColumn) entry.getKey();
		    ConValues val = (ConValues) entry.getValue();
		    if(col2.GetTable().equals(key.GetTable()))
		    {
		    	int keypos = findPos(key);
		    	try {
		    		values[keypos] = val.getValue(row);
				} catch (Exception e) {
					e.printStackTrace();
				}
		    }
		}
		if(mvalue != null)
			values[col2pos] = mvalue;
//		newrow += ";";
		newrow = "";
		for(int i = 0; i < values.length; i++)
		{
			newrow += values[i];
			if(i != values.length - 1)
				newrow += ",";
		}
//		FileUtils.appendLine(col2.GetTable() + ".txt", newrow);
		FileUtils.writeLastNthLine(col2.GetTable() + ".txt", row, newrow);
//		return newrow;
	}
	
	public String addOffset(String data, int offset)
	{
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal=Calendar.getInstance();
		try {
			cal.setTime(df.parse(data));
			cal.add(Calendar.DATE, offset);
			return df.format(cal.getTime());
		} catch (ParseException e) {
			data = "" + (Integer.parseInt(data) + offset);
			return data;
		}
	}
	
	public String minusOffset(String data, int offset)
	{
		SimpleDateFormat df=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cal=Calendar.getInstance();
		try {
			cal.setTime(df.parse(data));
			cal.add(Calendar.DATE, -1 * offset);
			return df.format(cal.getTime());
		} catch (ParseException e) {
			data = "" + (Integer.parseInt(data) - offset);
			return data;
		}
	}
	
	public boolean containsTable(TableColumn col)
	{
		if(col1.GetTable().equals(col.GetTable()) || col2.GetTable().equals(col.GetTable()))
			return true;
		else 
			return false;
	}
	
	public boolean covered(Compare comp)
	{
		if(this.containsTable(comp.getCol1()) || this.containsTable(comp.getCol2()))
			return true;
		else 
			return false;
	}
	
	public void setOffset(int offset)
	{
		this.offset = offset;
	}
	
}
