grammar Cool;

program: classDefiniton*;

// class definition
classDefiniton: CLASS ID (INHERITS type | ) OPENING_CURLY_BRACKET featureDefinition* CLOSING_CURLY_BRACKET;

// method definition
featureDefinition:
    ID OPENING_BRACKET (formalsList|) CLOSING_BRACKET COLON (ID|type) OPENING_CURLY_BRACKET expr CLOSING_CURLY_BRACKET SEMICOLON
    | ID COLON (type|ID) (OP_ASSIGNMENT expr |) SEMICOLON;


// statements
expr: term expr_;

expr_: (OP_ADD|OP_SUB|RELOP_EQ|RELOP_LE|RELOP_LT) term expr_ | ;

term: value term_;
term_: (OP_MUL|OP_DIV) value term_|;

value: assignmentStmt
   | featureCall
   | memberFeatureCall
   | ifStmt
   | caseStmt
   | letStmt
   | whileStmt
   | block
   | newObject
   | isvoidExpr
   | notExpr
   | invrseExpr
   | OPENING_BRACKET expr CLOSING_BRACKET
   | ID
   | NUM
   | LITERAL
   | TRUE
   | FALSE
   ;

assignmentStmt: ID OP_ASSIGNMENT expr;

featureCall: ID OPENING_BRACKET (exprList|) CLOSING_BRACKET;
memberFeatureCall: ID (AT (type|ID) | ) DOT featureCall;

ifStmt : IF expr THEN expr (ELSE expr | ) FI;
caseStmt: CASE expr OF (ID COLON (type|ID) '=>' expr SEMICOLON)+ ESAC;

letStmt: LET (ID COLON (type|ID) OP_ASSIGNMENT expr?)+ IN expr;

whileStmt: WHILE expr LOOP expr POOL;
block: OPENING_CURLY_BRACKET (expr SEMICOLON)+ CLOSING_CURLY_BRACKET;
newObject: NEW (type|ID);
isvoidExpr: ISVOID expr;
invrseExpr: OP_INV expr;
notExpr: OP_NOT expr;


exprList: expr exprList_;
exprList_: COMMA expr exprList_ |;

formal: ID COLON (type|ID);
formalsList: formal formalsList_;
formalsList_: COMMA formal formalsList_ | ;


variableDeclaration:ID COLON (type|ID) SEMICOLON;



// TERMINALS

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
    | BOOL
    | IO
    | SELF_TYPE;

INT: 'Int';
STRING: 'String';
VOID: 'Void';
BOOL: 'Bool';
TRUE: 'true';
FALSE: 'false';
ISVOID: 'isvoid';
IO: I O;
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
POOL:  P O O L;


LET: L E T;
IN: I N;

// operators
OP_ASSIGNMENT: '<-';
OP_ADD: '+';
OP_SUB: '-';
OP_MUL: '*';
OP_DIV: '/';

RELOP_LT: '<';
RELOP_LE: '<=';
RELOP_EQ: '=';

OP_NOT: N O T;
OP_INV: '~';

// SEPARATORS
SEMICOLON: ';';
OPENING_CURLY_BRACKET: '{';
CLOSING_CURLY_BRACKET: '}';
OPENING_BRACKET: '(';
CLOSING_BRACKET: ')';
OPENING_SQUARE_BRACKET: '[';
CLOSING_SQUARE_BRACKET: ']';
COMMA: ',';
COLON: ':';
DOT: '.';
AT: '@';

SINGLELINECOMMENTSTART:'--';

NUM: [+-]? [0-9]+ ('.'[0-9]*)? ([eE] [+-]? [0-9]+)?;
LITERAL: '"' ~["\n\r]* '"';
ID: [a-zA-Z_][a-zA-Z0-9_]*;

WS: [ \t\r\n]+ -> skip;
SINGLELINECOMMENT: SINGLELINECOMMENTSTART[ \t.]*('\n'|EOF) -> skip;
BlockComment: '*'[ \t.]*'*' -> skip;

ErrorChar : .;

fragment A : [aA];
fragment B : [bB];
fragment C : [cC];
fragment D : [dD];
fragment E : [eE];
fragment F : [fF];
fragment G : [gG];
fragment H : [hH];
fragment I : [iI];
fragment J : [jJ];
fragment K : [kK];
fragment L : [lL];
fragment M : [mM];
fragment N : [nN];
fragment O : [oO];
fragment P : [pP];
fragment Q : [qQ];
fragment R : [rR];
fragment S : [sS];
fragment T : [tT];
fragment U : [uU];
fragment V : [vV];
fragment W : [wW];
fragment X : [xX];
fragment Y : [yY];
fragment Z : [zZ];