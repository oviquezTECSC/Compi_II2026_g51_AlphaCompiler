grammar AlphaCompiler;

/****** lexer ******/
//keywords
IF      : 'if';
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
VOID    : 'void';
RETURN  : 'return';
TRUE    : 'true';
FALSE   : 'false';

//symbols
SEMI    : ';';
ASSIGN  : ':=';
LEFTP   : '(';
RIGHTP  : ')';
VIR     : '~';
COLON   : ':';
COMMA   : ',';
ADD     : '+';
SUB     : '-';
MUL     : '*';
DIV     : '/';
MOD     : '%';
EQEQ    : '==';
NOTEQ   : '!=';
LESS    : '<';
MORET    : '>';
LESSEQ  : '<=';
MOREEQ  : '>=';

//other tokens
ID      : LETTER (LETTER|DIGIT)*;
INTNUM  : DIGIT DIGIT*;
STRINGCONST : '"'.*?'"';
CHARCONST: '\'' ( ESC_SEQ | ~['\\\r\n] ) '\'';

LINE_COMMENT: '//' ~[\r\n]* -> skip;
BLOCK_COMMENT: '/*' .*? '*/' -> skip;
WS : [ \n\r\t] -> skip;

fragment ESC_SEQ : '\\' [btnrf"'\\];
fragment LETTER : [a-zA-Z];
fragment DIGIT  : [0-9];

//constantes caracter, incluyendo caravterres especiales
//constantes String
//comentarios al estilo java

/****** parser ******/
program         : singleCommand EOF                                 ;
command         : singleCommand (SEMI singleCommand)*               ;
singleCommand   : ID ASSIGN expression                                      #assignSingleCommand
                | ID LEFTP argumentList? RIGHTP                             #methodCallSingleCommand
                | RETURN expression?                                        #returnSingleCommand
                | IF expression THEN singleCommand (ELSE singleCommand)?    #ifSingleCommand
                | WHILE expression DO singleCommand                         #whileSingleCommand
                | LET declaration IN singleCommand                          #letSingleCommand
                | BEGIN command END                                         #blockSingleCommand;
argumentList    : expression (COMMA expression)*;
declaration     : singleDeclaration (SEMI singleDeclaration)*       ;
singleDeclaration : CONST ID VIR expression                                 #constSingleDeclaration
                | VAR ID COLON typeDenoter                                  #varSingleDeclaration
          | (VOID|typeDenoter) ID LEFTP paramList? RIGHTP singleCommand     #methodSingleDeclaration;
paramList       : param (COMMA param)*                              ;
param           : ID COLON typeDenoter                              ;
typeDenoter     : ID                                                ;
expression      : primaryExpression (operator primaryExpression)*   ;
primaryExpression : SUB? INTNUM                                             #numPrimaryExpression
                    | SUB? ID                                               #idPrimaryExpression
                    | SUB? LEFTP expression RIGHTP                          #groupPrimaryExpression
                    | SUB? ID LEFTP argumentList? RIGHTP                    #methodCallPrimaryExpression
                    | CHARCONST                                             #charPrimaryExpression
                    | STRINGCONST                                           #stringPrimaryExpression
                    | TRUE                                                  #truePrimaryExpression
                    | FALSE                                                 #falsePrimaryExpression;
operator        : ADD
                  | SUB
                  | MUL
                  | DIV
                  | MOD
                  | EQEQ
                  | NOTEQ
                  | LESS
                  | MORET
                  | LESSEQ
                  | MOREEQ                                          ;

