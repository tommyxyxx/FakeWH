
import java.io.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Vector;

import com.sun.org.apache.bcel.internal.generic.RETURN;

public class FileUtils {
	
	public static Map<String, Vector<String>> filemap = new HashMap<String, Vector<String>>();
	
	public static void clearFileMap()
	{
		filemap.clear();
		return;
	}
    
    public static void readToBuffer(StringBuffer buffer, String filePath) throws IOException {
        InputStream is = new FileInputStream(filePath);
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        line = reader.readLine();
        while (line != null) {
            buffer.append(line);
            buffer.append("\n");
            line = reader.readLine();
        }
        reader.close();
        is.close();
    }

    public static void readToFileMap(String filePath) throws IOException {
    	Vector<String> content = new Vector<String>();
    	
    	InputStream is = new FileInputStream(filePath);
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        line = reader.readLine();
        while (line != null) {
        	if(!line.equals(""))
        		content.add(line);
            line = reader.readLine();
        }
        reader.close();
        is.close();
        
        filemap.put(filePath, content);
    }
    
    public static String readFirstLine(String filePath) throws IOException {
        InputStream is = new FileInputStream(filePath);
        String line;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        line = reader.readLine();
        reader.close();
        is.close();
        return line;
    }
    
    public static void removeDuplicate(String filePath) throws IOException {
        HashSet<String> set = new HashSet<String>();
        InputStream is = new FileInputStream(filePath);
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        String line = reader.readLine();
        while(line != null) {
        	set.add(line);
        	line = reader.readLine();
        }
        reader.close();
        is.close();
        FileWriter writer = new FileWriter(filePath, false);
        for(Iterator<String> it=set.iterator();it.hasNext();)
        {
        	String entry = it.next();
        	writer.write(entry + "\n");
        }
        writer.close();
    }
    
    public static String findModifiedFiles(String filePath, long start) throws IOException {
    	String files = "";
    	
    	File directory = new File(filePath);
    	File[] fs = directory.listFiles();
    	for(int i = 0; i < fs.length; i++)
    	{
    		long lastModified = fs[i].lastModified();
    		if(System.currentTimeMillis() - lastModified < System.currentTimeMillis() - start)
 //   		if(fs[i].getName().contains("-1"))
    			files += fs[i].getName() + ";";
    	}
    	files = files.substring(0, files.length() - 1);
    	return files;
    }
    
    public static String readNthLine(String filePath, int n) throws IOException {
        InputStream is = new FileInputStream(filePath);
        String line = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(is));
        for(int i = 0; i < n; i++)
        	line = reader.readLine();
        reader.close();
        is.close();
        return line;
    }
    
    public static String readLastLine(String filePath)
    {
    	RandomAccessFile rf=null;
    	try {
    		rf=new RandomAccessFile(filePath,"r");
    		long len=rf.length();
    		long start=rf.getFilePointer();
    		long nextend=start+len-1;
    		String line;
    		rf.seek(nextend);
    		int c=-1;
    		while(nextend>start){
				c=rf.read();
				if(c=='\n'||c=='\r'){
					line=rf.readLine();
					if(line==null){
						nextend--;
						rf.seek(nextend);
						continue;
					}
//					System.out.println(line);
					return line;
				}
				nextend--;
				rf.seek(nextend);
				if(nextend==0){
//					System.out.println(rf.readLine());
					return rf.readLine();
				}
    		}
    	} catch (FileNotFoundException e) {
    	e.printStackTrace();
    	} catch (IOException e) {
    	e.printStackTrace();
    	}
    	finally{
    	try {
    	rf.close();
    	} catch (IOException e) {
    	e.printStackTrace();
    	}
    	}
    	
    	return null;
    }
    
//High Effect    
    public static String readLastNthLine(String filePath, int n)
    {
    	Vector<String> content;
    	
    	if(!filemap.containsKey(filePath))
    	{
    		try {
				FileUtils.readToFileMap(filePath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	content = filemap.get(filePath);
    	if(content == null)
    		return null;
    	if(content.size() >= n)
    		return content.get(content.size() - n);
    	else
    	{
    		int i = n % content.size();
    		return content.get(content.size() - (i == 0 ? content.size() : i));
    	}
    }
    
    public static int tableSize(String filePath)
    {
    	if(!filemap.containsKey(filePath))
    	{
    		try {
				FileUtils.readToFileMap(filePath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	
    	return filemap.get(filePath).size();
    }
    
    public static void keepLastLine(String filePath)
    {
    	Vector<String> content;
    	
    	if(!filemap.containsKey(filePath))
    	{
    		try {
				FileUtils.readToFileMap(filePath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	content = filemap.get(filePath);
    	
    	String last = content.get(content.size() - 1);
    	content.removeAllElements();
    	
    	content.add(last);
    	filemap.put(filePath, content);
    }
    
    public static void writeLastNthLine(String filePath, int n, String line)
    {
    	Vector<String> content;
    	
    	if(!filemap.containsKey(filePath))
    	{
    		try {
				FileUtils.readToFileMap(filePath);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    	content = filemap.get(filePath);
    	if(content.size() >= n)
    		content.set(content.size() - n, line);
    	else {
    		int i = n % content.size();
    		content.set(content.size() - (i == 0 ? content.size() : i), line);
		}
    	
    	filemap.put(filePath, content);
    }

    
    /*  Low Effect    
    public static String readLastNthLine(String filePath, int n)
    {
    	RandomAccessFile rf=null;
    	try {
    		rf=new RandomAccessFile(filePath,"r");
    		long len=rf.length();
    		long start=rf.getFilePointer();
    		long nextend=start+len-1;
    		String line;
    		rf.seek(nextend);
    		int c=-1;
    		int cur = 1;
    		while(nextend>start){
				c=rf.read();
				if(c=='\n'||c=='\r'){
					line=rf.readLine();
					if(line==null || line.equals("") || cur < n){
						cur++;
						nextend--;
						rf.seek(nextend);
						continue;
					}
//					System.out.println(line);
					return line;
				}
				nextend--;
				rf.seek(nextend);
				if(nextend==0){
//					System.out.println(rf.readLine());
					return rf.readLine();
				}
    		}
    	} catch (FileNotFoundException e) {
    	e.printStackTrace();
    	} catch (IOException e) {
    	e.printStackTrace();
    	}
    	finally{
    	try {
    	rf.close();
    	} catch (IOException e) {
    	e.printStackTrace();
    	}
    	}
    	
    	return null;
    }*/
    
    public static void appendLine(String fileName, String content) throws IOException {
        FileWriter writer = new FileWriter(fileName, true);
        writer.write(content);
        writer.close();
    }
    
    public static void refreshFile(String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName, false);
        writer.write("");
        writer.close();
    }
    
    public static void flushAll() throws IOException 
    {
    	Iterator it = filemap.entrySet().iterator();
		while(it.hasNext())
		{
			Map.Entry entry = (Map.Entry) it.next();
			String filepath = (String) entry.getKey();
			Vector<String> content = (Vector<String>) entry.getValue();
			
			refreshFile(filepath);
			for(int i = 0; i < content.size(); i++)
			{
				appendLine(filepath, content.get(i) + "\n");
			}
		}
    }
    
    public static String readFile(String filePath) throws IOException {
        StringBuffer sb = new StringBuffer();
        FileUtils.readToBuffer(sb, filePath);
        return sb.toString();
    }
    
    public static void removeFile(String filePath) throws IOException {
    	File file = new File(filePath);
    	
    	 if(file.isFile() && file.exists()){     
             file.delete();
             return;
    	 }
    	 else {
			return;
		}
    }
}
