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

statm : ID '=' expr ';'                                      # assign
      | 'print' expr ';'                                          # print
      | 'if' cond=expr then=statms ('else' otherwise=statms)?     # if
      | 'while' cond=expr statms                                  # while
      | 'for' '(' statms cond=expr? ';' expr? ')' statms          #for
      | 'return' expr ';'                                         # return
      ;

call : name=ID '(' exprs? ')' 
     ;

exprs : expr (',' expr)*
      ;

expr : left=summ (op=('>'|'<'|'>='|'<='|'=='|'!=') right=expr)*
      | atom
     ;

summ : left=mult (op=('+'|'-') right=summ)*
     ;

mult : left=atom (op=('*'|'/') right=mult)*
     ;

atom : '(' expr ')'
     | NUMBER
     | STRING
     | ID
     | 'input'
     | call
     ;

INPUT : 'input';
ELSE : 'else';
ID : [a-zA-Z]+[0-9a-zA-Z]*;
WS : [ \r\n\t]+ -> skip;
NUMBER: INT | FLOAT;
INT : [0-9]+ ;
FLOAT : INT ('.' INT)? ;
STRING : '"' (~'"')* '"' ;