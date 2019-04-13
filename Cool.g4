grammar Cool;

program: variableDeclaration*;

variableDeclaration:ID COLON (type|ID) SEMICOLON;

SingleLineComment:'--' [0-9a-zA-Z]* ('\n'|EOF);
BlockComment:'*' [0-9a-zA-Z]* '*';

// keywords
// OOP
CLASS: 'class';
INHERITS: 'inherits';
NEW: 'new';
SELF_TYPE: 'SELF_TYPE';
SELF: 'self';


// types
type:INT
    | STRING
    | VOID
    | BOOL;
INT: 'Int';
STRING: 'String';
VOID: 'Void';
BOOL: 'Bool';
TRUE: 'true';
FALSE: 'false';
ISVOID: 'isvoid';

// conditional
IF: 'if';
THEN: 'then';
ELSE: 'else';
FI: 'fi';

CASE: 'case';
OF: 'of';
ESAC: 'esac';

// loops
WHILE: 'while';
LOOP: 'loop';
POOL: 'pool';


LET: 'let';
IN: 'in';

// operators
OP_ASSIGNMENT: '<-';
OP_ADD: '+';
OP_SUB: '-';
OP_MUL: '*';
OP_DIV: '/';

RELOP_LT: '<';
RELOP_LE: '<=';
RELOP_EQ: '=';

OP_NOT: 'not';
OP_INV: '~';

// SEPARATORS
SEMICOLON: ';';
FORWARD_CURLY_BRACKET: '{';
BACKWARD_CURLY_BRACKET: '}';
FORWARD_BRACKET: '(';
BACKWARD_BRACKET: ')';
FORWARD_SQUARE_BRACKET: '[';
BACKWARD_SQUARE_BRACKET: ']';
COMMA: ',';
COLON: ':';
DOT: '.';
AT: '@';

NUM: [+-]? [0-9]+ ('.'[0-9]*)? ([eE] [+-]? [0-9]+)?;
LITERAL: '"' ~["\n\r]* '"';
ID: [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\r\n]+ -> skip;

ErrorChar : .;