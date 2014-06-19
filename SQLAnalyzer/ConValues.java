import java.util.Vector;


public class ConValues {
	private Vector<String> values;
	private int position;
	private boolean needrefresh;
	
	public ConValues(String[] v)
	{
		values = new Vector<String>();
		position = 0;
		for (String value : v) {
			values.add(value);
		}
		needrefresh = true;
	}
	
	public ConValues(String value)
	{
		values = new Vector<String>();
		position = 0;
		needrefresh = true;
		values.add(value);
	}
	
	public boolean checkRefresh()
	{
		return needrefresh;
	}
	
	public void refreshed()
	{
		needrefresh = false;
	}
	
	public void checkinValues(String[] v)
	{
		for (String value : v) {
			if(!values.contains(value))
			{
				values.add(value);
				if(needrefresh == false)
					needrefresh = true;
			}
		}
	}
	
	public void checkinValues(String value)
	{
		if(!values.contains(value))
		{
			values.add(value);
			if(needrefresh == false)
				needrefresh = true;
		}
		
	}
	
	public String getValue(int i)
	{
		i %= values.size();
		if(i == values.size() || values.size() == 1)
			i = 0;
		return values.get(i);
	}
	
	public String getValue()
	{
		if(position != values.size())
			return values.get(position++);
		else
		{
			position = 0;
			return values.get(position);
		}
	}
}
