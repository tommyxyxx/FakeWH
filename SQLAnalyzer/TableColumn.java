import com.sun.org.apache.bcel.internal.generic.RETURN;




public class TableColumn {
	private String tableName;
	private String colName;
	
	public TableColumn(String tableName, String colName) {
		// TODO Auto-generated constructor stub
		this.tableName = tableName.toLowerCase();
		
		if(colName.contains("["))
			colName = colName.substring(1, colName.length() - 1);
		this.colName = colName.toLowerCase();
	}
	
	public TableColumn(String tabCol)
	{
		
		if(!tabCol.contains("."))
		{
			this.tableName = null;
			this.colName = tabCol;
			if(colName.contains("["))
				colName = colName.substring(1, colName.length() - 1);
		}
		else
		{
			tabCol = tabCol.toLowerCase();
			this.tableName = tabCol.split("\\.")[0];
			this.colName = tabCol.split("\\.")[1];
			if(colName.contains("["))
				colName = colName.substring(1, colName.length() - 1);
		}
	}
	
	public void SetTable(String tableName)
	{
		this.tableName = tableName.toLowerCase();
	}
	
	public void SetColumn(String colName)
	{
		this.colName = colName.toLowerCase();
	}
	
	public String GetTable()
	{
		return tableName;
	}
	
	public String GetColumn()
	{
		return colName;
	}
	
	public String toString()
	{
		if(tableName != null)
			return tableName + "." + colName;
		else {
			return colName;
		}
	}
	
	public Boolean isSameString(String tabCol)
	{
		tabCol = tabCol.toLowerCase();
		
		if(tabCol.contains("["))
			tabCol = tabCol.replaceAll("[", "").replaceAll("]", "");
		if(!tabCol.contains("."))
			return this.colName.equals(tabCol);
		else {
			if(tableName == null)
				return false;
			if(tableName.equals(tabCol.split("\\.")[0]) && colName.equals(tabCol.split("\\.")[1]))
				return true;
			else 
				return false;
		}
	}
	
	public Boolean isSameCol(TableColumn tabCol)
	{
		if(tableName == null)
		{
			if(tabCol.GetTable() == null && colName.equals(tabCol.GetColumn()))
				return true;
			else
				return false;
		}
		else {
			if(tableName.equals(tabCol.GetTable()) && colName.equals(tabCol.GetColumn()))
				return true;
			else
				return false;
		}
	}
}
