package analizadores;
import errores.*;
import java_cup.runtime.Symbol; 
import compi1_proyecto1.*;
%%

/*Define how will works our scanner*/
%class Scanner      /*Class name will be Scanner*/
%public             /*Will be public*/
%line               /*Count of lines*/
%char               /*Count of recognized characters*/
%cup                /*Will works with cup*/
%unicode            /*Set of characters is unicode*/
%ignorecase         /*Will be ignore case; Example: Compi1 equals cOmpI1*/

%init{
    yyline = 1; 
    yycolumn = 1; 
%init}

/*Section or regular expressions*/
WHITE = [ \r\t\n]+
NUMERO =[0-9]
LETRA =[a-zA-Z]
CARACTER ="\""[^]"\""

IDENTIFICADOR = [a-zA-Z\_][\_a-zA-Z\d]*
CADENA = [\"][^\"]*[\"]

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
MultiLineaComentario = "<!"[^!]*"!>"
LineaComentario = "//"{InputCharacter}*{LineTerminator}?

SIMBOLO = "!"|"\""|"#"|"$"|"%"|"&"|"/"|"("|")"|"'"|"*"|"-"|"+"|","|"."|";"|":"|"<"|">"|"="|"?"|"@"|"["|"]"|"\\"|"^"|"_"|"´"|"{"|"}"|"|"

%%

"." {return new Symbol(sym.AND, yycolumn, yyline, yytext());}
"|" {return new Symbol(sym.OR, yycolumn, yyline, yytext());}
"*" {return new Symbol(sym.CEROMAS, yycolumn, yyline, yytext());}
"+" {return new Symbol(sym.UNOMAS, yycolumn, yyline, yytext());}
"?" {return new Symbol(sym.SINO, yycolumn, yyline, yytext());}
"~" {return new Symbol(sym.GUION, yycolumn, yyline, yytext());}
"," {return new Symbol(sym.COMA, yycolumn, yyline, yytext());}
"{" {return new Symbol(sym.ER_A, yycolumn, yyline, yytext());}
"}" {return new Symbol(sym.ER_C, yycolumn, yyline, yytext());}

";" {return new Symbol(sym.PUNTOYCOMA, yycolumn, yyline, yytext());}
":" {return new Symbol(sym.DOSPUNTOS, yycolumn, yyline, yytext());}
"->" {return new Symbol(sym.FLECHA, yycolumn, yyline, yytext());}
"CONJ" {return new Symbol(sym.CONJ, yycolumn, yyline, yytext());}
"%%" {return new Symbol(sym.SEPARADOR, yycolumn, yyline, yytext());}

{MultiLineaComentario} {}
{LineaComentario} {}
{NUMERO} {return new Symbol(sym.NUMERO, yycolumn, yyline, yytext());}
{LETRA} {return new Symbol(sym.LETRA, yycolumn, yyline, yytext());}
{SIMBOLO} {return new Symbol(sym.SIMBOLO, yycolumn, yyline, yytext());}
{CARACTER} {return new Symbol(sym.CARACTER, yycolumn, yyline, yytext());}

{IDENTIFICADOR} {return new Symbol(sym.IDENTIFICADOR, yycolumn, yyline, yytext());}
{CADENA} {return new Symbol(sym.CADENA, yycolumn, yyline, yytext());}

{WHITE} {}

. {
    //System.out.println("Lexical error: "+yytext());
    Instruccion.lista.addError(new Error_("Lexical error: "+yytext(), "Lexico", yycolumn, yyline));
}