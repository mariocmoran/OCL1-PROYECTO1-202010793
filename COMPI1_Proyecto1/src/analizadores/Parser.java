
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package analizadores;

import java_cup.runtime.*;
import java.util.ArrayList;
import errores.*;
import compi1_proyecto1.*;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\035\000\002\002\004\000\002\002\010\000\002\003" +
    "\004\000\002\003\003\000\002\005\003\000\002\005\003" +
    "\000\002\004\004\000\002\004\003\000\002\016\006\000" +
    "\002\007\006\000\002\015\005\000\002\015\005\000\002" +
    "\015\004\000\002\015\004\000\002\015\004\000\002\015" +
    "\005\000\002\015\003\000\002\006\010\000\002\010\005" +
    "\000\002\010\005\000\002\010\003\000\002\010\005\000" +
    "\002\010\003\000\002\011\004\000\002\012\005\000\002" +
    "\012\002\000\002\013\004\000\002\014\005\000\002\014" +
    "\002" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\100\000\004\013\005\001\002\000\004\002\102\001" +
    "\002\000\006\020\012\027\013\001\002\000\010\020\ufffe" +
    "\021\ufffe\027\ufffe\001\002\000\010\020\012\021\070\027" +
    "\013\001\002\000\010\020\ufffd\021\ufffd\027\ufffd\001\002" +
    "\000\010\020\ufffc\021\ufffc\027\ufffc\001\002\000\004\016" +
    "\037\001\002\000\004\017\014\001\002\000\020\004\015" +
    "\005\023\006\016\007\020\010\021\013\017\026\022\001" +
    "\002\000\020\004\015\005\023\006\016\007\020\010\021" +
    "\013\017\026\022\001\002\000\020\004\015\005\023\006" +
    "\016\007\020\010\021\013\017\026\022\001\002\000\004" +
    "\027\032\001\002\000\020\004\015\005\023\006\016\007" +
    "\020\010\021\013\017\026\022\001\002\000\020\004\015" +
    "\005\023\006\016\007\020\010\021\013\017\026\022\001" +
    "\002\000\022\004\ufff1\005\ufff1\006\ufff1\007\ufff1\010\ufff1" +
    "\013\ufff1\015\ufff1\026\ufff1\001\002\000\020\004\015\005" +
    "\023\006\016\007\020\010\021\013\017\026\022\001\002" +
    "\000\004\015\025\001\002\000\010\020\ufff8\021\ufff8\027" +
    "\ufff8\001\002\000\020\004\015\005\023\006\016\007\020" +
    "\010\021\013\017\026\022\001\002\000\022\004\ufff6\005" +
    "\ufff6\006\ufff6\007\ufff6\010\ufff6\013\ufff6\015\ufff6\026\ufff6" +
    "\001\002\000\022\004\ufff3\005\ufff3\006\ufff3\007\ufff3\010" +
    "\ufff3\013\ufff3\015\ufff3\026\ufff3\001\002\000\022\004\ufff4" +
    "\005\ufff4\006\ufff4\007\ufff4\010\ufff4\013\ufff4\015\ufff4\026" +
    "\ufff4\001\002\000\004\014\033\001\002\000\022\004\ufff2" +
    "\005\ufff2\006\ufff2\007\ufff2\010\ufff2\013\ufff2\015\ufff2\026" +
    "\ufff2\001\002\000\022\004\ufff5\005\ufff5\006\ufff5\007\ufff5" +
    "\010\ufff5\013\ufff5\015\ufff5\026\ufff5\001\002\000\020\004" +
    "\015\005\023\006\016\007\020\010\021\013\017\026\022" +
    "\001\002\000\022\004\ufff7\005\ufff7\006\ufff7\007\ufff7\010" +
    "\ufff7\013\ufff7\015\ufff7\026\ufff7\001\002\000\004\027\040" +
    "\001\002\000\004\017\041\001\002\000\010\022\042\024" +
    "\043\025\047\001\002\000\010\011\062\012\061\015\uffe8" +
    "\001\002\000\010\011\054\012\053\015\uffe5\001\002\000" +
    "\004\015\052\001\002\000\004\015\uffed\001\002\000\004" +
    "\015\uffeb\001\002\000\004\011\050\001\002\000\004\025" +
    "\051\001\002\000\004\015\uffec\001\002\000\010\020\ufff0" +
    "\021\ufff0\027\ufff0\001\002\000\004\024\057\001\002\000" +
    "\004\024\056\001\002\000\004\015\uffe7\001\002\000\004" +
    "\015\uffee\001\002\000\006\012\053\015\uffe5\001\002\000" +
    "\004\015\uffe6\001\002\000\004\022\065\001\002\000\004" +
    "\022\064\001\002\000\004\015\uffea\001\002\000\004\015" +
    "\uffef\001\002\000\006\012\061\015\uffe8\001\002\000\004" +
    "\015\uffe9\001\002\000\010\020\uffff\021\uffff\027\uffff\001" +
    "\002\000\004\021\071\001\002\000\004\027\073\001\002" +
    "\000\006\014\100\027\073\001\002\000\004\016\075\001" +
    "\002\000\006\014\ufffa\027\ufffa\001\002\000\004\030\076" +
    "\001\002\000\004\015\077\001\002\000\006\014\ufff9\027" +
    "\ufff9\001\002\000\004\002\000\001\002\000\006\014\ufffb" +
    "\027\ufffb\001\002\000\004\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\100\000\004\002\003\001\001\000\002\001\001\000" +
    "\012\003\006\005\005\006\007\007\010\001\001\000\002" +
    "\001\001\000\010\005\066\006\007\007\010\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\015\023\001\001\000\004\015\034\001" +
    "\001\000\004\015\033\001\001\000\002\001\001\000\004" +
    "\015\030\001\001\000\004\015\027\001\001\000\002\001" +
    "\001\000\004\015\025\001\001\000\002\001\001\000\002" +
    "\001\001\000\004\015\026\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\004\015\035\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\010" +
    "\010\043\011\044\013\045\001\001\000\004\012\062\001" +
    "\001\000\004\014\054\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\014\057\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\004\012\065\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\006\004\071\016\073\001\001\000" +
    "\004\016\100\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



    /*Method that is called when parser can be recovered*/

    public void syntax_error(Symbol s){ 
        System.out.println("Unexpected token: " +s.value); 
	Instruccion.lista.addError(new Error_("Sintactical error: "+s.value, "Sintactico", s.right, s.left));
    }

    /*Method that is called when parser can't be recovered*/

    public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{ 
	Instruccion.lista.addError(new Error_("Sintactical error: "+s.value, "Sintactico", s.right, s.left));
    }
    
    


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= ini EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // ini ::= ER_A instructions SEPARADOR SEPARADOR sentencias ER_C 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		ArrayList<String> a = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArrayList<String> b = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		 
    /**
    a.forEach((t) -> {
        System.out.println(t);
    });

    b.forEach((t) -> {
        System.out.println(t);
    });
    System.out.println("");
    System.out.println(TablaSimbolos.EscribirArchivo());**/
 
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("ini",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // instructions ::= instructions instruction 
            {
              ArrayList<String> RESULT =null;
		int listleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArrayList<String> list = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = list;RESULT.add( new String(val.toString()));
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instructions",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // instructions ::= instruction 
            {
              ArrayList<String> RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = new ArrayList<String>();RESULT.add( new String(val.toString()));
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instructions",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // instruction ::= conjuntos 
            {
              Object RESULT =null;
		int conleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int conright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object con = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = Tokens.CONJ;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruction",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // instruction ::= expresiones 
            {
              Object RESULT =null;
		int expleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int expright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object exp = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = Tokens.ER;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("instruction",3, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // sentencias ::= sentencias sentencia 
            {
              ArrayList<String> RESULT =null;
		int listleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int listright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArrayList<String> list = (ArrayList<String>)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = list;RESULT.add( new String(val.toString()));
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencias",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // sentencias ::= sentencia 
            {
              ArrayList<String> RESULT =null;
		int valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object val = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = new ArrayList<String>();RESULT.add( new String(val.toString()));
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencias",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // sentencia ::= IDENTIFICADOR DOSPUNTOS CADENA PUNTOYCOMA 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
                    RESULT = Tokens.SENTENCIA;
                    Simbolo nuevo = new Simbolo();
                    nuevo.setNombre(id.toString());
                    nuevo.setValor(c.toString());
                    nuevo.setTipoDeclaracion("Sentencia");
                    TablaSimbolos.add(nuevo);
                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("sentencia",12, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // expresiones ::= IDENTIFICADOR FLECHA expresion PUNTOYCOMA 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int rleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int rright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expresion r = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
                    RESULT = r;
                    Simbolo nuevo = new Simbolo();
                    nuevo.setNombre(id.toString());
                    nuevo.arbolExpresiones = r;
                    nuevo.setTipoDeclaracion("Expresion_Regular");
                    TablaSimbolos.add(nuevo);
                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresiones",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // expresion ::= AND expresion expresion 
            {
              Expresion RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expresion e1 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expresion e2 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                    if (e1.anulable == "A" && e2.anulable == "A")
                        RESULT = new Expresion(o, e1, e2, "A");
                    else
                        RESULT = new Expresion(o, e1, e2, "N");
                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // expresion ::= OR expresion expresion 
            {
              Expresion RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Expresion e1 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int e2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expresion e2 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                    if (e1.anulable == "A" || e2.anulable == "A")
                        RESULT = new Expresion(o, e1, e2, "A");
                    else
                        RESULT = new Expresion(o, e1, e2, "N");
                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // expresion ::= CEROMAS expresion 
            {
              Expresion RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expresion e1 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = new Expresion(o, e1, "A");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // expresion ::= UNOMAS expresion 
            {
              Expresion RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expresion e1 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
                    if (e1.anulable == "A")
                        RESULT = new Expresion(o, e1, "A");
                    else
                        RESULT = new Expresion(o, e1, "N");
                
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // expresion ::= SINO expresion 
            {
              Expresion RESULT =null;
		int oleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int oright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String o = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int e1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int e1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Expresion e1 = (Expresion)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = new Expresion(o, e1, "A");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // expresion ::= ER_A IDENTIFICADOR ER_C 
            {
              Expresion RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = new Expresion(id, "N");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // expresion ::= CARACTER 
            {
              Expresion RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = new Expresion(c, "N");
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("expresion",11, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 17: // conjuntos ::= CONJ DOSPUNTOS IDENTIFICADOR FLECHA conjunto PUNTOYCOMA 
            {
              Object RESULT =null;
		int idleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int idright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		String id = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object c = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		
                Simbolo nuevo = new Simbolo();
                nuevo.setNombre(id.toString());
                nuevo.setValor(c.toString());
                nuevo.setTipoDeclaracion("Conjunto");
                TablaSimbolos.add(nuevo);
                RESULT = c;
            
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("conjuntos",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 18: // conjunto ::= NUMERO GUION NUMERO 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = a+b+c;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("conjunto",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 19: // conjunto ::= LETRA GUION LETRA 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = a+b+c;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("conjunto",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 20: // conjunto ::= listanumeros 
            {
              Object RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object l = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = l;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("conjunto",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 21: // conjunto ::= SIMBOLO GUION SIMBOLO 
            {
              Object RESULT =null;
		int aleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int aright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String a = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int bleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int bright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String b = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = a+b+c;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("conjunto",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 22: // conjunto ::= listaletras 
            {
              Object RESULT =null;
		int lsleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int lsright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object ls = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = ls;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("conjunto",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 23: // listanumeros ::= NUMERO otronumero 
            {
              Object RESULT =null;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int onleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int onright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object on = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = n+on;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("listanumeros",7, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 24: // otronumero ::= COMA NUMERO otronumero 
            {
              Object RESULT =null;
		int cmleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int cmright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String cm = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int nleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int nright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String n = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int onleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int onright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object on = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = cm+n+on;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("otronumero",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 25: // otronumero ::= 
            {
              Object RESULT =null;
		RESULT = "";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("otronumero",8, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 26: // listaletras ::= LETRA otraletra 
            {
              Object RESULT =null;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String l = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int olleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int olright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object ol = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = l+ol;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("listaletras",9, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 27: // otraletra ::= COMA LETRA otraletra 
            {
              Object RESULT =null;
		int cleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int cright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		String c = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int lleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int lright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		String l = (String)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int olleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int olright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object ol = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		RESULT = c+l+ol;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("otraletra",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 28: // otraletra ::= 
            {
              Object RESULT =null;
		RESULT = "";
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("otraletra",10, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}
