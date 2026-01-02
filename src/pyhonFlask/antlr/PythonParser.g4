parser grammar PythonParser;

options { tokenVocab=PythonLexer; }

program: (statement  |NEWLINE)* EOF;


statement : globalIdentifier
          | route
          | importStmt
          | fromImport
          | if
          | while
          | for
          | classDef
          | functionDef
          | assignment NEWLINE
          | print NEWLINE
          | expression NEWLINE
          ;





statementInBlock : globalIdentifier
                 | if
                 | while
                 | for
                 | classDef
                 | functionDef
                 | assignment NEWLINE
                 | print NEWLINE
                 | expression NEWLINE
                 ;






globalIdentifier: GLOBAL ID (COMMA ID)* ;






route : A ID DOT functionAccess
      ;





importStmt : IMPORT ID (DOT ID)*
           ;





fromImport : FROM  ID (DOT ID)* IMPORT importElements
           ;





importElements : ID (COMMA ID)*
               ;



if : IF expression COLON blockCondition elif* else?
   ;





elif : ELIF expression COLON blockCondition
     ;





else : ELSE COLON blockCondition
     ;





while : WHILE expression COLON block
      ;



for : FOR ID IN expression COLON block
    ;




classDef : CLASS ID (LBRACK (inheritance (COMMA inheritance)*)? RBRACK)? COLON block
         ;


inheritance : ID
    ;



block : NEWLINE INDENT (NEWLINE* statementInBlock)* NEWLINE* DEDENT
      ;




blockCondition : NEWLINE INDENT (NEWLINE* statementInBlock)* NEWLINE* DEDENT
      ;






functionDef : DEF ID LBRACK (parameter (COMMA parameter)*)? RBRACK COLON blockFun
            ;




blockFun : NEWLINE INDENT (NEWLINE* functionContent)* NEWLINE* (return)? NEWLINE* DEDENT
         ;




functionContent : globalIdentifier
                | ifInFun
                | whileInFun
                | forInFun
                | functionDef
                | assignment NEWLINE
                | print NEWLINE
                | expression NEWLINE
                ;



ifInFun : IF expression COLON blockConditionInFun elifInFun* elseInFun?
        ;



elifInFun : ELIF expression COLON blockConditionInFun
          ;



elseInFun : ELSE COLON blockConditionInFun
          ;




whileInFun : WHILE expression COLON blockFun
           ;





forInFun : FOR ID IN expression COLON blockFun
         ;



blockConditionInFun : NEWLINE INDENT (NEWLINE* functionContent)* NEWLINE* (return)? NEWLINE* DEDENT
      ;




parameter : ID (ASSIGN expression)?
          ;




argument  : expression
          | assignment
          ;




return : RETURN expression? (COMMA expression)*
       ;




assignment : ID ASSIGN expression                                     # AssignmentID
           | ID DOT attribute (DOT attribute)* ASSIGN expression      # AssignmentOpj
           | listIndex (DOT attribute)* ASSIGN expression             # AssignmentListIdx
           ;





attribute : ID                                                # IdentifierAttribute
          | ID LSBRACK expression RSBRACK                     # ListIndexAttribute
          ;




functionCall : ID LBRACK (argument (COMMA argument)*)? RBRACK
             ;





print : PRINT LBRACK (expression (COMMA expression)*)? RBRACK
      ;




array : LSBRACK (expression (COMMA expression)*)? RSBRACK
      ;





set : LKBRACK expression (COMMA expression)* RKBRACK
      ;






dictionary : LKBRACK (dictionaryElement (COMMA dictionaryElement)*)? RKBRACK
           ;





dictionaryElement : expression COLON expression
                  ;




listIndex : ID LSBRACK expression RSBRACK
          ;





expression  : LBRACK expression RBRACK                                 # BracketExprtion
            | listIndex                                                # ListIndexExp
            | functionCall                                             # FunctionCallExp
            | expression POW expression                                # Power
            | MINUS expression                                         # Negative
            | expression MULT expression                               # Multipication
            | expression DIV expression                                # Division
            | expression MOD expression                                # Mod
            | expression PLUS  expression                              # Add
            | expression MINUS expression                              # Sub
            | expression GT  expression                                # GreaterThan
            | expression LT  expression                                # LessThan
            | expression GTE expression                                # GreaterEqual
            | expression LTE expression                                # LessEqual
            | expression EQ  expression                                # Equal
            | expression NEQ expression                                # NotEqual
            | expression AND expression                                # And
            | expression OR expression                                 # Or
            | NOT expression                                           # Not
            | NUMBER                                                   # Number
            | STRING                                                   # StringValue
            | TRUE                                                     # Bool
            | FALSE                                                    # Bool
            | NONE                                                     # None
            | ID                                                       # Identifier
            | array                                                    # ArrayExpr
            | set                                                      # SetExpr
            | dictionary                                               # DictionaryExp
            | ID (DOT attribute)* (DOT functionAccess)?                # AttributeAccess
            | listIndex (DOT attribute)* (DOT functionAccess)?         # ListIdxAttributeAccess
            ;





functionAccess : ID LBRACK (argument (COMMA argument)*)? RBRACK
             ;









