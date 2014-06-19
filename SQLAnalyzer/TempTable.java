
import java.util.*;

import javax.swing.text.TableView.TableRow;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class TempTable {
	private String tableName;
	private Map<String, TableColumn> columns;
	
	public TempTable(String tableName)
	{
		this.tableName = tableName;
		columns = new HashMap<String, TableColumn>();
	}
	
	public TempTable()
	{
		this.tableName = null;
		columns = new HashMap<String, TableColumn>();
	}
	
	public TempTable(TempTable tempTable)
	{
		this.tableName = tempTable.getTableName();
		this.columns = new HashMap<String, TableColumn>(tempTable.getColumns());
	}
	
	public String dealwithFunction(String func)
	{
		if(!func.contains("("))
			return func;
		func = func.substring(func.lastIndexOf('(', func.indexOf(')')) + 1, func.indexOf(')'));
		return func.split(",")[0];
	}
	
	public boolean AddColumn(String colName, String tableCol)
	{
		if(colName != null)
			colName = colName.toLowerCase();
		tableCol = tableCol.toLowerCase();
		
		if(!tableCol.contains("."))
		{
			if(colName != null)
				return false;
		}
		tableCol = dealwithFunction(tableCol);
		TableColumn tabcol = new TableColumn(tableCol);
		if(colName == null && !tableCol.contains("."))
			colName = "fakecol";
		columns.put(colName, tabcol);
		columns.containsKey("fakecol");
		return true;
	}
	
	public void setColumn(String colName, TableColumn tableColumn)
	{
		columns.put(colName.toLowerCase(), tableColumn);
	}
	
	public TableColumn getColumn(String colName)
	{
		if(!columns.containsKey(colName))
			return null;
		return columns.get(colName);
	}
	
	public void setTableName(String tableName)
	{
		this.tableName = tableName.toLowerCase();
	}
	
	public String getTableName()
	{
		return tableName;
	}
	
	public Map<String, TableColumn> getColumns()
	{
		return columns;
	}
	
	public Boolean hasCol()
	{
		return !columns.isEmpty();
	}
	
	public void CleanUp()
	{
		this.tableName = null;
		this.columns.clear();
	}
}
