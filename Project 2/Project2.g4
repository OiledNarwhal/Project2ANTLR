grammar Project2;


exprList: topExpr ( ';' topExpr)* ';'? ; 

varDef: VAR ID '=' expr;

topExpr: expr
;

expr: 

    //Regular Math
    el=expr op='*' er=expr
    | el=expr op='/' er=expr
    | el=expr op='+' er=expr
    | el=expr op='-' er=expr
    | el=expr op='%' er=expr
    | el=expr op='^' er=expr
    | op= '++' ID
    | op= '--' ID
    | ID op= '++'
    | ID op= '--'


    //Boolean Operations
    | el=expr op='&&' er=expr
    | el=expr op='||' er=expr
    | op='!' e=expr

    //Square Root and Read
    | op='sqrt(' e=expr ')'

    //Math Library Functions
    | op= 's(' e=expr ')'
    | op= 'c(' e=expr ')'
    | op= 'l(' e=expr ')'
    | op= 'e(' e=expr ')'

    //Statements Dunno How to Work it.
    | op= 'print(' e=expr ')'
    | op= 'read()'

    //Variable Recognition
    | ID '=' e=expr

    //Others
    | DBL
    | ID
    | COMMENT       
    | '(' e=expr ')'    
    ;

VAR: 'var';  // keyword
ID: [_A-Za-z]+;
DBL: '-'?[0-9]+'.'?[0-9]*;
COMMENT: '/*'~[\r\n]*'*/';
WS : [ \t\r\n]+ -> skip ;