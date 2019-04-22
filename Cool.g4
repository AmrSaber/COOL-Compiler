grammar Cool;

program:
    classDefiniton*
    ;

// class definition
classDefiniton:
    CLASS ID (INHERITS (type|ID) | ) OPENING_CURLY_BRACKET
        variableDeclaration*
        featureDefinition*
    CLOSING_CURLY_BRACKET SEMICOLON;

// method definition
featureDefinition:
    ID OPENING_BRACKET (formalsList|) CLOSING_BRACKET COLON (ID|type) OPENING_CURLY_BRACKET
        expr
    CLOSING_CURLY_BRACKET SEMICOLON
  | ID COLON (type|ID) (OP_ASSIGNMENT expr |) SEMICOLON;


// statements
expr: term expr_;

expr_: (OP_ADD|OP_SUB|RELOP_EQ|RELOP_LE|RELOP_LT) term expr_ | ;

term: value term_;
term_: (OP_MUL|OP_DIV) value term_|;

value: (assignmentStmt
   | featureCall
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
   | SELF
   | ID
   | NUM
   | LITERAL
   | TRUE
   | FALSE) (memberAccess_ |)
   ;

assignmentStmt:
    ID OP_ASSIGNMENT expr
    ;

featureCall:
    ID OPENING_BRACKET (exprList|) CLOSING_BRACKET
    ;

memberAccess_ : (AT (type|ID) | ) DOT (featureCall| ID) memberAccess_ | ;

memberAcess:
    ID (AT (type|ID) | ) DOT (featureCall| ID)
    ;

ifStmt :
    IF expr THEN
        expr
    (ELSE
        expr | )
    FI
    ;

caseStmt:
    CASE expr OF
        (ID COLON (type|ID) '=>' expr SEMICOLON)+
    ESAC
    ;

letStmt:
    LET (ID COLON (type|ID) OP_ASSIGNMENT expr?)+ IN
        expr
    ;

whileStmt:
    WHILE expr LOOP
        expr
    POOL
    ;

block:
    OPENING_CURLY_BRACKET
        (expr SEMICOLON)+
    CLOSING_CURLY_BRACKET
    ;

newObject:
    NEW (type|ID)
    ;

isvoidExpr:
    ISVOID expr
    ;

invrseExpr:
    OP_INV expr
    ;

notExpr:
    OP_NOT expr
    ;

exprList: expr exprList_;
exprList_: COMMA expr exprList_ |;

formal: ID COLON (type|ID);
formalsList: formal formalsList_;
formalsList_: COMMA formal formalsList_ | ;


variableDeclaration:ID COLON (type|ID) ( OP_ASSIGNMENT expr |) SEMICOLON;



// TERMINALS

// keywords
// OOP
CLASS: C L A S S;
INHERITS: I N H E R I T S;
NEW: N E W;
SELF_TYPE: S E L F '_' T Y P E;
SELF: S E L F;


// types
type:INT
    | STRING
    | VOID
    | BOOL
    | IO
    | SELF_TYPE;

INT: I N T;
STRING: S T R I N G;
VOID: V O I D;
BOOL: B O O L;
TRUE: 't' R U E;
FALSE: 'f' A L S E;
ISVOID: I S V O I D;
IO: I O;
// conditional
IF: I F;
THEN: T H E N;
ELSE: E L S E;
FI: F I;

CASE: C A S E;
OF: O F;
ESAC: E S A C;

// loops
WHILE: W H I L E;
LOOP: L O O P;
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
SINGLELINECOMMENT  : '--' .*? '\n' -> channel(HIDDEN) ;
BlockComment: '*' (BlockComment|.)*? '*' -> channel(HIDDEN);

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