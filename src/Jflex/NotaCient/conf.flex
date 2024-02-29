package Jflex.NotaCient.NotaCient;
import static Jflex.NotaCient.Tokens.*;

%%
%class Lexico
%type Tokens

DIGITO=[0-9]
SIGNO=[+-]
EXPONENTE=[eE^]
FLOAT_POINT=[.]
WHITE=[ \t\r\n]
FINCADENA=";"

%{
    public String lexema;
%}

%%

{WHITE} {/* NO HACER NADA*/}

{DIGITO}+{FLOAT_POINT}{DIGITO}*{EXPONENTE}{SIGNO}?{DIGITO}+{FINCADENA} {lexema=yytext(); return NOTACION_CIENTIFICA;}
{DIGITO}+{EXPONENTE}{SIGNO}?{DIGITO}+{FINCADENA} {lexema=yytext(); return NOTACION_CIENTIFICA;}
{DIGITO}+{FLOAT_POINT}{DIGITO}* {lexema=yytext(); return FLOAT;}
{DIGITO}+ {lexema=yytext(); return INTEGER;}
{FLOAT_POINT}{DIGITO}+ {lexema=yytext(); return FLOAT;}

. {return ERROR;}
