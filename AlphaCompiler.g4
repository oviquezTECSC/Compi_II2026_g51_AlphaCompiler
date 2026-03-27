grammar AlphaCompiler;

/******** lexer ********/
//keywords
IF      : 'if' ;
THEN    : 'then';
ELSE    : 'else';
WHILE   : 'while';
DO      : 'do';
LET     : 'let';
IN      : 'in';
BEGIN   : 'begin';
END     : 'end';
CONST   : 'const';
VAR     : 'var';

//symbolos
SEMI    : ';';
ASSIGN  : ':=';
LEFTP   : '(';
RIGHTP  : ')';
VIR     : '~';
COLON   : ':';
ADD     : '+';
SUB     : '-';
MUL     : '*';
DIV     : '/';
MOD     : '%';
EQEQ    : '==';
NOTEQ   : '!=';
LESS    : '<';
MORET   : '>';
LESSEQ  : '<=';
MOREEQ  : '>=';

//others

ID      : LETTER(LETTER|DIGIT)* ;
INTLIT  : DIGIT DIGIT* ;

WS      : [ \t\n\r] -> skip;

fragment LETTER : [a-zA-Z];
fragment DIGIT  : [0-9];

/******** parser ********/
program             : singleCommand EOF                                            ;
command             : singleCommand (SEMI singleCommand)*                       ;
singleCommand       : ID ASSIGN expression
                    | ID LEFTP expression RIGHTP
                    | IF expression THEN singleCommand
                                    (ELSE singleCommand)?
                    | WHILE expression DO singleCommand
                    | LET declaration IN singleCommand
                    | BEGIN command END                                         ;
declaration         : singleDeclaration (SEMI singleDeclaration)*               ;
singleDeclaration   : CONST ID VIR expression
    	            | VAR ID COLON typeDenoter                                  ;
typeDenoter         : ID                                                        ;
expression          : primaryExpression (operator primaryExpression)*           ;
primaryExpression   : SUB? (INTLIT | ID | LEFTP expression RIGHTP)                     ;
operator            : ADD
                    | SUB
                    | MUL
                    | DIV
                    | MOD
                    | EQEQ
                    | NOTEQ
                    | LESS
                    | MORET
                    | LESSEQ
                    | MOREEQ                                                    ;
