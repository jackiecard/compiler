grammar exemplo;

start : func* EOF
      ;

func : 'def' name=ID '(' args? ')'  statms 
     ;

args : ID (',' ID)*
     ;

statms : '{' statm* '}'
       | statm
       ;

statm : ID '=' expr ';'                                           # assign
      | 'print' expr ';'                                          # print
      | 'if' cond=expr then=statms ('else' otherwise=statms)?     # if
      | 'while' cond=expr statms                                  # while
      | 'for' '(' statms cond=expr? ';' expr? ')' statms          # for
      | 'switch' '(' expr ')' statms                              # switch
      | 'case' expr ':' statms 'break;'                           # case
      | 'default' ':' statms 'break;'                             # default
      | 'return' cond=expr '?' exprs ':' exprs ';'                # ternary
      | 'return' expr ';'                                         # return
      ;

call : name=ID '(' exprs? ')' 
     ;

exprs : expr (',' expr)*
      ;

expr : left=summ (op=('>'|'<'|'>='|'<='|'=='|'!=') right=expr)*
     ;

summ : left=mult (op=('+'|'-') right=summ)*
     ;

mult : left=atom (op=('*'|'/') right=mult)* 
     ;

atom : '(' expr ')'
     | number
     | STRING
     | ID
     | 'input'
     | call
     ;

INPUT : 'input';
ELSE : 'else';
ID : [a-zA-Z]+[0-9a-zA-Z]*;
WS : [ \r\n\t]+ -> skip;
number: INT | FLOAT;
INT : [0-9]+ ;
FLOAT : INT ('.' INT)? ;
STRING : '"' (~'"')* '"' ;