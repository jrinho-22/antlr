grammar rules;

/*
 * Lexer Rules
 */

ADD : '+' ;
SUBTRACT : '-' ;
MULTIPLY : '*' ;
DIVIDE_FLOAT : '|' ;
DIVIDE_INT : '/' ;
REMAINDER : '%' ;
EXPONENTIAL : '^' ;
LPAREN : '(' ;
RPAREN : ')' ;

PREV: 'RES';
ARMAZENAR: 'MEM';
INT: [0-9]+;
REAL: '-'? [0-9]+ '.' [0-9]* | '-'? '.' [0-9]+ | '-'? [0-9]+ ;
WS: [ \t\r\f]+ -> skip ;
NEWLINE : '\r'? '\n' ;

/*
 * Parser Rules
 */

program
    : line NEWLINE? (NEWLINE line)*?;

line
    : expression
    | armazenamento_memoria;

num
    : num_inteiro
    | num_real;

num_inteiro
    : INT;

num_real
    : REAL;

last_inputs
    : '(' INT PREV ')';

armazenamento_memoria
    : '(' expression ARMAZENAR ')';

get_armazenamento_memoria
    : ARMAZENAR ;

sign
    : ADD
    | SUBTRACT
    | MULTIPLY
    | DIVIDE_FLOAT
    | DIVIDE_INT
    | REMAINDER
    | EXPONENTIAL ;

expression
    : operation
    | '(' expression expression sign ')'
    | last_inputs
    | get_armazenamento_memoria
    | num;

operation
    : float_division
    | int_division
    | simple_operation;

simple_operation
    : '(' num num sign ')' ;

float_division
    : '(' num_real num_real DIVIDE_FLOAT ')';

int_division
    : '(' num_inteiro num_inteiro DIVIDE_INT ')';