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

%init}

/*Section or regular expressions*/
WHITE = [ \r\t\n]+
NUMERO =[0-9]
LETRA =[a-zA-Z]

IDENTIFICADOR = [a-zA-Z\_][\_a-zA-Z\d]*
CADENA = [\"][^\"]*[\"]

LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
MultiLineaComentario = "<!"[^!]*"!>"
LineaComentario = "//"{InputCharacter}*{LineTerminator}?

%%

"." {return new Symbol(sym.AND, yytext());}
"|" {return new Symbol(sym.OR, yytext());}
"*" {return new Symbol(sym.CEROMAS, yytext());}
"+" {return new Symbol(sym.UNOMAS, yytext());}
"?" {return new Symbol(sym.SINO, yytext());}
"~" {return new Symbol(sym.GUION, yytext());}
"," {return new Symbol(sym.COMA, yytext());}

";" {return new Symbol(sym.PUNTOYCOMA, yytext());}
":" {return new Symbol(sym.DOSPUNTOS, yytext());}
"->" {return new Symbol(sym.FLECHA, yytext());}
"CONJ" {return new Symbol(sym.CONJ, yytext());}

{MultiLineaComentario} {}
{LineaComentario} {}
{NUMERO} {return new Symbol(sym.NUMERO, yytext());}
{LETRA} {return new Symbol(sym.LETRA, yytext());}

{IDENTIFICADOR} {return new Symbol(sym.IDENTIFICADOR, yytext());}
{CADENA} {return new Symbol(sym.CADENA, yytext());}

{WHITE} {}

. {
    //System.out.println("Lexical error: "+yytext());
    Instruccion.lista.addError(new Error_("Lexical error: "+yytext(), "Lexico"));
}