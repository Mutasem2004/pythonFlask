lexer grammar PythonLexer;

tokens { INDENT, DEDENT }

@header {
    import org.pyhonFlask.antlr.v4.runtime.CommonToken;
    import java.util.Stack;
    import java.util.LinkedList;
    import java.util.Queue;
}

@members {
    Stack<Integer> indentStack = new Stack<>();
    Queue<Token> tokenQueue = new LinkedList<>();
    boolean atStartOfLine = true;
    int opened = 0;

    { indentStack.push(0); }

    @Override
    public Token nextToken() {
        if (!tokenQueue.isEmpty()) return tokenQueue.poll();

        Token next = super.nextToken();
        int type = next.getType();


        if (type == LBRACK || type == LSBRACK || type == LKBRACK) {
            opened++;
        } else if (type == RBRACK || type == RSBRACK || type == RKBRACK) {
            opened--;
        }


        if (opened > 0 && (type == NEWLINE || type == WS)) {
            return nextToken();
        }


        if (atStartOfLine) {
            if (type == NEWLINE) {

                return next;
            }

            atStartOfLine = false;

            int indent = 0;
            Token contentToken = next;

            if (type == WS) {
                String ws = next.getText();
                for (char c : ws.toCharArray()) indent += (c == '\t' ? 4 : 1);
                contentToken = super.nextToken();
                if (contentToken.getType() == NEWLINE) {
                    atStartOfLine = true;
                    return contentToken;
                }
            } else {
                indent = 0;
            }

            int previousIndent = indentStack.peek();


            if (indent > previousIndent) {
                indentStack.push(indent);
                tokenQueue.add(createToken(INDENT, contentToken));
            }

            else if (indent < previousIndent) {
                while (indent < indentStack.peek()) {
                    indentStack.pop();
                    tokenQueue.add(createToken(DEDENT, contentToken));
                }
            }

            tokenQueue.add(contentToken);
            return tokenQueue.poll();
        }


        if (type == NEWLINE) {
            atStartOfLine = true;
        }


        if (type == WS) return nextToken();

        return next;
    }

    private CommonToken createToken(int type, Token origin) {
        CommonToken t = new CommonToken(type, type == INDENT ? "INDENT" : "DEDENT");
        t.setLine(origin.getLine());
        t.setCharPositionInLine(origin.getCharPositionInLine());
        return t;
    }
}


DEF   : 'def';
RETURN: 'return';
IF    : 'if';
ELIF  : 'elif';
ELSE  : 'else';
WHILE : 'while';
FOR   : 'for';
IN    : 'in';
PRINT : 'print';
TRUE  : 'True';
FALSE : 'False';
NONE  : 'None';
AND   : 'and';
OR    : 'or';
NOT   : 'not';

LBRACK : '(';
RBRACK : ')';
LSBRACK : '[';
RSBRACK : ']';
LKBRACK : '{';
RKBRACK : '}';
COMMA  : ',';
ASSIGN : '=';
COLON  : ':';



POW   : '**';
MULT  : '*';
DIV   : '/';
MOD   : '%';
PLUS  : '+';
MINUS : '-';
EQ    : '==';
NEQ   : '!=';
GT    : '>';
LT    : '<';
GTE   : '>=';
LTE   : '<=';
PLUSEQ  : '+=';
MINUSEQ : '-=';
MULTEQ  : '*=';
DIVEQ   : '/=';
MODEQ   : '%=';
POWEQ   : '**=';
CONTINUE : 'continue';
BREAK : 'break';

CLASS  : 'class';
DOT    : '.';
GLOBAL : 'global';
A : '@';
IMPORT : 'import';
FROM : 'from';

ID : [a-zA-Z_] [a-zA-Z0-9_]*;


NUMBER
    : '0'
    | '-'?[1-9][0-9]* '.' [0-9]+
    | '-'?[1-9][0-9]*
    ;

STRING
    : '"""' ( ~'"' | '"' ~'"' | '""' ~'"' )* '"""'
    | '\'' ( ~['\\] | ESC )* '\''
    | '"' ( ~["\\] | ESC )* '"'
    ;

fragment ESC
    : '\\' [bfnrt"'\\]
    ;




NEWLINE : [\r\n]+ ;
WS : [ \t]+ ;
COMMENT : '#' ~[\r\n]* -> skip;

