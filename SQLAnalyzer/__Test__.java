import java.io.*;

import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;
import org.antlr.runtime.tree.CommonTree;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        long start = System.currentTimeMillis();
        String[] files = null;
        
    	GenericSQLLexer lex = new GenericSQLLexer(new ANTLRFileStream("SQLinput.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        GenericSQLParser g;
        if(args.length != 0)
        	g = new GenericSQLParser(tokens, Integer.parseInt(args[0]));
        else {
        	g = new GenericSQLParser(tokens, 10);
		}
        try {
            GenericSQLParser.statement_return r = g.statement();
            CommonTree tree = (CommonTree) r.tree;
 //           System.out.println(tree.toStringTree());
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
        
        files = FileUtils.findModifiedFiles(".",start).split(";");
        for(int i = 0; i < files.length; i++)
		{
			try {
				FileUtils.removeDuplicate(files[i]);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }
}