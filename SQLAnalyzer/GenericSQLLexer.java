// $ANTLR 3.5 C:\\FakeWH\\GenericSQL.g 2014-06-09 02:30:45
 
//	package fado.parse; 


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class GenericSQLLexer extends Lexer {
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

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public GenericSQLLexer() {} 
	public GenericSQLLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public GenericSQLLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\FakeWH\\GenericSQL.g"; }

	// $ANTLR start "T__131"
	public final void mT__131() throws RecognitionException {
		try {
			int _type = T__131;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:11:8: ( '{d' )
			// C:\\FakeWH\\GenericSQL.g:11:10: '{d'
			{
			match("{d"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__131"

	// $ANTLR start "T__132"
	public final void mT__132() throws RecognitionException {
		try {
			int _type = T__132;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:12:8: ( '{t' )
			// C:\\FakeWH\\GenericSQL.g:12:10: '{t'
			{
			match("{t"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__132"

	// $ANTLR start "T__133"
	public final void mT__133() throws RecognitionException {
		try {
			int _type = T__133;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:13:8: ( '{ts' )
			// C:\\FakeWH\\GenericSQL.g:13:10: '{ts'
			{
			match("{ts"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__133"

	// $ANTLR start "ALL"
	public final void mALL() throws RecognitionException {
		try {
			int _type = ALL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:498:11: ( A L L )
			// C:\\FakeWH\\GenericSQL.g:498:13: A L L
			{
			mA(); 

			mL(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ALL"

	// $ANTLR start "AND"
	public final void mAND() throws RecognitionException {
		try {
			int _type = AND;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:499:11: ( A N D )
			// C:\\FakeWH\\GenericSQL.g:499:13: A N D
			{
			mA(); 

			mN(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AND"

	// $ANTLR start "ANY"
	public final void mANY() throws RecognitionException {
		try {
			int _type = ANY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:500:11: ( A N Y )
			// C:\\FakeWH\\GenericSQL.g:500:13: A N Y
			{
			mA(); 

			mN(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ANY"

	// $ANTLR start "AS"
	public final void mAS() throws RecognitionException {
		try {
			int _type = AS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:501:11: ( A S )
			// C:\\FakeWH\\GenericSQL.g:501:13: A S
			{
			mA(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AS"

	// $ANTLR start "ASC"
	public final void mASC() throws RecognitionException {
		try {
			int _type = ASC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:502:11: ( A S C )
			// C:\\FakeWH\\GenericSQL.g:502:13: A S C
			{
			mA(); 

			mS(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASC"

	// $ANTLR start "BETWEEN"
	public final void mBETWEEN() throws RecognitionException {
		try {
			int _type = BETWEEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:503:11: ( B E T W E E N )
			// C:\\FakeWH\\GenericSQL.g:503:13: B E T W E E N
			{
			mB(); 

			mE(); 

			mT(); 

			mW(); 

			mE(); 

			mE(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BETWEEN"

	// $ANTLR start "BY"
	public final void mBY() throws RecognitionException {
		try {
			int _type = BY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:504:11: ( B Y )
			// C:\\FakeWH\\GenericSQL.g:504:13: B Y
			{
			mB(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "BY"

	// $ANTLR start "CASE"
	public final void mCASE() throws RecognitionException {
		try {
			int _type = CASE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:505:11: ( C A S E )
			// C:\\FakeWH\\GenericSQL.g:505:13: C A S E
			{
			mC(); 

			mA(); 

			mS(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CASE"

	// $ANTLR start "CREATE"
	public final void mCREATE() throws RecognitionException {
		try {
			int _type = CREATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:506:10: ( C R E A T E )
			// C:\\FakeWH\\GenericSQL.g:506:12: C R E A T E
			{
			mC(); 

			mR(); 

			mE(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CREATE"

	// $ANTLR start "CROSS"
	public final void mCROSS() throws RecognitionException {
		try {
			int _type = CROSS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:508:11: ( C R O S S )
			// C:\\FakeWH\\GenericSQL.g:508:13: C R O S S
			{
			mC(); 

			mR(); 

			mO(); 

			mS(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "CROSS"

	// $ANTLR start "DATE"
	public final void mDATE() throws RecognitionException {
		try {
			int _type = DATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:512:8: ( D A T E )
			// C:\\FakeWH\\GenericSQL.g:512:10: D A T E
			{
			mD(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DATE"

	// $ANTLR start "DELETE"
	public final void mDELETE() throws RecognitionException {
		try {
			int _type = DELETE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:513:11: ( D E L E T E )
			// C:\\FakeWH\\GenericSQL.g:513:13: D E L E T E
			{
			mD(); 

			mE(); 

			mL(); 

			mE(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DELETE"

	// $ANTLR start "DESC"
	public final void mDESC() throws RecognitionException {
		try {
			int _type = DESC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:514:11: ( D E S C )
			// C:\\FakeWH\\GenericSQL.g:514:13: D E S C
			{
			mD(); 

			mE(); 

			mS(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DESC"

	// $ANTLR start "DISTINCT"
	public final void mDISTINCT() throws RecognitionException {
		try {
			int _type = DISTINCT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:515:11: ( D I S T I N C T )
			// C:\\FakeWH\\GenericSQL.g:515:13: D I S T I N C T
			{
			mD(); 

			mI(); 

			mS(); 

			mT(); 

			mI(); 

			mN(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DISTINCT"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:516:11: ( E L S E )
			// C:\\FakeWH\\GenericSQL.g:516:13: E L S E
			{
			mE(); 

			mL(); 

			mS(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:517:11: ( E N D )
			// C:\\FakeWH\\GenericSQL.g:517:13: E N D
			{
			mE(); 

			mN(); 

			mD(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "EXISTS"
	public final void mEXISTS() throws RecognitionException {
		try {
			int _type = EXISTS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:519:11: ( E X I S T S )
			// C:\\FakeWH\\GenericSQL.g:519:13: E X I S T S
			{
			mE(); 

			mX(); 

			mI(); 

			mS(); 

			mT(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EXISTS"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:521:11: ( F A L S E )
			// C:\\FakeWH\\GenericSQL.g:521:13: F A L S E
			{
			mF(); 

			mA(); 

			mL(); 

			mS(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "FROM"
	public final void mFROM() throws RecognitionException {
		try {
			int _type = FROM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:524:11: ( F R O M )
			// C:\\FakeWH\\GenericSQL.g:524:13: F R O M
			{
			mF(); 

			mR(); 

			mO(); 

			mM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FROM"

	// $ANTLR start "FULL"
	public final void mFULL() throws RecognitionException {
		try {
			int _type = FULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:525:11: ( F U L L )
			// C:\\FakeWH\\GenericSQL.g:525:13: F U L L
			{
			mF(); 

			mU(); 

			mL(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FULL"

	// $ANTLR start "GROUP"
	public final void mGROUP() throws RecognitionException {
		try {
			int _type = GROUP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:526:11: ( G R O U P )
			// C:\\FakeWH\\GenericSQL.g:526:13: G R O U P
			{
			mG(); 

			mR(); 

			mO(); 

			mU(); 

			mP(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GROUP"

	// $ANTLR start "HAVING"
	public final void mHAVING() throws RecognitionException {
		try {
			int _type = HAVING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:527:11: ( H A V I N G )
			// C:\\FakeWH\\GenericSQL.g:527:13: H A V I N G
			{
			mH(); 

			mA(); 

			mV(); 

			mI(); 

			mN(); 

			mG(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "HAVING"

	// $ANTLR start "IN"
	public final void mIN() throws RecognitionException {
		try {
			int _type = IN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:529:11: ( I N )
			// C:\\FakeWH\\GenericSQL.g:529:13: I N
			{
			mI(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IN"

	// $ANTLR start "INNER"
	public final void mINNER() throws RecognitionException {
		try {
			int _type = INNER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:530:11: ( I N N E R )
			// C:\\FakeWH\\GenericSQL.g:530:13: I N N E R
			{
			mI(); 

			mN(); 

			mN(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INNER"

	// $ANTLR start "INSERT"
	public final void mINSERT() throws RecognitionException {
		try {
			int _type = INSERT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:531:11: ( I N S E R T )
			// C:\\FakeWH\\GenericSQL.g:531:13: I N S E R T
			{
			mI(); 

			mN(); 

			mS(); 

			mE(); 

			mR(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INSERT"

	// $ANTLR start "INTO"
	public final void mINTO() throws RecognitionException {
		try {
			int _type = INTO;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:533:11: ( I N T O )
			// C:\\FakeWH\\GenericSQL.g:533:13: I N T O
			{
			mI(); 

			mN(); 

			mT(); 

			mO(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INTO"

	// $ANTLR start "IS"
	public final void mIS() throws RecognitionException {
		try {
			int _type = IS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:534:11: ( I S )
			// C:\\FakeWH\\GenericSQL.g:534:13: I S
			{
			mI(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IS"

	// $ANTLR start "JOIN"
	public final void mJOIN() throws RecognitionException {
		try {
			int _type = JOIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:535:11: ( J O I N )
			// C:\\FakeWH\\GenericSQL.g:535:13: J O I N
			{
			mJ(); 

			mO(); 

			mI(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "JOIN"

	// $ANTLR start "LEFT"
	public final void mLEFT() throws RecognitionException {
		try {
			int _type = LEFT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:536:11: ( L E F T )
			// C:\\FakeWH\\GenericSQL.g:536:13: L E F T
			{
			mL(); 

			mE(); 

			mF(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LEFT"

	// $ANTLR start "LIKE"
	public final void mLIKE() throws RecognitionException {
		try {
			int _type = LIKE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:537:11: ( L I K E )
			// C:\\FakeWH\\GenericSQL.g:537:13: L I K E
			{
			mL(); 

			mI(); 

			mK(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LIKE"

	// $ANTLR start "NATURAL"
	public final void mNATURAL() throws RecognitionException {
		try {
			int _type = NATURAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:540:11: ( N A T U R A L )
			// C:\\FakeWH\\GenericSQL.g:540:13: N A T U R A L
			{
			mN(); 

			mA(); 

			mT(); 

			mU(); 

			mR(); 

			mA(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NATURAL"

	// $ANTLR start "NOT"
	public final void mNOT() throws RecognitionException {
		try {
			int _type = NOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:541:11: ( N O T )
			// C:\\FakeWH\\GenericSQL.g:541:13: N O T
			{
			mN(); 

			mO(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOT"

	// $ANTLR start "NULL"
	public final void mNULL() throws RecognitionException {
		try {
			int _type = NULL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:542:11: ( N U L L )
			// C:\\FakeWH\\GenericSQL.g:542:13: N U L L
			{
			mN(); 

			mU(); 

			mL(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NULL"

	// $ANTLR start "NOLOGGING"
	public final void mNOLOGGING() throws RecognitionException {
		try {
			int _type = NOLOGGING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:544:2: ( N O L O G G I N G )
			// C:\\FakeWH\\GenericSQL.g:544:4: N O L O G G I N G
			{
			mN(); 

			mO(); 

			mL(); 

			mO(); 

			mG(); 

			mG(); 

			mI(); 

			mN(); 

			mG(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOLOGGING"

	// $ANTLR start "ON"
	public final void mON() throws RecognitionException {
		try {
			int _type = ON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:545:11: ( O N )
			// C:\\FakeWH\\GenericSQL.g:545:13: O N
			{
			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ON"

	// $ANTLR start "OR"
	public final void mOR() throws RecognitionException {
		try {
			int _type = OR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:546:11: ( O R )
			// C:\\FakeWH\\GenericSQL.g:546:13: O R
			{
			mO(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OR"

	// $ANTLR start "ORDER"
	public final void mORDER() throws RecognitionException {
		try {
			int _type = ORDER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:547:11: ( O R D E R )
			// C:\\FakeWH\\GenericSQL.g:547:13: O R D E R
			{
			mO(); 

			mR(); 

			mD(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ORDER"

	// $ANTLR start "OUTER"
	public final void mOUTER() throws RecognitionException {
		try {
			int _type = OUTER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:548:11: ( O U T E R )
			// C:\\FakeWH\\GenericSQL.g:548:13: O U T E R
			{
			mO(); 

			mU(); 

			mT(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "OUTER"

	// $ANTLR start "PERCENT"
	public final void mPERCENT() throws RecognitionException {
		try {
			int _type = PERCENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:549:11: ( P E R C E N T )
			// C:\\FakeWH\\GenericSQL.g:549:13: P E R C E N T
			{
			mP(); 

			mE(); 

			mR(); 

			mC(); 

			mE(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PERCENT"

	// $ANTLR start "RIGHT"
	public final void mRIGHT() throws RecognitionException {
		try {
			int _type = RIGHT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:550:11: ( R I G H T )
			// C:\\FakeWH\\GenericSQL.g:550:13: R I G H T
			{
			mR(); 

			mI(); 

			mG(); 

			mH(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RIGHT"

	// $ANTLR start "SELECT"
	public final void mSELECT() throws RecognitionException {
		try {
			int _type = SELECT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:552:11: ( S E L E C T )
			// C:\\FakeWH\\GenericSQL.g:552:13: S E L E C T
			{
			mS(); 

			mE(); 

			mL(); 

			mE(); 

			mC(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SELECT"

	// $ANTLR start "SET"
	public final void mSET() throws RecognitionException {
		try {
			int _type = SET;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:553:11: ( S E T )
			// C:\\FakeWH\\GenericSQL.g:553:13: S E T
			{
			mS(); 

			mE(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SET"

	// $ANTLR start "SOME"
	public final void mSOME() throws RecognitionException {
		try {
			int _type = SOME;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:554:11: ( S O M E )
			// C:\\FakeWH\\GenericSQL.g:554:13: S O M E
			{
			mS(); 

			mO(); 

			mM(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SOME"

	// $ANTLR start "TABLE"
	public final void mTABLE() throws RecognitionException {
		try {
			int _type = TABLE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:556:9: ( T A B L E )
			// C:\\FakeWH\\GenericSQL.g:556:11: T A B L E
			{
			mT(); 

			mA(); 

			mB(); 

			mL(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TABLE"

	// $ANTLR start "THEN"
	public final void mTHEN() throws RecognitionException {
		try {
			int _type = THEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:557:11: ( T H E N )
			// C:\\FakeWH\\GenericSQL.g:557:13: T H E N
			{
			mT(); 

			mH(); 

			mE(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "THEN"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:558:11: ( T R U E )
			// C:\\FakeWH\\GenericSQL.g:558:13: T R U E
			{
			mT(); 

			mR(); 

			mU(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "TOP"
	public final void mTOP() throws RecognitionException {
		try {
			int _type = TOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:560:11: ( T O P )
			// C:\\FakeWH\\GenericSQL.g:560:13: T O P
			{
			mT(); 

			mO(); 

			mP(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TOP"

	// $ANTLR start "UNION"
	public final void mUNION() throws RecognitionException {
		try {
			int _type = UNION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:561:11: ( U N I O N )
			// C:\\FakeWH\\GenericSQL.g:561:13: U N I O N
			{
			mU(); 

			mN(); 

			mI(); 

			mO(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNION"

	// $ANTLR start "UNIQUE"
	public final void mUNIQUE() throws RecognitionException {
		try {
			int _type = UNIQUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:562:11: ( U N I Q U E )
			// C:\\FakeWH\\GenericSQL.g:562:13: U N I Q U E
			{
			mU(); 

			mN(); 

			mI(); 

			mQ(); 

			mU(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UNIQUE"

	// $ANTLR start "UPDATE"
	public final void mUPDATE() throws RecognitionException {
		try {
			int _type = UPDATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:563:11: ( U P D A T E )
			// C:\\FakeWH\\GenericSQL.g:563:13: U P D A T E
			{
			mU(); 

			mP(); 

			mD(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "UPDATE"

	// $ANTLR start "USING"
	public final void mUSING() throws RecognitionException {
		try {
			int _type = USING;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:564:11: ( U S I N G )
			// C:\\FakeWH\\GenericSQL.g:564:13: U S I N G
			{
			mU(); 

			mS(); 

			mI(); 

			mN(); 

			mG(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "USING"

	// $ANTLR start "VALUES"
	public final void mVALUES() throws RecognitionException {
		try {
			int _type = VALUES;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:565:11: ( V A L U E S )
			// C:\\FakeWH\\GenericSQL.g:565:13: V A L U E S
			{
			mV(); 

			mA(); 

			mL(); 

			mU(); 

			mE(); 

			mS(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "VALUES"

	// $ANTLR start "WHEN"
	public final void mWHEN() throws RecognitionException {
		try {
			int _type = WHEN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:566:11: ( W H E N )
			// C:\\FakeWH\\GenericSQL.g:566:13: W H E N
			{
			mW(); 

			mH(); 

			mE(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHEN"

	// $ANTLR start "WHERE"
	public final void mWHERE() throws RecognitionException {
		try {
			int _type = WHERE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:567:11: ( W H E R E )
			// C:\\FakeWH\\GenericSQL.g:567:13: W H E R E
			{
			mW(); 

			mH(); 

			mE(); 

			mR(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WHERE"

	// $ANTLR start "MAX"
	public final void mMAX() throws RecognitionException {
		try {
			int _type = MAX;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:570:11: ( M A X )
			// C:\\FakeWH\\GenericSQL.g:570:13: M A X
			{
			mM(); 

			mA(); 

			mX(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MAX"

	// $ANTLR start "MIN"
	public final void mMIN() throws RecognitionException {
		try {
			int _type = MIN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:571:11: ( M I N )
			// C:\\FakeWH\\GenericSQL.g:571:13: M I N
			{
			mM(); 

			mI(); 

			mN(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MIN"

	// $ANTLR start "COUNT"
	public final void mCOUNT() throws RecognitionException {
		try {
			int _type = COUNT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:572:11: ( C O U N T )
			// C:\\FakeWH\\GenericSQL.g:572:13: C O U N T
			{
			mC(); 

			mO(); 

			mU(); 

			mN(); 

			mT(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COUNT"

	// $ANTLR start "SUM"
	public final void mSUM() throws RecognitionException {
		try {
			int _type = SUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:573:5: ( S U M )
			// C:\\FakeWH\\GenericSQL.g:573:7: S U M
			{
			mS(); 

			mU(); 

			mM(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SUM"

	// $ANTLR start "AVG"
	public final void mAVG() throws RecognitionException {
		try {
			int _type = AVG;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:574:5: ( A V G )
			// C:\\FakeWH\\GenericSQL.g:574:7: A V G
			{
			mA(); 

			mV(); 

			mG(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "AVG"

	// $ANTLR start "NVL"
	public final void mNVL() throws RecognitionException {
		try {
			int _type = NVL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:575:5: ( N V L )
			// C:\\FakeWH\\GenericSQL.g:575:7: N V L
			{
			mN(); 

			mV(); 

			mL(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NVL"

	// $ANTLR start "COALESCE"
	public final void mCOALESCE() throws RecognitionException {
		try {
			int _type = COALESCE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:576:9: ( C O A L E S C E )
			// C:\\FakeWH\\GenericSQL.g:576:11: C O A L E S C E
			{
			mC(); 

			mO(); 

			mA(); 

			mL(); 

			mE(); 

			mS(); 

			mC(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COALESCE"

	// $ANTLR start "TOCHAR"
	public final void mTOCHAR() throws RecognitionException {
		try {
			int _type = TOCHAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:577:8: ( T O '_' C H A R )
			// C:\\FakeWH\\GenericSQL.g:577:10: T O '_' C H A R
			{
			mT(); 

			mO(); 

			match('_'); 
			mC(); 

			mH(); 

			mA(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TOCHAR"

	// $ANTLR start "TODATE"
	public final void mTODATE() throws RecognitionException {
		try {
			int _type = TODATE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:578:8: ( T O '_' D A T E )
			// C:\\FakeWH\\GenericSQL.g:578:10: T O '_' D A T E
			{
			mT(); 

			mO(); 

			match('_'); 
			mD(); 

			mA(); 

			mT(); 

			mE(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TODATE"

	// $ANTLR start "LASTDAY"
	public final void mLASTDAY() throws RecognitionException {
		try {
			int _type = LASTDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:579:9: ( L A S T '_' D A Y )
			// C:\\FakeWH\\GenericSQL.g:579:11: L A S T '_' D A Y
			{
			mL(); 

			mA(); 

			mS(); 

			mT(); 

			match('_'); 
			mD(); 

			mA(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LASTDAY"

	// $ANTLR start "TONUMBER"
	public final void mTONUMBER() throws RecognitionException {
		try {
			int _type = TONUMBER;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:580:9: ( T O '_' N U M B E R )
			// C:\\FakeWH\\GenericSQL.g:580:11: T O '_' N U M B E R
			{
			mT(); 

			mO(); 

			match('_'); 
			mN(); 

			mU(); 

			mM(); 

			mB(); 

			mE(); 

			mR(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TONUMBER"

	// $ANTLR start "TRUNC"
	public final void mTRUNC() throws RecognitionException {
		try {
			int _type = TRUNC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:581:8: ( T R U N C )
			// C:\\FakeWH\\GenericSQL.g:581:10: T R U N C
			{
			mT(); 

			mR(); 

			mU(); 

			mN(); 

			mC(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUNC"

	// $ANTLR start "NEXTDAY"
	public final void mNEXTDAY() throws RecognitionException {
		try {
			int _type = NEXTDAY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:582:9: ( N E X T '_' D A Y )
			// C:\\FakeWH\\GenericSQL.g:582:11: N E X T '_' D A Y
			{
			mN(); 

			mE(); 

			mX(); 

			mT(); 

			match('_'); 
			mD(); 

			mA(); 

			mY(); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEXTDAY"

	// $ANTLR start "A"
	public final void mA() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:584:11: ( ( 'a' | 'A' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='A'||input.LA(1)=='a' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "A"

	// $ANTLR start "B"
	public final void mB() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:585:11: ( ( 'b' | 'B' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='B'||input.LA(1)=='b' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "B"

	// $ANTLR start "C"
	public final void mC() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:586:11: ( ( 'c' | 'C' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='C'||input.LA(1)=='c' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "C"

	// $ANTLR start "D"
	public final void mD() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:587:11: ( ( 'd' | 'D' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='D'||input.LA(1)=='d' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "D"

	// $ANTLR start "E"
	public final void mE() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:588:11: ( ( 'e' | 'E' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "E"

	// $ANTLR start "F"
	public final void mF() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:589:11: ( ( 'f' | 'F' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='F'||input.LA(1)=='f' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "F"

	// $ANTLR start "G"
	public final void mG() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:590:11: ( ( 'g' | 'G' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='G'||input.LA(1)=='g' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "G"

	// $ANTLR start "H"
	public final void mH() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:591:11: ( ( 'h' | 'H' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='H'||input.LA(1)=='h' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "H"

	// $ANTLR start "I"
	public final void mI() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:592:11: ( ( 'i' | 'I' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='I'||input.LA(1)=='i' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "I"

	// $ANTLR start "J"
	public final void mJ() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:593:11: ( ( 'j' | 'J' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='J'||input.LA(1)=='j' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "J"

	// $ANTLR start "K"
	public final void mK() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:594:11: ( ( 'k' | 'K' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='K'||input.LA(1)=='k' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "K"

	// $ANTLR start "L"
	public final void mL() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:595:11: ( ( 'l' | 'L' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='L'||input.LA(1)=='l' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "L"

	// $ANTLR start "M"
	public final void mM() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:596:11: ( ( 'm' | 'M' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='M'||input.LA(1)=='m' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "M"

	// $ANTLR start "N"
	public final void mN() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:597:11: ( ( 'n' | 'N' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='N'||input.LA(1)=='n' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "N"

	// $ANTLR start "O"
	public final void mO() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:598:11: ( ( 'o' | 'O' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='O'||input.LA(1)=='o' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "O"

	// $ANTLR start "P"
	public final void mP() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:599:11: ( ( 'p' | 'P' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='P'||input.LA(1)=='p' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "P"

	// $ANTLR start "Q"
	public final void mQ() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:600:11: ( ( 'q' | 'Q' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='Q'||input.LA(1)=='q' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Q"

	// $ANTLR start "R"
	public final void mR() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:601:11: ( ( 'r' | 'R' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='R'||input.LA(1)=='r' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "R"

	// $ANTLR start "S"
	public final void mS() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:602:11: ( ( 's' | 'S' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='S'||input.LA(1)=='s' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "S"

	// $ANTLR start "T"
	public final void mT() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:603:11: ( ( 't' | 'T' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='T'||input.LA(1)=='t' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T"

	// $ANTLR start "U"
	public final void mU() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:604:11: ( ( 'u' | 'U' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='U'||input.LA(1)=='u' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "U"

	// $ANTLR start "V"
	public final void mV() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:605:11: ( ( 'v' | 'V' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='V'||input.LA(1)=='v' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "V"

	// $ANTLR start "W"
	public final void mW() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:606:11: ( ( 'w' | 'W' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='W'||input.LA(1)=='w' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "W"

	// $ANTLR start "X"
	public final void mX() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:607:11: ( ( 'x' | 'X' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='X'||input.LA(1)=='x' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "X"

	// $ANTLR start "Y"
	public final void mY() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:608:11: ( ( 'y' | 'Y' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='Y'||input.LA(1)=='y' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Y"

	// $ANTLR start "Z"
	public final void mZ() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:609:11: ( ( 'z' | 'Z' ) )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( input.LA(1)=='Z'||input.LA(1)=='z' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Z"

	// $ANTLR start "DOT"
	public final void mDOT() throws RecognitionException {
		try {
			int _type = DOT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:611:10: ( '.' )
			// C:\\FakeWH\\GenericSQL.g:611:12: '.'
			{
			match('.'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DOT"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:612:10: ( ',' )
			// C:\\FakeWH\\GenericSQL.g:612:12: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:613:10: ( '(' )
			// C:\\FakeWH\\GenericSQL.g:613:12: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:614:10: ( ')' )
			// C:\\FakeWH\\GenericSQL.g:614:12: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LCURLY"
	public final void mLCURLY() throws RecognitionException {
		try {
			int _type = LCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:615:10: ( '{' )
			// C:\\FakeWH\\GenericSQL.g:615:12: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LCURLY"

	// $ANTLR start "RCURLY"
	public final void mRCURLY() throws RecognitionException {
		try {
			int _type = RCURLY;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:616:10: ( '}' )
			// C:\\FakeWH\\GenericSQL.g:616:12: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RCURLY"

	// $ANTLR start "STRCAT"
	public final void mSTRCAT() throws RecognitionException {
		try {
			int _type = STRCAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:617:10: ( '||' )
			// C:\\FakeWH\\GenericSQL.g:617:12: '||'
			{
			match("||"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STRCAT"

	// $ANTLR start "QUESTION"
	public final void mQUESTION() throws RecognitionException {
		try {
			int _type = QUESTION;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:618:10: ( '?' )
			// C:\\FakeWH\\GenericSQL.g:618:12: '?'
			{
			match('?'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QUESTION"

	// $ANTLR start "COLON"
	public final void mCOLON() throws RecognitionException {
		try {
			int _type = COLON;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:619:10: ( ':' )
			// C:\\FakeWH\\GenericSQL.g:619:12: ':'
			{
			match(':'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COLON"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:620:10: ( ';' )
			// C:\\FakeWH\\GenericSQL.g:620:12: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "APOSTROPHE"
	public final void mAPOSTROPHE() throws RecognitionException {
		try {
			int _type = APOSTROPHE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:622:3: ( '\\'' )
			// C:\\FakeWH\\GenericSQL.g:622:5: '\\''
			{
			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "APOSTROPHE"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:624:10: ( '=' )
			// C:\\FakeWH\\GenericSQL.g:624:12: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "NEQ1"
	public final void mNEQ1() throws RecognitionException {
		try {
			int _type = NEQ1;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:625:10: ( '<>' )
			// C:\\FakeWH\\GenericSQL.g:625:12: '<>'
			{
			match("<>"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ1"

	// $ANTLR start "NEQ2"
	public final void mNEQ2() throws RecognitionException {
		try {
			int _type = NEQ2;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:626:10: ( '!=' )
			// C:\\FakeWH\\GenericSQL.g:626:12: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NEQ2"

	// $ANTLR start "LTE"
	public final void mLTE() throws RecognitionException {
		try {
			int _type = LTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:627:10: ( '<=' )
			// C:\\FakeWH\\GenericSQL.g:627:12: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LTE"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:628:10: ( '<' )
			// C:\\FakeWH\\GenericSQL.g:628:12: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "GTE"
	public final void mGTE() throws RecognitionException {
		try {
			int _type = GTE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:629:10: ( '>=' )
			// C:\\FakeWH\\GenericSQL.g:629:12: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GTE"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:630:10: ( '>' )
			// C:\\FakeWH\\GenericSQL.g:630:12: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:632:10: ( '+' )
			// C:\\FakeWH\\GenericSQL.g:632:12: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:633:10: ( '-' )
			// C:\\FakeWH\\GenericSQL.g:633:12: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "DIVIDE"
	public final void mDIVIDE() throws RecognitionException {
		try {
			int _type = DIVIDE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:634:10: ( '/' )
			// C:\\FakeWH\\GenericSQL.g:634:12: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIVIDE"

	// $ANTLR start "STAR"
	public final void mSTAR() throws RecognitionException {
		try {
			int _type = STAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:635:10: ( '*' )
			// C:\\FakeWH\\GenericSQL.g:635:12: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "STAR"

	// $ANTLR start "MOD"
	public final void mMOD() throws RecognitionException {
		try {
			int _type = MOD;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:636:10: ( '%' )
			// C:\\FakeWH\\GenericSQL.g:636:12: '%'
			{
			match('%'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MOD"

	// $ANTLR start "Digit"
	public final void mDigit() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:640:7: ( '0' .. '9' )
			// C:\\FakeWH\\GenericSQL.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Digit"

	// $ANTLR start "Daytime"
	public final void mDaytime() throws RecognitionException {
		try {
			int _type = Daytime;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:642:3: ( ( '\\'' )? Digit Digit Digit Digit '-' Digit Digit '-' Digit Digit ( '\\'' )? )
			// C:\\FakeWH\\GenericSQL.g:642:5: ( '\\'' )? Digit Digit Digit Digit '-' Digit Digit '-' Digit Digit ( '\\'' )?
			{
			// C:\\FakeWH\\GenericSQL.g:642:5: ( '\\'' )?
			int alt1=2;
			int LA1_0 = input.LA(1);
			if ( (LA1_0=='\'') ) {
				alt1=1;
			}
			switch (alt1) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:642:6: '\\''
					{
					match('\''); 
					}
					break;

			}

			mDigit(); 

			mDigit(); 

			mDigit(); 

			mDigit(); 

			match('-'); 
			mDigit(); 

			mDigit(); 

			match('-'); 
			mDigit(); 

			mDigit(); 

			// C:\\FakeWH\\GenericSQL.g:642:69: ( '\\'' )?
			int alt2=2;
			int LA2_0 = input.LA(1);
			if ( (LA2_0=='\'') ) {
				alt2=1;
			}
			switch (alt2) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:642:70: '\\''
					{
					match('\''); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Daytime"

	// $ANTLR start "Integer"
	public final void mInteger() throws RecognitionException {
		try {
			int _type = Integer;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:646:3: ( ( Digit )+ )
			// C:\\FakeWH\\GenericSQL.g:646:5: ( Digit )+
			{
			// C:\\FakeWH\\GenericSQL.g:646:5: ( Digit )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Integer"

	// $ANTLR start "Float"
	public final void mFloat() throws RecognitionException {
		try {
			int _type = Float;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:650:3: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ Exponent )
			int alt10=3;
			alt10 = dfa10.predict(input);
			switch (alt10) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:650:5: ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )?
					{
					// C:\\FakeWH\\GenericSQL.g:650:5: ( '0' .. '9' )+
					int cnt4=0;
					loop4:
					while (true) {
						int alt4=2;
						int LA4_0 = input.LA(1);
						if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
							alt4=1;
						}

						switch (alt4) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt4 >= 1 ) break loop4;
							EarlyExitException eee = new EarlyExitException(4, input);
							throw eee;
						}
						cnt4++;
					}

					match('.'); 
					// C:\\FakeWH\\GenericSQL.g:650:21: ( '0' .. '9' )*
					loop5:
					while (true) {
						int alt5=2;
						int LA5_0 = input.LA(1);
						if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
							alt5=1;
						}

						switch (alt5) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop5;
						}
					}

					// C:\\FakeWH\\GenericSQL.g:650:33: ( Exponent )?
					int alt6=2;
					int LA6_0 = input.LA(1);
					if ( (LA6_0=='E'||LA6_0=='e') ) {
						alt6=1;
					}
					switch (alt6) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:650:33: Exponent
							{
							mExponent(); 

							}
							break;

					}

					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:651:5: '.' ( '0' .. '9' )+ ( Exponent )?
					{
					match('.'); 
					// C:\\FakeWH\\GenericSQL.g:651:9: ( '0' .. '9' )+
					int cnt7=0;
					loop7:
					while (true) {
						int alt7=2;
						int LA7_0 = input.LA(1);
						if ( ((LA7_0 >= '0' && LA7_0 <= '9')) ) {
							alt7=1;
						}

						switch (alt7) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt7 >= 1 ) break loop7;
							EarlyExitException eee = new EarlyExitException(7, input);
							throw eee;
						}
						cnt7++;
					}

					// C:\\FakeWH\\GenericSQL.g:651:21: ( Exponent )?
					int alt8=2;
					int LA8_0 = input.LA(1);
					if ( (LA8_0=='E'||LA8_0=='e') ) {
						alt8=1;
					}
					switch (alt8) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:651:21: Exponent
							{
							mExponent(); 

							}
							break;

					}

					}
					break;
				case 3 :
					// C:\\FakeWH\\GenericSQL.g:652:5: ( '0' .. '9' )+ Exponent
					{
					// C:\\FakeWH\\GenericSQL.g:652:5: ( '0' .. '9' )+
					int cnt9=0;
					loop9:
					while (true) {
						int alt9=2;
						int LA9_0 = input.LA(1);
						if ( ((LA9_0 >= '0' && LA9_0 <= '9')) ) {
							alt9=1;
						}

						switch (alt9) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:
							{
							if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							if ( cnt9 >= 1 ) break loop9;
							EarlyExitException eee = new EarlyExitException(9, input);
							throw eee;
						}
						cnt9++;
					}

					mExponent(); 

					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Float"

	// $ANTLR start "Exponent"
	public final void mExponent() throws RecognitionException {
		try {
			// C:\\FakeWH\\GenericSQL.g:658:3: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
			// C:\\FakeWH\\GenericSQL.g:658:5: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
			{
			if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\FakeWH\\GenericSQL.g:658:15: ( '+' | '-' )?
			int alt11=2;
			int LA11_0 = input.LA(1);
			if ( (LA11_0=='+'||LA11_0=='-') ) {
				alt11=1;
			}
			switch (alt11) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:
					{
					if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

			}

			// C:\\FakeWH\\GenericSQL.g:658:26: ( '0' .. '9' )+
			int cnt12=0;
			loop12:
			while (true) {
				int alt12=2;
				int LA12_0 = input.LA(1);
				if ( ((LA12_0 >= '0' && LA12_0 <= '9')) ) {
					alt12=1;
				}

				switch (alt12) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt12 >= 1 ) break loop12;
					EarlyExitException eee = new EarlyExitException(12, input);
					throw eee;
				}
				cnt12++;
			}

			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Exponent"

	// $ANTLR start "String"
	public final void mString() throws RecognitionException {
		try {
			int _type = String;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:661:3: ( ( 'N' )? '\\'' ( options {greedy=false; } : . )* '\\'' )
			// C:\\FakeWH\\GenericSQL.g:661:5: ( 'N' )? '\\'' ( options {greedy=false; } : . )* '\\''
			{
			// C:\\FakeWH\\GenericSQL.g:661:5: ( 'N' )?
			int alt13=2;
			int LA13_0 = input.LA(1);
			if ( (LA13_0=='N') ) {
				alt13=1;
			}
			switch (alt13) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:661:6: 'N'
					{
					match('N'); 
					}
					break;

			}

			match('\''); 
			// C:\\FakeWH\\GenericSQL.g:661:16: ( options {greedy=false; } : . )*
			loop14:
			while (true) {
				int alt14=2;
				int LA14_0 = input.LA(1);
				if ( (LA14_0=='\'') ) {
					alt14=2;
				}
				else if ( ((LA14_0 >= '\u0000' && LA14_0 <= '&')||(LA14_0 >= '(' && LA14_0 <= '\uFFFF')) ) {
					alt14=1;
				}

				switch (alt14) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:661:44: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop14;
				}
			}

			match('\''); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "String"

	// $ANTLR start "Timestamp"
	public final void mTimestamp() throws RecognitionException {
		try {
			int _type = Timestamp;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:665:3: ( ( '\\'' )? Digit Digit Digit Digit '-' Digit Digit '-' Digit Digit ( ( 't' | ' ' ) Digit Digit ':' Digit Digit ':' Digit Digit )? ( '\\'' )? )
			// C:\\FakeWH\\GenericSQL.g:665:5: ( '\\'' )? Digit Digit Digit Digit '-' Digit Digit '-' Digit Digit ( ( 't' | ' ' ) Digit Digit ':' Digit Digit ':' Digit Digit )? ( '\\'' )?
			{
			// C:\\FakeWH\\GenericSQL.g:665:5: ( '\\'' )?
			int alt15=2;
			int LA15_0 = input.LA(1);
			if ( (LA15_0=='\'') ) {
				alt15=1;
			}
			switch (alt15) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:665:6: '\\''
					{
					match('\''); 
					}
					break;

			}

			mDigit(); 

			mDigit(); 

			mDigit(); 

			mDigit(); 

			match('-'); 
			mDigit(); 

			mDigit(); 

			match('-'); 
			mDigit(); 

			mDigit(); 

			// C:\\FakeWH\\GenericSQL.g:667:15: ( ( 't' | ' ' ) Digit Digit ':' Digit Digit ':' Digit Digit )?
			int alt16=2;
			int LA16_0 = input.LA(1);
			if ( (LA16_0==' '||LA16_0=='t') ) {
				alt16=1;
			}
			switch (alt16) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:667:16: ( 't' | ' ' ) Digit Digit ':' Digit Digit ':' Digit Digit
					{
					if ( input.LA(1)==' '||input.LA(1)=='t' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					mDigit(); 

					mDigit(); 

					match(':'); 
					mDigit(); 

					mDigit(); 

					match(':'); 
					mDigit(); 

					mDigit(); 

					}
					break;

			}

			// C:\\FakeWH\\GenericSQL.g:668:49: ( '\\'' )?
			int alt17=2;
			int LA17_0 = input.LA(1);
			if ( (LA17_0=='\'') ) {
				alt17=1;
			}
			switch (alt17) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:668:50: '\\''
					{
					match('\''); 
					}
					break;

			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Timestamp"

	// $ANTLR start "Identifier"
	public final void mIdentifier() throws RecognitionException {
		try {
			int _type = Identifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:672:3: ( ( '#' )? ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )* )
			// C:\\FakeWH\\GenericSQL.g:672:5: ( '#' )? ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
			{
			// C:\\FakeWH\\GenericSQL.g:672:5: ( '#' )?
			int alt18=2;
			int LA18_0 = input.LA(1);
			if ( (LA18_0=='#') ) {
				alt18=1;
			}
			switch (alt18) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:672:6: '#'
					{
					match('#'); 
					}
					break;

			}

			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\FakeWH\\GenericSQL.g:672:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '$' )*
			loop19:
			while (true) {
				int alt19=2;
				int LA19_0 = input.LA(1);
				if ( (LA19_0=='$'||(LA19_0 >= '0' && LA19_0 <= '9')||(LA19_0 >= 'A' && LA19_0 <= 'Z')||LA19_0=='_'||(LA19_0 >= 'a' && LA19_0 <= 'z')) ) {
					alt19=1;
				}

				switch (alt19) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:
					{
					if ( input.LA(1)=='$'||(input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop19;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Identifier"

	// $ANTLR start "QuotedIdentifier"
	public final void mQuotedIdentifier() throws RecognitionException {
		try {
			int _type = QuotedIdentifier;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:676:3: ( '[' ( options {greedy=false; } : . )* ']' | '\"' ( options {greedy=false; } : . )* '\"' )
			int alt22=2;
			int LA22_0 = input.LA(1);
			if ( (LA22_0=='[') ) {
				alt22=1;
			}
			else if ( (LA22_0=='\"') ) {
				alt22=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 22, 0, input);
				throw nvae;
			}

			switch (alt22) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:676:5: '[' ( options {greedy=false; } : . )* ']'
					{
					match('['); 
					// C:\\FakeWH\\GenericSQL.g:676:9: ( options {greedy=false; } : . )*
					loop20:
					while (true) {
						int alt20=2;
						int LA20_0 = input.LA(1);
						if ( (LA20_0==']') ) {
							alt20=2;
						}
						else if ( ((LA20_0 >= '\u0000' && LA20_0 <= '\\')||(LA20_0 >= '^' && LA20_0 <= '\uFFFF')) ) {
							alt20=1;
						}

						switch (alt20) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:676:37: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop20;
						}
					}

					match(']'); 
					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:677:5: '\"' ( options {greedy=false; } : . )* '\"'
					{
					match('\"'); 
					// C:\\FakeWH\\GenericSQL.g:677:9: ( options {greedy=false; } : . )*
					loop21:
					while (true) {
						int alt21=2;
						int LA21_0 = input.LA(1);
						if ( (LA21_0=='\"') ) {
							alt21=2;
						}
						else if ( ((LA21_0 >= '\u0000' && LA21_0 <= '!')||(LA21_0 >= '#' && LA21_0 <= '\uFFFF')) ) {
							alt21=1;
						}

						switch (alt21) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:677:37: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop21;
						}
					}

					match('\"'); 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "QuotedIdentifier"

	// $ANTLR start "Comment"
	public final void mComment() throws RecognitionException {
		try {
			int _type = Comment;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:681:3: ( '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
			int alt28=3;
			int LA28_0 = input.LA(1);
			if ( (LA28_0=='-') ) {
				alt28=1;
			}
			else if ( (LA28_0=='/') ) {
				int LA28_2 = input.LA(2);
				if ( (LA28_2=='/') ) {
					alt28=2;
				}
				else if ( (LA28_2=='*') ) {
					alt28=3;
				}

				else {
					int nvaeMark = input.mark();
					try {
						input.consume();
						NoViableAltException nvae =
							new NoViableAltException("", 28, 2, input);
						throw nvae;
					} finally {
						input.rewind(nvaeMark);
					}
				}

			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 28, 0, input);
				throw nvae;
			}

			switch (alt28) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:681:5: '--' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("--"); 

					// C:\\FakeWH\\GenericSQL.g:681:10: (~ ( '\\n' | '\\r' ) )*
					loop23:
					while (true) {
						int alt23=2;
						int LA23_0 = input.LA(1);
						if ( ((LA23_0 >= '\u0000' && LA23_0 <= '\t')||(LA23_0 >= '\u000B' && LA23_0 <= '\f')||(LA23_0 >= '\u000E' && LA23_0 <= '\uFFFF')) ) {
							alt23=1;
						}

						switch (alt23) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop23;
						}
					}

					// C:\\FakeWH\\GenericSQL.g:681:24: ( '\\r' )?
					int alt24=2;
					int LA24_0 = input.LA(1);
					if ( (LA24_0=='\r') ) {
						alt24=1;
					}
					switch (alt24) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:681:24: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					 _channel=HIDDEN; 
					}
					break;
				case 2 :
					// C:\\FakeWH\\GenericSQL.g:682:5: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
					{
					match("//"); 

					// C:\\FakeWH\\GenericSQL.g:682:10: (~ ( '\\n' | '\\r' ) )*
					loop25:
					while (true) {
						int alt25=2;
						int LA25_0 = input.LA(1);
						if ( ((LA25_0 >= '\u0000' && LA25_0 <= '\t')||(LA25_0 >= '\u000B' && LA25_0 <= '\f')||(LA25_0 >= '\u000E' && LA25_0 <= '\uFFFF')) ) {
							alt25=1;
						}

						switch (alt25) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:
							{
							if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
								input.consume();
							}
							else {
								MismatchedSetException mse = new MismatchedSetException(null,input);
								recover(mse);
								throw mse;
							}
							}
							break;

						default :
							break loop25;
						}
					}

					// C:\\FakeWH\\GenericSQL.g:682:24: ( '\\r' )?
					int alt26=2;
					int LA26_0 = input.LA(1);
					if ( (LA26_0=='\r') ) {
						alt26=1;
					}
					switch (alt26) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:682:24: '\\r'
							{
							match('\r'); 
							}
							break;

					}

					match('\n'); 
					 _channel=HIDDEN; 
					}
					break;
				case 3 :
					// C:\\FakeWH\\GenericSQL.g:683:5: '/*' ( options {greedy=false; } : . )* '*/'
					{
					match("/*"); 

					// C:\\FakeWH\\GenericSQL.g:683:10: ( options {greedy=false; } : . )*
					loop27:
					while (true) {
						int alt27=2;
						int LA27_0 = input.LA(1);
						if ( (LA27_0=='*') ) {
							int LA27_1 = input.LA(2);
							if ( (LA27_1=='/') ) {
								alt27=2;
							}
							else if ( ((LA27_1 >= '\u0000' && LA27_1 <= '.')||(LA27_1 >= '0' && LA27_1 <= '\uFFFF')) ) {
								alt27=1;
							}

						}
						else if ( ((LA27_0 >= '\u0000' && LA27_0 <= ')')||(LA27_0 >= '+' && LA27_0 <= '\uFFFF')) ) {
							alt27=1;
						}

						switch (alt27) {
						case 1 :
							// C:\\FakeWH\\GenericSQL.g:683:38: .
							{
							matchAny(); 
							}
							break;

						default :
							break loop27;
						}
					}

					match("*/"); 

					 _channel=HIDDEN; 
					}
					break;

			}
			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Comment"

	// $ANTLR start "Whitespace"
	public final void mWhitespace() throws RecognitionException {
		try {
			int _type = Whitespace;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\FakeWH\\GenericSQL.g:687:3: ( ( '\\t' | ' ' | '\\r' | '\\n' )+ )
			// C:\\FakeWH\\GenericSQL.g:687:5: ( '\\t' | ' ' | '\\r' | '\\n' )+
			{
			// C:\\FakeWH\\GenericSQL.g:687:5: ( '\\t' | ' ' | '\\r' | '\\n' )+
			int cnt29=0;
			loop29:
			while (true) {
				int alt29=2;
				int LA29_0 = input.LA(1);
				if ( ((LA29_0 >= '\t' && LA29_0 <= '\n')||LA29_0=='\r'||LA29_0==' ') ) {
					alt29=1;
				}

				switch (alt29) {
				case 1 :
					// C:\\FakeWH\\GenericSQL.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt29 >= 1 ) break loop29;
					EarlyExitException eee = new EarlyExitException(29, input);
					throw eee;
				}
				cnt29++;
			}

			 _channel = HIDDEN; 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "Whitespace"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\FakeWH\\GenericSQL.g:1:8: ( T__131 | T__132 | T__133 | ALL | AND | ANY | AS | ASC | BETWEEN | BY | CASE | CREATE | CROSS | DATE | DELETE | DESC | DISTINCT | ELSE | END | EXISTS | FALSE | FROM | FULL | GROUP | HAVING | IN | INNER | INSERT | INTO | IS | JOIN | LEFT | LIKE | NATURAL | NOT | NULL | NOLOGGING | ON | OR | ORDER | OUTER | PERCENT | RIGHT | SELECT | SET | SOME | TABLE | THEN | TRUE | TOP | UNION | UNIQUE | UPDATE | USING | VALUES | WHEN | WHERE | MAX | MIN | COUNT | SUM | AVG | NVL | COALESCE | TOCHAR | TODATE | LASTDAY | TONUMBER | TRUNC | NEXTDAY | DOT | COMMA | LPAREN | RPAREN | LCURLY | RCURLY | STRCAT | QUESTION | COLON | SEMI | APOSTROPHE | EQ | NEQ1 | NEQ2 | LTE | LT | GTE | GT | PLUS | MINUS | DIVIDE | STAR | MOD | Daytime | Integer | Float | String | Timestamp | Identifier | QuotedIdentifier | Comment | Whitespace )
		int alt30=102;
		alt30 = dfa30.predict(input);
		switch (alt30) {
			case 1 :
				// C:\\FakeWH\\GenericSQL.g:1:10: T__131
				{
				mT__131(); 

				}
				break;
			case 2 :
				// C:\\FakeWH\\GenericSQL.g:1:17: T__132
				{
				mT__132(); 

				}
				break;
			case 3 :
				// C:\\FakeWH\\GenericSQL.g:1:24: T__133
				{
				mT__133(); 

				}
				break;
			case 4 :
				// C:\\FakeWH\\GenericSQL.g:1:31: ALL
				{
				mALL(); 

				}
				break;
			case 5 :
				// C:\\FakeWH\\GenericSQL.g:1:35: AND
				{
				mAND(); 

				}
				break;
			case 6 :
				// C:\\FakeWH\\GenericSQL.g:1:39: ANY
				{
				mANY(); 

				}
				break;
			case 7 :
				// C:\\FakeWH\\GenericSQL.g:1:43: AS
				{
				mAS(); 

				}
				break;
			case 8 :
				// C:\\FakeWH\\GenericSQL.g:1:46: ASC
				{
				mASC(); 

				}
				break;
			case 9 :
				// C:\\FakeWH\\GenericSQL.g:1:50: BETWEEN
				{
				mBETWEEN(); 

				}
				break;
			case 10 :
				// C:\\FakeWH\\GenericSQL.g:1:58: BY
				{
				mBY(); 

				}
				break;
			case 11 :
				// C:\\FakeWH\\GenericSQL.g:1:61: CASE
				{
				mCASE(); 

				}
				break;
			case 12 :
				// C:\\FakeWH\\GenericSQL.g:1:66: CREATE
				{
				mCREATE(); 

				}
				break;
			case 13 :
				// C:\\FakeWH\\GenericSQL.g:1:73: CROSS
				{
				mCROSS(); 

				}
				break;
			case 14 :
				// C:\\FakeWH\\GenericSQL.g:1:79: DATE
				{
				mDATE(); 

				}
				break;
			case 15 :
				// C:\\FakeWH\\GenericSQL.g:1:84: DELETE
				{
				mDELETE(); 

				}
				break;
			case 16 :
				// C:\\FakeWH\\GenericSQL.g:1:91: DESC
				{
				mDESC(); 

				}
				break;
			case 17 :
				// C:\\FakeWH\\GenericSQL.g:1:96: DISTINCT
				{
				mDISTINCT(); 

				}
				break;
			case 18 :
				// C:\\FakeWH\\GenericSQL.g:1:105: ELSE
				{
				mELSE(); 

				}
				break;
			case 19 :
				// C:\\FakeWH\\GenericSQL.g:1:110: END
				{
				mEND(); 

				}
				break;
			case 20 :
				// C:\\FakeWH\\GenericSQL.g:1:114: EXISTS
				{
				mEXISTS(); 

				}
				break;
			case 21 :
				// C:\\FakeWH\\GenericSQL.g:1:121: FALSE
				{
				mFALSE(); 

				}
				break;
			case 22 :
				// C:\\FakeWH\\GenericSQL.g:1:127: FROM
				{
				mFROM(); 

				}
				break;
			case 23 :
				// C:\\FakeWH\\GenericSQL.g:1:132: FULL
				{
				mFULL(); 

				}
				break;
			case 24 :
				// C:\\FakeWH\\GenericSQL.g:1:137: GROUP
				{
				mGROUP(); 

				}
				break;
			case 25 :
				// C:\\FakeWH\\GenericSQL.g:1:143: HAVING
				{
				mHAVING(); 

				}
				break;
			case 26 :
				// C:\\FakeWH\\GenericSQL.g:1:150: IN
				{
				mIN(); 

				}
				break;
			case 27 :
				// C:\\FakeWH\\GenericSQL.g:1:153: INNER
				{
				mINNER(); 

				}
				break;
			case 28 :
				// C:\\FakeWH\\GenericSQL.g:1:159: INSERT
				{
				mINSERT(); 

				}
				break;
			case 29 :
				// C:\\FakeWH\\GenericSQL.g:1:166: INTO
				{
				mINTO(); 

				}
				break;
			case 30 :
				// C:\\FakeWH\\GenericSQL.g:1:171: IS
				{
				mIS(); 

				}
				break;
			case 31 :
				// C:\\FakeWH\\GenericSQL.g:1:174: JOIN
				{
				mJOIN(); 

				}
				break;
			case 32 :
				// C:\\FakeWH\\GenericSQL.g:1:179: LEFT
				{
				mLEFT(); 

				}
				break;
			case 33 :
				// C:\\FakeWH\\GenericSQL.g:1:184: LIKE
				{
				mLIKE(); 

				}
				break;
			case 34 :
				// C:\\FakeWH\\GenericSQL.g:1:189: NATURAL
				{
				mNATURAL(); 

				}
				break;
			case 35 :
				// C:\\FakeWH\\GenericSQL.g:1:197: NOT
				{
				mNOT(); 

				}
				break;
			case 36 :
				// C:\\FakeWH\\GenericSQL.g:1:201: NULL
				{
				mNULL(); 

				}
				break;
			case 37 :
				// C:\\FakeWH\\GenericSQL.g:1:206: NOLOGGING
				{
				mNOLOGGING(); 

				}
				break;
			case 38 :
				// C:\\FakeWH\\GenericSQL.g:1:216: ON
				{
				mON(); 

				}
				break;
			case 39 :
				// C:\\FakeWH\\GenericSQL.g:1:219: OR
				{
				mOR(); 

				}
				break;
			case 40 :
				// C:\\FakeWH\\GenericSQL.g:1:222: ORDER
				{
				mORDER(); 

				}
				break;
			case 41 :
				// C:\\FakeWH\\GenericSQL.g:1:228: OUTER
				{
				mOUTER(); 

				}
				break;
			case 42 :
				// C:\\FakeWH\\GenericSQL.g:1:234: PERCENT
				{
				mPERCENT(); 

				}
				break;
			case 43 :
				// C:\\FakeWH\\GenericSQL.g:1:242: RIGHT
				{
				mRIGHT(); 

				}
				break;
			case 44 :
				// C:\\FakeWH\\GenericSQL.g:1:248: SELECT
				{
				mSELECT(); 

				}
				break;
			case 45 :
				// C:\\FakeWH\\GenericSQL.g:1:255: SET
				{
				mSET(); 

				}
				break;
			case 46 :
				// C:\\FakeWH\\GenericSQL.g:1:259: SOME
				{
				mSOME(); 

				}
				break;
			case 47 :
				// C:\\FakeWH\\GenericSQL.g:1:264: TABLE
				{
				mTABLE(); 

				}
				break;
			case 48 :
				// C:\\FakeWH\\GenericSQL.g:1:270: THEN
				{
				mTHEN(); 

				}
				break;
			case 49 :
				// C:\\FakeWH\\GenericSQL.g:1:275: TRUE
				{
				mTRUE(); 

				}
				break;
			case 50 :
				// C:\\FakeWH\\GenericSQL.g:1:280: TOP
				{
				mTOP(); 

				}
				break;
			case 51 :
				// C:\\FakeWH\\GenericSQL.g:1:284: UNION
				{
				mUNION(); 

				}
				break;
			case 52 :
				// C:\\FakeWH\\GenericSQL.g:1:290: UNIQUE
				{
				mUNIQUE(); 

				}
				break;
			case 53 :
				// C:\\FakeWH\\GenericSQL.g:1:297: UPDATE
				{
				mUPDATE(); 

				}
				break;
			case 54 :
				// C:\\FakeWH\\GenericSQL.g:1:304: USING
				{
				mUSING(); 

				}
				break;
			case 55 :
				// C:\\FakeWH\\GenericSQL.g:1:310: VALUES
				{
				mVALUES(); 

				}
				break;
			case 56 :
				// C:\\FakeWH\\GenericSQL.g:1:317: WHEN
				{
				mWHEN(); 

				}
				break;
			case 57 :
				// C:\\FakeWH\\GenericSQL.g:1:322: WHERE
				{
				mWHERE(); 

				}
				break;
			case 58 :
				// C:\\FakeWH\\GenericSQL.g:1:328: MAX
				{
				mMAX(); 

				}
				break;
			case 59 :
				// C:\\FakeWH\\GenericSQL.g:1:332: MIN
				{
				mMIN(); 

				}
				break;
			case 60 :
				// C:\\FakeWH\\GenericSQL.g:1:336: COUNT
				{
				mCOUNT(); 

				}
				break;
			case 61 :
				// C:\\FakeWH\\GenericSQL.g:1:342: SUM
				{
				mSUM(); 

				}
				break;
			case 62 :
				// C:\\FakeWH\\GenericSQL.g:1:346: AVG
				{
				mAVG(); 

				}
				break;
			case 63 :
				// C:\\FakeWH\\GenericSQL.g:1:350: NVL
				{
				mNVL(); 

				}
				break;
			case 64 :
				// C:\\FakeWH\\GenericSQL.g:1:354: COALESCE
				{
				mCOALESCE(); 

				}
				break;
			case 65 :
				// C:\\FakeWH\\GenericSQL.g:1:363: TOCHAR
				{
				mTOCHAR(); 

				}
				break;
			case 66 :
				// C:\\FakeWH\\GenericSQL.g:1:370: TODATE
				{
				mTODATE(); 

				}
				break;
			case 67 :
				// C:\\FakeWH\\GenericSQL.g:1:377: LASTDAY
				{
				mLASTDAY(); 

				}
				break;
			case 68 :
				// C:\\FakeWH\\GenericSQL.g:1:385: TONUMBER
				{
				mTONUMBER(); 

				}
				break;
			case 69 :
				// C:\\FakeWH\\GenericSQL.g:1:394: TRUNC
				{
				mTRUNC(); 

				}
				break;
			case 70 :
				// C:\\FakeWH\\GenericSQL.g:1:400: NEXTDAY
				{
				mNEXTDAY(); 

				}
				break;
			case 71 :
				// C:\\FakeWH\\GenericSQL.g:1:408: DOT
				{
				mDOT(); 

				}
				break;
			case 72 :
				// C:\\FakeWH\\GenericSQL.g:1:412: COMMA
				{
				mCOMMA(); 

				}
				break;
			case 73 :
				// C:\\FakeWH\\GenericSQL.g:1:418: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 74 :
				// C:\\FakeWH\\GenericSQL.g:1:425: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 75 :
				// C:\\FakeWH\\GenericSQL.g:1:432: LCURLY
				{
				mLCURLY(); 

				}
				break;
			case 76 :
				// C:\\FakeWH\\GenericSQL.g:1:439: RCURLY
				{
				mRCURLY(); 

				}
				break;
			case 77 :
				// C:\\FakeWH\\GenericSQL.g:1:446: STRCAT
				{
				mSTRCAT(); 

				}
				break;
			case 78 :
				// C:\\FakeWH\\GenericSQL.g:1:453: QUESTION
				{
				mQUESTION(); 

				}
				break;
			case 79 :
				// C:\\FakeWH\\GenericSQL.g:1:462: COLON
				{
				mCOLON(); 

				}
				break;
			case 80 :
				// C:\\FakeWH\\GenericSQL.g:1:468: SEMI
				{
				mSEMI(); 

				}
				break;
			case 81 :
				// C:\\FakeWH\\GenericSQL.g:1:473: APOSTROPHE
				{
				mAPOSTROPHE(); 

				}
				break;
			case 82 :
				// C:\\FakeWH\\GenericSQL.g:1:484: EQ
				{
				mEQ(); 

				}
				break;
			case 83 :
				// C:\\FakeWH\\GenericSQL.g:1:487: NEQ1
				{
				mNEQ1(); 

				}
				break;
			case 84 :
				// C:\\FakeWH\\GenericSQL.g:1:492: NEQ2
				{
				mNEQ2(); 

				}
				break;
			case 85 :
				// C:\\FakeWH\\GenericSQL.g:1:497: LTE
				{
				mLTE(); 

				}
				break;
			case 86 :
				// C:\\FakeWH\\GenericSQL.g:1:501: LT
				{
				mLT(); 

				}
				break;
			case 87 :
				// C:\\FakeWH\\GenericSQL.g:1:504: GTE
				{
				mGTE(); 

				}
				break;
			case 88 :
				// C:\\FakeWH\\GenericSQL.g:1:508: GT
				{
				mGT(); 

				}
				break;
			case 89 :
				// C:\\FakeWH\\GenericSQL.g:1:511: PLUS
				{
				mPLUS(); 

				}
				break;
			case 90 :
				// C:\\FakeWH\\GenericSQL.g:1:516: MINUS
				{
				mMINUS(); 

				}
				break;
			case 91 :
				// C:\\FakeWH\\GenericSQL.g:1:522: DIVIDE
				{
				mDIVIDE(); 

				}
				break;
			case 92 :
				// C:\\FakeWH\\GenericSQL.g:1:529: STAR
				{
				mSTAR(); 

				}
				break;
			case 93 :
				// C:\\FakeWH\\GenericSQL.g:1:534: MOD
				{
				mMOD(); 

				}
				break;
			case 94 :
				// C:\\FakeWH\\GenericSQL.g:1:538: Daytime
				{
				mDaytime(); 

				}
				break;
			case 95 :
				// C:\\FakeWH\\GenericSQL.g:1:546: Integer
				{
				mInteger(); 

				}
				break;
			case 96 :
				// C:\\FakeWH\\GenericSQL.g:1:554: Float
				{
				mFloat(); 

				}
				break;
			case 97 :
				// C:\\FakeWH\\GenericSQL.g:1:560: String
				{
				mString(); 

				}
				break;
			case 98 :
				// C:\\FakeWH\\GenericSQL.g:1:567: Timestamp
				{
				mTimestamp(); 

				}
				break;
			case 99 :
				// C:\\FakeWH\\GenericSQL.g:1:577: Identifier
				{
				mIdentifier(); 

				}
				break;
			case 100 :
				// C:\\FakeWH\\GenericSQL.g:1:588: QuotedIdentifier
				{
				mQuotedIdentifier(); 

				}
				break;
			case 101 :
				// C:\\FakeWH\\GenericSQL.g:1:605: Comment
				{
				mComment(); 

				}
				break;
			case 102 :
				// C:\\FakeWH\\GenericSQL.g:1:613: Whitespace
				{
				mWhitespace(); 

				}
				break;

		}
	}


	protected DFA10 dfa10 = new DFA10(this);
	protected DFA30 dfa30 = new DFA30(this);
	static final String DFA10_eotS =
		"\5\uffff";
	static final String DFA10_eofS =
		"\5\uffff";
	static final String DFA10_minS =
		"\2\56\3\uffff";
	static final String DFA10_maxS =
		"\1\71\1\145\3\uffff";
	static final String DFA10_acceptS =
		"\2\uffff\1\2\1\1\1\3";
	static final String DFA10_specialS =
		"\5\uffff}>";
	static final String[] DFA10_transitionS = {
			"\1\2\1\uffff\12\1",
			"\1\3\1\uffff\12\1\13\uffff\1\4\37\uffff\1\4",
			"",
			"",
			""
	};

	static final short[] DFA10_eot = DFA.unpackEncodedString(DFA10_eotS);
	static final short[] DFA10_eof = DFA.unpackEncodedString(DFA10_eofS);
	static final char[] DFA10_min = DFA.unpackEncodedStringToUnsignedChars(DFA10_minS);
	static final char[] DFA10_max = DFA.unpackEncodedStringToUnsignedChars(DFA10_maxS);
	static final short[] DFA10_accept = DFA.unpackEncodedString(DFA10_acceptS);
	static final short[] DFA10_special = DFA.unpackEncodedString(DFA10_specialS);
	static final short[][] DFA10_transition;

	static {
		int numStates = DFA10_transitionS.length;
		DFA10_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA10_transition[i] = DFA.unpackEncodedString(DFA10_transitionS[i]);
		}
	}

	protected class DFA10 extends DFA {

		public DFA10(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 10;
			this.eot = DFA10_eot;
			this.eof = DFA10_eof;
			this.min = DFA10_min;
			this.max = DFA10_max;
			this.accept = DFA10_accept;
			this.special = DFA10_special;
			this.transition = DFA10_transition;
		}
		@Override
		public String getDescription() {
			return "649:1: Float : ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( Exponent )? | '.' ( '0' .. '9' )+ ( Exponent )? | ( '0' .. '9' )+ Exponent );";
		}
	}

	static final String DFA30_eotS =
		"\1\uffff\1\61\25\54\1\145\10\uffff\1\147\1\uffff\1\153\1\uffff\1\155\1"+
		"\uffff\1\157\1\160\2\uffff\1\161\1\54\4\uffff\1\164\1\uffff\2\54\1\170"+
		"\2\54\1\174\16\54\1\u008e\1\u0092\11\54\1\uffff\1\u009d\1\u009e\21\54"+
		"\15\uffff\1\161\2\uffff\1\u00b5\1\u00b6\1\u00b7\1\uffff\1\u00b8\1\u00b9"+
		"\1\54\1\uffff\12\54\1\u00c5\6\54\1\uffff\3\54\1\uffff\5\54\1\u00d4\2\54"+
		"\1\u00d7\1\54\2\uffff\5\54\1\u00de\1\54\1\u00e0\3\54\1\u00e5\6\54\1\u00f0"+
		"\1\u00f1\1\uffff\1\161\5\uffff\1\54\1\u00f5\4\54\1\u00fa\1\54\1\u00fc"+
		"\1\54\1\u00fe\1\uffff\2\54\1\u0101\1\u0102\4\54\1\u0107\1\u0108\1\u0109"+
		"\1\u010a\2\54\1\uffff\1\54\1\u010e\1\uffff\6\54\1\uffff\1\u0115\1\uffff"+
		"\1\54\1\u0117\1\u0118\1\54\1\uffff\10\54\1\u0122\1\54\3\uffff\1\161\1"+
		"\54\1\uffff\1\54\1\u0129\1\u012a\1\54\1\uffff\1\54\1\uffff\1\54\1\uffff"+
		"\1\54\1\u012f\2\uffff\1\u0130\1\54\1\u0132\1\54\4\uffff\3\54\1\uffff\1"+
		"\54\1\u0138\1\u0139\1\54\1\u013b\1\54\1\uffff\1\u013d\2\uffff\1\u013e"+
		"\3\54\1\u0142\2\54\1\u0145\1\54\1\uffff\1\u0147\2\uffff\1\161\1\54\1\u014b"+
		"\2\uffff\1\54\1\u014d\1\54\1\u014f\2\uffff\1\u0150\1\uffff\1\u0151\4\54"+
		"\2\uffff\1\54\1\uffff\1\u0157\2\uffff\3\54\1\uffff\1\u015b\1\u015c\1\uffff"+
		"\1\u015d\3\uffff\1\u0160\1\uffff\1\54\1\uffff\1\54\3\uffff\1\54\1\u0164"+
		"\2\54\1\u0167\1\uffff\1\u0168\1\u0169\1\54\6\uffff\1\u016d\1\u016e\1\u016f"+
		"\1\uffff\1\54\1\u0171\3\uffff\1\54\5\uffff\1\u0175\1\uffff\1\u0176\5\uffff"+
		"\2\u017a\3\uffff\1\u017a\10\uffff\1\u017c\1\uffff";
	static final String DFA30_eofS =
		"\u0188\uffff";
	static final String DFA30_minS =
		"\1\11\1\144\1\114\1\105\2\101\1\114\1\101\1\122\1\101\1\116\1\117\1\101"+
		"\1\47\1\116\1\105\1\111\1\105\1\101\1\116\1\101\1\110\1\101\1\60\10\uffff"+
		"\1\0\1\uffff\1\75\1\uffff\1\75\1\uffff\1\55\1\52\2\uffff\1\56\1\101\4"+
		"\uffff\1\163\1\uffff\1\114\1\104\1\44\1\107\1\124\1\44\1\123\1\105\1\101"+
		"\1\124\1\114\2\123\1\104\1\111\1\114\1\117\1\114\1\117\1\126\2\44\1\111"+
		"\1\106\1\113\1\123\1\124\3\114\1\130\1\uffff\2\44\1\124\1\122\1\107\1"+
		"\114\2\115\1\102\1\105\1\125\1\120\1\111\1\104\1\111\1\114\1\105\1\130"+
		"\1\116\3\uffff\1\0\11\uffff\1\56\2\uffff\3\44\1\uffff\2\44\1\127\1\uffff"+
		"\1\105\1\101\1\123\1\116\1\114\2\105\1\103\1\124\1\105\1\44\2\123\1\115"+
		"\1\114\1\125\1\111\1\uffff\2\105\1\117\1\uffff\1\116\1\124\1\105\1\124"+
		"\1\125\1\44\1\117\1\114\1\44\1\124\2\uffff\2\105\1\103\1\110\1\105\1\44"+
		"\1\105\1\44\1\114\1\116\1\105\1\44\1\103\1\117\1\101\1\116\1\125\1\116"+
		"\2\44\1\0\1\56\5\uffff\1\105\1\44\1\124\1\123\1\124\1\105\1\44\1\124\1"+
		"\44\1\111\1\44\1\uffff\1\124\1\105\2\44\1\120\1\116\2\122\4\44\1\137\1"+
		"\122\1\uffff\1\107\1\44\1\uffff\1\137\2\122\1\105\1\124\1\103\1\uffff"+
		"\1\44\1\uffff\1\105\2\44\1\103\1\uffff\1\110\1\101\1\125\1\116\1\125\1"+
		"\124\1\107\1\105\1\44\1\105\2\uffff\1\0\1\55\1\105\1\uffff\1\105\2\44"+
		"\1\123\1\uffff\1\105\1\uffff\1\116\1\uffff\1\123\1\44\2\uffff\1\44\1\107"+
		"\1\44\1\124\4\uffff\1\104\1\101\1\107\1\uffff\1\104\2\44\1\116\1\44\1"+
		"\124\1\uffff\1\44\2\uffff\1\44\1\101\1\124\1\115\1\44\2\105\1\44\1\123"+
		"\1\uffff\1\44\1\0\1\60\1\56\1\116\1\44\2\uffff\1\103\1\44\1\103\1\44\2"+
		"\uffff\1\44\1\uffff\1\44\1\101\1\114\1\111\1\101\2\uffff\1\124\1\uffff"+
		"\1\44\2\uffff\1\122\1\105\1\102\1\uffff\2\44\1\uffff\1\44\1\uffff\1\0"+
		"\1\60\1\44\1\uffff\1\105\1\uffff\1\124\3\uffff\1\131\1\44\1\116\1\131"+
		"\1\44\1\uffff\2\44\1\105\3\uffff\1\0\1\55\1\uffff\3\44\1\uffff\1\107\1"+
		"\44\3\uffff\1\122\1\0\1\60\3\uffff\1\44\1\uffff\1\44\1\0\1\60\2\uffff"+
		"\1\0\1\40\1\0\3\uffff\12\0\1\uffff";
	static final String DFA30_maxS =
		"\1\175\1\164\1\166\1\171\1\162\1\151\1\170\1\165\1\162\1\141\1\163\1\157"+
		"\1\151\1\166\1\165\1\145\1\151\1\165\1\162\1\163\1\141\1\150\1\151\1\71"+
		"\10\uffff\1\uffff\1\uffff\1\76\1\uffff\1\75\1\uffff\1\55\1\57\2\uffff"+
		"\1\145\1\166\4\uffff\1\163\1\uffff\1\154\1\171\1\172\1\147\1\164\1\172"+
		"\1\163\1\157\1\165\1\164\3\163\1\144\1\151\1\154\1\157\1\154\1\157\1\166"+
		"\2\172\1\151\1\146\1\153\1\163\2\164\2\154\1\170\1\uffff\2\172\1\164\1"+
		"\162\1\147\1\164\2\155\1\142\1\145\1\165\1\160\1\151\1\144\1\151\1\154"+
		"\1\145\1\170\1\156\3\uffff\1\uffff\11\uffff\1\145\2\uffff\3\172\1\uffff"+
		"\2\172\1\167\1\uffff\1\145\1\141\1\163\1\156\1\154\2\145\1\143\1\164\1"+
		"\145\1\172\2\163\1\155\1\154\1\165\1\151\1\uffff\2\145\1\157\1\uffff\1"+
		"\156\1\164\1\145\1\164\1\165\1\172\1\157\1\154\1\172\1\164\2\uffff\2\145"+
		"\1\143\1\150\1\145\1\172\1\145\1\172\1\154\2\156\1\172\1\156\1\161\1\141"+
		"\1\156\1\165\1\162\2\172\1\uffff\1\145\5\uffff\1\145\1\172\1\164\1\163"+
		"\1\164\1\145\1\172\1\164\1\172\1\151\1\172\1\uffff\1\164\1\145\2\172\1"+
		"\160\1\156\2\162\4\172\1\137\1\162\1\uffff\1\147\1\172\1\uffff\1\137\2"+
		"\162\1\145\1\164\1\143\1\uffff\1\172\1\uffff\1\145\2\172\1\143\1\uffff"+
		"\1\150\1\141\1\165\1\156\1\165\1\164\1\147\1\145\1\172\1\145\2\uffff\1"+
		"\uffff\2\145\1\uffff\1\145\2\172\1\163\1\uffff\1\145\1\uffff\1\156\1\uffff"+
		"\1\163\1\172\2\uffff\1\172\1\147\1\172\1\164\4\uffff\1\144\1\141\1\147"+
		"\1\uffff\1\144\2\172\1\156\1\172\1\164\1\uffff\1\172\2\uffff\1\172\1\141"+
		"\1\164\1\155\1\172\2\145\1\172\1\163\1\uffff\1\172\1\uffff\1\71\1\145"+
		"\1\156\1\172\2\uffff\1\143\1\172\1\143\1\172\2\uffff\1\172\1\uffff\1\172"+
		"\1\141\1\154\1\151\1\141\2\uffff\1\164\1\uffff\1\172\2\uffff\1\162\1\145"+
		"\1\142\1\uffff\2\172\1\uffff\1\172\1\uffff\1\uffff\1\71\1\172\1\uffff"+
		"\1\145\1\uffff\1\164\3\uffff\1\171\1\172\1\156\1\171\1\172\1\uffff\2\172"+
		"\1\145\3\uffff\1\uffff\1\55\1\uffff\3\172\1\uffff\1\147\1\172\3\uffff"+
		"\1\162\1\uffff\1\71\3\uffff\1\172\1\uffff\1\172\1\uffff\1\71\2\uffff\1"+
		"\uffff\1\164\1\uffff\3\uffff\12\uffff\1\uffff";
	static final String DFA30_acceptS =
		"\30\uffff\1\110\1\111\1\112\1\114\1\115\1\116\1\117\1\120\1\uffff\1\122"+
		"\1\uffff\1\124\1\uffff\1\131\2\uffff\1\134\1\135\2\uffff\1\143\1\144\1"+
		"\146\1\1\1\uffff\1\113\37\uffff\1\141\23\uffff\1\107\1\140\1\121\1\uffff"+
		"\1\123\1\125\1\126\1\127\1\130\1\145\1\132\1\133\1\137\1\uffff\1\3\1\2"+
		"\3\uffff\1\7\3\uffff\1\12\21\uffff\1\32\3\uffff\1\36\12\uffff\1\46\1\47"+
		"\26\uffff\1\4\1\5\1\6\1\10\1\76\13\uffff\1\23\16\uffff\1\43\2\uffff\1"+
		"\77\6\uffff\1\55\1\uffff\1\75\4\uffff\1\62\12\uffff\1\72\1\73\3\uffff"+
		"\1\13\4\uffff\1\16\1\uffff\1\20\1\uffff\1\22\2\uffff\1\26\1\27\4\uffff"+
		"\1\35\1\37\1\40\1\41\3\uffff\1\44\6\uffff\1\56\1\uffff\1\60\1\61\11\uffff"+
		"\1\70\6\uffff\1\15\1\74\4\uffff\1\25\1\30\1\uffff\1\33\5\uffff\1\50\1"+
		"\51\1\uffff\1\53\1\uffff\1\57\1\105\3\uffff\1\63\2\uffff\1\66\1\uffff"+
		"\1\71\3\uffff\1\14\1\uffff\1\17\1\uffff\1\24\1\31\1\34\5\uffff\1\54\3"+
		"\uffff\1\64\1\65\1\67\2\uffff\1\11\3\uffff\1\42\2\uffff\1\52\1\101\1\102"+
		"\3\uffff\1\100\1\21\1\103\1\uffff\1\106\3\uffff\1\45\1\104\3\uffff\2\136"+
		"\1\142\12\uffff\1\141";
	static final String DFA30_specialS =
		"\40\uffff\1\14\107\uffff\1\13\112\uffff\1\21\76\uffff\1\22\61\uffff\1"+
		"\11\43\uffff\1\3\25\uffff\1\17\14\uffff\1\7\7\uffff\1\4\3\uffff\1\20\1"+
		"\uffff\1\23\3\uffff\1\24\1\0\1\6\1\15\1\1\1\10\1\16\1\2\1\12\1\5\1\uffff}>";
	static final String[] DFA30_transitionS = {
			"\2\56\2\uffff\1\56\22\uffff\1\56\1\43\1\55\1\54\1\uffff\1\51\1\uffff"+
			"\1\40\1\31\1\32\1\50\1\45\1\30\1\46\1\27\1\47\12\52\1\36\1\37\1\42\1"+
			"\41\1\44\1\35\1\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\54"+
			"\1\14\1\26\1\15\1\16\1\17\1\54\1\20\1\21\1\22\1\23\1\24\1\25\3\54\1\55"+
			"\5\uffff\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\54\1\14\1\26\1"+
			"\53\1\16\1\17\1\54\1\20\1\21\1\22\1\23\1\24\1\25\3\54\1\1\1\34\1\33",
			"\1\57\17\uffff\1\60",
			"\1\62\1\uffff\1\63\4\uffff\1\64\2\uffff\1\65\25\uffff\1\62\1\uffff\1"+
			"\63\4\uffff\1\64\2\uffff\1\65",
			"\1\66\23\uffff\1\67\13\uffff\1\66\23\uffff\1\67",
			"\1\70\15\uffff\1\72\2\uffff\1\71\16\uffff\1\70\15\uffff\1\72\2\uffff"+
			"\1\71",
			"\1\73\3\uffff\1\74\3\uffff\1\75\27\uffff\1\73\3\uffff\1\74\3\uffff\1"+
			"\75",
			"\1\76\1\uffff\1\77\11\uffff\1\100\23\uffff\1\76\1\uffff\1\77\11\uffff"+
			"\1\100",
			"\1\101\20\uffff\1\102\2\uffff\1\103\13\uffff\1\101\20\uffff\1\102\2"+
			"\uffff\1\103",
			"\1\104\37\uffff\1\104",
			"\1\105\37\uffff\1\105",
			"\1\106\4\uffff\1\107\32\uffff\1\106\4\uffff\1\107",
			"\1\110\37\uffff\1\110",
			"\1\113\3\uffff\1\111\3\uffff\1\112\27\uffff\1\113\3\uffff\1\111\3\uffff"+
			"\1\112",
			"\1\121\31\uffff\1\114\3\uffff\1\120\11\uffff\1\115\5\uffff\1\116\1\117"+
			"\12\uffff\1\114\3\uffff\1\120\11\uffff\1\115\5\uffff\1\116\1\117",
			"\1\122\3\uffff\1\123\2\uffff\1\124\30\uffff\1\122\3\uffff\1\123\2\uffff"+
			"\1\124",
			"\1\125\37\uffff\1\125",
			"\1\126\37\uffff\1\126",
			"\1\127\11\uffff\1\130\5\uffff\1\131\17\uffff\1\127\11\uffff\1\130\5"+
			"\uffff\1\131",
			"\1\132\6\uffff\1\133\6\uffff\1\135\2\uffff\1\134\16\uffff\1\132\6\uffff"+
			"\1\133\6\uffff\1\135\2\uffff\1\134",
			"\1\136\1\uffff\1\137\2\uffff\1\140\32\uffff\1\136\1\uffff\1\137\2\uffff"+
			"\1\140",
			"\1\141\37\uffff\1\141",
			"\1\142\37\uffff\1\142",
			"\1\143\7\uffff\1\144\27\uffff\1\143\7\uffff\1\144",
			"\12\146",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\60\121\12\150\uffc6\121",
			"",
			"\1\152\1\151",
			"",
			"\1\154",
			"",
			"\1\156",
			"\1\156\4\uffff\1\156",
			"",
			"",
			"\1\146\1\uffff\12\162\13\uffff\1\146\37\uffff\1\146",
			"\1\114\3\uffff\1\120\11\uffff\1\115\5\uffff\1\116\1\117\12\uffff\1\114"+
			"\3\uffff\1\120\11\uffff\1\115\5\uffff\1\116\1\117",
			"",
			"",
			"",
			"",
			"\1\163",
			"",
			"\1\165\37\uffff\1\165",
			"\1\166\24\uffff\1\167\12\uffff\1\166\24\uffff\1\167",
			"\1\54\13\uffff\12\54\7\uffff\2\54\1\171\27\54\4\uffff\1\54\1\uffff\2"+
			"\54\1\171\27\54",
			"\1\172\37\uffff\1\172",
			"\1\173\37\uffff\1\173",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\175\37\uffff\1\175",
			"\1\176\11\uffff\1\177\25\uffff\1\176\11\uffff\1\177",
			"\1\u0081\23\uffff\1\u0080\13\uffff\1\u0081\23\uffff\1\u0080",
			"\1\u0082\37\uffff\1\u0082",
			"\1\u0083\6\uffff\1\u0084\30\uffff\1\u0083\6\uffff\1\u0084",
			"\1\u0085\37\uffff\1\u0085",
			"\1\u0086\37\uffff\1\u0086",
			"\1\u0087\37\uffff\1\u0087",
			"\1\u0088\37\uffff\1\u0088",
			"\1\u0089\37\uffff\1\u0089",
			"\1\u008a\37\uffff\1\u008a",
			"\1\u008b\37\uffff\1\u008b",
			"\1\u008c\37\uffff\1\u008c",
			"\1\u008d\37\uffff\1\u008d",
			"\1\54\13\uffff\12\54\7\uffff\15\54\1\u008f\4\54\1\u0090\1\u0091\6\54"+
			"\4\uffff\1\54\1\uffff\15\54\1\u008f\4\54\1\u0090\1\u0091\6\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0093\37\uffff\1\u0093",
			"\1\u0094\37\uffff\1\u0094",
			"\1\u0095\37\uffff\1\u0095",
			"\1\u0096\37\uffff\1\u0096",
			"\1\u0097\37\uffff\1\u0097",
			"\1\u0099\7\uffff\1\u0098\27\uffff\1\u0099\7\uffff\1\u0098",
			"\1\u009a\37\uffff\1\u009a",
			"\1\u009b\37\uffff\1\u009b",
			"\1\u009c\37\uffff\1\u009c",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\3\54\1\u009f\26\54\4\uffff\1\54\1\uffff"+
			"\3\54\1\u009f\26\54",
			"\1\u00a0\37\uffff\1\u00a0",
			"\1\u00a1\37\uffff\1\u00a1",
			"\1\u00a2\37\uffff\1\u00a2",
			"\1\u00a3\7\uffff\1\u00a4\27\uffff\1\u00a3\7\uffff\1\u00a4",
			"\1\u00a5\37\uffff\1\u00a5",
			"\1\u00a6\37\uffff\1\u00a6",
			"\1\u00a7\37\uffff\1\u00a7",
			"\1\u00a8\37\uffff\1\u00a8",
			"\1\u00a9\37\uffff\1\u00a9",
			"\1\u00aa\16\uffff\1\u00ab\20\uffff\1\u00aa",
			"\1\u00ac\37\uffff\1\u00ac",
			"\1\u00ad\37\uffff\1\u00ad",
			"\1\u00ae\37\uffff\1\u00ae",
			"\1\u00af\37\uffff\1\u00af",
			"\1\u00b0\37\uffff\1\u00b0",
			"\1\u00b1\37\uffff\1\u00b1",
			"\1\u00b2\37\uffff\1\u00b2",
			"",
			"",
			"",
			"\60\121\12\u00b3\uffc6\121",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\146\1\uffff\12\u00b4\13\uffff\1\146\37\uffff\1\146",
			"",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00ba\37\uffff\1\u00ba",
			"",
			"\1\u00bb\37\uffff\1\u00bb",
			"\1\u00bc\37\uffff\1\u00bc",
			"\1\u00bd\37\uffff\1\u00bd",
			"\1\u00be\37\uffff\1\u00be",
			"\1\u00bf\37\uffff\1\u00bf",
			"\1\u00c0\37\uffff\1\u00c0",
			"\1\u00c1\37\uffff\1\u00c1",
			"\1\u00c2\37\uffff\1\u00c2",
			"\1\u00c3\37\uffff\1\u00c3",
			"\1\u00c4\37\uffff\1\u00c4",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00c6\37\uffff\1\u00c6",
			"\1\u00c7\37\uffff\1\u00c7",
			"\1\u00c8\37\uffff\1\u00c8",
			"\1\u00c9\37\uffff\1\u00c9",
			"\1\u00ca\37\uffff\1\u00ca",
			"\1\u00cb\37\uffff\1\u00cb",
			"",
			"\1\u00cc\37\uffff\1\u00cc",
			"\1\u00cd\37\uffff\1\u00cd",
			"\1\u00ce\37\uffff\1\u00ce",
			"",
			"\1\u00cf\37\uffff\1\u00cf",
			"\1\u00d0\37\uffff\1\u00d0",
			"\1\u00d1\37\uffff\1\u00d1",
			"\1\u00d2\37\uffff\1\u00d2",
			"\1\u00d3\37\uffff\1\u00d3",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00d5\37\uffff\1\u00d5",
			"\1\u00d6\37\uffff\1\u00d6",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00d8\37\uffff\1\u00d8",
			"",
			"",
			"\1\u00d9\37\uffff\1\u00d9",
			"\1\u00da\37\uffff\1\u00da",
			"\1\u00db\37\uffff\1\u00db",
			"\1\u00dc\37\uffff\1\u00dc",
			"\1\u00dd\37\uffff\1\u00dd",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00df\37\uffff\1\u00df",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00e1\37\uffff\1\u00e1",
			"\1\u00e2\37\uffff\1\u00e2",
			"\1\u00e3\10\uffff\1\u00e4\26\uffff\1\u00e3\10\uffff\1\u00e4",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00e6\1\u00e7\11\uffff\1\u00e8\24\uffff\1\u00e6\1\u00e7\11\uffff"+
			"\1\u00e8",
			"\1\u00e9\1\uffff\1\u00ea\35\uffff\1\u00e9\1\uffff\1\u00ea",
			"\1\u00eb\37\uffff\1\u00eb",
			"\1\u00ec\37\uffff\1\u00ec",
			"\1\u00ed\37\uffff\1\u00ed",
			"\1\u00ee\3\uffff\1\u00ef\33\uffff\1\u00ee\3\uffff\1\u00ef",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\60\121\12\u00f2\uffc6\121",
			"\1\146\1\uffff\12\u00f3\13\uffff\1\146\37\uffff\1\146",
			"",
			"",
			"",
			"",
			"",
			"\1\u00f4\37\uffff\1\u00f4",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00f6\37\uffff\1\u00f6",
			"\1\u00f7\37\uffff\1\u00f7",
			"\1\u00f8\37\uffff\1\u00f8",
			"\1\u00f9\37\uffff\1\u00f9",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00fb\37\uffff\1\u00fb",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u00fd\37\uffff\1\u00fd",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u00ff\37\uffff\1\u00ff",
			"\1\u0100\37\uffff\1\u0100",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0103\37\uffff\1\u0103",
			"\1\u0104\37\uffff\1\u0104",
			"\1\u0105\37\uffff\1\u0105",
			"\1\u0106\37\uffff\1\u0106",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u010b",
			"\1\u010c\37\uffff\1\u010c",
			"",
			"\1\u010d\37\uffff\1\u010d",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u010f",
			"\1\u0110\37\uffff\1\u0110",
			"\1\u0111\37\uffff\1\u0111",
			"\1\u0112\37\uffff\1\u0112",
			"\1\u0113\37\uffff\1\u0113",
			"\1\u0114\37\uffff\1\u0114",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u0116\37\uffff\1\u0116",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0119\37\uffff\1\u0119",
			"",
			"\1\u011a\37\uffff\1\u011a",
			"\1\u011b\37\uffff\1\u011b",
			"\1\u011c\37\uffff\1\u011c",
			"\1\u011d\37\uffff\1\u011d",
			"\1\u011e\37\uffff\1\u011e",
			"\1\u011f\37\uffff\1\u011f",
			"\1\u0120\37\uffff\1\u0120",
			"\1\u0121\37\uffff\1\u0121",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0123\37\uffff\1\u0123",
			"",
			"",
			"\60\121\12\u0124\uffc6\121",
			"\1\u0125\1\146\1\uffff\12\u0126\13\uffff\1\146\37\uffff\1\146",
			"\1\u0127\37\uffff\1\u0127",
			"",
			"\1\u0128\37\uffff\1\u0128",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u012b\37\uffff\1\u012b",
			"",
			"\1\u012c\37\uffff\1\u012c",
			"",
			"\1\u012d\37\uffff\1\u012d",
			"",
			"\1\u012e\37\uffff\1\u012e",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0131\37\uffff\1\u0131",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0133\37\uffff\1\u0133",
			"",
			"",
			"",
			"",
			"\1\u0134\37\uffff\1\u0134",
			"\1\u0135\37\uffff\1\u0135",
			"\1\u0136\37\uffff\1\u0136",
			"",
			"\1\u0137\37\uffff\1\u0137",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u013a\37\uffff\1\u013a",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u013c\37\uffff\1\u013c",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u013f\37\uffff\1\u013f",
			"\1\u0140\37\uffff\1\u0140",
			"\1\u0141\37\uffff\1\u0141",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0143\37\uffff\1\u0143",
			"\1\u0144\37\uffff\1\u0144",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0146\37\uffff\1\u0146",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\55\121\1\u0148\uffd2\121",
			"\12\u0149",
			"\1\146\1\uffff\12\u0126\13\uffff\1\146\37\uffff\1\146",
			"\1\u014a\37\uffff\1\u014a",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"\1\u014c\37\uffff\1\u014c",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u014e\37\uffff\1\u014e",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0152\37\uffff\1\u0152",
			"\1\u0153\37\uffff\1\u0153",
			"\1\u0154\37\uffff\1\u0154",
			"\1\u0155\37\uffff\1\u0155",
			"",
			"",
			"\1\u0156\37\uffff\1\u0156",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"\1\u0158\37\uffff\1\u0158",
			"\1\u0159\37\uffff\1\u0159",
			"\1\u015a\37\uffff\1\u015a",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\60\121\12\u015e\uffc6\121",
			"\12\u015f",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u0161\37\uffff\1\u0161",
			"",
			"\1\u0162\37\uffff\1\u0162",
			"",
			"",
			"",
			"\1\u0163\37\uffff\1\u0163",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u0165\37\uffff\1\u0165",
			"\1\u0166\37\uffff\1\u0166",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\u016a\37\uffff\1\u016a",
			"",
			"",
			"",
			"\60\121\12\u016b\uffc6\121",
			"\1\u016c",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\u0170\37\uffff\1\u0170",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"",
			"",
			"\1\u0172\37\uffff\1\u0172",
			"\55\121\1\u0173\uffd2\121",
			"\12\u0174",
			"",
			"",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"",
			"\1\54\13\uffff\12\54\7\uffff\32\54\4\uffff\1\54\1\uffff\32\54",
			"\60\121\12\u0177\uffc6\121",
			"\12\u0178",
			"",
			"",
			"\60\121\12\u0179\uffc6\121",
			"\1\u017c\6\uffff\1\u017b\114\uffff\1\u017c",
			"\40\121\1\u017e\6\121\1\u017d\114\121\1\u017e\uff8b\121",
			"",
			"",
			"",
			"\0\121",
			"\60\121\12\u017f\uffc6\121",
			"\60\121\12\u0180\uffc6\121",
			"\72\121\1\u0181\uffc5\121",
			"\60\121\12\u0182\uffc6\121",
			"\60\121\12\u0183\uffc6\121",
			"\72\121\1\u0184\uffc5\121",
			"\60\121\12\u0185\uffc6\121",
			"\60\121\12\u0186\uffc6\121",
			"\47\121\1\u0187\uffd8\121",
			""
	};

	static final short[] DFA30_eot = DFA.unpackEncodedString(DFA30_eotS);
	static final short[] DFA30_eof = DFA.unpackEncodedString(DFA30_eofS);
	static final char[] DFA30_min = DFA.unpackEncodedStringToUnsignedChars(DFA30_minS);
	static final char[] DFA30_max = DFA.unpackEncodedStringToUnsignedChars(DFA30_maxS);
	static final short[] DFA30_accept = DFA.unpackEncodedString(DFA30_acceptS);
	static final short[] DFA30_special = DFA.unpackEncodedString(DFA30_specialS);
	static final short[][] DFA30_transition;

	static {
		int numStates = DFA30_transitionS.length;
		DFA30_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA30_transition[i] = DFA.unpackEncodedString(DFA30_transitionS[i]);
		}
	}

	protected class DFA30 extends DFA {

		public DFA30(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 30;
			this.eot = DFA30_eot;
			this.eof = DFA30_eof;
			this.min = DFA30_min;
			this.max = DFA30_max;
			this.accept = DFA30_accept;
			this.special = DFA30_special;
			this.transition = DFA30_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__131 | T__132 | T__133 | ALL | AND | ANY | AS | ASC | BETWEEN | BY | CASE | CREATE | CROSS | DATE | DELETE | DESC | DISTINCT | ELSE | END | EXISTS | FALSE | FROM | FULL | GROUP | HAVING | IN | INNER | INSERT | INTO | IS | JOIN | LEFT | LIKE | NATURAL | NOT | NULL | NOLOGGING | ON | OR | ORDER | OUTER | PERCENT | RIGHT | SELECT | SET | SOME | TABLE | THEN | TRUE | TOP | UNION | UNIQUE | UPDATE | USING | VALUES | WHEN | WHERE | MAX | MIN | COUNT | SUM | AVG | NVL | COALESCE | TOCHAR | TODATE | LASTDAY | TONUMBER | TRUNC | NEXTDAY | DOT | COMMA | LPAREN | RPAREN | LCURLY | RCURLY | STRCAT | QUESTION | COLON | SEMI | APOSTROPHE | EQ | NEQ1 | NEQ2 | LTE | LT | GTE | GT | PLUS | MINUS | DIVIDE | STAR | MOD | Daytime | Integer | Float | String | Timestamp | Identifier | QuotedIdentifier | Comment | Whitespace );";
		}
		@Override
		public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
			IntStream input = _input;
			int _s = s;
			switch ( s ) {
					case 0 : 
						int LA30_382 = input.LA(1);
						s = -1;
						if ( ((LA30_382 >= '\u0000' && LA30_382 <= '/')||(LA30_382 >= ':' && LA30_382 <= '\uFFFF')) ) {s = 81;}
						else if ( ((LA30_382 >= '0' && LA30_382 <= '9')) ) {s = 383;}
						if ( s>=0 ) return s;
						break;

					case 1 : 
						int LA30_385 = input.LA(1);
						s = -1;
						if ( ((LA30_385 >= '\u0000' && LA30_385 <= '/')||(LA30_385 >= ':' && LA30_385 <= '\uFFFF')) ) {s = 81;}
						else if ( ((LA30_385 >= '0' && LA30_385 <= '9')) ) {s = 386;}
						if ( s>=0 ) return s;
						break;

					case 2 : 
						int LA30_388 = input.LA(1);
						s = -1;
						if ( ((LA30_388 >= '\u0000' && LA30_388 <= '/')||(LA30_388 >= ':' && LA30_388 <= '\uFFFF')) ) {s = 81;}
						else if ( ((LA30_388 >= '0' && LA30_388 <= '9')) ) {s = 389;}
						if ( s>=0 ) return s;
						break;

					case 3 : 
						int LA30_328 = input.LA(1);
						s = -1;
						if ( ((LA30_328 >= '0' && LA30_328 <= '9')) ) {s = 350;}
						else if ( ((LA30_328 >= '\u0000' && LA30_328 <= '/')||(LA30_328 >= ':' && LA30_328 <= '\uFFFF')) ) {s = 81;}
						if ( s>=0 ) return s;
						break;

					case 4 : 
						int LA30_371 = input.LA(1);
						s = -1;
						if ( ((LA30_371 >= '0' && LA30_371 <= '9')) ) {s = 375;}
						else if ( ((LA30_371 >= '\u0000' && LA30_371 <= '/')||(LA30_371 >= ':' && LA30_371 <= '\uFFFF')) ) {s = 81;}
						if ( s>=0 ) return s;
						break;

					case 5 : 
						int LA30_390 = input.LA(1);
						s = -1;
						if ( (LA30_390=='\'') ) {s = 391;}
						else if ( ((LA30_390 >= '\u0000' && LA30_390 <= '&')||(LA30_390 >= '(' && LA30_390 <= '\uFFFF')) ) {s = 81;}
						else s = 380;
						if ( s>=0 ) return s;
						break;

					case 6 : 
						int LA30_383 = input.LA(1);
						s = -1;
						if ( ((LA30_383 >= '\u0000' && LA30_383 <= '/')||(LA30_383 >= ':' && LA30_383 <= '\uFFFF')) ) {s = 81;}
						else if ( ((LA30_383 >= '0' && LA30_383 <= '9')) ) {s = 384;}
						if ( s>=0 ) return s;
						break;

					case 7 : 
						int LA30_363 = input.LA(1);
						s = -1;
						if ( (LA30_363=='-') ) {s = 371;}
						else if ( ((LA30_363 >= '\u0000' && LA30_363 <= ',')||(LA30_363 >= '.' && LA30_363 <= '\uFFFF')) ) {s = 81;}
						if ( s>=0 ) return s;
						break;

					case 8 : 
						int LA30_386 = input.LA(1);
						s = -1;
						if ( ((LA30_386 >= '\u0000' && LA30_386 <= '/')||(LA30_386 >= ':' && LA30_386 <= '\uFFFF')) ) {s = 81;}
						else if ( ((LA30_386 >= '0' && LA30_386 <= '9')) ) {s = 387;}
						if ( s>=0 ) return s;
						break;

					case 9 : 
						int LA30_292 = input.LA(1);
						s = -1;
						if ( (LA30_292=='-') ) {s = 328;}
						else if ( ((LA30_292 >= '\u0000' && LA30_292 <= ',')||(LA30_292 >= '.' && LA30_292 <= '\uFFFF')) ) {s = 81;}
						if ( s>=0 ) return s;
						break;

					case 10 : 
						int LA30_389 = input.LA(1);
						s = -1;
						if ( ((LA30_389 >= '\u0000' && LA30_389 <= '/')||(LA30_389 >= ':' && LA30_389 <= '\uFFFF')) ) {s = 81;}
						else if ( ((LA30_389 >= '0' && LA30_389 <= '9')) ) {s = 390;}
						if ( s>=0 ) return s;
						break;

					case 11 : 
						int LA30_104 = input.LA(1);
						s = -1;
						if ( ((LA30_104 >= '0' && LA30_104 <= '9')) ) {s = 179;}
						else if ( ((LA30_104 >= '\u0000' && LA30_104 <= '/')||(LA30_104 >= ':' && LA30_104 <= '\uFFFF')) ) {s = 81;}
						if ( s>=0 ) return s;
						break;

					case 12 : 
						int LA30_32 = input.LA(1);
						s = -1;
						if ( ((LA30_32 >= '0' && LA30_32 <= '9')) ) {s = 104;}
						else if ( ((LA30_32 >= '\u0000' && LA30_32 <= '/')||(LA30_32 >= ':' && LA30_32 <= '\uFFFF')) ) {s = 81;}
						else s = 103;
						if ( s>=0 ) return s;
						break;

					case 13 : 
						int LA30_384 = input.LA(1);
						s = -1;
						if ( ((LA30_384 >= '\u0000' && LA30_384 <= '9')||(LA30_384 >= ';' && LA30_384 <= '\uFFFF')) ) {s = 81;}
						else if ( (LA30_384==':') ) {s = 385;}
						if ( s>=0 ) return s;
						break;

					case 14 : 
						int LA30_387 = input.LA(1);
						s = -1;
						if ( ((LA30_387 >= '\u0000' && LA30_387 <= '9')||(LA30_387 >= ';' && LA30_387 <= '\uFFFF')) ) {s = 81;}
						else if ( (LA30_387==':') ) {s = 388;}
						if ( s>=0 ) return s;
						break;

					case 15 : 
						int LA30_350 = input.LA(1);
						s = -1;
						if ( ((LA30_350 >= '0' && LA30_350 <= '9')) ) {s = 363;}
						else if ( ((LA30_350 >= '\u0000' && LA30_350 <= '/')||(LA30_350 >= ':' && LA30_350 <= '\uFFFF')) ) {s = 81;}
						if ( s>=0 ) return s;
						break;

					case 16 : 
						int LA30_375 = input.LA(1);
						s = -1;
						if ( ((LA30_375 >= '0' && LA30_375 <= '9')) ) {s = 377;}
						else if ( ((LA30_375 >= '\u0000' && LA30_375 <= '/')||(LA30_375 >= ':' && LA30_375 <= '\uFFFF')) ) {s = 81;}
						if ( s>=0 ) return s;
						break;

					case 17 : 
						int LA30_179 = input.LA(1);
						s = -1;
						if ( ((LA30_179 >= '0' && LA30_179 <= '9')) ) {s = 242;}
						else if ( ((LA30_179 >= '\u0000' && LA30_179 <= '/')||(LA30_179 >= ':' && LA30_179 <= '\uFFFF')) ) {s = 81;}
						if ( s>=0 ) return s;
						break;

					case 18 : 
						int LA30_242 = input.LA(1);
						s = -1;
						if ( ((LA30_242 >= '0' && LA30_242 <= '9')) ) {s = 292;}
						else if ( ((LA30_242 >= '\u0000' && LA30_242 <= '/')||(LA30_242 >= ':' && LA30_242 <= '\uFFFF')) ) {s = 81;}
						if ( s>=0 ) return s;
						break;

					case 19 : 
						int LA30_377 = input.LA(1);
						s = -1;
						if ( (LA30_377=='\'') ) {s = 381;}
						else if ( (LA30_377==' '||LA30_377=='t') ) {s = 382;}
						else if ( ((LA30_377 >= '\u0000' && LA30_377 <= '\u001F')||(LA30_377 >= '!' && LA30_377 <= '&')||(LA30_377 >= '(' && LA30_377 <= 's')||(LA30_377 >= 'u' && LA30_377 <= '\uFFFF')) ) {s = 81;}
						else s = 378;
						if ( s>=0 ) return s;
						break;

					case 20 : 
						int LA30_381 = input.LA(1);
						s = -1;
						if ( ((LA30_381 >= '\u0000' && LA30_381 <= '\uFFFF')) ) {s = 81;}
						else s = 378;
						if ( s>=0 ) return s;
						break;
			}
			NoViableAltException nvae =
				new NoViableAltException(getDescription(), 30, _s, input);
			error(nvae);
			throw nvae;
		}
	}

}
