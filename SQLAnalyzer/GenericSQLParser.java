// $ANTLR 3.5 C:\\FakeWH\\GenericSQL.g 2014-06-09 02:30:45
 
//	package fado.parse;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.tree.*;


@SuppressWarnings("all")
public class GenericSQLParser extends Parser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "A", "ALL", "AND", "ANY", "APOSTROPHE", 
		"AS", "ASC", "AVG", "B", "BETWEEN", "BY", "C", "CASE", "COALESCE", "COLON", 
		"COMMA", "COUNT", "CREATE", "CROSS", "Comment", "D", "DATE", "DELETE", 
		"DESC", "DISTINCT", "DIVIDE", "DOT", "Daytime", "Digit", "E", "ELSE", 
		"END", "EQ", "EXISTS", "Exponent", "F", "FALSE", "FROM", "FULL", "Float", 
		"G", "GROUP", "GT", "GTE", "H", "HAVING", "I", "IN", "INNER", "INSERT", 
		"INTO", "IS", "Identifier", "Integer", "J", "JOIN", "K", "L", "LASTDAY", 
		"LCURLY", "LEFT", "LIKE", "LPAREN", "LT", "LTE", "M", "MAX", "MIN", "MINUS", 
		"MOD", "N", "NATURAL", "NEQ1", "NEQ2", "NEXTDAY", "NOLOGGING", "NOT", 
		"NULL", "NVL", "O", "ON", "OR", "ORDER", "OUTER", "P", "PERCENT", "PLUS", 
		"Q", "QUESTION", "QuotedIdentifier", "R", "RCURLY", "RIGHT", "RPAREN", 
		"S", "SELECT", "SEMI", "SET", "SOME", "STAR", "STRCAT", "SUM", "String", 
		"T", "TABLE", "THEN", "TOCHAR", "TODATE", "TONUMBER", "TOP", "TRUE", "TRUNC", 
		"Timestamp", "U", "UNION", "UNIQUE", "UPDATE", "USING", "V", "VALUES", 
		"W", "WHEN", "WHERE", "Whitespace", "X", "Y", "Z", "'{d'", "'{t'", "'{ts'"
	};
	public static final int EOF=-1;
	public static final int T__131=131;
	public static final int T__132=132;
	public static final int T__133=133;
	public static final int A=4;
	public static final int ALL=5;
	public static final int AND=6;
	public static final int ANY=7;
	public static final int APOSTROPHE=8;
	public static final int AS=9;
	public static final int ASC=10;
	public static final int AVG=11;
	public static final int B=12;
	public static final int BETWEEN=13;
	public static final int BY=14;
	public static final int C=15;
	public static final int CASE=16;
	public static final int COALESCE=17;
	public static final int COLON=18;
	public static final int COMMA=19;
	public static final int COUNT=20;
	public static final int CREATE=21;
	public static final int CROSS=22;
	public static final int Comment=23;
	public static final int D=24;
	public static final int DATE=25;
	public static final int DELETE=26;
	public static final int DESC=27;
	public static final int DISTINCT=28;
	public static final int DIVIDE=29;
	public static final int DOT=30;
	public static final int Daytime=31;
	public static final int Digit=32;
	public static final int E=33;
	public static final int ELSE=34;
	public static final int END=35;
	public static final int EQ=36;
	public static final int EXISTS=37;
	public static final int Exponent=38;
	public static final int F=39;
	public static final int FALSE=40;
	public static final int FROM=41;
	public static final int FULL=42;
	public static final int Float=43;
	public static final int G=44;
	public static final int GROUP=45;
	public static final int GT=46;
	public static final int GTE=47;
	public static final int H=48;
	public static final int HAVING=49;
	public static final int I=50;
	public static final int IN=51;
	public static final int INNER=52;
	public static final int INSERT=53;
	public static final int INTO=54;
	public static final int IS=55;
	public static final int Identifier=56;
	public static final int Integer=57;
	public static final int J=58;
	public static final int JOIN=59;
	public static final int K=60;
	public static final int L=61;
	public static final int LASTDAY=62;
	public static final int LCURLY=63;
	public static final int LEFT=64;
	public static final int LIKE=65;
	public static final int LPAREN=66;
	public static final int LT=67;
	public static final int LTE=68;
	public static final int M=69;
	public static final int MAX=70;
	public static final int MIN=71;
	public static final int MINUS=72;
	public static final int MOD=73;
	public static final int N=74;
	public static final int NATURAL=75;
	public static final int NEQ1=76;
	public static final int NEQ2=77;
	public static final int NEXTDAY=78;
	public static final int NOLOGGING=79;
	public static final int NOT=80;
	public static final int NULL=81;
	public static final int NVL=82;
	public static final int O=83;
	public static final int ON=84;
	public static final int OR=85;
	public static final int ORDER=86;
	public static final int OUTER=87;
	public static final int P=88;
	public static final int PERCENT=89;
	public static final int PLUS=90;
	public static final int Q=91;
	public static final int QUESTION=92;
	public static final int QuotedIdentifier=93;
	public static final int R=94;
	public static final int RCURLY=95;
	public static final int RIGHT=96;
	public static final int RPAREN=97;
	public static final int S=98;
	public static final int SELECT=99;
	public static final int SEMI=100;
	public static final int SET=101;
	public static final int SOME=102;
	public static final int STAR=103;
	public static final int STRCAT=104;
	public static final int SUM=105;
	public static final int String=106;
	public static final int T=107;
	public static final int TABLE=108;
	public static final int THEN=109;
	public static final int TOCHAR=110;
	public static final int TODATE=111;
	public static final int TONUMBER=112;
	public static final int TOP=113;
	public static final int TRUE=114;
	public static final int TRUNC=115;
	public static final int Timestamp=116;
	public static final int U=117;
	public static final int UNION=118;
	public static final int UNIQUE=119;
	public static final int UPDATE=120;
	public static final int USING=121;
	public static final int V=122;
	public static final int VALUES=123;
	public static final int W=124;
	public static final int WHEN=125;
	public static final int WHERE=126;
	public static final int Whitespace=127;
	public static final int X=128;
	public static final int Y=129;
	public static final int Z=130;
	int row_count;
	SQLPass sql;
	TempTable tempTable;
	boolean creatas;
	
	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public GenericSQLParser(TokenStream input, int row_count) {
		this(input, new RecognizerSharedState());
		this.row_count = row_count;
		sql = new SQLPass(row_count);
		tempTable = new TempTable();
		creatas = false;
	}
	
	public GenericSQLParser(TokenStream input, RecognizerSharedState state) {
		super(input, state);
	}

	protected TreeAdaptor adaptor = new CommonTreeAdaptor();

	public void setTreeAdaptor(TreeAdaptor adaptor) {
		this.adaptor = adaptor;
	}
	public TreeAdaptor getTreeAdaptor() {
		return adaptor;
	}
	@Override public String[] getTokenNames() { return GenericSQLParser.tokenNames; }
	@Override public String getGrammarFileName() { return "C:\\FakeWH\\GenericSQL.g"; }


	public static class statement_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "statement"
	// C:\\FakeWH\\GenericSQL.g:31:1: statement : ( ( select ( SEMI )? | create ( SEMI )? )* EOF | insert ( SEMI )? EOF | update ( SEMI )? EOF );
	public final GenericSQLParser.statement_return statement() throws RecognitionException {
		GenericSQLParser.statement_return retval = new GenericSQLParser.statement_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SEMI2=null;
		Token SEMI4=null;
		Token EOF5=null;
		Token SEMI7=null;
		Token EOF8=null;
		Token SEMI10=null;
		Token EOF11=null;
		ParserRuleReturnScope select1 =null;
		ParserRuleReturnScope create3 =null;
		ParserRuleReturnScope insert6 =null;
		ParserRuleReturnScope update9 =null;

		Object SEMI2_tree=null;
		Object SEMI4_tree=null;
		Object EOF5_tree=null;
		Object SEMI7_tree=null;
		Object EOF8_tree=null;
		Object SEMI10_tree=null;
		Object EOF11_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:32:3: ( ( select ( SEMI )? | create ( SEMI )? )* EOF | insert ( SEMI )? EOF | update ( SEMI )? EOF )
			int alt6=3;
			switch ( input.LA(1) ) {
			case EOF:
			case CREATE:
			case SELECT:
				{
				alt6=1;
				}
				break;
			case INSERT:
				{
				alt6=2;
				}
				break;
			case UPDATE:
				{
				alt6=3;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				throw nvae;
			}
			switch (alt6) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:32:5: ( select ( SEMI )? | create ( SEMI )? )* EOF
					{
					root_0 = (Object)adaptor.nil();


					// C:\\FakeWH\\GenericSQL.g:32:5: ( select ( SEMI )? | create ( SEMI )? )*
					loop3:
					while (true) {
						int alt3=3;
						int LA3_0 = input.LA(1);
						if ( (LA3_0==SELECT) ) {
							alt3=1;
						}
						else if ( (LA3_0==CREATE) ) {
							alt3=2;
						}

						switch (alt3) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:32:6: select ( SEMI )?
							{
							pushFollow(FOLLOW_select_in_statement76);
							select1=select();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, select1.getTree());

							// C:\\FakeWH\\GenericSQL.g:32:13: ( SEMI )?
							int alt1=2;
							int LA1_0 = input.LA(1);
							if ( (LA1_0==SEMI) ) {
								alt1=1;
							}
							switch (alt1) {
								case 1 :
									// C:\\FakeWH\\GenericSQL.g:32:15: SEMI
									{
									SEMI2=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement80); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									SEMI2_tree = (Object)adaptor.create(SEMI2);
									adaptor.addChild(root_0, SEMI2_tree);
									}

									}
									break;

							}

							}
							break;
						case 2 :
							// C:\\FakeWH\\GenericSQL.g:32:25: create ( SEMI )?
							{
							pushFollow(FOLLOW_create_in_statement87);
							create3=create();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, create3.getTree());

							// C:\\FakeWH\\GenericSQL.g:32:32: ( SEMI )?
							int alt2=2;
							int LA2_0 = input.LA(1);
							if ( (LA2_0==SEMI) ) {
								alt2=1;
							}
							switch (alt2) {
								case 1 :
									// C:\\FakeWH\\GenericSQL.g:32:34: SEMI
									{
									SEMI4=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement91); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									SEMI4_tree = (Object)adaptor.create(SEMI4);
									adaptor.addChild(root_0, SEMI4_tree);
									}

									}
									break;

							}

							}
							break;

						default :
							break loop3;
						}
					}

					EOF5=(Token)match(input,EOF,FOLLOW_EOF_in_statement98); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOF5_tree = (Object)adaptor.create(EOF5);
					adaptor.addChild(root_0, EOF5_tree);
					}

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:33:5: insert ( SEMI )? EOF
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_insert_in_statement104);
					insert6=insert();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, insert6.getTree());

					// C:\\FakeWH\\GenericSQL.g:33:12: ( SEMI )?
					int alt4=2;
					int LA4_0 = input.LA(1);
					if ( (LA4_0==SEMI) ) {
						alt4=1;
					}
					switch (alt4) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:33:14: SEMI
							{
							SEMI7=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement108); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							SEMI7_tree = (Object)adaptor.create(SEMI7);
							adaptor.addChild(root_0, SEMI7_tree);
							}

							}
							break;

					}

					EOF8=(Token)match(input,EOF,FOLLOW_EOF_in_statement113); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOF8_tree = (Object)adaptor.create(EOF8);
					adaptor.addChild(root_0, EOF8_tree);
					}

					}
					break;
				case 3 :
					// C:\\FakeWH\\GenericSQL.g:34:4: update ( SEMI )? EOF
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_update_in_statement118);
					update9=update();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, update9.getTree());

					// C:\\FakeWH\\GenericSQL.g:34:11: ( SEMI )?
					int alt5=2;
					int LA5_0 = input.LA(1);
					if ( (LA5_0==SEMI) ) {
						alt5=1;
					}
					switch (alt5) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:34:13: SEMI
							{
							SEMI10=(Token)match(input,SEMI,FOLLOW_SEMI_in_statement122); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							SEMI10_tree = (Object)adaptor.create(SEMI10);
							adaptor.addChild(root_0, SEMI10_tree);
							}

							}
							break;

					}

					EOF11=(Token)match(input,EOF,FOLLOW_EOF_in_statement127); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					EOF11_tree = (Object)adaptor.create(EOF11);
					adaptor.addChild(root_0, EOF11_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "statement"


	public static class create_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "create"
	// C:\\FakeWH\\GenericSQL.g:38:1: create : CREATE TABLE tableRef ( NOLOGGING )? AS subSelect ;
	public final GenericSQLParser.create_return create() throws RecognitionException {
		GenericSQLParser.create_return retval = new GenericSQLParser.create_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CREATE12=null;
		Token TABLE13=null;
		Token NOLOGGING15=null;
		Token AS16=null;
		ParserRuleReturnScope tableRef14 =null;
		ParserRuleReturnScope subSelect17 =null;

		Object CREATE12_tree=null;
		Object TABLE13_tree=null;
		Object NOLOGGING15_tree=null;
		Object AS16_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:39:3: ( CREATE TABLE tableRef ( NOLOGGING )? AS subSelect )
			// C:\\FakeWH\\GenericSQL.g:39:5: CREATE TABLE tableRef ( NOLOGGING )? AS subSelect
			{
			root_0 = (Object)adaptor.nil();


			CREATE12=(Token)match(input,CREATE,FOLLOW_CREATE_in_create145); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CREATE12_tree = (Object)adaptor.create(CREATE12);
			adaptor.addChild(root_0, CREATE12_tree);
			}

			TABLE13=(Token)match(input,TABLE,FOLLOW_TABLE_in_create147); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			TABLE13_tree = (Object)adaptor.create(TABLE13);
			adaptor.addChild(root_0, TABLE13_tree);
			}

			pushFollow(FOLLOW_tableRef_in_create149);
			tableRef14=tableRef();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, tableRef14.getTree());

			if ( state.backtracking==0 ) {
			  	tempTable.CleanUp();
			  	tempTable.setTableName((tableRef14!=null?input.toString(tableRef14.start,tableRef14.stop):null));
			  	creatas = true;
			  }
			// C:\\FakeWH\\GenericSQL.g:45:3: ( NOLOGGING )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0==NOLOGGING) ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:45:4: NOLOGGING
					{
					NOLOGGING15=(Token)match(input,NOLOGGING,FOLLOW_NOLOGGING_in_create158); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOLOGGING15_tree = (Object)adaptor.create(NOLOGGING15);
					adaptor.addChild(root_0, NOLOGGING15_tree);
					}

					}
					break;

			}

			AS16=(Token)match(input,AS,FOLLOW_AS_in_create162); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			AS16_tree = (Object)adaptor.create(AS16);
			adaptor.addChild(root_0, AS16_tree);
			}

			pushFollow(FOLLOW_subSelect_in_create164);
			subSelect17=subSelect();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subSelect17.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "create"


	public static class subSelect_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "subSelect"
	// C:\\FakeWH\\GenericSQL.g:48:1: subSelect : ( select | LPAREN select RPAREN );
	public final GenericSQLParser.subSelect_return subSelect() throws RecognitionException {
		GenericSQLParser.subSelect_return retval = new GenericSQLParser.subSelect_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN19=null;
		Token RPAREN21=null;
		ParserRuleReturnScope select18 =null;
		ParserRuleReturnScope select20 =null;

		Object LPAREN19_tree=null;
		Object RPAREN21_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:49:3: ( select | LPAREN select RPAREN )
			int alt8=2;
			int LA8_0 = input.LA(1);
			if ( (LA8_0==SELECT) ) {
				alt8=1;
			}
			else if ( (LA8_0==LPAREN) ) {
				alt8=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				throw nvae;
			}

			switch (alt8) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:49:5: select
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_select_in_subSelect179);
					select18=select();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, select18.getTree());

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:50:5: LPAREN select RPAREN
					{
					root_0 = (Object)adaptor.nil();


					LPAREN19=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_subSelect185); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN19_tree = (Object)adaptor.create(LPAREN19);
					adaptor.addChild(root_0, LPAREN19_tree);
					}

					pushFollow(FOLLOW_select_in_subSelect187);
					select20=select();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, select20.getTree());

					RPAREN21=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_subSelect189); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RPAREN21_tree = (Object)adaptor.create(RPAREN21);
					adaptor.addChild(root_0, RPAREN21_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "subSelect"


	public static class select_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "select"
	// C:\\FakeWH\\GenericSQL.g:53:1: select : SELECT ( ALL | DISTINCT | UNIQUE )? ( TOP Integer ( PERCENT )? )? itemList ( into )? from ( joinList )? ( where )? ( groupBy )? ( having )? ( orderBy )? ;
	public final GenericSQLParser.select_return select() throws RecognitionException {
		GenericSQLParser.select_return retval = new GenericSQLParser.select_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token SELECT22=null;
		Token set23=null;
		Token TOP24=null;
		Token Integer25=null;
		Token PERCENT26=null;
		ParserRuleReturnScope itemList27 =null;
		ParserRuleReturnScope into28 =null;
		ParserRuleReturnScope from29 =null;
		ParserRuleReturnScope joinList30 =null;
		ParserRuleReturnScope where31 =null;
		ParserRuleReturnScope groupBy32 =null;
		ParserRuleReturnScope having33 =null;
		ParserRuleReturnScope orderBy34 =null;

		Object SELECT22_tree=null;
		Object set23_tree=null;
		Object TOP24_tree=null;
		Object Integer25_tree=null;
		Object PERCENT26_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:54:3: ( SELECT ( ALL | DISTINCT | UNIQUE )? ( TOP Integer ( PERCENT )? )? itemList ( into )? from ( joinList )? ( where )? ( groupBy )? ( having )? ( orderBy )? )
			// C:\\FakeWH\\GenericSQL.g:54:5: SELECT ( ALL | DISTINCT | UNIQUE )? ( TOP Integer ( PERCENT )? )? itemList ( into )? from ( joinList )? ( where )? ( groupBy )? ( having )? ( orderBy )?
			{
			root_0 = (Object)adaptor.nil();


			SELECT22=(Token)match(input,SELECT,FOLLOW_SELECT_in_select204); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SELECT22_tree = (Object)adaptor.create(SELECT22);
			adaptor.addChild(root_0, SELECT22_tree);
			}

			if ( state.backtracking==0 ) {
			  	if(tempTable.getTableName() != null || tempTable.hasCol())
				{
				if(!creatas)
				{
					TempTable tab = new TempTable(tempTable);
					sql.tableStack.push(tab);
					tempTable.CleanUp();
				}
				else
					creatas = false;
				}
			  		
			  }
			// C:\\FakeWH\\GenericSQL.g:69:5: ( ALL | DISTINCT | UNIQUE )?
			int alt9=2;
			int LA9_0 = input.LA(1);
			if ( (LA9_0==ALL||LA9_0==DISTINCT||LA9_0==UNIQUE) ) {
				alt9=1;
			}
			switch (alt9) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:
					{
					set23=input.LT(1);
					if ( input.LA(1)==ALL||input.LA(1)==DISTINCT||input.LA(1)==UNIQUE ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set23));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			// C:\\FakeWH\\GenericSQL.g:70:5: ( TOP Integer ( PERCENT )? )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0==TOP) ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:70:7: TOP Integer ( PERCENT )?
					{
					TOP24=(Token)match(input,TOP,FOLLOW_TOP_in_select235); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TOP24_tree = (Object)adaptor.create(TOP24);
					adaptor.addChild(root_0, TOP24_tree);
					}

					Integer25=(Token)match(input,Integer,FOLLOW_Integer_in_select237); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Integer25_tree = (Object)adaptor.create(Integer25);
					adaptor.addChild(root_0, Integer25_tree);
					}

					// C:\\FakeWH\\GenericSQL.g:70:19: ( PERCENT )?
					int alt10=2;
					int LA10_0 = input.LA(1);
					if ( (LA10_0==PERCENT) ) {
						alt10=1;
					}
					switch (alt10) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:70:21: PERCENT
							{
							PERCENT26=(Token)match(input,PERCENT,FOLLOW_PERCENT_in_select241); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							PERCENT26_tree = (Object)adaptor.create(PERCENT26);
							adaptor.addChild(root_0, PERCENT26_tree);
							}

							}
							break;

					}

					}
					break;

			}

			pushFollow(FOLLOW_itemList_in_select253);
			itemList27=itemList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, itemList27.getTree());

			// C:\\FakeWH\\GenericSQL.g:72:5: ( into )?
			int alt12=2;
			int LA12_0 = input.LA(1);
			if ( (LA12_0==INTO) ) {
				alt12=1;
			}
			switch (alt12) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:72:7: into
					{
					pushFollow(FOLLOW_into_in_select261);
					into28=into();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, into28.getTree());

					}
					break;

			}

			pushFollow(FOLLOW_from_in_select270);
			from29=from();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, from29.getTree());

			// C:\\FakeWH\\GenericSQL.g:74:5: ( joinList )?
			int alt13=2;
			switch ( input.LA(1) ) {
				case JOIN:
					{
					int LA13_1 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case INNER:
					{
					int LA13_2 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case LEFT:
					{
					int LA13_3 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case RIGHT:
					{
					int LA13_4 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case OUTER:
					{
					int LA13_5 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case NATURAL:
					{
					int LA13_6 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case CROSS:
					{
					int LA13_7 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case FULL:
					{
					int LA13_8 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case WHERE:
					{
					int LA13_9 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case GROUP:
					{
					int LA13_10 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case HAVING:
					{
					int LA13_11 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case ORDER:
					{
					int LA13_12 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case SEMI:
					{
					int LA13_13 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case EOF:
					{
					int LA13_14 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case SELECT:
					{
					int LA13_15 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case CREATE:
					{
					int LA13_16 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case AS:
					{
					int LA13_17 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case Identifier:
					{
					int LA13_18 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case COMMA:
					{
					int LA13_19 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case ON:
					{
					int LA13_20 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case USING:
					{
					int LA13_21 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case RPAREN:
					{
					int LA13_22 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case AND:
					{
					int LA13_23 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case OR:
					{
					int LA13_24 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
				case THEN:
					{
					int LA13_25 = input.LA(2);
					if ( (synpred17_GenericSQL()) ) {
						alt13=1;
					}
					}
					break;
			}
			switch (alt13) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:74:7: joinList
					{
					pushFollow(FOLLOW_joinList_in_select278);
					joinList30=joinList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, joinList30.getTree());

					}
					break;

			}

			if ( state.backtracking==0 ) {
			    	if(tempTable.getTableName() != null)
			    	{
			      		TempTable tempTab = new TempTable(tempTable);
			  		sql.AddTempTable(tempTab.getTableName(), tempTab);
			  		if(!sql.tableStack.isEmpty())
			  			tempTable = sql.tableStack.pop();
			  		else
			  			tempTable.CleanUp();
			  	}
			  	else{
			  		Map columns = tempTable.getColumns();
			  		if(columns.containsKey("fakecol"))
			  		{
			  			sql.exsub = (TableColumn)columns.get("fakecol");
			  		}
			  		else
			  		{
				  		TableColumn col = (TableColumn)columns.get(null);
						sql.insub = sql.FindColumn(col);
					}
			  	}
			    }
			// C:\\FakeWH\\GenericSQL.g:98:5: ( where )?
			int alt14=2;
			int LA14_0 = input.LA(1);
			if ( (LA14_0==WHERE) ) {
				int LA14_1 = input.LA(2);
				if ( (synpred18_GenericSQL()) ) {
					alt14=1;
				}
			}
			switch (alt14) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:98:7: where
					{
					pushFollow(FOLLOW_where_in_select295);
					where31=where();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, where31.getTree());

					}
					break;

			}

			// C:\\FakeWH\\GenericSQL.g:99:5: ( groupBy )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0==GROUP) ) {
				int LA15_1 = input.LA(2);
				if ( (synpred19_GenericSQL()) ) {
					alt15=1;
				}
			}
			switch (alt15) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:99:7: groupBy
					{
					pushFollow(FOLLOW_groupBy_in_select306);
					groupBy32=groupBy();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, groupBy32.getTree());

					}
					break;

			}

			// C:\\FakeWH\\GenericSQL.g:100:5: ( having )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==HAVING) ) {
				int LA16_1 = input.LA(2);
				if ( (synpred20_GenericSQL()) ) {
					alt16=1;
				}
			}
			switch (alt16) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:100:7: having
					{
					pushFollow(FOLLOW_having_in_select317);
					having33=having();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, having33.getTree());

					}
					break;

			}

			// C:\\FakeWH\\GenericSQL.g:101:5: ( orderBy )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0==ORDER) ) {
				int LA17_1 = input.LA(2);
				if ( (synpred21_GenericSQL()) ) {
					alt17=1;
				}
			}
			switch (alt17) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:101:7: orderBy
					{
					pushFollow(FOLLOW_orderBy_in_select328);
					orderBy34=orderBy();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, orderBy34.getTree());

					}
					break;

			}

			if ( state.backtracking==0 ) {
			//    	TempTable tempTab = new TempTable(tempTable);
			//  	sql.AddTempTable(tempTab.getTableName(), tempTab);
			  	sql.ProcessOneSQL();
			  	if(sql.insub != null)
			  	{
			  		sql.findInVal(sql.insub);
			  		sql.insub = null;
			  	}
			    }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "select"


	public static class insert_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "insert"
	// C:\\FakeWH\\GenericSQL.g:113:1: insert : INSERT into ( columnList )? ( values ) ;
	public final GenericSQLParser.insert_return insert() throws RecognitionException {
		GenericSQLParser.insert_return retval = new GenericSQLParser.insert_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INSERT35=null;
		ParserRuleReturnScope into36 =null;
		ParserRuleReturnScope columnList37 =null;
		ParserRuleReturnScope values38 =null;

		Object INSERT35_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:114:3: ( INSERT into ( columnList )? ( values ) )
			// C:\\FakeWH\\GenericSQL.g:114:5: INSERT into ( columnList )? ( values )
			{
			root_0 = (Object)adaptor.nil();


			INSERT35=(Token)match(input,INSERT,FOLLOW_INSERT_in_insert352); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			INSERT35_tree = (Object)adaptor.create(INSERT35);
			adaptor.addChild(root_0, INSERT35_tree);
			}

			pushFollow(FOLLOW_into_in_insert354);
			into36=into();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, into36.getTree());

			// C:\\FakeWH\\GenericSQL.g:114:17: ( columnList )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0==LPAREN) ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:114:19: columnList
					{
					pushFollow(FOLLOW_columnList_in_insert358);
					columnList37=columnList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, columnList37.getTree());

					}
					break;

			}

			// C:\\FakeWH\\GenericSQL.g:115:3: ( values )
			// C:\\FakeWH\\GenericSQL.g:115:5: values
			{
			pushFollow(FOLLOW_values_in_insert367);
			values38=values();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, values38.getTree());

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "insert"


	public static class update_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "update"
	// C:\\FakeWH\\GenericSQL.g:120:1: update : UPDATE tableRef SET setter ( COMMA setter )* ( where )? ;
	public final GenericSQLParser.update_return update() throws RecognitionException {
		GenericSQLParser.update_return retval = new GenericSQLParser.update_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token UPDATE39=null;
		Token SET41=null;
		Token COMMA43=null;
		ParserRuleReturnScope tableRef40 =null;
		ParserRuleReturnScope setter42 =null;
		ParserRuleReturnScope setter44 =null;
		ParserRuleReturnScope where45 =null;

		Object UPDATE39_tree=null;
		Object SET41_tree=null;
		Object COMMA43_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:121:3: ( UPDATE tableRef SET setter ( COMMA setter )* ( where )? )
			// C:\\FakeWH\\GenericSQL.g:121:5: UPDATE tableRef SET setter ( COMMA setter )* ( where )?
			{
			root_0 = (Object)adaptor.nil();


			UPDATE39=(Token)match(input,UPDATE,FOLLOW_UPDATE_in_update387); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			UPDATE39_tree = (Object)adaptor.create(UPDATE39);
			adaptor.addChild(root_0, UPDATE39_tree);
			}

			pushFollow(FOLLOW_tableRef_in_update389);
			tableRef40=tableRef();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, tableRef40.getTree());

			SET41=(Token)match(input,SET,FOLLOW_SET_in_update391); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			SET41_tree = (Object)adaptor.create(SET41);
			adaptor.addChild(root_0, SET41_tree);
			}

			pushFollow(FOLLOW_setter_in_update393);
			setter42=setter();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, setter42.getTree());

			// C:\\FakeWH\\GenericSQL.g:121:32: ( COMMA setter )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0==COMMA) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:121:34: COMMA setter
					{
					COMMA43=(Token)match(input,COMMA,FOLLOW_COMMA_in_update397); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA43_tree = (Object)adaptor.create(COMMA43);
					adaptor.addChild(root_0, COMMA43_tree);
					}

					pushFollow(FOLLOW_setter_in_update399);
					setter44=setter();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, setter44.getTree());

					}
					break;

				default :
					break loop19;
				}
			}

			// C:\\FakeWH\\GenericSQL.g:122:5: ( where )?
			int alt20=2;
			int LA20_0 = input.LA(1);
			if ( (LA20_0==WHERE) ) {
				alt20=1;
			}
			switch (alt20) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:122:7: where
					{
					pushFollow(FOLLOW_where_in_update410);
					where45=where();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, where45.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "update"


	public static class setter_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "setter"
	// C:\\FakeWH\\GenericSQL.g:125:1: setter : columnName EQ literal ;
	public final GenericSQLParser.setter_return setter() throws RecognitionException {
		GenericSQLParser.setter_return retval = new GenericSQLParser.setter_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EQ47=null;
		ParserRuleReturnScope columnName46 =null;
		ParserRuleReturnScope literal48 =null;

		Object EQ47_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:126:3: ( columnName EQ literal )
			// C:\\FakeWH\\GenericSQL.g:126:5: columnName EQ literal
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_columnName_in_setter428);
			columnName46=columnName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, columnName46.getTree());

			EQ47=(Token)match(input,EQ,FOLLOW_EQ_in_setter430); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			EQ47_tree = (Object)adaptor.create(EQ47);
			adaptor.addChild(root_0, EQ47_tree);
			}

			pushFollow(FOLLOW_literal_in_setter432);
			literal48=literal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, literal48.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "setter"


	public static class into_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "into"
	// C:\\FakeWH\\GenericSQL.g:129:1: into : INTO tableRef ( COMMA tableRef )* ;
	public final GenericSQLParser.into_return into() throws RecognitionException {
		GenericSQLParser.into_return retval = new GenericSQLParser.into_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token INTO49=null;
		Token COMMA51=null;
		ParserRuleReturnScope tableRef50 =null;
		ParserRuleReturnScope tableRef52 =null;

		Object INTO49_tree=null;
		Object COMMA51_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:130:3: ( INTO tableRef ( COMMA tableRef )* )
			// C:\\FakeWH\\GenericSQL.g:130:5: INTO tableRef ( COMMA tableRef )*
			{
			root_0 = (Object)adaptor.nil();


			INTO49=(Token)match(input,INTO,FOLLOW_INTO_in_into447); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			INTO49_tree = (Object)adaptor.create(INTO49);
			adaptor.addChild(root_0, INTO49_tree);
			}

			pushFollow(FOLLOW_tableRef_in_into449);
			tableRef50=tableRef();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, tableRef50.getTree());

			// C:\\FakeWH\\GenericSQL.g:130:19: ( COMMA tableRef )*
			loop21:
			while (true) {
				int alt21=2;
				int LA21_0 = input.LA(1);
				if ( (LA21_0==COMMA) ) {
					alt21=1;
				}

				switch (alt21) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:130:21: COMMA tableRef
					{
					COMMA51=(Token)match(input,COMMA,FOLLOW_COMMA_in_into453); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA51_tree = (Object)adaptor.create(COMMA51);
					adaptor.addChild(root_0, COMMA51_tree);
					}

					pushFollow(FOLLOW_tableRef_in_into455);
					tableRef52=tableRef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableRef52.getTree());

					}
					break;

				default :
					break loop21;
				}
			}

			if ( state.backtracking==0 ) {
			//  	System.out.println(input.toString(retval.start,input.LT(-1)));
			  	tempTable.setTableName(input.toString(retval.start,input.LT(-1)).substring(5));
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "into"


	public static class columnList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "columnList"
	// C:\\FakeWH\\GenericSQL.g:137:1: columnList : LPAREN columnName ( COMMA columnName )* RPAREN ;
	public final GenericSQLParser.columnList_return columnList() throws RecognitionException {
		GenericSQLParser.columnList_return retval = new GenericSQLParser.columnList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN53=null;
		Token COMMA55=null;
		Token RPAREN57=null;
		ParserRuleReturnScope columnName54 =null;
		ParserRuleReturnScope columnName56 =null;

		Object LPAREN53_tree=null;
		Object COMMA55_tree=null;
		Object RPAREN57_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:138:3: ( LPAREN columnName ( COMMA columnName )* RPAREN )
			// C:\\FakeWH\\GenericSQL.g:138:5: LPAREN columnName ( COMMA columnName )* RPAREN
			{
			root_0 = (Object)adaptor.nil();


			LPAREN53=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_columnList475); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN53_tree = (Object)adaptor.create(LPAREN53);
			adaptor.addChild(root_0, LPAREN53_tree);
			}

			pushFollow(FOLLOW_columnName_in_columnList477);
			columnName54=columnName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, columnName54.getTree());

			// C:\\FakeWH\\GenericSQL.g:138:23: ( COMMA columnName )*
			loop22:
			while (true) {
				int alt22=2;
				int LA22_0 = input.LA(1);
				if ( (LA22_0==COMMA) ) {
					alt22=1;
				}

				switch (alt22) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:138:25: COMMA columnName
					{
					COMMA55=(Token)match(input,COMMA,FOLLOW_COMMA_in_columnList481); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA55_tree = (Object)adaptor.create(COMMA55);
					adaptor.addChild(root_0, COMMA55_tree);
					}

					pushFollow(FOLLOW_columnName_in_columnList483);
					columnName56=columnName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, columnName56.getTree());

					}
					break;

				default :
					break loop22;
				}
			}

			RPAREN57=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_columnList488); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN57_tree = (Object)adaptor.create(RPAREN57);
			adaptor.addChild(root_0, RPAREN57_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "columnList"


	public static class values_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "values"
	// C:\\FakeWH\\GenericSQL.g:141:1: values : VALUES LPAREN literal ( COMMA literal )* RPAREN ;
	public final GenericSQLParser.values_return values() throws RecognitionException {
		GenericSQLParser.values_return retval = new GenericSQLParser.values_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token VALUES58=null;
		Token LPAREN59=null;
		Token COMMA61=null;
		Token RPAREN63=null;
		ParserRuleReturnScope literal60 =null;
		ParserRuleReturnScope literal62 =null;

		Object VALUES58_tree=null;
		Object LPAREN59_tree=null;
		Object COMMA61_tree=null;
		Object RPAREN63_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:142:3: ( VALUES LPAREN literal ( COMMA literal )* RPAREN )
			// C:\\FakeWH\\GenericSQL.g:142:5: VALUES LPAREN literal ( COMMA literal )* RPAREN
			{
			root_0 = (Object)adaptor.nil();


			VALUES58=(Token)match(input,VALUES,FOLLOW_VALUES_in_values503); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			VALUES58_tree = (Object)adaptor.create(VALUES58);
			adaptor.addChild(root_0, VALUES58_tree);
			}

			LPAREN59=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_values505); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN59_tree = (Object)adaptor.create(LPAREN59);
			adaptor.addChild(root_0, LPAREN59_tree);
			}

			pushFollow(FOLLOW_literal_in_values507);
			literal60=literal();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, literal60.getTree());

			// C:\\FakeWH\\GenericSQL.g:142:27: ( COMMA literal )*
			loop23:
			while (true) {
				int alt23=2;
				int LA23_0 = input.LA(1);
				if ( (LA23_0==COMMA) ) {
					alt23=1;
				}

				switch (alt23) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:142:29: COMMA literal
					{
					COMMA61=(Token)match(input,COMMA,FOLLOW_COMMA_in_values511); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA61_tree = (Object)adaptor.create(COMMA61);
					adaptor.addChild(root_0, COMMA61_tree);
					}

					pushFollow(FOLLOW_literal_in_values513);
					literal62=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal62.getTree());

					}
					break;

				default :
					break loop23;
				}
			}

			RPAREN63=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_values518); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN63_tree = (Object)adaptor.create(RPAREN63);
			adaptor.addChild(root_0, RPAREN63_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "values"


	public static class itemList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "itemList"
	// C:\\FakeWH\\GenericSQL.g:145:1: itemList : ( STAR | item ( COMMA item )* );
	public final GenericSQLParser.itemList_return itemList() throws RecognitionException {
		GenericSQLParser.itemList_return retval = new GenericSQLParser.itemList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token STAR64=null;
		Token COMMA66=null;
		ParserRuleReturnScope item65 =null;
		ParserRuleReturnScope item67 =null;

		Object STAR64_tree=null;
		Object COMMA66_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:146:3: ( STAR | item ( COMMA item )* )
			int alt25=2;
			int LA25_0 = input.LA(1);
			if ( (LA25_0==STAR) ) {
				int LA25_1 = input.LA(2);
				if ( (synpred28_GenericSQL()) ) {
					alt25=1;
				}
				else if ( (true) ) {
					alt25=2;
				}

			}
			else if ( (LA25_0==AVG||(LA25_0 >= CASE && LA25_0 <= COALESCE)||LA25_0==COUNT||LA25_0==DATE||LA25_0==Daytime||LA25_0==FALSE||LA25_0==Float||(LA25_0 >= Identifier && LA25_0 <= Integer)||LA25_0==LASTDAY||LA25_0==LPAREN||(LA25_0 >= MAX && LA25_0 <= MINUS)||LA25_0==NEXTDAY||LA25_0==NVL||LA25_0==PLUS||LA25_0==QuotedIdentifier||(LA25_0 >= SUM && LA25_0 <= String)||(LA25_0 >= TOCHAR && LA25_0 <= TONUMBER)||(LA25_0 >= TRUE && LA25_0 <= TRUNC)||(LA25_0 >= 131 && LA25_0 <= 133)) ) {
				alt25=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 25, 0, input);
				throw nvae;
			}

			switch (alt25) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:146:5: STAR
					{
					root_0 = (Object)adaptor.nil();


					STAR64=(Token)match(input,STAR,FOLLOW_STAR_in_itemList533); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					STAR64_tree = (Object)adaptor.create(STAR64);
					adaptor.addChild(root_0, STAR64_tree);
					}

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:147:5: item ( COMMA item )*
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_item_in_itemList539);
					item65=item();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, item65.getTree());

					// C:\\FakeWH\\GenericSQL.g:147:10: ( COMMA item )*
					loop24:
					while (true) {
						int alt24=2;
						int LA24_0 = input.LA(1);
						if ( (LA24_0==COMMA) ) {
							alt24=1;
						}

						switch (alt24) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:147:12: COMMA item
							{
							COMMA66=(Token)match(input,COMMA,FOLLOW_COMMA_in_itemList543); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COMMA66_tree = (Object)adaptor.create(COMMA66);
							adaptor.addChild(root_0, COMMA66_tree);
							}

							pushFollow(FOLLOW_item_in_itemList545);
							item67=item();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, item67.getTree());

							}
							break;

						default :
							break loop24;
						}
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "itemList"


	public static class item_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "item"
	// C:\\FakeWH\\GenericSQL.g:150:1: item : ( allColumns | expression ( ( AS )? alias )? );
	public final GenericSQLParser.item_return item() throws RecognitionException {
		GenericSQLParser.item_return retval = new GenericSQLParser.item_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AS70=null;
		ParserRuleReturnScope allColumns68 =null;
		ParserRuleReturnScope expression69 =null;
		ParserRuleReturnScope alias71 =null;

		Object AS70_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:151:3: ( allColumns | expression ( ( AS )? alias )? )
			int alt28=2;
			switch ( input.LA(1) ) {
			case Identifier:
				{
				int LA28_1 = input.LA(2);
				if ( (LA28_1==DOT) ) {
					int LA28_4 = input.LA(3);
					if ( (LA28_4==STAR) ) {
						alt28=1;
					}
					else if ( (LA28_4==Identifier||LA28_4==QuotedIdentifier) ) {
						alt28=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						int nvaeMark = input.mark();
						try {
							for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
								input.consume();
							}
							NoViableAltException nvae =
								new NoViableAltException("", 28, 4, input);
							throw nvae;
						} finally {
							input.rewind(nvaeMark);
						}
					}

				}
				else if ( (LA28_1==EOF||LA28_1==AS||LA28_1==COMMA||LA28_1==DIVIDE||LA28_1==FROM||LA28_1==INTO||LA28_1==Identifier||LA28_1==MINUS||LA28_1==PLUS||LA28_1==STAR) ) {
					alt28=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case STAR:
				{
				alt28=1;
				}
				break;
			case AVG:
			case CASE:
			case COALESCE:
			case COUNT:
			case DATE:
			case Daytime:
			case FALSE:
			case Float:
			case Integer:
			case LASTDAY:
			case LPAREN:
			case MAX:
			case MIN:
			case MINUS:
			case NEXTDAY:
			case NVL:
			case PLUS:
			case QuotedIdentifier:
			case SUM:
			case String:
			case TOCHAR:
			case TODATE:
			case TONUMBER:
			case TRUE:
			case TRUNC:
			case 131:
			case 132:
			case 133:
				{
				alt28=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}
			switch (alt28) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:151:5: allColumns
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_allColumns_in_item563);
					allColumns68=allColumns();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, allColumns68.getTree());

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:152:5: expression ( ( AS )? alias )?
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_expression_in_item569);
					expression69=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression69.getTree());

					// C:\\FakeWH\\GenericSQL.g:152:16: ( ( AS )? alias )?
					int alt27=2;
					int LA27_0 = input.LA(1);
					if ( (LA27_0==AS||LA27_0==Identifier) ) {
						alt27=1;
					}
					switch (alt27) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:152:18: ( AS )? alias
							{
							// C:\\FakeWH\\GenericSQL.g:152:18: ( AS )?
							int alt26=2;
							int LA26_0 = input.LA(1);
							if ( (LA26_0==AS) ) {
								alt26=1;
							}
							switch (alt26) {
								case 1 :
									// C:\\FakeWH\\GenericSQL.g:152:18: AS
									{
									AS70=(Token)match(input,AS,FOLLOW_AS_in_item573); if (state.failed) return retval;
									if ( state.backtracking==0 ) {
									AS70_tree = (Object)adaptor.create(AS70);
									adaptor.addChild(root_0, AS70_tree);
									}

									}
									break;

							}

							pushFollow(FOLLOW_alias_in_item576);
							alias71=alias();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, alias71.getTree());

							}
							break;

					}

					if ( state.backtracking==0 ) {
					//  	if((alias71!=null?input.toString(alias71.start,alias71.stop):null) != null)
					  		tempTable.AddColumn((alias71!=null?input.toString(alias71.start,alias71.stop):null), (expression69!=null?input.toString(expression69.start,expression69.stop):null));
					  }
					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "item"


	public static class allColumns_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "allColumns"
	// C:\\FakeWH\\GenericSQL.g:160:1: allColumns : ( tableAlias DOT )? STAR ;
	public final GenericSQLParser.allColumns_return allColumns() throws RecognitionException {
		GenericSQLParser.allColumns_return retval = new GenericSQLParser.allColumns_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DOT73=null;
		Token STAR74=null;
		ParserRuleReturnScope tableAlias72 =null;

		Object DOT73_tree=null;
		Object STAR74_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:161:3: ( ( tableAlias DOT )? STAR )
			// C:\\FakeWH\\GenericSQL.g:161:5: ( tableAlias DOT )? STAR
			{
			root_0 = (Object)adaptor.nil();


			// C:\\FakeWH\\GenericSQL.g:161:5: ( tableAlias DOT )?
			int alt29=2;
			int LA29_0 = input.LA(1);
			if ( (LA29_0==Identifier) ) {
				alt29=1;
			}
			switch (alt29) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:161:6: tableAlias DOT
					{
					pushFollow(FOLLOW_tableAlias_in_allColumns599);
					tableAlias72=tableAlias();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableAlias72.getTree());

					DOT73=(Token)match(input,DOT,FOLLOW_DOT_in_allColumns601); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT73_tree = (Object)adaptor.create(DOT73);
					adaptor.addChild(root_0, DOT73_tree);
					}

					}
					break;

			}

			STAR74=(Token)match(input,STAR,FOLLOW_STAR_in_allColumns605); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			STAR74_tree = (Object)adaptor.create(STAR74);
			adaptor.addChild(root_0, STAR74_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "allColumns"


	public static class alias_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "alias"
	// C:\\FakeWH\\GenericSQL.g:164:1: alias : Identifier ;
	public final GenericSQLParser.alias_return alias() throws RecognitionException {
		GenericSQLParser.alias_return retval = new GenericSQLParser.alias_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier75=null;

		Object Identifier75_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:165:3: ( Identifier )
			// C:\\FakeWH\\GenericSQL.g:165:5: Identifier
			{
			root_0 = (Object)adaptor.nil();


			Identifier75=(Token)match(input,Identifier,FOLLOW_Identifier_in_alias618); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier75_tree = (Object)adaptor.create(Identifier75);
			adaptor.addChild(root_0, Identifier75_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "alias"


	public static class function_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function"
	// C:\\FakeWH\\GenericSQL.g:168:1: function : functionName LPAREN ( ( DISTINCT )? ( allColumns | expression ) ( COMMA ( allColumns | expression ) )* )? RPAREN ;
	public final GenericSQLParser.function_return function() throws RecognitionException {
		GenericSQLParser.function_return retval = new GenericSQLParser.function_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN77=null;
		Token DISTINCT78=null;
		Token COMMA81=null;
		Token RPAREN84=null;
		ParserRuleReturnScope functionName76 =null;
		ParserRuleReturnScope allColumns79 =null;
		ParserRuleReturnScope expression80 =null;
		ParserRuleReturnScope allColumns82 =null;
		ParserRuleReturnScope expression83 =null;

		Object LPAREN77_tree=null;
		Object DISTINCT78_tree=null;
		Object COMMA81_tree=null;
		Object RPAREN84_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:169:3: ( functionName LPAREN ( ( DISTINCT )? ( allColumns | expression ) ( COMMA ( allColumns | expression ) )* )? RPAREN )
			// C:\\FakeWH\\GenericSQL.g:169:5: functionName LPAREN ( ( DISTINCT )? ( allColumns | expression ) ( COMMA ( allColumns | expression ) )* )? RPAREN
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_functionName_in_function633);
			functionName76=functionName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionName76.getTree());

			LPAREN77=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function635); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN77_tree = (Object)adaptor.create(LPAREN77);
			adaptor.addChild(root_0, LPAREN77_tree);
			}

			// C:\\FakeWH\\GenericSQL.g:169:25: ( ( DISTINCT )? ( allColumns | expression ) ( COMMA ( allColumns | expression ) )* )?
			int alt34=2;
			int LA34_0 = input.LA(1);
			if ( (LA34_0==AVG||(LA34_0 >= CASE && LA34_0 <= COALESCE)||LA34_0==COUNT||LA34_0==DATE||LA34_0==DISTINCT||LA34_0==Daytime||LA34_0==FALSE||LA34_0==Float||(LA34_0 >= Identifier && LA34_0 <= Integer)||LA34_0==LASTDAY||LA34_0==LPAREN||(LA34_0 >= MAX && LA34_0 <= MINUS)||LA34_0==NEXTDAY||LA34_0==NVL||LA34_0==PLUS||LA34_0==QuotedIdentifier||LA34_0==STAR||(LA34_0 >= SUM && LA34_0 <= String)||(LA34_0 >= TOCHAR && LA34_0 <= TONUMBER)||(LA34_0 >= TRUE && LA34_0 <= TRUNC)||(LA34_0 >= 131 && LA34_0 <= 133)) ) {
				alt34=1;
			}
			switch (alt34) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:169:27: ( DISTINCT )? ( allColumns | expression ) ( COMMA ( allColumns | expression ) )*
					{
					// C:\\FakeWH\\GenericSQL.g:169:27: ( DISTINCT )?
					int alt30=2;
					int LA30_0 = input.LA(1);
					if ( (LA30_0==DISTINCT) ) {
						alt30=1;
					}
					switch (alt30) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:169:28: DISTINCT
							{
							DISTINCT78=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_function640); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DISTINCT78_tree = (Object)adaptor.create(DISTINCT78);
							adaptor.addChild(root_0, DISTINCT78_tree);
							}

							}
							break;

					}

					// C:\\FakeWH\\GenericSQL.g:169:38: ( allColumns | expression )
					int alt31=2;
					switch ( input.LA(1) ) {
					case Identifier:
						{
						int LA31_1 = input.LA(2);
						if ( (LA31_1==DOT) ) {
							int LA31_4 = input.LA(3);
							if ( (LA31_4==STAR) ) {
								alt31=1;
							}
							else if ( (LA31_4==Identifier||LA31_4==QuotedIdentifier) ) {
								alt31=2;
							}

							else {
								if (state.backtracking>0) {state.failed=true; return retval;}
								int nvaeMark = input.mark();
								try {
									for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
										input.consume();
									}
									NoViableAltException nvae =
										new NoViableAltException("", 31, 4, input);
									throw nvae;
								} finally {
									input.rewind(nvaeMark);
								}
							}

						}
						else if ( (LA31_1==COMMA||LA31_1==DIVIDE||LA31_1==MINUS||LA31_1==PLUS||LA31_1==RPAREN||LA31_1==STAR) ) {
							alt31=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 31, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case STAR:
						{
						alt31=1;
						}
						break;
					case AVG:
					case CASE:
					case COALESCE:
					case COUNT:
					case DATE:
					case Daytime:
					case FALSE:
					case Float:
					case Integer:
					case LASTDAY:
					case LPAREN:
					case MAX:
					case MIN:
					case MINUS:
					case NEXTDAY:
					case NVL:
					case PLUS:
					case QuotedIdentifier:
					case SUM:
					case String:
					case TOCHAR:
					case TODATE:
					case TONUMBER:
					case TRUE:
					case TRUNC:
					case 131:
					case 132:
					case 133:
						{
						alt31=2;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 31, 0, input);
						throw nvae;
					}
					switch (alt31) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:169:39: allColumns
							{
							pushFollow(FOLLOW_allColumns_in_function644);
							allColumns79=allColumns();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, allColumns79.getTree());

							}
							break;
						case 2 :
							// C:\\FakeWH\\GenericSQL.g:169:50: expression
							{
							pushFollow(FOLLOW_expression_in_function646);
							expression80=expression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, expression80.getTree());

							}
							break;

					}

					// C:\\FakeWH\\GenericSQL.g:169:62: ( COMMA ( allColumns | expression ) )*
					loop33:
					while (true) {
						int alt33=2;
						int LA33_0 = input.LA(1);
						if ( (LA33_0==COMMA) ) {
							alt33=1;
						}

						switch (alt33) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:169:64: COMMA ( allColumns | expression )
							{
							COMMA81=(Token)match(input,COMMA,FOLLOW_COMMA_in_function651); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COMMA81_tree = (Object)adaptor.create(COMMA81);
							adaptor.addChild(root_0, COMMA81_tree);
							}

							// C:\\FakeWH\\GenericSQL.g:169:70: ( allColumns | expression )
							int alt32=2;
							switch ( input.LA(1) ) {
							case Identifier:
								{
								int LA32_1 = input.LA(2);
								if ( (LA32_1==DOT) ) {
									int LA32_4 = input.LA(3);
									if ( (LA32_4==STAR) ) {
										alt32=1;
									}
									else if ( (LA32_4==Identifier||LA32_4==QuotedIdentifier) ) {
										alt32=2;
									}

									else {
										if (state.backtracking>0) {state.failed=true; return retval;}
										int nvaeMark = input.mark();
										try {
											for (int nvaeConsume = 0; nvaeConsume < 3 - 1; nvaeConsume++) {
												input.consume();
											}
											NoViableAltException nvae =
												new NoViableAltException("", 32, 4, input);
											throw nvae;
										} finally {
											input.rewind(nvaeMark);
										}
									}

								}
								else if ( (LA32_1==COMMA||LA32_1==DIVIDE||LA32_1==MINUS||LA32_1==PLUS||LA32_1==RPAREN||LA32_1==STAR) ) {
									alt32=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 32, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case STAR:
								{
								alt32=1;
								}
								break;
							case AVG:
							case CASE:
							case COALESCE:
							case COUNT:
							case DATE:
							case Daytime:
							case FALSE:
							case Float:
							case Integer:
							case LASTDAY:
							case LPAREN:
							case MAX:
							case MIN:
							case MINUS:
							case NEXTDAY:
							case NVL:
							case PLUS:
							case QuotedIdentifier:
							case SUM:
							case String:
							case TOCHAR:
							case TODATE:
							case TONUMBER:
							case TRUE:
							case TRUNC:
							case 131:
							case 132:
							case 133:
								{
								alt32=2;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 32, 0, input);
								throw nvae;
							}
							switch (alt32) {
								case 1 :
									// C:\\FakeWH\\GenericSQL.g:169:71: allColumns
									{
									pushFollow(FOLLOW_allColumns_in_function654);
									allColumns82=allColumns();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, allColumns82.getTree());

									}
									break;
								case 2 :
									// C:\\FakeWH\\GenericSQL.g:169:82: expression
									{
									pushFollow(FOLLOW_expression_in_function656);
									expression83=expression();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, expression83.getTree());

									}
									break;

							}

							}
							break;

						default :
							break loop33;
						}
					}

					}
					break;

			}

			RPAREN84=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function665); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN84_tree = (Object)adaptor.create(RPAREN84);
			adaptor.addChild(root_0, RPAREN84_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function"


	public static class function1_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "function1"
	// C:\\FakeWH\\GenericSQL.g:172:1: function1 : functionName LPAREN ( ( DISTINCT )? ( allColumns | value | function ) ( COMMA ( allColumns | value | function ) )* )? RPAREN ;
	public final GenericSQLParser.function1_return function1() throws RecognitionException {
		GenericSQLParser.function1_return retval = new GenericSQLParser.function1_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN86=null;
		Token DISTINCT87=null;
		Token COMMA91=null;
		Token RPAREN95=null;
		ParserRuleReturnScope functionName85 =null;
		ParserRuleReturnScope allColumns88 =null;
		ParserRuleReturnScope value89 =null;
		ParserRuleReturnScope function90 =null;
		ParserRuleReturnScope allColumns92 =null;
		ParserRuleReturnScope value93 =null;
		ParserRuleReturnScope function94 =null;

		Object LPAREN86_tree=null;
		Object DISTINCT87_tree=null;
		Object COMMA91_tree=null;
		Object RPAREN95_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:173:3: ( functionName LPAREN ( ( DISTINCT )? ( allColumns | value | function ) ( COMMA ( allColumns | value | function ) )* )? RPAREN )
			// C:\\FakeWH\\GenericSQL.g:173:5: functionName LPAREN ( ( DISTINCT )? ( allColumns | value | function ) ( COMMA ( allColumns | value | function ) )* )? RPAREN
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_functionName_in_function1681);
			functionName85=functionName();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, functionName85.getTree());

			LPAREN86=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_function1683); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN86_tree = (Object)adaptor.create(LPAREN86);
			adaptor.addChild(root_0, LPAREN86_tree);
			}

			// C:\\FakeWH\\GenericSQL.g:173:25: ( ( DISTINCT )? ( allColumns | value | function ) ( COMMA ( allColumns | value | function ) )* )?
			int alt39=2;
			int LA39_0 = input.LA(1);
			if ( (LA39_0==AVG||(LA39_0 >= CASE && LA39_0 <= COALESCE)||LA39_0==COUNT||LA39_0==DATE||LA39_0==DISTINCT||LA39_0==Daytime||LA39_0==FALSE||LA39_0==Float||(LA39_0 >= Identifier && LA39_0 <= Integer)||LA39_0==LASTDAY||LA39_0==LPAREN||(LA39_0 >= MAX && LA39_0 <= MINUS)||LA39_0==NEXTDAY||LA39_0==NVL||LA39_0==PLUS||LA39_0==QuotedIdentifier||LA39_0==STAR||(LA39_0 >= SUM && LA39_0 <= String)||(LA39_0 >= TOCHAR && LA39_0 <= TONUMBER)||(LA39_0 >= TRUE && LA39_0 <= TRUNC)||(LA39_0 >= 131 && LA39_0 <= 133)) ) {
				alt39=1;
			}
			switch (alt39) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:173:27: ( DISTINCT )? ( allColumns | value | function ) ( COMMA ( allColumns | value | function ) )*
					{
					// C:\\FakeWH\\GenericSQL.g:173:27: ( DISTINCT )?
					int alt35=2;
					int LA35_0 = input.LA(1);
					if ( (LA35_0==DISTINCT) ) {
						alt35=1;
					}
					switch (alt35) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:173:28: DISTINCT
							{
							DISTINCT87=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_function1688); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							DISTINCT87_tree = (Object)adaptor.create(DISTINCT87);
							adaptor.addChild(root_0, DISTINCT87_tree);
							}

							}
							break;

					}

					// C:\\FakeWH\\GenericSQL.g:173:38: ( allColumns | value | function )
					int alt36=3;
					switch ( input.LA(1) ) {
					case Identifier:
						{
						int LA36_1 = input.LA(2);
						if ( (synpred40_GenericSQL()) ) {
							alt36=1;
						}
						else if ( (synpred41_GenericSQL()) ) {
							alt36=2;
						}

						else {
							if (state.backtracking>0) {state.failed=true; return retval;}
							int nvaeMark = input.mark();
							try {
								input.consume();
								NoViableAltException nvae =
									new NoViableAltException("", 36, 1, input);
								throw nvae;
							} finally {
								input.rewind(nvaeMark);
							}
						}

						}
						break;
					case STAR:
						{
						alt36=1;
						}
						break;
					case AVG:
					case COALESCE:
					case COUNT:
					case LASTDAY:
					case MAX:
					case MIN:
					case NEXTDAY:
					case NVL:
					case SUM:
					case TOCHAR:
					case TODATE:
					case TONUMBER:
					case TRUNC:
						{
						int LA36_3 = input.LA(2);
						if ( (synpred41_GenericSQL()) ) {
							alt36=2;
						}
						else if ( (true) ) {
							alt36=3;
						}

						}
						break;
					case CASE:
					case DATE:
					case Daytime:
					case FALSE:
					case Float:
					case Integer:
					case LPAREN:
					case MINUS:
					case PLUS:
					case QuotedIdentifier:
					case String:
					case TRUE:
					case 131:
					case 132:
					case 133:
						{
						alt36=2;
						}
						break;
					default:
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 36, 0, input);
						throw nvae;
					}
					switch (alt36) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:173:39: allColumns
							{
							pushFollow(FOLLOW_allColumns_in_function1692);
							allColumns88=allColumns();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, allColumns88.getTree());

							}
							break;
						case 2 :
							// C:\\FakeWH\\GenericSQL.g:173:50: value
							{
							pushFollow(FOLLOW_value_in_function1694);
							value89=value();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, value89.getTree());

							}
							break;
						case 3 :
							// C:\\FakeWH\\GenericSQL.g:173:56: function
							{
							pushFollow(FOLLOW_function_in_function1696);
							function90=function();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, function90.getTree());

							}
							break;

					}

					// C:\\FakeWH\\GenericSQL.g:173:66: ( COMMA ( allColumns | value | function ) )*
					loop38:
					while (true) {
						int alt38=2;
						int LA38_0 = input.LA(1);
						if ( (LA38_0==COMMA) ) {
							alt38=1;
						}

						switch (alt38) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:173:68: COMMA ( allColumns | value | function )
							{
							COMMA91=(Token)match(input,COMMA,FOLLOW_COMMA_in_function1701); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COMMA91_tree = (Object)adaptor.create(COMMA91);
							adaptor.addChild(root_0, COMMA91_tree);
							}

							// C:\\FakeWH\\GenericSQL.g:173:74: ( allColumns | value | function )
							int alt37=3;
							switch ( input.LA(1) ) {
							case Identifier:
								{
								int LA37_1 = input.LA(2);
								if ( (synpred42_GenericSQL()) ) {
									alt37=1;
								}
								else if ( (synpred43_GenericSQL()) ) {
									alt37=2;
								}

								else {
									if (state.backtracking>0) {state.failed=true; return retval;}
									int nvaeMark = input.mark();
									try {
										input.consume();
										NoViableAltException nvae =
											new NoViableAltException("", 37, 1, input);
										throw nvae;
									} finally {
										input.rewind(nvaeMark);
									}
								}

								}
								break;
							case STAR:
								{
								alt37=1;
								}
								break;
							case AVG:
							case COALESCE:
							case COUNT:
							case LASTDAY:
							case MAX:
							case MIN:
							case NEXTDAY:
							case NVL:
							case SUM:
							case TOCHAR:
							case TODATE:
							case TONUMBER:
							case TRUNC:
								{
								int LA37_3 = input.LA(2);
								if ( (synpred43_GenericSQL()) ) {
									alt37=2;
								}
								else if ( (true) ) {
									alt37=3;
								}

								}
								break;
							case CASE:
							case DATE:
							case Daytime:
							case FALSE:
							case Float:
							case Integer:
							case LPAREN:
							case MINUS:
							case PLUS:
							case QuotedIdentifier:
							case String:
							case TRUE:
							case 131:
							case 132:
							case 133:
								{
								alt37=2;
								}
								break;
							default:
								if (state.backtracking>0) {state.failed=true; return retval;}
								NoViableAltException nvae =
									new NoViableAltException("", 37, 0, input);
								throw nvae;
							}
							switch (alt37) {
								case 1 :
									// C:\\FakeWH\\GenericSQL.g:173:75: allColumns
									{
									pushFollow(FOLLOW_allColumns_in_function1704);
									allColumns92=allColumns();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, allColumns92.getTree());

									}
									break;
								case 2 :
									// C:\\FakeWH\\GenericSQL.g:173:86: value
									{
									pushFollow(FOLLOW_value_in_function1706);
									value93=value();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, value93.getTree());

									}
									break;
								case 3 :
									// C:\\FakeWH\\GenericSQL.g:173:92: function
									{
									pushFollow(FOLLOW_function_in_function1708);
									function94=function();
									state._fsp--;
									if (state.failed) return retval;
									if ( state.backtracking==0 ) adaptor.addChild(root_0, function94.getTree());

									}
									break;

							}

							}
							break;

						default :
							break loop38;
						}
					}

					}
					break;

			}

			RPAREN95=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_function1717); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN95_tree = (Object)adaptor.create(RPAREN95);
			adaptor.addChild(root_0, RPAREN95_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "function1"


	public static class functionName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "functionName"
	// C:\\FakeWH\\GenericSQL.g:176:1: functionName : ( COUNT | MIN | MAX | SUM | AVG | NVL | COALESCE | TOCHAR | TODATE | LASTDAY | TONUMBER | NEXTDAY | TRUNC );
	public final GenericSQLParser.functionName_return functionName() throws RecognitionException {
		GenericSQLParser.functionName_return retval = new GenericSQLParser.functionName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set96=null;

		Object set96_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:177:3: ( COUNT | MIN | MAX | SUM | AVG | NVL | COALESCE | TOCHAR | TODATE | LASTDAY | TONUMBER | NEXTDAY | TRUNC )
			// C:\\FakeWH\\GenericSQL.g:
			{
			root_0 = (Object)adaptor.nil();


			set96=input.LT(1);
			if ( input.LA(1)==AVG||input.LA(1)==COALESCE||input.LA(1)==COUNT||input.LA(1)==LASTDAY||(input.LA(1) >= MAX && input.LA(1) <= MIN)||input.LA(1)==NEXTDAY||input.LA(1)==NVL||input.LA(1)==SUM||(input.LA(1) >= TOCHAR && input.LA(1) <= TONUMBER)||input.LA(1)==TRUNC ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set96));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "functionName"


	public static class from_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "from"
	// C:\\FakeWH\\GenericSQL.g:193:1: from : FROM fromItem ( COMMA fromItem )* ;
	public final GenericSQLParser.from_return from() throws RecognitionException {
		GenericSQLParser.from_return retval = new GenericSQLParser.from_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token FROM97=null;
		Token COMMA99=null;
		ParserRuleReturnScope fromItem98 =null;
		ParserRuleReturnScope fromItem100 =null;

		Object FROM97_tree=null;
		Object COMMA99_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:194:3: ( FROM fromItem ( COMMA fromItem )* )
			// C:\\FakeWH\\GenericSQL.g:194:5: FROM fromItem ( COMMA fromItem )*
			{
			root_0 = (Object)adaptor.nil();


			FROM97=(Token)match(input,FROM,FOLLOW_FROM_in_from821); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			FROM97_tree = (Object)adaptor.create(FROM97);
			adaptor.addChild(root_0, FROM97_tree);
			}

			pushFollow(FOLLOW_fromItem_in_from823);
			fromItem98=fromItem();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fromItem98.getTree());

			// C:\\FakeWH\\GenericSQL.g:194:19: ( COMMA fromItem )*
			loop40:
			while (true) {
				int alt40=2;
				int LA40_0 = input.LA(1);
				if ( (LA40_0==COMMA) ) {
					int LA40_2 = input.LA(2);
					if ( (synpred58_GenericSQL()) ) {
						alt40=1;
					}

				}

				switch (alt40) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:194:21: COMMA fromItem
					{
					COMMA99=(Token)match(input,COMMA,FOLLOW_COMMA_in_from827); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA99_tree = (Object)adaptor.create(COMMA99);
					adaptor.addChild(root_0, COMMA99_tree);
					}

					pushFollow(FOLLOW_fromItem_in_from829);
					fromItem100=fromItem();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, fromItem100.getTree());

					}
					break;

				default :
					break loop40;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "from"


	public static class fromItem_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "fromItem"
	// C:\\FakeWH\\GenericSQL.g:197:1: fromItem : ( subSelect | tableRef ) ( ( AS )? alias )? ;
	public final GenericSQLParser.fromItem_return fromItem() throws RecognitionException {
		GenericSQLParser.fromItem_return retval = new GenericSQLParser.fromItem_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token AS103=null;
		ParserRuleReturnScope subSelect101 =null;
		ParserRuleReturnScope tableRef102 =null;
		ParserRuleReturnScope alias104 =null;

		Object AS103_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:198:3: ( ( subSelect | tableRef ) ( ( AS )? alias )? )
			// C:\\FakeWH\\GenericSQL.g:198:5: ( subSelect | tableRef ) ( ( AS )? alias )?
			{
			root_0 = (Object)adaptor.nil();


			// C:\\FakeWH\\GenericSQL.g:198:5: ( subSelect | tableRef )
			int alt41=2;
			int LA41_0 = input.LA(1);
			if ( (LA41_0==LPAREN||LA41_0==SELECT) ) {
				alt41=1;
			}
			else if ( (LA41_0==Identifier||LA41_0==QuotedIdentifier) ) {
				alt41=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 41, 0, input);
				throw nvae;
			}

			switch (alt41) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:198:7: subSelect
					{
					pushFollow(FOLLOW_subSelect_in_fromItem849);
					subSelect101=subSelect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subSelect101.getTree());

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:199:7: tableRef
					{
					pushFollow(FOLLOW_tableRef_in_fromItem857);
					tableRef102=tableRef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableRef102.getTree());

					}
					break;

			}

			// C:\\FakeWH\\GenericSQL.g:201:5: ( ( AS )? alias )?
			int alt43=2;
			int LA43_0 = input.LA(1);
			if ( (LA43_0==AS) ) {
				int LA43_1 = input.LA(2);
				if ( (synpred61_GenericSQL()) ) {
					alt43=1;
				}
			}
			else if ( (LA43_0==Identifier) ) {
				int LA43_2 = input.LA(2);
				if ( (synpred61_GenericSQL()) ) {
					alt43=1;
				}
			}
			switch (alt43) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:201:7: ( AS )? alias
					{
					// C:\\FakeWH\\GenericSQL.g:201:7: ( AS )?
					int alt42=2;
					int LA42_0 = input.LA(1);
					if ( (LA42_0==AS) ) {
						alt42=1;
					}
					switch (alt42) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:201:9: AS
							{
							AS103=(Token)match(input,AS,FOLLOW_AS_in_fromItem874); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							AS103_tree = (Object)adaptor.create(AS103);
							adaptor.addChild(root_0, AS103_tree);
							}

							}
							break;

					}

					pushFollow(FOLLOW_alias_in_fromItem879);
					alias104=alias();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, alias104.getTree());

					}
					break;

			}

			if ( state.backtracking==0 ) {
			    	if((tableRef102!=null?input.toString(tableRef102.start,tableRef102.stop):null) != null)
			    	{
			    		if((alias104!=null?input.toString(alias104.start,alias104.stop):null) != null)
			    		{
				    		System.out.println((tableRef102!=null?input.toString(tableRef102.start,tableRef102.stop):null) + "," + (alias104!=null?input.toString(alias104.start,alias104.stop):null));
				    		sql.AddAlia((alias104!=null?input.toString(alias104.start,alias104.stop):null), (tableRef102!=null?input.toString(tableRef102.start,tableRef102.stop):null));
			    		}
			    		else
			    		{
			    			System.out.println((tableRef102!=null?input.toString(tableRef102.start,tableRef102.stop):null) + "," + (alias104!=null?input.toString(alias104.start,alias104.stop):null));
			    			TableColumn tabcol = tempTable.getColumn("fakecol");
			    			if(!(tableRef102!=null?input.toString(tableRef102.start,tableRef102.stop):null).contains("."))
			    				tabcol.SetTable((tableRef102!=null?input.toString(tableRef102.start,tableRef102.stop):null));
			    			else
			    				tabcol.SetTable((tableRef102!=null?input.toString(tableRef102.start,tableRef102.stop):null).split("\\.")[1]);
			    			tempTable.setColumn("fakecol", tabcol);
			    		}
			    	}
			    	else 
				    	if((alias104!=null?input.toString(alias104.start,alias104.stop):null) != null)
				    	{
				    		if(tempTable.getTableName() == null)
				    		{
				    			tempTable.setTableName("ttable" + sql.tcount);
				    			sql.tcount++;
				    		}
				    			    		
			      			TempTable tempTab = new TempTable(tempTable);
			  			sql.AddTempTable(tempTab.getTableName(), tempTab);
			  			
			  			sql.AddAlia((alias104!=null?input.toString(alias104.start,alias104.stop):null), tempTable.getTableName());
			  			
			  			if(!sql.tableStack.isEmpty())
			  				tempTable = sql.tableStack.pop();
			  			
			  			
				    		
				    	}
			    }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "fromItem"


	public static class joinList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "joinList"
	// C:\\FakeWH\\GenericSQL.g:244:1: joinList : ( join )* ;
	public final GenericSQLParser.joinList_return joinList() throws RecognitionException {
		GenericSQLParser.joinList_return retval = new GenericSQLParser.joinList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope join105 =null;


		try {
			// C:\\FakeWH\\GenericSQL.g:245:3: ( ( join )* )
			// C:\\FakeWH\\GenericSQL.g:245:5: ( join )*
			{
			root_0 = (Object)adaptor.nil();


			// C:\\FakeWH\\GenericSQL.g:245:5: ( join )*
			loop44:
			while (true) {
				int alt44=2;
				switch ( input.LA(1) ) {
				case JOIN:
					{
					int LA44_2 = input.LA(2);
					if ( (synpred62_GenericSQL()) ) {
						alt44=1;
					}

					}
					break;
				case INNER:
					{
					int LA44_3 = input.LA(2);
					if ( (synpred62_GenericSQL()) ) {
						alt44=1;
					}

					}
					break;
				case LEFT:
					{
					int LA44_4 = input.LA(2);
					if ( (synpred62_GenericSQL()) ) {
						alt44=1;
					}

					}
					break;
				case RIGHT:
					{
					int LA44_5 = input.LA(2);
					if ( (synpred62_GenericSQL()) ) {
						alt44=1;
					}

					}
					break;
				case OUTER:
					{
					int LA44_6 = input.LA(2);
					if ( (synpred62_GenericSQL()) ) {
						alt44=1;
					}

					}
					break;
				case NATURAL:
					{
					int LA44_7 = input.LA(2);
					if ( (synpred62_GenericSQL()) ) {
						alt44=1;
					}

					}
					break;
				case CROSS:
					{
					int LA44_8 = input.LA(2);
					if ( (synpred62_GenericSQL()) ) {
						alt44=1;
					}

					}
					break;
				case FULL:
					{
					int LA44_9 = input.LA(2);
					if ( (synpred62_GenericSQL()) ) {
						alt44=1;
					}

					}
					break;
				}
				switch (alt44) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:245:7: join
					{
					pushFollow(FOLLOW_join_in_joinList903);
					join105=join();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, join105.getTree());

					}
					break;

				default :
					break loop44;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "joinList"


	public static class join_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "join"
	// C:\\FakeWH\\GenericSQL.g:248:1: join : ( JOIN | INNER JOIN | LEFT JOIN | LEFT OUTER JOIN | RIGHT JOIN | RIGHT OUTER JOIN | OUTER JOIN | NATURAL JOIN | CROSS JOIN | FULL OUTER JOIN | FULL JOIN ) fromItem ( ON conditionList | USING LPAREN columnRef ( COMMA columnRef )* RPAREN )? ;
	public final GenericSQLParser.join_return join() throws RecognitionException {
		GenericSQLParser.join_return retval = new GenericSQLParser.join_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token JOIN106=null;
		Token INNER107=null;
		Token JOIN108=null;
		Token LEFT109=null;
		Token JOIN110=null;
		Token LEFT111=null;
		Token OUTER112=null;
		Token JOIN113=null;
		Token RIGHT114=null;
		Token JOIN115=null;
		Token RIGHT116=null;
		Token OUTER117=null;
		Token JOIN118=null;
		Token OUTER119=null;
		Token JOIN120=null;
		Token NATURAL121=null;
		Token JOIN122=null;
		Token CROSS123=null;
		Token JOIN124=null;
		Token FULL125=null;
		Token OUTER126=null;
		Token JOIN127=null;
		Token FULL128=null;
		Token JOIN129=null;
		Token ON131=null;
		Token USING133=null;
		Token LPAREN134=null;
		Token COMMA136=null;
		Token RPAREN138=null;
		ParserRuleReturnScope fromItem130 =null;
		ParserRuleReturnScope conditionList132 =null;
		ParserRuleReturnScope columnRef135 =null;
		ParserRuleReturnScope columnRef137 =null;

		Object JOIN106_tree=null;
		Object INNER107_tree=null;
		Object JOIN108_tree=null;
		Object LEFT109_tree=null;
		Object JOIN110_tree=null;
		Object LEFT111_tree=null;
		Object OUTER112_tree=null;
		Object JOIN113_tree=null;
		Object RIGHT114_tree=null;
		Object JOIN115_tree=null;
		Object RIGHT116_tree=null;
		Object OUTER117_tree=null;
		Object JOIN118_tree=null;
		Object OUTER119_tree=null;
		Object JOIN120_tree=null;
		Object NATURAL121_tree=null;
		Object JOIN122_tree=null;
		Object CROSS123_tree=null;
		Object JOIN124_tree=null;
		Object FULL125_tree=null;
		Object OUTER126_tree=null;
		Object JOIN127_tree=null;
		Object FULL128_tree=null;
		Object JOIN129_tree=null;
		Object ON131_tree=null;
		Object USING133_tree=null;
		Object LPAREN134_tree=null;
		Object COMMA136_tree=null;
		Object RPAREN138_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:249:3: ( ( JOIN | INNER JOIN | LEFT JOIN | LEFT OUTER JOIN | RIGHT JOIN | RIGHT OUTER JOIN | OUTER JOIN | NATURAL JOIN | CROSS JOIN | FULL OUTER JOIN | FULL JOIN ) fromItem ( ON conditionList | USING LPAREN columnRef ( COMMA columnRef )* RPAREN )? )
			// C:\\FakeWH\\GenericSQL.g:250:5: ( JOIN | INNER JOIN | LEFT JOIN | LEFT OUTER JOIN | RIGHT JOIN | RIGHT OUTER JOIN | OUTER JOIN | NATURAL JOIN | CROSS JOIN | FULL OUTER JOIN | FULL JOIN ) fromItem ( ON conditionList | USING LPAREN columnRef ( COMMA columnRef )* RPAREN )?
			{
			root_0 = (Object)adaptor.nil();


			// C:\\FakeWH\\GenericSQL.g:250:5: ( JOIN | INNER JOIN | LEFT JOIN | LEFT OUTER JOIN | RIGHT JOIN | RIGHT OUTER JOIN | OUTER JOIN | NATURAL JOIN | CROSS JOIN | FULL OUTER JOIN | FULL JOIN )
			int alt45=11;
			switch ( input.LA(1) ) {
			case JOIN:
				{
				alt45=1;
				}
				break;
			case INNER:
				{
				alt45=2;
				}
				break;
			case LEFT:
				{
				int LA45_3 = input.LA(2);
				if ( (LA45_3==JOIN) ) {
					alt45=3;
				}
				else if ( (LA45_3==OUTER) ) {
					alt45=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case RIGHT:
				{
				int LA45_4 = input.LA(2);
				if ( (LA45_4==JOIN) ) {
					alt45=5;
				}
				else if ( (LA45_4==OUTER) ) {
					alt45=6;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 4, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case OUTER:
				{
				alt45=7;
				}
				break;
			case NATURAL:
				{
				alt45=8;
				}
				break;
			case CROSS:
				{
				alt45=9;
				}
				break;
			case FULL:
				{
				int LA45_8 = input.LA(2);
				if ( (LA45_8==OUTER) ) {
					alt45=10;
				}
				else if ( (LA45_8==JOIN) ) {
					alt45=11;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 45, 8, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 45, 0, input);
				throw nvae;
			}
			switch (alt45) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:250:7: JOIN
					{
					JOIN106=(Token)match(input,JOIN,FOLLOW_JOIN_in_join928); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					JOIN106_tree = (Object)adaptor.create(JOIN106);
					adaptor.addChild(root_0, JOIN106_tree);
					}

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:251:7: INNER JOIN
					{
					INNER107=(Token)match(input,INNER,FOLLOW_INNER_in_join936); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					INNER107_tree = (Object)adaptor.create(INNER107);
					adaptor.addChild(root_0, INNER107_tree);
					}

					JOIN108=(Token)match(input,JOIN,FOLLOW_JOIN_in_join938); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					JOIN108_tree = (Object)adaptor.create(JOIN108);
					adaptor.addChild(root_0, JOIN108_tree);
					}

					}
					break;
				case 3 :
					// C:\\FakeWH\\GenericSQL.g:252:7: LEFT JOIN
					{
					LEFT109=(Token)match(input,LEFT,FOLLOW_LEFT_in_join946); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT109_tree = (Object)adaptor.create(LEFT109);
					adaptor.addChild(root_0, LEFT109_tree);
					}

					JOIN110=(Token)match(input,JOIN,FOLLOW_JOIN_in_join948); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					JOIN110_tree = (Object)adaptor.create(JOIN110);
					adaptor.addChild(root_0, JOIN110_tree);
					}

					}
					break;
				case 4 :
					// C:\\FakeWH\\GenericSQL.g:253:7: LEFT OUTER JOIN
					{
					LEFT111=(Token)match(input,LEFT,FOLLOW_LEFT_in_join956); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LEFT111_tree = (Object)adaptor.create(LEFT111);
					adaptor.addChild(root_0, LEFT111_tree);
					}

					OUTER112=(Token)match(input,OUTER,FOLLOW_OUTER_in_join958); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OUTER112_tree = (Object)adaptor.create(OUTER112);
					adaptor.addChild(root_0, OUTER112_tree);
					}

					JOIN113=(Token)match(input,JOIN,FOLLOW_JOIN_in_join960); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					JOIN113_tree = (Object)adaptor.create(JOIN113);
					adaptor.addChild(root_0, JOIN113_tree);
					}

					}
					break;
				case 5 :
					// C:\\FakeWH\\GenericSQL.g:254:7: RIGHT JOIN
					{
					RIGHT114=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_join968); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT114_tree = (Object)adaptor.create(RIGHT114);
					adaptor.addChild(root_0, RIGHT114_tree);
					}

					JOIN115=(Token)match(input,JOIN,FOLLOW_JOIN_in_join970); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					JOIN115_tree = (Object)adaptor.create(JOIN115);
					adaptor.addChild(root_0, JOIN115_tree);
					}

					}
					break;
				case 6 :
					// C:\\FakeWH\\GenericSQL.g:255:7: RIGHT OUTER JOIN
					{
					RIGHT116=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_join979); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RIGHT116_tree = (Object)adaptor.create(RIGHT116);
					adaptor.addChild(root_0, RIGHT116_tree);
					}

					OUTER117=(Token)match(input,OUTER,FOLLOW_OUTER_in_join981); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OUTER117_tree = (Object)adaptor.create(OUTER117);
					adaptor.addChild(root_0, OUTER117_tree);
					}

					JOIN118=(Token)match(input,JOIN,FOLLOW_JOIN_in_join983); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					JOIN118_tree = (Object)adaptor.create(JOIN118);
					adaptor.addChild(root_0, JOIN118_tree);
					}

					}
					break;
				case 7 :
					// C:\\FakeWH\\GenericSQL.g:256:7: OUTER JOIN
					{
					OUTER119=(Token)match(input,OUTER,FOLLOW_OUTER_in_join991); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OUTER119_tree = (Object)adaptor.create(OUTER119);
					adaptor.addChild(root_0, OUTER119_tree);
					}

					JOIN120=(Token)match(input,JOIN,FOLLOW_JOIN_in_join993); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					JOIN120_tree = (Object)adaptor.create(JOIN120);
					adaptor.addChild(root_0, JOIN120_tree);
					}

					}
					break;
				case 8 :
					// C:\\FakeWH\\GenericSQL.g:257:7: NATURAL JOIN
					{
					NATURAL121=(Token)match(input,NATURAL,FOLLOW_NATURAL_in_join1002); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NATURAL121_tree = (Object)adaptor.create(NATURAL121);
					adaptor.addChild(root_0, NATURAL121_tree);
					}

					JOIN122=(Token)match(input,JOIN,FOLLOW_JOIN_in_join1004); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					JOIN122_tree = (Object)adaptor.create(JOIN122);
					adaptor.addChild(root_0, JOIN122_tree);
					}

					}
					break;
				case 9 :
					// C:\\FakeWH\\GenericSQL.g:258:7: CROSS JOIN
					{
					CROSS123=(Token)match(input,CROSS,FOLLOW_CROSS_in_join1012); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					CROSS123_tree = (Object)adaptor.create(CROSS123);
					adaptor.addChild(root_0, CROSS123_tree);
					}

					JOIN124=(Token)match(input,JOIN,FOLLOW_JOIN_in_join1014); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					JOIN124_tree = (Object)adaptor.create(JOIN124);
					adaptor.addChild(root_0, JOIN124_tree);
					}

					}
					break;
				case 10 :
					// C:\\FakeWH\\GenericSQL.g:259:7: FULL OUTER JOIN
					{
					FULL125=(Token)match(input,FULL,FOLLOW_FULL_in_join1022); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FULL125_tree = (Object)adaptor.create(FULL125);
					adaptor.addChild(root_0, FULL125_tree);
					}

					OUTER126=(Token)match(input,OUTER,FOLLOW_OUTER_in_join1024); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					OUTER126_tree = (Object)adaptor.create(OUTER126);
					adaptor.addChild(root_0, OUTER126_tree);
					}

					JOIN127=(Token)match(input,JOIN,FOLLOW_JOIN_in_join1026); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					JOIN127_tree = (Object)adaptor.create(JOIN127);
					adaptor.addChild(root_0, JOIN127_tree);
					}

					}
					break;
				case 11 :
					// C:\\FakeWH\\GenericSQL.g:260:7: FULL JOIN
					{
					FULL128=(Token)match(input,FULL,FOLLOW_FULL_in_join1034); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FULL128_tree = (Object)adaptor.create(FULL128);
					adaptor.addChild(root_0, FULL128_tree);
					}

					JOIN129=(Token)match(input,JOIN,FOLLOW_JOIN_in_join1036); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					JOIN129_tree = (Object)adaptor.create(JOIN129);
					adaptor.addChild(root_0, JOIN129_tree);
					}

					}
					break;

			}

			pushFollow(FOLLOW_fromItem_in_join1047);
			fromItem130=fromItem();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, fromItem130.getTree());

			// C:\\FakeWH\\GenericSQL.g:263:3: ( ON conditionList | USING LPAREN columnRef ( COMMA columnRef )* RPAREN )?
			int alt47=3;
			int LA47_0 = input.LA(1);
			if ( (LA47_0==ON) ) {
				int LA47_1 = input.LA(2);
				if ( (synpred73_GenericSQL()) ) {
					alt47=1;
				}
			}
			else if ( (LA47_0==USING) ) {
				int LA47_2 = input.LA(2);
				if ( (synpred75_GenericSQL()) ) {
					alt47=2;
				}
			}
			switch (alt47) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:263:5: ON conditionList
					{
					ON131=(Token)match(input,ON,FOLLOW_ON_in_join1053); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					ON131_tree = (Object)adaptor.create(ON131);
					adaptor.addChild(root_0, ON131_tree);
					}

					pushFollow(FOLLOW_conditionList_in_join1055);
					conditionList132=conditionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionList132.getTree());

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:264:5: USING LPAREN columnRef ( COMMA columnRef )* RPAREN
					{
					USING133=(Token)match(input,USING,FOLLOW_USING_in_join1061); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					USING133_tree = (Object)adaptor.create(USING133);
					adaptor.addChild(root_0, USING133_tree);
					}

					LPAREN134=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_join1063); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					LPAREN134_tree = (Object)adaptor.create(LPAREN134);
					adaptor.addChild(root_0, LPAREN134_tree);
					}

					pushFollow(FOLLOW_columnRef_in_join1065);
					columnRef135=columnRef();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, columnRef135.getTree());

					// C:\\FakeWH\\GenericSQL.g:264:28: ( COMMA columnRef )*
					loop46:
					while (true) {
						int alt46=2;
						int LA46_0 = input.LA(1);
						if ( (LA46_0==COMMA) ) {
							alt46=1;
						}

						switch (alt46) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:264:30: COMMA columnRef
							{
							COMMA136=(Token)match(input,COMMA,FOLLOW_COMMA_in_join1069); if (state.failed) return retval;
							if ( state.backtracking==0 ) {
							COMMA136_tree = (Object)adaptor.create(COMMA136);
							adaptor.addChild(root_0, COMMA136_tree);
							}

							pushFollow(FOLLOW_columnRef_in_join1071);
							columnRef137=columnRef();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, columnRef137.getTree());

							}
							break;

						default :
							break loop46;
						}
					}

					RPAREN138=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_join1076); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					RPAREN138_tree = (Object)adaptor.create(RPAREN138);
					adaptor.addChild(root_0, RPAREN138_tree);
					}

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "join"


	public static class where_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "where"
	// C:\\FakeWH\\GenericSQL.g:275:1: where : WHERE conditionList ;
	public final GenericSQLParser.where_return where() throws RecognitionException {
		GenericSQLParser.where_return retval = new GenericSQLParser.where_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHERE139=null;
		ParserRuleReturnScope conditionList140 =null;

		Object WHERE139_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:276:3: ( WHERE conditionList )
			// C:\\FakeWH\\GenericSQL.g:276:5: WHERE conditionList
			{
			root_0 = (Object)adaptor.nil();


			WHERE139=(Token)match(input,WHERE,FOLLOW_WHERE_in_where1103); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHERE139_tree = (Object)adaptor.create(WHERE139);
			adaptor.addChild(root_0, WHERE139_tree);
			}

			pushFollow(FOLLOW_conditionList_in_where1105);
			conditionList140=conditionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionList140.getTree());

			if ( state.backtracking==0 ) {System.out.println(input.toString(retval.start,input.LT(-1)));}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "where"


	public static class groupBy_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "groupBy"
	// C:\\FakeWH\\GenericSQL.g:280:1: groupBy : GROUP BY expression ( COMMA expression )* ;
	public final GenericSQLParser.groupBy_return groupBy() throws RecognitionException {
		GenericSQLParser.groupBy_return retval = new GenericSQLParser.groupBy_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token GROUP141=null;
		Token BY142=null;
		Token COMMA144=null;
		ParserRuleReturnScope expression143 =null;
		ParserRuleReturnScope expression145 =null;

		Object GROUP141_tree=null;
		Object BY142_tree=null;
		Object COMMA144_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:281:3: ( GROUP BY expression ( COMMA expression )* )
			// C:\\FakeWH\\GenericSQL.g:281:5: GROUP BY expression ( COMMA expression )*
			{
			root_0 = (Object)adaptor.nil();


			GROUP141=(Token)match(input,GROUP,FOLLOW_GROUP_in_groupBy1124); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			GROUP141_tree = (Object)adaptor.create(GROUP141);
			adaptor.addChild(root_0, GROUP141_tree);
			}

			BY142=(Token)match(input,BY,FOLLOW_BY_in_groupBy1126); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BY142_tree = (Object)adaptor.create(BY142);
			adaptor.addChild(root_0, BY142_tree);
			}

			pushFollow(FOLLOW_expression_in_groupBy1128);
			expression143=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression143.getTree());

			// C:\\FakeWH\\GenericSQL.g:281:25: ( COMMA expression )*
			loop48:
			while (true) {
				int alt48=2;
				int LA48_0 = input.LA(1);
				if ( (LA48_0==COMMA) ) {
					switch ( input.LA(2) ) {
					case LPAREN:
						{
						int LA48_3 = input.LA(3);
						if ( (LA48_3==AVG||(LA48_3 >= CASE && LA48_3 <= COALESCE)||LA48_3==COUNT||LA48_3==DATE||LA48_3==Daytime||LA48_3==FALSE||LA48_3==Float||(LA48_3 >= Identifier && LA48_3 <= Integer)||LA48_3==LASTDAY||LA48_3==LPAREN||(LA48_3 >= MAX && LA48_3 <= MINUS)||LA48_3==NEXTDAY||LA48_3==NVL||LA48_3==PLUS||LA48_3==QuotedIdentifier||(LA48_3 >= SUM && LA48_3 <= String)||(LA48_3 >= TOCHAR && LA48_3 <= TONUMBER)||(LA48_3 >= TRUE && LA48_3 <= TRUNC)||(LA48_3 >= 131 && LA48_3 <= 133)) ) {
							alt48=1;
						}

						}
						break;
					case Identifier:
						{
						int LA48_4 = input.LA(3);
						if ( (synpred76_GenericSQL()) ) {
							alt48=1;
						}

						}
						break;
					case AVG:
					case CASE:
					case COALESCE:
					case COUNT:
					case DATE:
					case Daytime:
					case FALSE:
					case Float:
					case Integer:
					case LASTDAY:
					case MAX:
					case MIN:
					case MINUS:
					case NEXTDAY:
					case NVL:
					case PLUS:
					case SUM:
					case String:
					case TOCHAR:
					case TODATE:
					case TONUMBER:
					case TRUE:
					case TRUNC:
					case 131:
					case 132:
					case 133:
						{
						alt48=1;
						}
						break;
					case QuotedIdentifier:
						{
						int LA48_6 = input.LA(3);
						if ( (synpred76_GenericSQL()) ) {
							alt48=1;
						}

						}
						break;
					}
				}

				switch (alt48) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:281:27: COMMA expression
					{
					COMMA144=(Token)match(input,COMMA,FOLLOW_COMMA_in_groupBy1132); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA144_tree = (Object)adaptor.create(COMMA144);
					adaptor.addChild(root_0, COMMA144_tree);
					}

					pushFollow(FOLLOW_expression_in_groupBy1134);
					expression145=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression145.getTree());

					}
					break;

				default :
					break loop48;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "groupBy"


	public static class having_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "having"
	// C:\\FakeWH\\GenericSQL.g:284:1: having : HAVING conditionList ;
	public final GenericSQLParser.having_return having() throws RecognitionException {
		GenericSQLParser.having_return retval = new GenericSQLParser.having_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token HAVING146=null;
		ParserRuleReturnScope conditionList147 =null;

		Object HAVING146_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:285:3: ( HAVING conditionList )
			// C:\\FakeWH\\GenericSQL.g:285:5: HAVING conditionList
			{
			root_0 = (Object)adaptor.nil();


			HAVING146=(Token)match(input,HAVING,FOLLOW_HAVING_in_having1152); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			HAVING146_tree = (Object)adaptor.create(HAVING146);
			adaptor.addChild(root_0, HAVING146_tree);
			}

			pushFollow(FOLLOW_conditionList_in_having1154);
			conditionList147=conditionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionList147.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "having"


	public static class orderBy_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orderBy"
	// C:\\FakeWH\\GenericSQL.g:288:1: orderBy : ORDER BY orderByItem ( COMMA orderByItem )* ;
	public final GenericSQLParser.orderBy_return orderBy() throws RecognitionException {
		GenericSQLParser.orderBy_return retval = new GenericSQLParser.orderBy_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ORDER148=null;
		Token BY149=null;
		Token COMMA151=null;
		ParserRuleReturnScope orderByItem150 =null;
		ParserRuleReturnScope orderByItem152 =null;

		Object ORDER148_tree=null;
		Object BY149_tree=null;
		Object COMMA151_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:289:3: ( ORDER BY orderByItem ( COMMA orderByItem )* )
			// C:\\FakeWH\\GenericSQL.g:289:5: ORDER BY orderByItem ( COMMA orderByItem )*
			{
			root_0 = (Object)adaptor.nil();


			ORDER148=(Token)match(input,ORDER,FOLLOW_ORDER_in_orderBy1169); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ORDER148_tree = (Object)adaptor.create(ORDER148);
			adaptor.addChild(root_0, ORDER148_tree);
			}

			BY149=(Token)match(input,BY,FOLLOW_BY_in_orderBy1171); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BY149_tree = (Object)adaptor.create(BY149);
			adaptor.addChild(root_0, BY149_tree);
			}

			pushFollow(FOLLOW_orderByItem_in_orderBy1173);
			orderByItem150=orderByItem();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, orderByItem150.getTree());

			// C:\\FakeWH\\GenericSQL.g:289:26: ( COMMA orderByItem )*
			loop49:
			while (true) {
				int alt49=2;
				int LA49_0 = input.LA(1);
				if ( (LA49_0==COMMA) ) {
					switch ( input.LA(2) ) {
					case LPAREN:
						{
						int LA49_3 = input.LA(3);
						if ( (LA49_3==AVG||(LA49_3 >= CASE && LA49_3 <= COALESCE)||LA49_3==COUNT||LA49_3==DATE||LA49_3==Daytime||LA49_3==FALSE||LA49_3==Float||(LA49_3 >= Identifier && LA49_3 <= Integer)||LA49_3==LASTDAY||LA49_3==LPAREN||(LA49_3 >= MAX && LA49_3 <= MINUS)||LA49_3==NEXTDAY||LA49_3==NVL||LA49_3==PLUS||LA49_3==QuotedIdentifier||(LA49_3 >= SUM && LA49_3 <= String)||(LA49_3 >= TOCHAR && LA49_3 <= TONUMBER)||(LA49_3 >= TRUE && LA49_3 <= TRUNC)||(LA49_3 >= 131 && LA49_3 <= 133)) ) {
							alt49=1;
						}

						}
						break;
					case Identifier:
						{
						int LA49_4 = input.LA(3);
						if ( (synpred77_GenericSQL()) ) {
							alt49=1;
						}

						}
						break;
					case AVG:
					case CASE:
					case COALESCE:
					case COUNT:
					case DATE:
					case Daytime:
					case FALSE:
					case Float:
					case Integer:
					case LASTDAY:
					case MAX:
					case MIN:
					case MINUS:
					case NEXTDAY:
					case NVL:
					case PLUS:
					case SUM:
					case String:
					case TOCHAR:
					case TODATE:
					case TONUMBER:
					case TRUE:
					case TRUNC:
					case 131:
					case 132:
					case 133:
						{
						alt49=1;
						}
						break;
					case QuotedIdentifier:
						{
						int LA49_6 = input.LA(3);
						if ( (synpred77_GenericSQL()) ) {
							alt49=1;
						}

						}
						break;
					}
				}

				switch (alt49) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:289:28: COMMA orderByItem
					{
					COMMA151=(Token)match(input,COMMA,FOLLOW_COMMA_in_orderBy1177); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA151_tree = (Object)adaptor.create(COMMA151);
					adaptor.addChild(root_0, COMMA151_tree);
					}

					pushFollow(FOLLOW_orderByItem_in_orderBy1179);
					orderByItem152=orderByItem();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, orderByItem152.getTree());

					}
					break;

				default :
					break loop49;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orderBy"


	public static class orderByItem_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "orderByItem"
	// C:\\FakeWH\\GenericSQL.g:292:1: orderByItem : expression ( ASC | DESC )? ;
	public final GenericSQLParser.orderByItem_return orderByItem() throws RecognitionException {
		GenericSQLParser.orderByItem_return retval = new GenericSQLParser.orderByItem_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set154=null;
		ParserRuleReturnScope expression153 =null;

		Object set154_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:293:3: ( expression ( ASC | DESC )? )
			// C:\\FakeWH\\GenericSQL.g:293:5: expression ( ASC | DESC )?
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_orderByItem1197);
			expression153=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression153.getTree());

			// C:\\FakeWH\\GenericSQL.g:293:16: ( ASC | DESC )?
			int alt50=2;
			int LA50_0 = input.LA(1);
			if ( (LA50_0==ASC||LA50_0==DESC) ) {
				alt50=1;
			}
			switch (alt50) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:
					{
					set154=input.LT(1);
					if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set154));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "orderByItem"


	public static class nestedCondition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nestedCondition"
	// C:\\FakeWH\\GenericSQL.g:296:1: nestedCondition : LPAREN conditionList RPAREN ;
	public final GenericSQLParser.nestedCondition_return nestedCondition() throws RecognitionException {
		GenericSQLParser.nestedCondition_return retval = new GenericSQLParser.nestedCondition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN155=null;
		Token RPAREN157=null;
		ParserRuleReturnScope conditionList156 =null;

		Object LPAREN155_tree=null;
		Object RPAREN157_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:297:3: ( LPAREN conditionList RPAREN )
			// C:\\FakeWH\\GenericSQL.g:297:5: LPAREN conditionList RPAREN
			{
			root_0 = (Object)adaptor.nil();


			LPAREN155=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_nestedCondition1223); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN155_tree = (Object)adaptor.create(LPAREN155);
			adaptor.addChild(root_0, LPAREN155_tree);
			}

			pushFollow(FOLLOW_conditionList_in_nestedCondition1225);
			conditionList156=conditionList();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, conditionList156.getTree());

			RPAREN157=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_nestedCondition1227); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN157_tree = (Object)adaptor.create(RPAREN157);
			adaptor.addChild(root_0, RPAREN157_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nestedCondition"


	public static class conditionList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "conditionList"
	// C:\\FakeWH\\GenericSQL.g:300:1: conditionList : condition ( ( OR | AND ) condition )* ;
	public final GenericSQLParser.conditionList_return conditionList() throws RecognitionException {
		GenericSQLParser.conditionList_return retval = new GenericSQLParser.conditionList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set159=null;
		ParserRuleReturnScope condition158 =null;
		ParserRuleReturnScope condition160 =null;

		Object set159_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:301:3: ( condition ( ( OR | AND ) condition )* )
			// C:\\FakeWH\\GenericSQL.g:301:5: condition ( ( OR | AND ) condition )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_condition_in_conditionList1242);
			condition158=condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, condition158.getTree());

			// C:\\FakeWH\\GenericSQL.g:301:15: ( ( OR | AND ) condition )*
			loop51:
			while (true) {
				int alt51=2;
				int LA51_0 = input.LA(1);
				if ( (LA51_0==AND) ) {
					int LA51_2 = input.LA(2);
					if ( (synpred81_GenericSQL()) ) {
						alt51=1;
					}

				}
				else if ( (LA51_0==OR) ) {
					int LA51_3 = input.LA(2);
					if ( (synpred81_GenericSQL()) ) {
						alt51=1;
					}

				}

				switch (alt51) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:301:17: ( OR | AND ) condition
					{
					set159=input.LT(1);
					if ( input.LA(1)==AND||input.LA(1)==OR ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set159));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_condition_in_conditionList1256);
					condition160=condition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, condition160.getTree());

					}
					break;

				default :
					break loop51;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "conditionList"


	public static class condition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "condition"
	// C:\\FakeWH\\GenericSQL.g:304:1: condition : ( NOT )? ( between | notbetween | nestedCondition | in | notin | isNull | exists | like | quantifier | comparison ) ;
	public final GenericSQLParser.condition_return condition() throws RecognitionException {
		GenericSQLParser.condition_return retval = new GenericSQLParser.condition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT161=null;
		ParserRuleReturnScope between162 =null;
		ParserRuleReturnScope notbetween163 =null;
		ParserRuleReturnScope nestedCondition164 =null;
		ParserRuleReturnScope in165 =null;
		ParserRuleReturnScope notin166 =null;
		ParserRuleReturnScope isNull167 =null;
		ParserRuleReturnScope exists168 =null;
		ParserRuleReturnScope like169 =null;
		ParserRuleReturnScope quantifier170 =null;
		ParserRuleReturnScope comparison171 =null;

		Object NOT161_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:305:3: ( ( NOT )? ( between | notbetween | nestedCondition | in | notin | isNull | exists | like | quantifier | comparison ) )
			// C:\\FakeWH\\GenericSQL.g:305:5: ( NOT )? ( between | notbetween | nestedCondition | in | notin | isNull | exists | like | quantifier | comparison )
			{
			root_0 = (Object)adaptor.nil();


			// C:\\FakeWH\\GenericSQL.g:305:5: ( NOT )?
			int alt52=2;
			int LA52_0 = input.LA(1);
			if ( (LA52_0==NOT) ) {
				alt52=1;
			}
			switch (alt52) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:305:7: NOT
					{
					NOT161=(Token)match(input,NOT,FOLLOW_NOT_in_condition1276); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT161_tree = (Object)adaptor.create(NOT161);
					adaptor.addChild(root_0, NOT161_tree);
					}

					}
					break;

			}

			// C:\\FakeWH\\GenericSQL.g:306:5: ( between | notbetween | nestedCondition | in | notin | isNull | exists | like | quantifier | comparison )
			int alt53=10;
			switch ( input.LA(1) ) {
			case AVG:
			case COALESCE:
			case COUNT:
			case LASTDAY:
			case MAX:
			case MIN:
			case NEXTDAY:
			case NVL:
			case SUM:
			case TOCHAR:
			case TODATE:
			case TONUMBER:
			case TRUNC:
				{
				int LA53_1 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case CASE:
				{
				int LA53_2 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case MINUS:
			case PLUS:
				{
				int LA53_3 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case Identifier:
				{
				int LA53_4 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case QuotedIdentifier:
				{
				int LA53_5 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case LPAREN:
				{
				int LA53_6 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred85_GenericSQL()) ) {
					alt53=3;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case Float:
				{
				int LA53_7 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case Integer:
				{
				int LA53_8 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case String:
				{
				int LA53_9 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case TRUE:
				{
				int LA53_10 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case FALSE:
				{
				int LA53_11 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case 131:
				{
				int LA53_12 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case 132:
				{
				int LA53_13 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case 133:
				{
				int LA53_14 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case Daytime:
				{
				int LA53_15 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case DATE:
				{
				int LA53_16 = input.LA(2);
				if ( (synpred83_GenericSQL()) ) {
					alt53=1;
				}
				else if ( (synpred84_GenericSQL()) ) {
					alt53=2;
				}
				else if ( (synpred86_GenericSQL()) ) {
					alt53=4;
				}
				else if ( (synpred87_GenericSQL()) ) {
					alt53=5;
				}
				else if ( (synpred88_GenericSQL()) ) {
					alt53=6;
				}
				else if ( (synpred90_GenericSQL()) ) {
					alt53=8;
				}
				else if ( (synpred91_GenericSQL()) ) {
					alt53=9;
				}
				else if ( (true) ) {
					alt53=10;
				}

				}
				break;
			case EXISTS:
				{
				alt53=7;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 53, 0, input);
				throw nvae;
			}
			switch (alt53) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:306:7: between
					{
					pushFollow(FOLLOW_between_in_condition1287);
					between162=between();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, between162.getTree());

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:307:7: notbetween
					{
					pushFollow(FOLLOW_notbetween_in_condition1295);
					notbetween163=notbetween();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, notbetween163.getTree());

					}
					break;
				case 3 :
					// C:\\FakeWH\\GenericSQL.g:308:7: nestedCondition
					{
					pushFollow(FOLLOW_nestedCondition_in_condition1303);
					nestedCondition164=nestedCondition();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, nestedCondition164.getTree());

					}
					break;
				case 4 :
					// C:\\FakeWH\\GenericSQL.g:309:7: in
					{
					pushFollow(FOLLOW_in_in_condition1311);
					in165=in();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, in165.getTree());

					}
					break;
				case 5 :
					// C:\\FakeWH\\GenericSQL.g:310:7: notin
					{
					pushFollow(FOLLOW_notin_in_condition1319);
					notin166=notin();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, notin166.getTree());

					}
					break;
				case 6 :
					// C:\\FakeWH\\GenericSQL.g:311:7: isNull
					{
					pushFollow(FOLLOW_isNull_in_condition1327);
					isNull167=isNull();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, isNull167.getTree());

					}
					break;
				case 7 :
					// C:\\FakeWH\\GenericSQL.g:312:7: exists
					{
					pushFollow(FOLLOW_exists_in_condition1335);
					exists168=exists();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, exists168.getTree());

					}
					break;
				case 8 :
					// C:\\FakeWH\\GenericSQL.g:313:7: like
					{
					pushFollow(FOLLOW_like_in_condition1343);
					like169=like();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, like169.getTree());

					}
					break;
				case 9 :
					// C:\\FakeWH\\GenericSQL.g:314:7: quantifier
					{
					pushFollow(FOLLOW_quantifier_in_condition1351);
					quantifier170=quantifier();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, quantifier170.getTree());

					}
					break;
				case 10 :
					// C:\\FakeWH\\GenericSQL.g:315:7: comparison
					{
					pushFollow(FOLLOW_comparison_in_condition1359);
					comparison171=comparison();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, comparison171.getTree());

					}
					break;

			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "condition"


	public static class in_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "in"
	// C:\\FakeWH\\GenericSQL.g:319:1: in : expression IN LPAREN ( subSelect | expressionList ) RPAREN ;
	public final GenericSQLParser.in_return in() throws RecognitionException {
		GenericSQLParser.in_return retval = new GenericSQLParser.in_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IN173=null;
		Token LPAREN174=null;
		Token RPAREN177=null;
		ParserRuleReturnScope expression172 =null;
		ParserRuleReturnScope subSelect175 =null;
		ParserRuleReturnScope expressionList176 =null;

		Object IN173_tree=null;
		Object LPAREN174_tree=null;
		Object RPAREN177_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:320:3: ( expression IN LPAREN ( subSelect | expressionList ) RPAREN )
			// C:\\FakeWH\\GenericSQL.g:320:5: expression IN LPAREN ( subSelect | expressionList ) RPAREN
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_in1378);
			expression172=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression172.getTree());

			IN173=(Token)match(input,IN,FOLLOW_IN_in_in1380); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IN173_tree = (Object)adaptor.create(IN173);
			adaptor.addChild(root_0, IN173_tree);
			}

			LPAREN174=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_in1382); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN174_tree = (Object)adaptor.create(LPAREN174);
			adaptor.addChild(root_0, LPAREN174_tree);
			}

			// C:\\FakeWH\\GenericSQL.g:320:26: ( subSelect | expressionList )
			int alt54=2;
			switch ( input.LA(1) ) {
			case SELECT:
				{
				alt54=1;
				}
				break;
			case LPAREN:
				{
				int LA54_2 = input.LA(2);
				if ( (LA54_2==SELECT) ) {
					alt54=1;
				}
				else if ( (LA54_2==AVG||(LA54_2 >= CASE && LA54_2 <= COALESCE)||LA54_2==COUNT||LA54_2==DATE||LA54_2==Daytime||LA54_2==FALSE||LA54_2==Float||(LA54_2 >= Identifier && LA54_2 <= Integer)||LA54_2==LASTDAY||LA54_2==LPAREN||(LA54_2 >= MAX && LA54_2 <= MINUS)||LA54_2==NEXTDAY||LA54_2==NVL||LA54_2==PLUS||LA54_2==QuotedIdentifier||(LA54_2 >= SUM && LA54_2 <= String)||(LA54_2 >= TOCHAR && LA54_2 <= TONUMBER)||(LA54_2 >= TRUE && LA54_2 <= TRUNC)||(LA54_2 >= 131 && LA54_2 <= 133)) ) {
					alt54=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 54, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AVG:
			case CASE:
			case COALESCE:
			case COUNT:
			case DATE:
			case Daytime:
			case FALSE:
			case Float:
			case Identifier:
			case Integer:
			case LASTDAY:
			case MAX:
			case MIN:
			case MINUS:
			case NEXTDAY:
			case NVL:
			case PLUS:
			case QuotedIdentifier:
			case SUM:
			case String:
			case TOCHAR:
			case TODATE:
			case TONUMBER:
			case TRUE:
			case TRUNC:
			case 131:
			case 132:
			case 133:
				{
				alt54=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 54, 0, input);
				throw nvae;
			}
			switch (alt54) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:320:28: subSelect
					{
					pushFollow(FOLLOW_subSelect_in_in1386);
					subSelect175=subSelect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subSelect175.getTree());

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:320:40: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_in1390);
					expressionList176=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList176.getTree());

					}
					break;

			}

			RPAREN177=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_in1394); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN177_tree = (Object)adaptor.create(RPAREN177);
			adaptor.addChild(root_0, RPAREN177_tree);
			}

			if ( state.backtracking==0 ) {
			  	sql.ProcessIn((expression172!=null?input.toString(expression172.start,expression172.stop):null), (expressionList176!=null?input.toString(expressionList176.start,expressionList176.stop):null));
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "in"


	public static class notin_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "notin"
	// C:\\FakeWH\\GenericSQL.g:326:1: notin : expression NOT IN LPAREN ( subSelect | expressionList ) RPAREN ;
	public final GenericSQLParser.notin_return notin() throws RecognitionException {
		GenericSQLParser.notin_return retval = new GenericSQLParser.notin_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT179=null;
		Token IN180=null;
		Token LPAREN181=null;
		Token RPAREN184=null;
		ParserRuleReturnScope expression178 =null;
		ParserRuleReturnScope subSelect182 =null;
		ParserRuleReturnScope expressionList183 =null;

		Object NOT179_tree=null;
		Object IN180_tree=null;
		Object LPAREN181_tree=null;
		Object RPAREN184_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:327:3: ( expression NOT IN LPAREN ( subSelect | expressionList ) RPAREN )
			// C:\\FakeWH\\GenericSQL.g:327:5: expression NOT IN LPAREN ( subSelect | expressionList ) RPAREN
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_notin1411);
			expression178=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression178.getTree());

			NOT179=(Token)match(input,NOT,FOLLOW_NOT_in_notin1413); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NOT179_tree = (Object)adaptor.create(NOT179);
			adaptor.addChild(root_0, NOT179_tree);
			}

			IN180=(Token)match(input,IN,FOLLOW_IN_in_notin1415); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IN180_tree = (Object)adaptor.create(IN180);
			adaptor.addChild(root_0, IN180_tree);
			}

			LPAREN181=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_notin1417); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN181_tree = (Object)adaptor.create(LPAREN181);
			adaptor.addChild(root_0, LPAREN181_tree);
			}

			// C:\\FakeWH\\GenericSQL.g:327:30: ( subSelect | expressionList )
			int alt55=2;
			switch ( input.LA(1) ) {
			case SELECT:
				{
				alt55=1;
				}
				break;
			case LPAREN:
				{
				int LA55_2 = input.LA(2);
				if ( (LA55_2==SELECT) ) {
					alt55=1;
				}
				else if ( (LA55_2==AVG||(LA55_2 >= CASE && LA55_2 <= COALESCE)||LA55_2==COUNT||LA55_2==DATE||LA55_2==Daytime||LA55_2==FALSE||LA55_2==Float||(LA55_2 >= Identifier && LA55_2 <= Integer)||LA55_2==LASTDAY||LA55_2==LPAREN||(LA55_2 >= MAX && LA55_2 <= MINUS)||LA55_2==NEXTDAY||LA55_2==NVL||LA55_2==PLUS||LA55_2==QuotedIdentifier||(LA55_2 >= SUM && LA55_2 <= String)||(LA55_2 >= TOCHAR && LA55_2 <= TONUMBER)||(LA55_2 >= TRUE && LA55_2 <= TRUNC)||(LA55_2 >= 131 && LA55_2 <= 133)) ) {
					alt55=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 55, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case AVG:
			case CASE:
			case COALESCE:
			case COUNT:
			case DATE:
			case Daytime:
			case FALSE:
			case Float:
			case Identifier:
			case Integer:
			case LASTDAY:
			case MAX:
			case MIN:
			case MINUS:
			case NEXTDAY:
			case NVL:
			case PLUS:
			case QuotedIdentifier:
			case SUM:
			case String:
			case TOCHAR:
			case TODATE:
			case TONUMBER:
			case TRUE:
			case TRUNC:
			case 131:
			case 132:
			case 133:
				{
				alt55=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 55, 0, input);
				throw nvae;
			}
			switch (alt55) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:327:32: subSelect
					{
					pushFollow(FOLLOW_subSelect_in_notin1421);
					subSelect182=subSelect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subSelect182.getTree());

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:327:44: expressionList
					{
					pushFollow(FOLLOW_expressionList_in_notin1425);
					expressionList183=expressionList();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expressionList183.getTree());

					}
					break;

			}

			RPAREN184=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_notin1429); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN184_tree = (Object)adaptor.create(RPAREN184);
			adaptor.addChild(root_0, RPAREN184_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "notin"


	public static class between_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "between"
	// C:\\FakeWH\\GenericSQL.g:330:1: between : expression BETWEEN ( expression | subSelect ) AND ( expression | subSelect ) ;
	public final GenericSQLParser.between_return between() throws RecognitionException {
		GenericSQLParser.between_return retval = new GenericSQLParser.between_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token BETWEEN186=null;
		Token AND189=null;
		ParserRuleReturnScope expression185 =null;
		ParserRuleReturnScope expression187 =null;
		ParserRuleReturnScope subSelect188 =null;
		ParserRuleReturnScope expression190 =null;
		ParserRuleReturnScope subSelect191 =null;

		Object BETWEEN186_tree=null;
		Object AND189_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:331:3: ( expression BETWEEN ( expression | subSelect ) AND ( expression | subSelect ) )
			// C:\\FakeWH\\GenericSQL.g:331:5: expression BETWEEN ( expression | subSelect ) AND ( expression | subSelect )
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_between1444);
			expression185=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression185.getTree());

			BETWEEN186=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_between1446); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BETWEEN186_tree = (Object)adaptor.create(BETWEEN186);
			adaptor.addChild(root_0, BETWEEN186_tree);
			}

			// C:\\FakeWH\\GenericSQL.g:331:24: ( expression | subSelect )
			int alt56=2;
			switch ( input.LA(1) ) {
			case AVG:
			case CASE:
			case COALESCE:
			case COUNT:
			case DATE:
			case Daytime:
			case FALSE:
			case Float:
			case Identifier:
			case Integer:
			case LASTDAY:
			case MAX:
			case MIN:
			case MINUS:
			case NEXTDAY:
			case NVL:
			case PLUS:
			case QuotedIdentifier:
			case SUM:
			case String:
			case TOCHAR:
			case TODATE:
			case TONUMBER:
			case TRUE:
			case TRUNC:
			case 131:
			case 132:
			case 133:
				{
				alt56=1;
				}
				break;
			case LPAREN:
				{
				int LA56_2 = input.LA(2);
				if ( (LA56_2==AVG||(LA56_2 >= CASE && LA56_2 <= COALESCE)||LA56_2==COUNT||LA56_2==DATE||LA56_2==Daytime||LA56_2==FALSE||LA56_2==Float||(LA56_2 >= Identifier && LA56_2 <= Integer)||LA56_2==LASTDAY||LA56_2==LPAREN||(LA56_2 >= MAX && LA56_2 <= MINUS)||LA56_2==NEXTDAY||LA56_2==NVL||LA56_2==PLUS||LA56_2==QuotedIdentifier||(LA56_2 >= SUM && LA56_2 <= String)||(LA56_2 >= TOCHAR && LA56_2 <= TONUMBER)||(LA56_2 >= TRUE && LA56_2 <= TRUNC)||(LA56_2 >= 131 && LA56_2 <= 133)) ) {
					alt56=1;
				}
				else if ( (LA56_2==SELECT) ) {
					alt56=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 56, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SELECT:
				{
				alt56=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 56, 0, input);
				throw nvae;
			}
			switch (alt56) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:331:25: expression
					{
					pushFollow(FOLLOW_expression_in_between1449);
					expression187=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression187.getTree());

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:331:38: subSelect
					{
					pushFollow(FOLLOW_subSelect_in_between1453);
					subSelect188=subSelect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subSelect188.getTree());

					}
					break;

			}

			AND189=(Token)match(input,AND,FOLLOW_AND_in_between1456); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			AND189_tree = (Object)adaptor.create(AND189);
			adaptor.addChild(root_0, AND189_tree);
			}

			// C:\\FakeWH\\GenericSQL.g:331:53: ( expression | subSelect )
			int alt57=2;
			switch ( input.LA(1) ) {
			case AVG:
			case CASE:
			case COALESCE:
			case COUNT:
			case DATE:
			case Daytime:
			case FALSE:
			case Float:
			case Identifier:
			case Integer:
			case LASTDAY:
			case MAX:
			case MIN:
			case MINUS:
			case NEXTDAY:
			case NVL:
			case PLUS:
			case QuotedIdentifier:
			case SUM:
			case String:
			case TOCHAR:
			case TODATE:
			case TONUMBER:
			case TRUE:
			case TRUNC:
			case 131:
			case 132:
			case 133:
				{
				alt57=1;
				}
				break;
			case LPAREN:
				{
				int LA57_2 = input.LA(2);
				if ( (LA57_2==AVG||(LA57_2 >= CASE && LA57_2 <= COALESCE)||LA57_2==COUNT||LA57_2==DATE||LA57_2==Daytime||LA57_2==FALSE||LA57_2==Float||(LA57_2 >= Identifier && LA57_2 <= Integer)||LA57_2==LASTDAY||LA57_2==LPAREN||(LA57_2 >= MAX && LA57_2 <= MINUS)||LA57_2==NEXTDAY||LA57_2==NVL||LA57_2==PLUS||LA57_2==QuotedIdentifier||(LA57_2 >= SUM && LA57_2 <= String)||(LA57_2 >= TOCHAR && LA57_2 <= TONUMBER)||(LA57_2 >= TRUE && LA57_2 <= TRUNC)||(LA57_2 >= 131 && LA57_2 <= 133)) ) {
					alt57=1;
				}
				else if ( (LA57_2==SELECT) ) {
					alt57=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 57, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SELECT:
				{
				alt57=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 57, 0, input);
				throw nvae;
			}
			switch (alt57) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:331:54: expression
					{
					pushFollow(FOLLOW_expression_in_between1459);
					expression190=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression190.getTree());

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:331:67: subSelect
					{
					pushFollow(FOLLOW_subSelect_in_between1463);
					subSelect191=subSelect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subSelect191.getTree());

					}
					break;

			}

			if ( state.backtracking==0 ) {
			  	System.out.println(input.toString(retval.start,input.LT(-1)));
			  	System.out.println(sql.ProcessBetween(input.toString(retval.start,input.LT(-1))));
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "between"


	public static class notbetween_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "notbetween"
	// C:\\FakeWH\\GenericSQL.g:338:1: notbetween : expression NOT BETWEEN expression AND expression ;
	public final GenericSQLParser.notbetween_return notbetween() throws RecognitionException {
		GenericSQLParser.notbetween_return retval = new GenericSQLParser.notbetween_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT193=null;
		Token BETWEEN194=null;
		Token AND196=null;
		ParserRuleReturnScope expression192 =null;
		ParserRuleReturnScope expression195 =null;
		ParserRuleReturnScope expression197 =null;

		Object NOT193_tree=null;
		Object BETWEEN194_tree=null;
		Object AND196_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:339:3: ( expression NOT BETWEEN expression AND expression )
			// C:\\FakeWH\\GenericSQL.g:339:5: expression NOT BETWEEN expression AND expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_notbetween1483);
			expression192=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression192.getTree());

			NOT193=(Token)match(input,NOT,FOLLOW_NOT_in_notbetween1486); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NOT193_tree = (Object)adaptor.create(NOT193);
			adaptor.addChild(root_0, NOT193_tree);
			}

			BETWEEN194=(Token)match(input,BETWEEN,FOLLOW_BETWEEN_in_notbetween1488); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			BETWEEN194_tree = (Object)adaptor.create(BETWEEN194);
			adaptor.addChild(root_0, BETWEEN194_tree);
			}

			pushFollow(FOLLOW_expression_in_notbetween1490);
			expression195=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression195.getTree());

			AND196=(Token)match(input,AND,FOLLOW_AND_in_notbetween1492); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			AND196_tree = (Object)adaptor.create(AND196);
			adaptor.addChild(root_0, AND196_tree);
			}

			pushFollow(FOLLOW_expression_in_notbetween1494);
			expression197=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression197.getTree());

			if ( state.backtracking==0 ) {
			//  	System.out.println($between.text);
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "notbetween"


	public static class isNull_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "isNull"
	// C:\\FakeWH\\GenericSQL.g:345:1: isNull : expression IS ( NOT )? NULL ;
	public final GenericSQLParser.isNull_return isNull() throws RecognitionException {
		GenericSQLParser.isNull_return retval = new GenericSQLParser.isNull_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token IS199=null;
		Token NOT200=null;
		Token NULL201=null;
		ParserRuleReturnScope expression198 =null;

		Object IS199_tree=null;
		Object NOT200_tree=null;
		Object NULL201_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:346:3: ( expression IS ( NOT )? NULL )
			// C:\\FakeWH\\GenericSQL.g:346:5: expression IS ( NOT )? NULL
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_isNull1513);
			expression198=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression198.getTree());

			IS199=(Token)match(input,IS,FOLLOW_IS_in_isNull1515); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			IS199_tree = (Object)adaptor.create(IS199);
			adaptor.addChild(root_0, IS199_tree);
			}

			// C:\\FakeWH\\GenericSQL.g:346:19: ( NOT )?
			int alt58=2;
			int LA58_0 = input.LA(1);
			if ( (LA58_0==NOT) ) {
				alt58=1;
			}
			switch (alt58) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:346:21: NOT
					{
					NOT200=(Token)match(input,NOT,FOLLOW_NOT_in_isNull1519); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT200_tree = (Object)adaptor.create(NOT200);
					adaptor.addChild(root_0, NOT200_tree);
					}

					}
					break;

			}

			NULL201=(Token)match(input,NULL,FOLLOW_NULL_in_isNull1524); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			NULL201_tree = (Object)adaptor.create(NULL201);
			adaptor.addChild(root_0, NULL201_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "isNull"


	public static class exists_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "exists"
	// C:\\FakeWH\\GenericSQL.g:349:1: exists : EXISTS expression ;
	public final GenericSQLParser.exists_return exists() throws RecognitionException {
		GenericSQLParser.exists_return retval = new GenericSQLParser.exists_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token EXISTS202=null;
		ParserRuleReturnScope expression203 =null;

		Object EXISTS202_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:350:3: ( EXISTS expression )
			// C:\\FakeWH\\GenericSQL.g:350:5: EXISTS expression
			{
			root_0 = (Object)adaptor.nil();


			EXISTS202=(Token)match(input,EXISTS,FOLLOW_EXISTS_in_exists1539); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			EXISTS202_tree = (Object)adaptor.create(EXISTS202);
			adaptor.addChild(root_0, EXISTS202_tree);
			}

			pushFollow(FOLLOW_expression_in_exists1541);
			expression203=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression203.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "exists"


	public static class like_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "like"
	// C:\\FakeWH\\GenericSQL.g:353:1: like : expression ( NOT )? LIKE expression ;
	public final GenericSQLParser.like_return like() throws RecognitionException {
		GenericSQLParser.like_return retval = new GenericSQLParser.like_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token NOT205=null;
		Token LIKE206=null;
		ParserRuleReturnScope expression204 =null;
		ParserRuleReturnScope expression207 =null;

		Object NOT205_tree=null;
		Object LIKE206_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:356:3: ( expression ( NOT )? LIKE expression )
			// C:\\FakeWH\\GenericSQL.g:356:5: expression ( NOT )? LIKE expression
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_like1560);
			expression204=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression204.getTree());

			// C:\\FakeWH\\GenericSQL.g:356:16: ( NOT )?
			int alt59=2;
			int LA59_0 = input.LA(1);
			if ( (LA59_0==NOT) ) {
				alt59=1;
			}
			switch (alt59) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:356:18: NOT
					{
					NOT205=(Token)match(input,NOT,FOLLOW_NOT_in_like1564); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					NOT205_tree = (Object)adaptor.create(NOT205);
					adaptor.addChild(root_0, NOT205_tree);
					}

					}
					break;

			}

			LIKE206=(Token)match(input,LIKE,FOLLOW_LIKE_in_like1569); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LIKE206_tree = (Object)adaptor.create(LIKE206);
			adaptor.addChild(root_0, LIKE206_tree);
			}

			pushFollow(FOLLOW_expression_in_like1571);
			expression207=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression207.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "like"


	public static class comparison_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparison"
	// C:\\FakeWH\\GenericSQL.g:360:1: comparison : ( expression ) comparator ( expression | subSelect ) ;
	public final GenericSQLParser.comparison_return comparison() throws RecognitionException {
		GenericSQLParser.comparison_return retval = new GenericSQLParser.comparison_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope expression208 =null;
		ParserRuleReturnScope comparator209 =null;
		ParserRuleReturnScope expression210 =null;
		ParserRuleReturnScope subSelect211 =null;


		try {
			// C:\\FakeWH\\GenericSQL.g:361:3: ( ( expression ) comparator ( expression | subSelect ) )
			// C:\\FakeWH\\GenericSQL.g:361:5: ( expression ) comparator ( expression | subSelect )
			{
			root_0 = (Object)adaptor.nil();


			// C:\\FakeWH\\GenericSQL.g:361:5: ( expression )
			// C:\\FakeWH\\GenericSQL.g:361:6: expression
			{
			pushFollow(FOLLOW_expression_in_comparison1590);
			expression208=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression208.getTree());

			}

			pushFollow(FOLLOW_comparator_in_comparison1593);
			comparator209=comparator();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, comparator209.getTree());

			// C:\\FakeWH\\GenericSQL.g:361:29: ( expression | subSelect )
			int alt60=2;
			switch ( input.LA(1) ) {
			case AVG:
			case CASE:
			case COALESCE:
			case COUNT:
			case DATE:
			case Daytime:
			case FALSE:
			case Float:
			case Identifier:
			case Integer:
			case LASTDAY:
			case MAX:
			case MIN:
			case MINUS:
			case NEXTDAY:
			case NVL:
			case PLUS:
			case QuotedIdentifier:
			case SUM:
			case String:
			case TOCHAR:
			case TODATE:
			case TONUMBER:
			case TRUE:
			case TRUNC:
			case 131:
			case 132:
			case 133:
				{
				alt60=1;
				}
				break;
			case LPAREN:
				{
				int LA60_2 = input.LA(2);
				if ( (LA60_2==AVG||(LA60_2 >= CASE && LA60_2 <= COALESCE)||LA60_2==COUNT||LA60_2==DATE||LA60_2==Daytime||LA60_2==FALSE||LA60_2==Float||(LA60_2 >= Identifier && LA60_2 <= Integer)||LA60_2==LASTDAY||LA60_2==LPAREN||(LA60_2 >= MAX && LA60_2 <= MINUS)||LA60_2==NEXTDAY||LA60_2==NVL||LA60_2==PLUS||LA60_2==QuotedIdentifier||(LA60_2 >= SUM && LA60_2 <= String)||(LA60_2 >= TOCHAR && LA60_2 <= TONUMBER)||(LA60_2 >= TRUE && LA60_2 <= TRUNC)||(LA60_2 >= 131 && LA60_2 <= 133)) ) {
					alt60=1;
				}
				else if ( (LA60_2==SELECT) ) {
					alt60=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 60, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case SELECT:
				{
				alt60=2;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 60, 0, input);
				throw nvae;
			}
			switch (alt60) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:361:30: expression
					{
					pushFollow(FOLLOW_expression_in_comparison1596);
					expression210=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression210.getTree());

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:361:43: subSelect
					{
					pushFollow(FOLLOW_subSelect_in_comparison1600);
					subSelect211=subSelect();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, subSelect211.getTree());

					}
					break;

			}

			if ( state.backtracking==0 ) {
			  	System.out.println((comparator209!=null?input.toString(comparator209.start,comparator209.stop):null) + "," + input.toString(retval.start,input.LT(-1)));
			  	System.out.println(sql.ProcessExpression((comparator209!=null?input.toString(comparator209.start,comparator209.stop):null), input.toString(retval.start,input.LT(-1))));
			  }
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparison"


	public static class comparator_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "comparator"
	// C:\\FakeWH\\GenericSQL.g:368:1: comparator : ( EQ | NEQ1 | NEQ2 | LTE | LT | GTE | GT );
	public final GenericSQLParser.comparator_return comparator() throws RecognitionException {
		GenericSQLParser.comparator_return retval = new GenericSQLParser.comparator_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set212=null;

		Object set212_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:369:3: ( EQ | NEQ1 | NEQ2 | LTE | LT | GTE | GT )
			// C:\\FakeWH\\GenericSQL.g:
			{
			root_0 = (Object)adaptor.nil();


			set212=input.LT(1);
			if ( input.LA(1)==EQ||(input.LA(1) >= GT && input.LA(1) <= GTE)||(input.LA(1) >= LT && input.LA(1) <= LTE)||(input.LA(1) >= NEQ1 && input.LA(1) <= NEQ2) ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set212));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "comparator"


	public static class quantifier_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "quantifier"
	// C:\\FakeWH\\GenericSQL.g:378:1: quantifier : expression ( ALL | ANY | SOME ) LPAREN subSelect RPAREN ;
	public final GenericSQLParser.quantifier_return quantifier() throws RecognitionException {
		GenericSQLParser.quantifier_return retval = new GenericSQLParser.quantifier_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set214=null;
		Token LPAREN215=null;
		Token RPAREN217=null;
		ParserRuleReturnScope expression213 =null;
		ParserRuleReturnScope subSelect216 =null;

		Object set214_tree=null;
		Object LPAREN215_tree=null;
		Object RPAREN217_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:379:3: ( expression ( ALL | ANY | SOME ) LPAREN subSelect RPAREN )
			// C:\\FakeWH\\GenericSQL.g:379:5: expression ( ALL | ANY | SOME ) LPAREN subSelect RPAREN
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_quantifier1670);
			expression213=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression213.getTree());

			set214=input.LT(1);
			if ( input.LA(1)==ALL||input.LA(1)==ANY||input.LA(1)==SOME ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set214));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			LPAREN215=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_quantifier1686); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN215_tree = (Object)adaptor.create(LPAREN215);
			adaptor.addChild(root_0, LPAREN215_tree);
			}

			pushFollow(FOLLOW_subSelect_in_quantifier1688);
			subSelect216=subSelect();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, subSelect216.getTree());

			RPAREN217=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_quantifier1690); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN217_tree = (Object)adaptor.create(RPAREN217);
			adaptor.addChild(root_0, RPAREN217_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "quantifier"


	public static class expressionList_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expressionList"
	// C:\\FakeWH\\GenericSQL.g:382:1: expressionList : expression ( COMMA expression )* ;
	public final GenericSQLParser.expressionList_return expressionList() throws RecognitionException {
		GenericSQLParser.expressionList_return retval = new GenericSQLParser.expressionList_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token COMMA219=null;
		ParserRuleReturnScope expression218 =null;
		ParserRuleReturnScope expression220 =null;

		Object COMMA219_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:383:3: ( expression ( COMMA expression )* )
			// C:\\FakeWH\\GenericSQL.g:383:5: expression ( COMMA expression )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_expression_in_expressionList1705);
			expression218=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression218.getTree());

			// C:\\FakeWH\\GenericSQL.g:383:16: ( COMMA expression )*
			loop61:
			while (true) {
				int alt61=2;
				int LA61_0 = input.LA(1);
				if ( (LA61_0==COMMA) ) {
					alt61=1;
				}

				switch (alt61) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:383:18: COMMA expression
					{
					COMMA219=(Token)match(input,COMMA,FOLLOW_COMMA_in_expressionList1709); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					COMMA219_tree = (Object)adaptor.create(COMMA219);
					adaptor.addChild(root_0, COMMA219_tree);
					}

					pushFollow(FOLLOW_expression_in_expressionList1711);
					expression220=expression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, expression220.getTree());

					}
					break;

				default :
					break loop61;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expressionList"


	public static class nestedExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "nestedExpression"
	// C:\\FakeWH\\GenericSQL.g:386:1: nestedExpression : LPAREN expression RPAREN ;
	public final GenericSQLParser.nestedExpression_return nestedExpression() throws RecognitionException {
		GenericSQLParser.nestedExpression_return retval = new GenericSQLParser.nestedExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token LPAREN221=null;
		Token RPAREN223=null;
		ParserRuleReturnScope expression222 =null;

		Object LPAREN221_tree=null;
		Object RPAREN223_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:387:3: ( LPAREN expression RPAREN )
			// C:\\FakeWH\\GenericSQL.g:387:5: LPAREN expression RPAREN
			{
			root_0 = (Object)adaptor.nil();


			LPAREN221=(Token)match(input,LPAREN,FOLLOW_LPAREN_in_nestedExpression1727); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			LPAREN221_tree = (Object)adaptor.create(LPAREN221);
			adaptor.addChild(root_0, LPAREN221_tree);
			}

			pushFollow(FOLLOW_expression_in_nestedExpression1729);
			expression222=expression();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, expression222.getTree());

			RPAREN223=(Token)match(input,RPAREN,FOLLOW_RPAREN_in_nestedExpression1731); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			RPAREN223_tree = (Object)adaptor.create(RPAREN223);
			adaptor.addChild(root_0, RPAREN223_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "nestedExpression"


	public static class expression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "expression"
	// C:\\FakeWH\\GenericSQL.g:390:1: expression : multiply ( ( PLUS | MINUS ) multiply )* ;
	public final GenericSQLParser.expression_return expression() throws RecognitionException {
		GenericSQLParser.expression_return retval = new GenericSQLParser.expression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set225=null;
		ParserRuleReturnScope multiply224 =null;
		ParserRuleReturnScope multiply226 =null;

		Object set225_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:391:3: ( multiply ( ( PLUS | MINUS ) multiply )* )
			// C:\\FakeWH\\GenericSQL.g:391:5: multiply ( ( PLUS | MINUS ) multiply )*
			{
			root_0 = (Object)adaptor.nil();


			pushFollow(FOLLOW_multiply_in_expression1746);
			multiply224=multiply();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, multiply224.getTree());

			// C:\\FakeWH\\GenericSQL.g:391:14: ( ( PLUS | MINUS ) multiply )*
			loop62:
			while (true) {
				int alt62=2;
				int LA62_0 = input.LA(1);
				if ( (LA62_0==MINUS||LA62_0==PLUS) ) {
					alt62=1;
				}

				switch (alt62) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:391:16: ( PLUS | MINUS ) multiply
					{
					set225=input.LT(1);
					if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set225));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					pushFollow(FOLLOW_multiply_in_expression1760);
					multiply226=multiply();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, multiply226.getTree());

					}
					break;

				default :
					break loop62;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "expression"


	public static class multiply_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "multiply"
	// C:\\FakeWH\\GenericSQL.g:394:1: multiply : ( value ) ( ( STAR | DIVIDE ) ( value ) )* ;
	public final GenericSQLParser.multiply_return multiply() throws RecognitionException {
		GenericSQLParser.multiply_return retval = new GenericSQLParser.multiply_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set228=null;
		ParserRuleReturnScope value227 =null;
		ParserRuleReturnScope value229 =null;

		Object set228_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:395:3: ( ( value ) ( ( STAR | DIVIDE ) ( value ) )* )
			// C:\\FakeWH\\GenericSQL.g:395:5: ( value ) ( ( STAR | DIVIDE ) ( value ) )*
			{
			root_0 = (Object)adaptor.nil();


			// C:\\FakeWH\\GenericSQL.g:395:5: ( value )
			// C:\\FakeWH\\GenericSQL.g:395:6: value
			{
			pushFollow(FOLLOW_value_in_multiply1778);
			value227=value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, value227.getTree());

			}

			// C:\\FakeWH\\GenericSQL.g:395:13: ( ( STAR | DIVIDE ) ( value ) )*
			loop63:
			while (true) {
				int alt63=2;
				int LA63_0 = input.LA(1);
				if ( (LA63_0==DIVIDE||LA63_0==STAR) ) {
					alt63=1;
				}

				switch (alt63) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:395:15: ( STAR | DIVIDE ) ( value )
					{
					set228=input.LT(1);
					if ( input.LA(1)==DIVIDE||input.LA(1)==STAR ) {
						input.consume();
						if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set228));
						state.errorRecovery=false;
						state.failed=false;
					}
					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						MismatchedSetException mse = new MismatchedSetException(null,input);
						throw mse;
					}
					// C:\\FakeWH\\GenericSQL.g:395:33: ( value )
					// C:\\FakeWH\\GenericSQL.g:395:34: value
					{
					pushFollow(FOLLOW_value_in_multiply1794);
					value229=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, value229.getTree());

					}

					}
					break;

				default :
					break loop63;
				}
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "multiply"


	public static class value_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "value"
	// C:\\FakeWH\\GenericSQL.g:413:1: value : ( function | caseWhenExpression | ( unary )? ( columnRef | nestedExpression ) | literal );
	public final GenericSQLParser.value_return value() throws RecognitionException {
		GenericSQLParser.value_return retval = new GenericSQLParser.value_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		ParserRuleReturnScope function230 =null;
		ParserRuleReturnScope caseWhenExpression231 =null;
		ParserRuleReturnScope unary232 =null;
		ParserRuleReturnScope columnRef233 =null;
		ParserRuleReturnScope nestedExpression234 =null;
		ParserRuleReturnScope literal235 =null;


		try {
			// C:\\FakeWH\\GenericSQL.g:414:3: ( function | caseWhenExpression | ( unary )? ( columnRef | nestedExpression ) | literal )
			int alt66=4;
			switch ( input.LA(1) ) {
			case AVG:
			case COALESCE:
			case COUNT:
			case LASTDAY:
			case MAX:
			case MIN:
			case NEXTDAY:
			case NVL:
			case SUM:
			case TOCHAR:
			case TODATE:
			case TONUMBER:
			case TRUNC:
				{
				alt66=1;
				}
				break;
			case CASE:
				{
				alt66=2;
				}
				break;
			case MINUS:
			case PLUS:
				{
				int LA66_3 = input.LA(2);
				if ( (LA66_3==Identifier||LA66_3==LPAREN||LA66_3==QuotedIdentifier) ) {
					alt66=3;
				}
				else if ( (LA66_3==Float||LA66_3==Integer) ) {
					alt66=4;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 66, 3, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Identifier:
			case LPAREN:
			case QuotedIdentifier:
				{
				alt66=3;
				}
				break;
			case DATE:
			case Daytime:
			case FALSE:
			case Float:
			case Integer:
			case String:
			case TRUE:
			case 131:
			case 132:
			case 133:
				{
				alt66=4;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 66, 0, input);
				throw nvae;
			}
			switch (alt66) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:415:7: function
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_function_in_value1842);
					function230=function();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, function230.getTree());

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:416:7: caseWhenExpression
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_caseWhenExpression_in_value1850);
					caseWhenExpression231=caseWhenExpression();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, caseWhenExpression231.getTree());

					}
					break;
				case 3 :
					// C:\\FakeWH\\GenericSQL.g:418:5: ( unary )? ( columnRef | nestedExpression )
					{
					root_0 = (Object)adaptor.nil();


					// C:\\FakeWH\\GenericSQL.g:418:5: ( unary )?
					int alt64=2;
					int LA64_0 = input.LA(1);
					if ( (LA64_0==MINUS||LA64_0==PLUS) ) {
						alt64=1;
					}
					switch (alt64) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:418:7: unary
							{
							pushFollow(FOLLOW_unary_in_value1864);
							unary232=unary();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, unary232.getTree());

							}
							break;

					}

					// C:\\FakeWH\\GenericSQL.g:419:5: ( columnRef | nestedExpression )
					int alt65=2;
					int LA65_0 = input.LA(1);
					if ( (LA65_0==Identifier||LA65_0==QuotedIdentifier) ) {
						alt65=1;
					}
					else if ( (LA65_0==LPAREN) ) {
						alt65=2;
					}

					else {
						if (state.backtracking>0) {state.failed=true; return retval;}
						NoViableAltException nvae =
							new NoViableAltException("", 65, 0, input);
						throw nvae;
					}

					switch (alt65) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:419:7: columnRef
							{
							pushFollow(FOLLOW_columnRef_in_value1875);
							columnRef233=columnRef();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, columnRef233.getTree());

							}
							break;
						case 2 :
							// C:\\FakeWH\\GenericSQL.g:420:7: nestedExpression
							{
							pushFollow(FOLLOW_nestedExpression_in_value1883);
							nestedExpression234=nestedExpression();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, nestedExpression234.getTree());

							}
							break;

					}

					}
					break;
				case 4 :
					// C:\\FakeWH\\GenericSQL.g:423:7: literal
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_literal_in_value1898);
					literal235=literal();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, literal235.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "value"


	public static class literal_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "literal"
	// C:\\FakeWH\\GenericSQL.g:426:1: literal : ( ( unary )? Float | ( unary )? Integer | String | TRUE | FALSE | date );
	public final GenericSQLParser.literal_return literal() throws RecognitionException {
		GenericSQLParser.literal_return retval = new GenericSQLParser.literal_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Float237=null;
		Token Integer239=null;
		Token String240=null;
		Token TRUE241=null;
		Token FALSE242=null;
		ParserRuleReturnScope unary236 =null;
		ParserRuleReturnScope unary238 =null;
		ParserRuleReturnScope date243 =null;

		Object Float237_tree=null;
		Object Integer239_tree=null;
		Object String240_tree=null;
		Object TRUE241_tree=null;
		Object FALSE242_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:427:3: ( ( unary )? Float | ( unary )? Integer | String | TRUE | FALSE | date )
			int alt69=6;
			switch ( input.LA(1) ) {
			case MINUS:
			case PLUS:
				{
				int LA69_1 = input.LA(2);
				if ( (LA69_1==Float) ) {
					alt69=1;
				}
				else if ( (LA69_1==Integer) ) {
					alt69=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 69, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

				}
				break;
			case Float:
				{
				alt69=1;
				}
				break;
			case Integer:
				{
				alt69=2;
				}
				break;
			case String:
				{
				alt69=3;
				}
				break;
			case TRUE:
				{
				alt69=4;
				}
				break;
			case FALSE:
				{
				alt69=5;
				}
				break;
			case DATE:
			case Daytime:
			case 131:
			case 132:
			case 133:
				{
				alt69=6;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 69, 0, input);
				throw nvae;
			}
			switch (alt69) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:427:5: ( unary )? Float
					{
					root_0 = (Object)adaptor.nil();


					// C:\\FakeWH\\GenericSQL.g:427:5: ( unary )?
					int alt67=2;
					int LA67_0 = input.LA(1);
					if ( (LA67_0==MINUS||LA67_0==PLUS) ) {
						alt67=1;
					}
					switch (alt67) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:427:7: unary
							{
							pushFollow(FOLLOW_unary_in_literal1915);
							unary236=unary();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, unary236.getTree());

							}
							break;

					}

					Float237=(Token)match(input,Float,FOLLOW_Float_in_literal1920); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Float237_tree = (Object)adaptor.create(Float237);
					adaptor.addChild(root_0, Float237_tree);
					}

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:428:5: ( unary )? Integer
					{
					root_0 = (Object)adaptor.nil();


					// C:\\FakeWH\\GenericSQL.g:428:5: ( unary )?
					int alt68=2;
					int LA68_0 = input.LA(1);
					if ( (LA68_0==MINUS||LA68_0==PLUS) ) {
						alt68=1;
					}
					switch (alt68) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:428:7: unary
							{
							pushFollow(FOLLOW_unary_in_literal1928);
							unary238=unary();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, unary238.getTree());

							}
							break;

					}

					Integer239=(Token)match(input,Integer,FOLLOW_Integer_in_literal1933); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Integer239_tree = (Object)adaptor.create(Integer239);
					adaptor.addChild(root_0, Integer239_tree);
					}

					}
					break;
				case 3 :
					// C:\\FakeWH\\GenericSQL.g:429:5: String
					{
					root_0 = (Object)adaptor.nil();


					String240=(Token)match(input,String,FOLLOW_String_in_literal1939); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					String240_tree = (Object)adaptor.create(String240);
					adaptor.addChild(root_0, String240_tree);
					}

					}
					break;
				case 4 :
					// C:\\FakeWH\\GenericSQL.g:430:5: TRUE
					{
					root_0 = (Object)adaptor.nil();


					TRUE241=(Token)match(input,TRUE,FOLLOW_TRUE_in_literal1945); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					TRUE241_tree = (Object)adaptor.create(TRUE241);
					adaptor.addChild(root_0, TRUE241_tree);
					}

					}
					break;
				case 5 :
					// C:\\FakeWH\\GenericSQL.g:431:5: FALSE
					{
					root_0 = (Object)adaptor.nil();


					FALSE242=(Token)match(input,FALSE,FOLLOW_FALSE_in_literal1951); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					FALSE242_tree = (Object)adaptor.create(FALSE242);
					adaptor.addChild(root_0, FALSE242_tree);
					}

					}
					break;
				case 6 :
					// C:\\FakeWH\\GenericSQL.g:432:5: date
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_date_in_literal1957);
					date243=date();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, date243.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "literal"


	public static class date_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "date"
	// C:\\FakeWH\\GenericSQL.g:435:1: date : ( '{d' Timestamp '}' | '{t' Timestamp '}' | '{ts' Timestamp '}' | Daytime | DATE Daytime );
	public final GenericSQLParser.date_return date() throws RecognitionException {
		GenericSQLParser.date_return retval = new GenericSQLParser.date_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token string_literal244=null;
		Token Timestamp245=null;
		Token char_literal246=null;
		Token string_literal247=null;
		Token Timestamp248=null;
		Token char_literal249=null;
		Token string_literal250=null;
		Token Timestamp251=null;
		Token char_literal252=null;
		Token Daytime253=null;
		Token DATE254=null;
		Token Daytime255=null;

		Object string_literal244_tree=null;
		Object Timestamp245_tree=null;
		Object char_literal246_tree=null;
		Object string_literal247_tree=null;
		Object Timestamp248_tree=null;
		Object char_literal249_tree=null;
		Object string_literal250_tree=null;
		Object Timestamp251_tree=null;
		Object char_literal252_tree=null;
		Object Daytime253_tree=null;
		Object DATE254_tree=null;
		Object Daytime255_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:436:3: ( '{d' Timestamp '}' | '{t' Timestamp '}' | '{ts' Timestamp '}' | Daytime | DATE Daytime )
			int alt70=5;
			switch ( input.LA(1) ) {
			case 131:
				{
				alt70=1;
				}
				break;
			case 132:
				{
				alt70=2;
				}
				break;
			case 133:
				{
				alt70=3;
				}
				break;
			case Daytime:
				{
				alt70=4;
				}
				break;
			case DATE:
				{
				alt70=5;
				}
				break;
			default:
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 70, 0, input);
				throw nvae;
			}
			switch (alt70) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:436:5: '{d' Timestamp '}'
					{
					root_0 = (Object)adaptor.nil();


					string_literal244=(Token)match(input,131,FOLLOW_131_in_date1970); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal244_tree = (Object)adaptor.create(string_literal244);
					adaptor.addChild(root_0, string_literal244_tree);
					}

					Timestamp245=(Token)match(input,Timestamp,FOLLOW_Timestamp_in_date1972); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Timestamp245_tree = (Object)adaptor.create(Timestamp245);
					adaptor.addChild(root_0, Timestamp245_tree);
					}

					char_literal246=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_date1974); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal246_tree = (Object)adaptor.create(char_literal246);
					adaptor.addChild(root_0, char_literal246_tree);
					}

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:437:5: '{t' Timestamp '}'
					{
					root_0 = (Object)adaptor.nil();


					string_literal247=(Token)match(input,132,FOLLOW_132_in_date1981); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal247_tree = (Object)adaptor.create(string_literal247);
					adaptor.addChild(root_0, string_literal247_tree);
					}

					Timestamp248=(Token)match(input,Timestamp,FOLLOW_Timestamp_in_date1983); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Timestamp248_tree = (Object)adaptor.create(Timestamp248);
					adaptor.addChild(root_0, Timestamp248_tree);
					}

					char_literal249=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_date1985); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal249_tree = (Object)adaptor.create(char_literal249);
					adaptor.addChild(root_0, char_literal249_tree);
					}

					}
					break;
				case 3 :
					// C:\\FakeWH\\GenericSQL.g:438:5: '{ts' Timestamp '}'
					{
					root_0 = (Object)adaptor.nil();


					string_literal250=(Token)match(input,133,FOLLOW_133_in_date1992); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					string_literal250_tree = (Object)adaptor.create(string_literal250);
					adaptor.addChild(root_0, string_literal250_tree);
					}

					Timestamp251=(Token)match(input,Timestamp,FOLLOW_Timestamp_in_date1994); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Timestamp251_tree = (Object)adaptor.create(Timestamp251);
					adaptor.addChild(root_0, Timestamp251_tree);
					}

					char_literal252=(Token)match(input,RCURLY,FOLLOW_RCURLY_in_date1996); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					char_literal252_tree = (Object)adaptor.create(char_literal252);
					adaptor.addChild(root_0, char_literal252_tree);
					}

					}
					break;
				case 4 :
					// C:\\FakeWH\\GenericSQL.g:439:5: Daytime
					{
					root_0 = (Object)adaptor.nil();


					Daytime253=(Token)match(input,Daytime,FOLLOW_Daytime_in_date2003); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Daytime253_tree = (Object)adaptor.create(Daytime253);
					adaptor.addChild(root_0, Daytime253_tree);
					}

					}
					break;
				case 5 :
					// C:\\FakeWH\\GenericSQL.g:440:5: DATE Daytime
					{
					root_0 = (Object)adaptor.nil();


					DATE254=(Token)match(input,DATE,FOLLOW_DATE_in_date2009); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DATE254_tree = (Object)adaptor.create(DATE254);
					adaptor.addChild(root_0, DATE254_tree);
					}

					Daytime255=(Token)match(input,Daytime,FOLLOW_Daytime_in_date2011); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					Daytime255_tree = (Object)adaptor.create(Daytime255);
					adaptor.addChild(root_0, Daytime255_tree);
					}

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "date"


	public static class unary_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "unary"
	// C:\\FakeWH\\GenericSQL.g:443:1: unary : ( MINUS | PLUS );
	public final GenericSQLParser.unary_return unary() throws RecognitionException {
		GenericSQLParser.unary_return retval = new GenericSQLParser.unary_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set256=null;

		Object set256_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:444:3: ( MINUS | PLUS )
			// C:\\FakeWH\\GenericSQL.g:
			{
			root_0 = (Object)adaptor.nil();


			set256=input.LT(1);
			if ( input.LA(1)==MINUS||input.LA(1)==PLUS ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set256));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "unary"


	public static class caseWhenExpression_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "caseWhenExpression"
	// C:\\FakeWH\\GenericSQL.g:448:1: caseWhenExpression : CASE ( ( whenThenSearchCondition )+ | value ( whenThenValue )* ) elseInCase END ;
	public final GenericSQLParser.caseWhenExpression_return caseWhenExpression() throws RecognitionException {
		GenericSQLParser.caseWhenExpression_return retval = new GenericSQLParser.caseWhenExpression_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token CASE257=null;
		Token END262=null;
		ParserRuleReturnScope whenThenSearchCondition258 =null;
		ParserRuleReturnScope value259 =null;
		ParserRuleReturnScope whenThenValue260 =null;
		ParserRuleReturnScope elseInCase261 =null;

		Object CASE257_tree=null;
		Object END262_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:449:3: ( CASE ( ( whenThenSearchCondition )+ | value ( whenThenValue )* ) elseInCase END )
			// C:\\FakeWH\\GenericSQL.g:449:5: CASE ( ( whenThenSearchCondition )+ | value ( whenThenValue )* ) elseInCase END
			{
			root_0 = (Object)adaptor.nil();


			CASE257=(Token)match(input,CASE,FOLLOW_CASE_in_caseWhenExpression2049); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			CASE257_tree = (Object)adaptor.create(CASE257);
			adaptor.addChild(root_0, CASE257_tree);
			}

			// C:\\FakeWH\\GenericSQL.g:450:5: ( ( whenThenSearchCondition )+ | value ( whenThenValue )* )
			int alt73=2;
			int LA73_0 = input.LA(1);
			if ( (LA73_0==WHEN) ) {
				alt73=1;
			}
			else if ( (LA73_0==AVG||(LA73_0 >= CASE && LA73_0 <= COALESCE)||LA73_0==COUNT||LA73_0==DATE||LA73_0==Daytime||LA73_0==FALSE||LA73_0==Float||(LA73_0 >= Identifier && LA73_0 <= Integer)||LA73_0==LASTDAY||LA73_0==LPAREN||(LA73_0 >= MAX && LA73_0 <= MINUS)||LA73_0==NEXTDAY||LA73_0==NVL||LA73_0==PLUS||LA73_0==QuotedIdentifier||(LA73_0 >= SUM && LA73_0 <= String)||(LA73_0 >= TOCHAR && LA73_0 <= TONUMBER)||(LA73_0 >= TRUE && LA73_0 <= TRUNC)||(LA73_0 >= 131 && LA73_0 <= 133)) ) {
				alt73=2;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 73, 0, input);
				throw nvae;
			}

			switch (alt73) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:450:7: ( whenThenSearchCondition )+
					{
					// C:\\FakeWH\\GenericSQL.g:450:7: ( whenThenSearchCondition )+
					int cnt71=0;
					loop71:
					while (true) {
						int alt71=2;
						int LA71_0 = input.LA(1);
						if ( (LA71_0==WHEN) ) {
							alt71=1;
						}

						switch (alt71) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:450:9: whenThenSearchCondition
							{
							pushFollow(FOLLOW_whenThenSearchCondition_in_caseWhenExpression2059);
							whenThenSearchCondition258=whenThenSearchCondition();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, whenThenSearchCondition258.getTree());

							}
							break;

						default :
							if ( cnt71 >= 1 ) break loop71;
							if (state.backtracking>0) {state.failed=true; return retval;}
							EarlyExitException eee = new EarlyExitException(71, input);
							throw eee;
						}
						cnt71++;
					}

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:451:7: value ( whenThenValue )*
					{
					pushFollow(FOLLOW_value_in_caseWhenExpression2070);
					value259=value();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, value259.getTree());

					// C:\\FakeWH\\GenericSQL.g:451:13: ( whenThenValue )*
					loop72:
					while (true) {
						int alt72=2;
						int LA72_0 = input.LA(1);
						if ( (LA72_0==WHEN) ) {
							alt72=1;
						}

						switch (alt72) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:451:15: whenThenValue
							{
							pushFollow(FOLLOW_whenThenValue_in_caseWhenExpression2074);
							whenThenValue260=whenThenValue();
							state._fsp--;
							if (state.failed) return retval;
							if ( state.backtracking==0 ) adaptor.addChild(root_0, whenThenValue260.getTree());

							}
							break;

						default :
							break loop72;
						}
					}

					}
					break;

			}

			pushFollow(FOLLOW_elseInCase_in_caseWhenExpression2085);
			elseInCase261=elseInCase();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, elseInCase261.getTree());

			END262=(Token)match(input,END,FOLLOW_END_in_caseWhenExpression2091); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			END262_tree = (Object)adaptor.create(END262);
			adaptor.addChild(root_0, END262_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "caseWhenExpression"


	public static class whenThenSearchCondition_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whenThenSearchCondition"
	// C:\\FakeWH\\GenericSQL.g:456:1: whenThenSearchCondition : WHEN condition THEN value ;
	public final GenericSQLParser.whenThenSearchCondition_return whenThenSearchCondition() throws RecognitionException {
		GenericSQLParser.whenThenSearchCondition_return retval = new GenericSQLParser.whenThenSearchCondition_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHEN263=null;
		Token THEN265=null;
		ParserRuleReturnScope condition264 =null;
		ParserRuleReturnScope value266 =null;

		Object WHEN263_tree=null;
		Object THEN265_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:457:3: ( WHEN condition THEN value )
			// C:\\FakeWH\\GenericSQL.g:457:5: WHEN condition THEN value
			{
			root_0 = (Object)adaptor.nil();


			WHEN263=(Token)match(input,WHEN,FOLLOW_WHEN_in_whenThenSearchCondition2104); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHEN263_tree = (Object)adaptor.create(WHEN263);
			adaptor.addChild(root_0, WHEN263_tree);
			}

			pushFollow(FOLLOW_condition_in_whenThenSearchCondition2106);
			condition264=condition();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, condition264.getTree());

			THEN265=(Token)match(input,THEN,FOLLOW_THEN_in_whenThenSearchCondition2108); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			THEN265_tree = (Object)adaptor.create(THEN265);
			adaptor.addChild(root_0, THEN265_tree);
			}

			pushFollow(FOLLOW_value_in_whenThenSearchCondition2110);
			value266=value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, value266.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whenThenSearchCondition"


	public static class whenThenValue_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "whenThenValue"
	// C:\\FakeWH\\GenericSQL.g:460:1: whenThenValue : WHEN value THEN value ;
	public final GenericSQLParser.whenThenValue_return whenThenValue() throws RecognitionException {
		GenericSQLParser.whenThenValue_return retval = new GenericSQLParser.whenThenValue_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token WHEN267=null;
		Token THEN269=null;
		ParserRuleReturnScope value268 =null;
		ParserRuleReturnScope value270 =null;

		Object WHEN267_tree=null;
		Object THEN269_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:461:3: ( WHEN value THEN value )
			// C:\\FakeWH\\GenericSQL.g:461:5: WHEN value THEN value
			{
			root_0 = (Object)adaptor.nil();


			WHEN267=(Token)match(input,WHEN,FOLLOW_WHEN_in_whenThenValue2123); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			WHEN267_tree = (Object)adaptor.create(WHEN267);
			adaptor.addChild(root_0, WHEN267_tree);
			}

			pushFollow(FOLLOW_value_in_whenThenValue2125);
			value268=value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, value268.getTree());

			THEN269=(Token)match(input,THEN,FOLLOW_THEN_in_whenThenValue2127); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			THEN269_tree = (Object)adaptor.create(THEN269);
			adaptor.addChild(root_0, THEN269_tree);
			}

			pushFollow(FOLLOW_value_in_whenThenValue2129);
			value270=value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, value270.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "whenThenValue"


	public static class elseInCase_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "elseInCase"
	// C:\\FakeWH\\GenericSQL.g:464:1: elseInCase : ELSE value ;
	public final GenericSQLParser.elseInCase_return elseInCase() throws RecognitionException {
		GenericSQLParser.elseInCase_return retval = new GenericSQLParser.elseInCase_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token ELSE271=null;
		ParserRuleReturnScope value272 =null;

		Object ELSE271_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:465:3: ( ELSE value )
			// C:\\FakeWH\\GenericSQL.g:465:5: ELSE value
			{
			root_0 = (Object)adaptor.nil();


			ELSE271=(Token)match(input,ELSE,FOLLOW_ELSE_in_elseInCase2144); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			ELSE271_tree = (Object)adaptor.create(ELSE271);
			adaptor.addChild(root_0, ELSE271_tree);
			}

			pushFollow(FOLLOW_value_in_elseInCase2146);
			value272=value();
			state._fsp--;
			if (state.failed) return retval;
			if ( state.backtracking==0 ) adaptor.addChild(root_0, value272.getTree());

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "elseInCase"


	public static class tableRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tableRef"
	// C:\\FakeWH\\GenericSQL.g:469:1: tableRef : ( tableName | databaseName DOT tableName );
	public final GenericSQLParser.tableRef_return tableRef() throws RecognitionException {
		GenericSQLParser.tableRef_return retval = new GenericSQLParser.tableRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DOT275=null;
		ParserRuleReturnScope tableName273 =null;
		ParserRuleReturnScope databaseName274 =null;
		ParserRuleReturnScope tableName276 =null;

		Object DOT275_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:470:3: ( tableName | databaseName DOT tableName )
			int alt74=2;
			int LA74_0 = input.LA(1);
			if ( (LA74_0==Identifier||LA74_0==QuotedIdentifier) ) {
				int LA74_1 = input.LA(2);
				if ( (LA74_1==EOF||LA74_1==AND||LA74_1==AS||LA74_1==COMMA||(LA74_1 >= CREATE && LA74_1 <= CROSS)||(LA74_1 >= FROM && LA74_1 <= FULL)||LA74_1==GROUP||LA74_1==HAVING||LA74_1==INNER||LA74_1==Identifier||LA74_1==JOIN||LA74_1==LEFT||LA74_1==LPAREN||LA74_1==NATURAL||LA74_1==NOLOGGING||(LA74_1 >= ON && LA74_1 <= OUTER)||(LA74_1 >= RIGHT && LA74_1 <= RPAREN)||(LA74_1 >= SELECT && LA74_1 <= SET)||LA74_1==THEN||LA74_1==USING||LA74_1==VALUES||LA74_1==WHERE) ) {
					alt74=1;
				}
				else if ( (LA74_1==DOT) ) {
					alt74=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 74, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 74, 0, input);
				throw nvae;
			}

			switch (alt74) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:470:5: tableName
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tableName_in_tableRef2162);
					tableName273=tableName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableName273.getTree());

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:471:5: databaseName DOT tableName
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_databaseName_in_tableRef2168);
					databaseName274=databaseName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, databaseName274.getTree());

					DOT275=(Token)match(input,DOT,FOLLOW_DOT_in_tableRef2170); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT275_tree = (Object)adaptor.create(DOT275);
					adaptor.addChild(root_0, DOT275_tree);
					}

					pushFollow(FOLLOW_tableName_in_tableRef2172);
					tableName276=tableName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableName276.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableRef"


	public static class columnRef_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "columnRef"
	// C:\\FakeWH\\GenericSQL.g:474:1: columnRef : ( columnName | tableAlias DOT columnName );
	public final GenericSQLParser.columnRef_return columnRef() throws RecognitionException {
		GenericSQLParser.columnRef_return retval = new GenericSQLParser.columnRef_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token DOT279=null;
		ParserRuleReturnScope columnName277 =null;
		ParserRuleReturnScope tableAlias278 =null;
		ParserRuleReturnScope columnName280 =null;

		Object DOT279_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:475:3: ( columnName | tableAlias DOT columnName )
			int alt75=2;
			int LA75_0 = input.LA(1);
			if ( (LA75_0==Identifier) ) {
				int LA75_1 = input.LA(2);
				if ( (LA75_1==EOF||(LA75_1 >= ALL && LA75_1 <= ANY)||(LA75_1 >= AS && LA75_1 <= ASC)||LA75_1==BETWEEN||LA75_1==COMMA||(LA75_1 >= CREATE && LA75_1 <= CROSS)||LA75_1==DESC||LA75_1==DIVIDE||(LA75_1 >= ELSE && LA75_1 <= EQ)||(LA75_1 >= FROM && LA75_1 <= FULL)||(LA75_1 >= GROUP && LA75_1 <= GTE)||LA75_1==HAVING||(LA75_1 >= IN && LA75_1 <= INNER)||(LA75_1 >= INTO && LA75_1 <= Identifier)||LA75_1==JOIN||(LA75_1 >= LEFT && LA75_1 <= LIKE)||(LA75_1 >= LT && LA75_1 <= LTE)||LA75_1==MINUS||(LA75_1 >= NATURAL && LA75_1 <= NEQ2)||LA75_1==NOT||(LA75_1 >= ON && LA75_1 <= OUTER)||LA75_1==PLUS||(LA75_1 >= RIGHT && LA75_1 <= RPAREN)||(LA75_1 >= SELECT && LA75_1 <= SEMI)||(LA75_1 >= SOME && LA75_1 <= STAR)||LA75_1==THEN||LA75_1==USING||(LA75_1 >= WHEN && LA75_1 <= WHERE)) ) {
					alt75=1;
				}
				else if ( (LA75_1==DOT) ) {
					alt75=2;
				}

				else {
					if (state.backtracking>0) {state.failed=true; return retval;}
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 75, 1, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}
			else if ( (LA75_0==QuotedIdentifier) ) {
				alt75=1;
			}

			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				NoViableAltException nvae =
					new NoViableAltException("", 75, 0, input);
				throw nvae;
			}

			switch (alt75) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:475:5: columnName
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_columnName_in_columnRef2187);
					columnName277=columnName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, columnName277.getTree());

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:476:5: tableAlias DOT columnName
					{
					root_0 = (Object)adaptor.nil();


					pushFollow(FOLLOW_tableAlias_in_columnRef2194);
					tableAlias278=tableAlias();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, tableAlias278.getTree());

					DOT279=(Token)match(input,DOT,FOLLOW_DOT_in_columnRef2196); if (state.failed) return retval;
					if ( state.backtracking==0 ) {
					DOT279_tree = (Object)adaptor.create(DOT279);
					adaptor.addChild(root_0, DOT279_tree);
					}

					pushFollow(FOLLOW_columnName_in_columnRef2198);
					columnName280=columnName();
					state._fsp--;
					if (state.failed) return retval;
					if ( state.backtracking==0 ) adaptor.addChild(root_0, columnName280.getTree());

					}
					break;

			}
			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "columnRef"


	public static class databaseName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "databaseName"
	// C:\\FakeWH\\GenericSQL.g:479:1: databaseName : ( Identifier | QuotedIdentifier );
	public final GenericSQLParser.databaseName_return databaseName() throws RecognitionException {
		GenericSQLParser.databaseName_return retval = new GenericSQLParser.databaseName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set281=null;

		Object set281_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:480:3: ( Identifier | QuotedIdentifier )
			// C:\\FakeWH\\GenericSQL.g:
			{
			root_0 = (Object)adaptor.nil();


			set281=input.LT(1);
			if ( input.LA(1)==Identifier||input.LA(1)==QuotedIdentifier ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set281));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "databaseName"


	public static class tableName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tableName"
	// C:\\FakeWH\\GenericSQL.g:484:1: tableName : ( Identifier | QuotedIdentifier );
	public final GenericSQLParser.tableName_return tableName() throws RecognitionException {
		GenericSQLParser.tableName_return retval = new GenericSQLParser.tableName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set282=null;

		Object set282_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:485:3: ( Identifier | QuotedIdentifier )
			// C:\\FakeWH\\GenericSQL.g:
			{
			root_0 = (Object)adaptor.nil();


			set282=input.LT(1);
			if ( input.LA(1)==Identifier||input.LA(1)==QuotedIdentifier ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set282));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableName"


	public static class tableAlias_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "tableAlias"
	// C:\\FakeWH\\GenericSQL.g:489:1: tableAlias : Identifier ;
	public final GenericSQLParser.tableAlias_return tableAlias() throws RecognitionException {
		GenericSQLParser.tableAlias_return retval = new GenericSQLParser.tableAlias_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token Identifier283=null;

		Object Identifier283_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:490:3: ( Identifier )
			// C:\\FakeWH\\GenericSQL.g:490:5: Identifier
			{
			root_0 = (Object)adaptor.nil();


			Identifier283=(Token)match(input,Identifier,FOLLOW_Identifier_in_tableAlias2253); if (state.failed) return retval;
			if ( state.backtracking==0 ) {
			Identifier283_tree = (Object)adaptor.create(Identifier283);
			adaptor.addChild(root_0, Identifier283_tree);
			}

			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "tableAlias"


	public static class columnName_return extends ParserRuleReturnScope {
		Object tree;
		@Override
		public Object getTree() { return tree; }
	};


	// $ANTLR start "columnName"
	// C:\\FakeWH\\GenericSQL.g:493:1: columnName : ( Identifier | QuotedIdentifier );
	public final GenericSQLParser.columnName_return columnName() throws RecognitionException {
		GenericSQLParser.columnName_return retval = new GenericSQLParser.columnName_return();
		retval.start = input.LT(1);

		Object root_0 = null;

		Token set284=null;

		Object set284_tree=null;

		try {
			// C:\\FakeWH\\GenericSQL.g:494:3: ( Identifier | QuotedIdentifier )
			// C:\\FakeWH\\GenericSQL.g:
			{
			root_0 = (Object)adaptor.nil();


			set284=input.LT(1);
			if ( input.LA(1)==Identifier||input.LA(1)==QuotedIdentifier ) {
				input.consume();
				if ( state.backtracking==0 ) adaptor.addChild(root_0, (Object)adaptor.create(set284));
				state.errorRecovery=false;
				state.failed=false;
			}
			else {
				if (state.backtracking>0) {state.failed=true; return retval;}
				MismatchedSetException mse = new MismatchedSetException(null,input);
				throw mse;
			}
			}

			retval.stop = input.LT(-1);

			if ( state.backtracking==0 ) {
			retval.tree = (Object)adaptor.rulePostProcessing(root_0);
			adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);
			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
			retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);
		}
		finally {
			// do for sure before leaving
		}
		return retval;
	}
	// $ANTLR end "columnName"

	// $ANTLR start synpred17_GenericSQL
	public final void synpred17_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:74:7: ( joinList )
		// C:\\FakeWH\\GenericSQL.g:74:7: joinList
		{
		pushFollow(FOLLOW_joinList_in_synpred17_GenericSQL278);
		joinList();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred17_GenericSQL

	// $ANTLR start synpred18_GenericSQL
	public final void synpred18_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:98:7: ( where )
		// C:\\FakeWH\\GenericSQL.g:98:7: where
		{
		pushFollow(FOLLOW_where_in_synpred18_GenericSQL295);
		where();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred18_GenericSQL

	// $ANTLR start synpred19_GenericSQL
	public final void synpred19_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:99:7: ( groupBy )
		// C:\\FakeWH\\GenericSQL.g:99:7: groupBy
		{
		pushFollow(FOLLOW_groupBy_in_synpred19_GenericSQL306);
		groupBy();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred19_GenericSQL

	// $ANTLR start synpred20_GenericSQL
	public final void synpred20_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:100:7: ( having )
		// C:\\FakeWH\\GenericSQL.g:100:7: having
		{
		pushFollow(FOLLOW_having_in_synpred20_GenericSQL317);
		having();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred20_GenericSQL

	// $ANTLR start synpred21_GenericSQL
	public final void synpred21_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:101:7: ( orderBy )
		// C:\\FakeWH\\GenericSQL.g:101:7: orderBy
		{
		pushFollow(FOLLOW_orderBy_in_synpred21_GenericSQL328);
		orderBy();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred21_GenericSQL

	// $ANTLR start synpred28_GenericSQL
	public final void synpred28_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:146:5: ( STAR )
		// C:\\FakeWH\\GenericSQL.g:146:5: STAR
		{
		match(input,STAR,FOLLOW_STAR_in_synpred28_GenericSQL533); if (state.failed) return;

		}

	}
	// $ANTLR end synpred28_GenericSQL

	// $ANTLR start synpred40_GenericSQL
	public final void synpred40_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:173:39: ( allColumns )
		// C:\\FakeWH\\GenericSQL.g:173:39: allColumns
		{
		pushFollow(FOLLOW_allColumns_in_synpred40_GenericSQL692);
		allColumns();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred40_GenericSQL

	// $ANTLR start synpred41_GenericSQL
	public final void synpred41_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:173:50: ( value )
		// C:\\FakeWH\\GenericSQL.g:173:50: value
		{
		pushFollow(FOLLOW_value_in_synpred41_GenericSQL694);
		value();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred41_GenericSQL

	// $ANTLR start synpred42_GenericSQL
	public final void synpred42_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:173:75: ( allColumns )
		// C:\\FakeWH\\GenericSQL.g:173:75: allColumns
		{
		pushFollow(FOLLOW_allColumns_in_synpred42_GenericSQL704);
		allColumns();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred42_GenericSQL

	// $ANTLR start synpred43_GenericSQL
	public final void synpred43_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:173:86: ( value )
		// C:\\FakeWH\\GenericSQL.g:173:86: value
		{
		pushFollow(FOLLOW_value_in_synpred43_GenericSQL706);
		value();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred43_GenericSQL

	// $ANTLR start synpred58_GenericSQL
	public final void synpred58_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:194:21: ( COMMA fromItem )
		// C:\\FakeWH\\GenericSQL.g:194:21: COMMA fromItem
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred58_GenericSQL827); if (state.failed) return;

		pushFollow(FOLLOW_fromItem_in_synpred58_GenericSQL829);
		fromItem();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred58_GenericSQL

	// $ANTLR start synpred61_GenericSQL
	public final void synpred61_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:201:7: ( ( AS )? alias )
		// C:\\FakeWH\\GenericSQL.g:201:7: ( AS )? alias
		{
		// C:\\FakeWH\\GenericSQL.g:201:7: ( AS )?
		int alt94=2;
		int LA94_0 = input.LA(1);
		if ( (LA94_0==AS) ) {
			alt94=1;
		}
		switch (alt94) {
			case 1 :
				// C:\\FakeWH\\GenericSQL.g:201:9: AS
				{
				match(input,AS,FOLLOW_AS_in_synpred61_GenericSQL874); if (state.failed) return;

				}
				break;

		}

		pushFollow(FOLLOW_alias_in_synpred61_GenericSQL879);
		alias();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred61_GenericSQL

	// $ANTLR start synpred62_GenericSQL
	public final void synpred62_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:245:7: ( join )
		// C:\\FakeWH\\GenericSQL.g:245:7: join
		{
		pushFollow(FOLLOW_join_in_synpred62_GenericSQL903);
		join();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred62_GenericSQL

	// $ANTLR start synpred73_GenericSQL
	public final void synpred73_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:263:5: ( ON conditionList )
		// C:\\FakeWH\\GenericSQL.g:263:5: ON conditionList
		{
		match(input,ON,FOLLOW_ON_in_synpred73_GenericSQL1053); if (state.failed) return;

		pushFollow(FOLLOW_conditionList_in_synpred73_GenericSQL1055);
		conditionList();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred73_GenericSQL

	// $ANTLR start synpred75_GenericSQL
	public final void synpred75_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:264:5: ( USING LPAREN columnRef ( COMMA columnRef )* RPAREN )
		// C:\\FakeWH\\GenericSQL.g:264:5: USING LPAREN columnRef ( COMMA columnRef )* RPAREN
		{
		match(input,USING,FOLLOW_USING_in_synpred75_GenericSQL1061); if (state.failed) return;

		match(input,LPAREN,FOLLOW_LPAREN_in_synpred75_GenericSQL1063); if (state.failed) return;

		pushFollow(FOLLOW_columnRef_in_synpred75_GenericSQL1065);
		columnRef();
		state._fsp--;
		if (state.failed) return;

		// C:\\FakeWH\\GenericSQL.g:264:28: ( COMMA columnRef )*
		loop95:
		while (true) {
			int alt95=2;
			int LA95_0 = input.LA(1);
			if ( (LA95_0==COMMA) ) {
				alt95=1;
			}

			switch (alt95) {
			case 1 :
				// C:\\FakeWH\\GenericSQL.g:264:30: COMMA columnRef
				{
				match(input,COMMA,FOLLOW_COMMA_in_synpred75_GenericSQL1069); if (state.failed) return;

				pushFollow(FOLLOW_columnRef_in_synpred75_GenericSQL1071);
				columnRef();
				state._fsp--;
				if (state.failed) return;

				}
				break;

			default :
				break loop95;
			}
		}

		match(input,RPAREN,FOLLOW_RPAREN_in_synpred75_GenericSQL1076); if (state.failed) return;

		}

	}
	// $ANTLR end synpred75_GenericSQL

	// $ANTLR start synpred76_GenericSQL
	public final void synpred76_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:281:27: ( COMMA expression )
		// C:\\FakeWH\\GenericSQL.g:281:27: COMMA expression
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred76_GenericSQL1132); if (state.failed) return;

		pushFollow(FOLLOW_expression_in_synpred76_GenericSQL1134);
		expression();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred76_GenericSQL

	// $ANTLR start synpred77_GenericSQL
	public final void synpred77_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:289:28: ( COMMA orderByItem )
		// C:\\FakeWH\\GenericSQL.g:289:28: COMMA orderByItem
		{
		match(input,COMMA,FOLLOW_COMMA_in_synpred77_GenericSQL1177); if (state.failed) return;

		pushFollow(FOLLOW_orderByItem_in_synpred77_GenericSQL1179);
		orderByItem();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred77_GenericSQL

	// $ANTLR start synpred81_GenericSQL
	public final void synpred81_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:301:17: ( ( OR | AND ) condition )
		// C:\\FakeWH\\GenericSQL.g:301:17: ( OR | AND ) condition
		{
		if ( input.LA(1)==AND||input.LA(1)==OR ) {
			input.consume();
			state.errorRecovery=false;
			state.failed=false;
		}
		else {
			if (state.backtracking>0) {state.failed=true; return;}
			MismatchedSetException mse = new MismatchedSetException(null,input);
			throw mse;
		}
		pushFollow(FOLLOW_condition_in_synpred81_GenericSQL1256);
		condition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred81_GenericSQL

	// $ANTLR start synpred83_GenericSQL
	public final void synpred83_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:306:7: ( between )
		// C:\\FakeWH\\GenericSQL.g:306:7: between
		{
		pushFollow(FOLLOW_between_in_synpred83_GenericSQL1287);
		between();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred83_GenericSQL

	// $ANTLR start synpred84_GenericSQL
	public final void synpred84_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:307:7: ( notbetween )
		// C:\\FakeWH\\GenericSQL.g:307:7: notbetween
		{
		pushFollow(FOLLOW_notbetween_in_synpred84_GenericSQL1295);
		notbetween();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred84_GenericSQL

	// $ANTLR start synpred85_GenericSQL
	public final void synpred85_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:308:7: ( nestedCondition )
		// C:\\FakeWH\\GenericSQL.g:308:7: nestedCondition
		{
		pushFollow(FOLLOW_nestedCondition_in_synpred85_GenericSQL1303);
		nestedCondition();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred85_GenericSQL

	// $ANTLR start synpred86_GenericSQL
	public final void synpred86_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:309:7: ( in )
		// C:\\FakeWH\\GenericSQL.g:309:7: in
		{
		pushFollow(FOLLOW_in_in_synpred86_GenericSQL1311);
		in();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred86_GenericSQL

	// $ANTLR start synpred87_GenericSQL
	public final void synpred87_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:310:7: ( notin )
		// C:\\FakeWH\\GenericSQL.g:310:7: notin
		{
		pushFollow(FOLLOW_notin_in_synpred87_GenericSQL1319);
		notin();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred87_GenericSQL

	// $ANTLR start synpred88_GenericSQL
	public final void synpred88_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:311:7: ( isNull )
		// C:\\FakeWH\\GenericSQL.g:311:7: isNull
		{
		pushFollow(FOLLOW_isNull_in_synpred88_GenericSQL1327);
		isNull();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred88_GenericSQL

	// $ANTLR start synpred90_GenericSQL
	public final void synpred90_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:313:7: ( like )
		// C:\\FakeWH\\GenericSQL.g:313:7: like
		{
		pushFollow(FOLLOW_like_in_synpred90_GenericSQL1343);
		like();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred90_GenericSQL

	// $ANTLR start synpred91_GenericSQL
	public final void synpred91_GenericSQL_fragment() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:314:7: ( quantifier )
		// C:\\FakeWH\\GenericSQL.g:314:7: quantifier
		{
		pushFollow(FOLLOW_quantifier_in_synpred91_GenericSQL1351);
		quantifier();
		state._fsp--;
		if (state.failed) return;

		}

	}
	// $ANTLR end synpred91_GenericSQL

	// Delegated rules

	public final boolean synpred62_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred62_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred81_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred81_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred87_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred87_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred86_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred86_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred28_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred28_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred84_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred84_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred85_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred85_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred75_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred75_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred18_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred18_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred76_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred76_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred91_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred91_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred21_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred21_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred19_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred19_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred73_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred73_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred88_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred88_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred43_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred43_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred90_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred90_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred58_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred58_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred17_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred17_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred20_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred20_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred42_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred42_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred83_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred83_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred40_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred40_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred61_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred61_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred77_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred77_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}
	public final boolean synpred41_GenericSQL() {
		state.backtracking++;
		int start = input.mark();
		try {
			synpred41_GenericSQL_fragment(); // can never throw exception
		} catch (RecognitionException re) {
			System.err.println("impossible: "+re);
		}
		boolean success = !state.failed;
		input.rewind(start);
		state.backtracking--;
		state.failed=false;
		return success;
	}



	public static final BitSet FOLLOW_select_in_statement76 = new BitSet(new long[]{0x0000000000200000L,0x0000001800000000L});
	public static final BitSet FOLLOW_SEMI_in_statement80 = new BitSet(new long[]{0x0000000000200000L,0x0000000800000000L});
	public static final BitSet FOLLOW_create_in_statement87 = new BitSet(new long[]{0x0000000000200000L,0x0000001800000000L});
	public static final BitSet FOLLOW_SEMI_in_statement91 = new BitSet(new long[]{0x0000000000200000L,0x0000000800000000L});
	public static final BitSet FOLLOW_EOF_in_statement98 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_insert_in_statement104 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_SEMI_in_statement108 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_statement113 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_update_in_statement118 = new BitSet(new long[]{0x0000000000000000L,0x0000001000000000L});
	public static final BitSet FOLLOW_SEMI_in_statement122 = new BitSet(new long[]{0x0000000000000000L});
	public static final BitSet FOLLOW_EOF_in_statement127 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CREATE_in_create145 = new BitSet(new long[]{0x0000000000000000L,0x0000100000000000L});
	public static final BitSet FOLLOW_TABLE_in_create147 = new BitSet(new long[]{0x0100000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_tableRef_in_create149 = new BitSet(new long[]{0x0000000000000200L,0x0000000000008000L});
	public static final BitSet FOLLOW_NOLOGGING_in_create158 = new BitSet(new long[]{0x0000000000000200L});
	public static final BitSet FOLLOW_AS_in_create162 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000004L});
	public static final BitSet FOLLOW_subSelect_in_create164 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_select_in_subSelect179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LPAREN_in_subSelect185 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000000L});
	public static final BitSet FOLLOW_select_in_subSelect187 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RPAREN_in_subSelect189 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_SELECT_in_select204 = new BitSet(new long[]{0x4300090092130820L,0x008FC680240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_TOP_in_select235 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Integer_in_select237 = new BitSet(new long[]{0x4300090082130800L,0x000DC680260441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_PERCENT_in_select241 = new BitSet(new long[]{0x4300090082130800L,0x000DC680240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_itemList_in_select253 = new BitSet(new long[]{0x0040020000000000L});
	public static final BitSet FOLLOW_into_in_select261 = new BitSet(new long[]{0x0000020000000000L});
	public static final BitSet FOLLOW_from_in_select270 = new BitSet(new long[]{0x0812240000400000L,0x4000000100C00801L});
	public static final BitSet FOLLOW_joinList_in_select278 = new BitSet(new long[]{0x0002200000000002L,0x4000000000400000L});
	public static final BitSet FOLLOW_where_in_select295 = new BitSet(new long[]{0x0002200000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_groupBy_in_select306 = new BitSet(new long[]{0x0002000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_having_in_select317 = new BitSet(new long[]{0x0000000000000002L,0x0000000000400000L});
	public static final BitSet FOLLOW_orderBy_in_select328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INSERT_in_insert352 = new BitSet(new long[]{0x0040000000000000L});
	public static final BitSet FOLLOW_into_in_insert354 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000004L});
	public static final BitSet FOLLOW_columnList_in_insert358 = new BitSet(new long[]{0x0000000000000000L,0x0800000000000000L});
	public static final BitSet FOLLOW_values_in_insert367 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_UPDATE_in_update387 = new BitSet(new long[]{0x0100000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_tableRef_in_update389 = new BitSet(new long[]{0x0000000000000000L,0x0000002000000000L});
	public static final BitSet FOLLOW_SET_in_update391 = new BitSet(new long[]{0x0100000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_setter_in_update393 = new BitSet(new long[]{0x0000000000080002L,0x4000000000000000L});
	public static final BitSet FOLLOW_COMMA_in_update397 = new BitSet(new long[]{0x0100000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_setter_in_update399 = new BitSet(new long[]{0x0000000000080002L,0x4000000000000000L});
	public static final BitSet FOLLOW_where_in_update410 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_columnName_in_setter428 = new BitSet(new long[]{0x0000001000000000L});
	public static final BitSet FOLLOW_EQ_in_setter430 = new BitSet(new long[]{0x0200090082000000L,0x0004040004000100L,0x0000000000000038L});
	public static final BitSet FOLLOW_literal_in_setter432 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_INTO_in_into447 = new BitSet(new long[]{0x0100000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_tableRef_in_into449 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_COMMA_in_into453 = new BitSet(new long[]{0x0100000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_tableRef_in_into455 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_LPAREN_in_columnList475 = new BitSet(new long[]{0x0100000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_columnName_in_columnList477 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_COMMA_in_columnList481 = new BitSet(new long[]{0x0100000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_columnName_in_columnList483 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RPAREN_in_columnList488 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_VALUES_in_values503 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_values505 = new BitSet(new long[]{0x0200090082000000L,0x0004040004000100L,0x0000000000000038L});
	public static final BitSet FOLLOW_literal_in_values507 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_COMMA_in_values511 = new BitSet(new long[]{0x0200090082000000L,0x0004040004000100L,0x0000000000000038L});
	public static final BitSet FOLLOW_literal_in_values513 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RPAREN_in_values518 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_itemList533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_item_in_itemList539 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_COMMA_in_itemList543 = new BitSet(new long[]{0x4300090082130800L,0x000DC680240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_item_in_itemList545 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_allColumns_in_item563 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_item569 = new BitSet(new long[]{0x0100000000000202L});
	public static final BitSet FOLLOW_AS_in_item573 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_alias_in_item576 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableAlias_in_allColumns599 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_DOT_in_allColumns601 = new BitSet(new long[]{0x0000000000000000L,0x0000008000000000L});
	public static final BitSet FOLLOW_STAR_in_allColumns605 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_alias618 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_function633 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_function635 = new BitSet(new long[]{0x4300090092130800L,0x000DC682240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_DISTINCT_in_function640 = new BitSet(new long[]{0x4300090082130800L,0x000DC680240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_allColumns_in_function644 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_expression_in_function646 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_COMMA_in_function651 = new BitSet(new long[]{0x4300090082130800L,0x000DC680240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_allColumns_in_function654 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_expression_in_function656 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RPAREN_in_function665 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_functionName_in_function1681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_function1683 = new BitSet(new long[]{0x4300090092130800L,0x000DC682240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_DISTINCT_in_function1688 = new BitSet(new long[]{0x4300090082130800L,0x000DC680240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_allColumns_in_function1692 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_value_in_function1694 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_function_in_function1696 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_COMMA_in_function1701 = new BitSet(new long[]{0x4300090082130800L,0x000DC680240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_allColumns_in_function1704 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_value_in_function1706 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_function_in_function1708 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RPAREN_in_function1717 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FROM_in_from821 = new BitSet(new long[]{0x0100000000000000L,0x0000000820000004L});
	public static final BitSet FOLLOW_fromItem_in_from823 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_COMMA_in_from827 = new BitSet(new long[]{0x0100000000000000L,0x0000000820000004L});
	public static final BitSet FOLLOW_fromItem_in_from829 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_subSelect_in_fromItem849 = new BitSet(new long[]{0x0100000000000202L});
	public static final BitSet FOLLOW_tableRef_in_fromItem857 = new BitSet(new long[]{0x0100000000000202L});
	public static final BitSet FOLLOW_AS_in_fromItem874 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_alias_in_fromItem879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_in_joinList903 = new BitSet(new long[]{0x0810040000400002L,0x0000000100800801L});
	public static final BitSet FOLLOW_JOIN_in_join928 = new BitSet(new long[]{0x0100000000000000L,0x0000000820000004L});
	public static final BitSet FOLLOW_INNER_in_join936 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_JOIN_in_join938 = new BitSet(new long[]{0x0100000000000000L,0x0000000820000004L});
	public static final BitSet FOLLOW_LEFT_in_join946 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_JOIN_in_join948 = new BitSet(new long[]{0x0100000000000000L,0x0000000820000004L});
	public static final BitSet FOLLOW_LEFT_in_join956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OUTER_in_join958 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_JOIN_in_join960 = new BitSet(new long[]{0x0100000000000000L,0x0000000820000004L});
	public static final BitSet FOLLOW_RIGHT_in_join968 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_JOIN_in_join970 = new BitSet(new long[]{0x0100000000000000L,0x0000000820000004L});
	public static final BitSet FOLLOW_RIGHT_in_join979 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OUTER_in_join981 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_JOIN_in_join983 = new BitSet(new long[]{0x0100000000000000L,0x0000000820000004L});
	public static final BitSet FOLLOW_OUTER_in_join991 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_JOIN_in_join993 = new BitSet(new long[]{0x0100000000000000L,0x0000000820000004L});
	public static final BitSet FOLLOW_NATURAL_in_join1002 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_JOIN_in_join1004 = new BitSet(new long[]{0x0100000000000000L,0x0000000820000004L});
	public static final BitSet FOLLOW_CROSS_in_join1012 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_JOIN_in_join1014 = new BitSet(new long[]{0x0100000000000000L,0x0000000820000004L});
	public static final BitSet FOLLOW_FULL_in_join1022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000800000L});
	public static final BitSet FOLLOW_OUTER_in_join1024 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_JOIN_in_join1026 = new BitSet(new long[]{0x0100000000000000L,0x0000000820000004L});
	public static final BitSet FOLLOW_FULL_in_join1034 = new BitSet(new long[]{0x0800000000000000L});
	public static final BitSet FOLLOW_JOIN_in_join1036 = new BitSet(new long[]{0x0100000000000000L,0x0000000820000004L});
	public static final BitSet FOLLOW_fromItem_in_join1047 = new BitSet(new long[]{0x0000000000000002L,0x0200000000100000L});
	public static final BitSet FOLLOW_ON_in_join1053 = new BitSet(new long[]{0x4300092082130800L,0x000DC600240541C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_conditionList_in_join1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_join1061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_join1063 = new BitSet(new long[]{0x0100000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_columnRef_in_join1065 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_COMMA_in_join1069 = new BitSet(new long[]{0x0100000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_columnRef_in_join1071 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RPAREN_in_join1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHERE_in_where1103 = new BitSet(new long[]{0x4300092082130800L,0x000DC600240541C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_conditionList_in_where1105 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_GROUP_in_groupBy1124 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_BY_in_groupBy1126 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_expression_in_groupBy1128 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_COMMA_in_groupBy1132 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_expression_in_groupBy1134 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_HAVING_in_having1152 = new BitSet(new long[]{0x4300092082130800L,0x000DC600240541C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_conditionList_in_having1154 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ORDER_in_orderBy1169 = new BitSet(new long[]{0x0000000000004000L});
	public static final BitSet FOLLOW_BY_in_orderBy1171 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_orderByItem_in_orderBy1173 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_COMMA_in_orderBy1177 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_orderByItem_in_orderBy1179 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_expression_in_orderByItem1197 = new BitSet(new long[]{0x0000000008000402L});
	public static final BitSet FOLLOW_LPAREN_in_nestedCondition1223 = new BitSet(new long[]{0x4300092082130800L,0x000DC600240541C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_conditionList_in_nestedCondition1225 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RPAREN_in_nestedCondition1227 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_condition_in_conditionList1242 = new BitSet(new long[]{0x0000000000000042L,0x0000000000200000L});
	public static final BitSet FOLLOW_set_in_conditionList1246 = new BitSet(new long[]{0x4300092082130800L,0x000DC600240541C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_condition_in_conditionList1256 = new BitSet(new long[]{0x0000000000000042L,0x0000000000200000L});
	public static final BitSet FOLLOW_NOT_in_condition1276 = new BitSet(new long[]{0x4300092082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_between_in_condition1287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_notbetween_in_condition1295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nestedCondition_in_condition1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_in_condition1311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_notin_in_condition1319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_isNull_in_condition1327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_exists_in_condition1335 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_in_condition1343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantifier_in_condition1351 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_comparison_in_condition1359 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_in1378 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_IN_in_in1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_in1382 = new BitSet(new long[]{0x4300090082130800L,0x000DC608240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_subSelect_in_in1386 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_expressionList_in_in1390 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RPAREN_in_in1394 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_notin1411 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_NOT_in_notin1413 = new BitSet(new long[]{0x0008000000000000L});
	public static final BitSet FOLLOW_IN_in_notin1415 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_notin1417 = new BitSet(new long[]{0x4300090082130800L,0x000DC608240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_subSelect_in_notin1421 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_expressionList_in_notin1425 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RPAREN_in_notin1429 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_between1444 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_BETWEEN_in_between1446 = new BitSet(new long[]{0x4300090082130800L,0x000DC608240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_expression_in_between1449 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_subSelect_in_between1453 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AND_in_between1456 = new BitSet(new long[]{0x4300090082130800L,0x000DC608240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_expression_in_between1459 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subSelect_in_between1463 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_notbetween1483 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010000L});
	public static final BitSet FOLLOW_NOT_in_notbetween1486 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_BETWEEN_in_notbetween1488 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_expression_in_notbetween1490 = new BitSet(new long[]{0x0000000000000040L});
	public static final BitSet FOLLOW_AND_in_notbetween1492 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_expression_in_notbetween1494 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_isNull1513 = new BitSet(new long[]{0x0080000000000000L});
	public static final BitSet FOLLOW_IS_in_isNull1515 = new BitSet(new long[]{0x0000000000000000L,0x0000000000030000L});
	public static final BitSet FOLLOW_NOT_in_isNull1519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000020000L});
	public static final BitSet FOLLOW_NULL_in_isNull1524 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_EXISTS_in_exists1539 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_expression_in_exists1541 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_like1560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000010002L});
	public static final BitSet FOLLOW_NOT_in_like1564 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000002L});
	public static final BitSet FOLLOW_LIKE_in_like1569 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_expression_in_like1571 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_comparison1590 = new BitSet(new long[]{0x0000C01000000000L,0x0000000000003018L});
	public static final BitSet FOLLOW_comparator_in_comparison1593 = new BitSet(new long[]{0x4300090082130800L,0x000DC608240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_expression_in_comparison1596 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_subSelect_in_comparison1600 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_quantifier1670 = new BitSet(new long[]{0x00000000000000A0L,0x0000004000000000L});
	public static final BitSet FOLLOW_set_in_quantifier1672 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_quantifier1686 = new BitSet(new long[]{0x0000000000000000L,0x0000000800000004L});
	public static final BitSet FOLLOW_subSelect_in_quantifier1688 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RPAREN_in_quantifier1690 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_expression_in_expressionList1705 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_COMMA_in_expressionList1709 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_expression_in_expressionList1711 = new BitSet(new long[]{0x0000000000080002L});
	public static final BitSet FOLLOW_LPAREN_in_nestedExpression1727 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_expression_in_nestedExpression1729 = new BitSet(new long[]{0x0000000000000000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RPAREN_in_nestedExpression1731 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_multiply_in_expression1746 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000100L});
	public static final BitSet FOLLOW_set_in_expression1750 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_multiply_in_expression1760 = new BitSet(new long[]{0x0000000000000002L,0x0000000004000100L});
	public static final BitSet FOLLOW_value_in_multiply1778 = new BitSet(new long[]{0x0000000020000002L,0x0000008000000000L});
	public static final BitSet FOLLOW_set_in_multiply1783 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_value_in_multiply1794 = new BitSet(new long[]{0x0000000020000002L,0x0000008000000000L});
	public static final BitSet FOLLOW_function_in_value1842 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_caseWhenExpression_in_value1850 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_value1864 = new BitSet(new long[]{0x0100000000000000L,0x0000000020000004L});
	public static final BitSet FOLLOW_columnRef_in_value1875 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nestedExpression_in_value1883 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_literal_in_value1898 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_literal1915 = new BitSet(new long[]{0x0000080000000000L});
	public static final BitSet FOLLOW_Float_in_literal1920 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_unary_in_literal1928 = new BitSet(new long[]{0x0200000000000000L});
	public static final BitSet FOLLOW_Integer_in_literal1933 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_String_in_literal1939 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_TRUE_in_literal1945 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_FALSE_in_literal1951 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_date_in_literal1957 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_131_in_date1970 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_Timestamp_in_date1972 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_RCURLY_in_date1974 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_132_in_date1981 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_Timestamp_in_date1983 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_RCURLY_in_date1985 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_133_in_date1992 = new BitSet(new long[]{0x0000000000000000L,0x0010000000000000L});
	public static final BitSet FOLLOW_Timestamp_in_date1994 = new BitSet(new long[]{0x0000000000000000L,0x0000000080000000L});
	public static final BitSet FOLLOW_RCURLY_in_date1996 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Daytime_in_date2003 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_DATE_in_date2009 = new BitSet(new long[]{0x0000000080000000L});
	public static final BitSet FOLLOW_Daytime_in_date2011 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_CASE_in_caseWhenExpression2049 = new BitSet(new long[]{0x4300090082130800L,0x200DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_whenThenSearchCondition_in_caseWhenExpression2059 = new BitSet(new long[]{0x0000000400000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_value_in_caseWhenExpression2070 = new BitSet(new long[]{0x0000000400000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_whenThenValue_in_caseWhenExpression2074 = new BitSet(new long[]{0x0000000400000000L,0x2000000000000000L});
	public static final BitSet FOLLOW_elseInCase_in_caseWhenExpression2085 = new BitSet(new long[]{0x0000000800000000L});
	public static final BitSet FOLLOW_END_in_caseWhenExpression2091 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHEN_in_whenThenSearchCondition2104 = new BitSet(new long[]{0x4300092082130800L,0x000DC600240541C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_condition_in_whenThenSearchCondition2106 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_THEN_in_whenThenSearchCondition2108 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_value_in_whenThenSearchCondition2110 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_WHEN_in_whenThenValue2123 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_value_in_whenThenValue2125 = new BitSet(new long[]{0x0000000000000000L,0x0000200000000000L});
	public static final BitSet FOLLOW_THEN_in_whenThenValue2127 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_value_in_whenThenValue2129 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ELSE_in_elseInCase2144 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_value_in_elseInCase2146 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableName_in_tableRef2162 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_databaseName_in_tableRef2168 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_DOT_in_tableRef2170 = new BitSet(new long[]{0x0100000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_tableName_in_tableRef2172 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_columnName_in_columnRef2187 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_tableAlias_in_columnRef2194 = new BitSet(new long[]{0x0000000040000000L});
	public static final BitSet FOLLOW_DOT_in_columnRef2196 = new BitSet(new long[]{0x0100000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_columnName_in_columnRef2198 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_Identifier_in_tableAlias2253 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_joinList_in_synpred17_GenericSQL278 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_where_in_synpred18_GenericSQL295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_groupBy_in_synpred19_GenericSQL306 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_having_in_synpred20_GenericSQL317 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_orderBy_in_synpred21_GenericSQL328 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_STAR_in_synpred28_GenericSQL533 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allColumns_in_synpred40_GenericSQL692 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_synpred41_GenericSQL694 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_allColumns_in_synpred42_GenericSQL704 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_value_in_synpred43_GenericSQL706 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred58_GenericSQL827 = new BitSet(new long[]{0x0100000000000000L,0x0000000820000004L});
	public static final BitSet FOLLOW_fromItem_in_synpred58_GenericSQL829 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_AS_in_synpred61_GenericSQL874 = new BitSet(new long[]{0x0100000000000000L});
	public static final BitSet FOLLOW_alias_in_synpred61_GenericSQL879 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_join_in_synpred62_GenericSQL903 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_ON_in_synpred73_GenericSQL1053 = new BitSet(new long[]{0x4300092082130800L,0x000DC600240541C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_conditionList_in_synpred73_GenericSQL1055 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_USING_in_synpred75_GenericSQL1061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
	public static final BitSet FOLLOW_LPAREN_in_synpred75_GenericSQL1063 = new BitSet(new long[]{0x0100000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_columnRef_in_synpred75_GenericSQL1065 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_COMMA_in_synpred75_GenericSQL1069 = new BitSet(new long[]{0x0100000000000000L,0x0000000020000000L});
	public static final BitSet FOLLOW_columnRef_in_synpred75_GenericSQL1071 = new BitSet(new long[]{0x0000000000080000L,0x0000000200000000L});
	public static final BitSet FOLLOW_RPAREN_in_synpred75_GenericSQL1076 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred76_GenericSQL1132 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_expression_in_synpred76_GenericSQL1134 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_COMMA_in_synpred77_GenericSQL1177 = new BitSet(new long[]{0x4300090082130800L,0x000DC600240441C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_orderByItem_in_synpred77_GenericSQL1179 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_set_in_synpred81_GenericSQL1246 = new BitSet(new long[]{0x4300092082130800L,0x000DC600240541C4L,0x0000000000000038L});
	public static final BitSet FOLLOW_condition_in_synpred81_GenericSQL1256 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_between_in_synpred83_GenericSQL1287 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_notbetween_in_synpred84_GenericSQL1295 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_nestedCondition_in_synpred85_GenericSQL1303 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_in_in_synpred86_GenericSQL1311 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_notin_in_synpred87_GenericSQL1319 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_isNull_in_synpred88_GenericSQL1327 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_like_in_synpred90_GenericSQL1343 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_quantifier_in_synpred91_GenericSQL1351 = new BitSet(new long[]{0x0000000000000002L});
}
