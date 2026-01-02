package pyhonFlask.Visitor_Py;

import pyhonFlask.AST_PY.*;
import pyhonFlask.AST_PY.expression.*;
import pyhonFlask.AST_PY.expression.Number;
import pyhonFlask.SymbolTable.SymbolTable;
import pyhonFlask.antlr.PythonParser;
import pyhonFlask.antlr.PythonParserBaseVisitor;

import java.util.ArrayList;
import java.util.List;

public class StatementVisitor extends PythonParserBaseVisitor<Statement> {

    SymbolTable symTab = new SymbolTable();
    private final List<String> temporaryParameters = new ArrayList<>();

    @Override
    public Statement visitStatement(PythonParser.StatementContext ctx) {
            return visit(ctx.getChild(0));
    }

    @Override
    public Statement visitBlock(PythonParser.BlockContext ctx) {
        int line = ctx.getStart().getLine();
        symTab.pushScope();
        Block block = new Block(line);
        for(int j=0;j<ctx.statementInBlock().size();j++){
            block.add(visit(ctx.statementInBlock(j)));
        }
        symTab.popScope();
        return block;
    }

    @Override
    public Statement visitBlockCondition(PythonParser.BlockConditionContext ctx) {
        int line = ctx.getStart().getLine();
        BlockCondition blockCondition = new BlockCondition(line);
        for(int j=0;j<ctx.statementInBlock().size();j++){
            blockCondition.add(visit(ctx.statementInBlock(j)));
        }
        return blockCondition;
    }

    @Override
    public Statement visitIf(PythonParser.IfContext ctx) {
        int line = ctx.getStart().getLine();
        Statement condition = visit(ctx.expression());
        BlockCondition body = (BlockCondition) visit(ctx.blockCondition());
        Else elseStatement = null;
        if (ctx.else_() != null) {
            elseStatement = (Else) visit(ctx.else_());
        }

        If ifStatement = new If(condition,body,elseStatement,line);
        for(int i = 0;i<ctx.elif().size();i++){
            ifStatement.addElifStatement((Elif) visit(ctx.elif(i)));
        }
        return ifStatement;
    }

    @Override
    public Statement visitElif(PythonParser.ElifContext ctx) {
        int line   = ctx.getStart().getLine();
        Statement condition = visit(ctx.expression());
        BlockCondition body = (BlockCondition) visit(ctx.blockCondition());
        return new  Elif(condition,body,line);
    }

    @Override
    public Statement visitElse(PythonParser.ElseContext ctx) {
        int line = ctx.getStart().getLine();
        BlockCondition body = (BlockCondition) visit(ctx.blockCondition());
        return new Else(body,line);
    }

    @Override
    public Statement visitWhile(PythonParser.WhileContext ctx) {
        int line = ctx.getStart().getLine();
        Statement condition = visit(ctx.expression());
        Block block = (Block) visit(ctx.block());
        return new While(condition,block,line);
    }

    @Override
    public Statement visitFor(PythonParser.ForContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.ID().getText(),line);
        Statement statement = visit(ctx.expression());
        Block block = (Block) visit(ctx.block());
        return new For(id,statement,block,line);
    }

    @Override
    public Statement visitFunctionDef(PythonParser.FunctionDefContext ctx) {
        int line = ctx.start.getLine();
        Identifier name = new Identifier(ctx.ID().getText(),line);
        symTab.insert(ctx.ID().getText());
        for (int i = 0 ;i<ctx.parameter().size();i++){
            temporaryParameters.add(ctx.parameter(i).getText());
        }
        BlockFun body = (BlockFun) visit(ctx.blockFun());
        FunctionDef function = new FunctionDef(name,body,line);
        for (int i = 0 ;i<ctx.parameter().size();i++){
            function.addParameter((Parameter) visit(ctx.parameter(i)));
        }
        return  function;
    }

    @Override
    public Statement visitParameter(PythonParser.ParameterContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.ID().getText(),line);
        Statement expression = null;
        if (ctx.expression() != null) {
            expression = visit(ctx.expression());
        }

        return new Parameter(id, expression,line);
    }

    @Override
    public Statement visitReturn(PythonParser.ReturnContext ctx) {
        int line = ctx.start.getLine();
        Return returnStatement = new Return(line);
        for (int i=0;i<ctx.expression().size();i++) {
            returnStatement.addExpression(visit(ctx.expression(i)));
        }
        return returnStatement;
    }


//    @Override
//    public Statement visitAssignmentID(PythonParser.AssignmentContext ctx) {
//        Identifier id = new Identifier(ctx.ID().getText());
//        Statement expression = visit(ctx.expression());
//        return new Assignment(id, expression);
//    }


    @Override
    public Statement visitPrint(PythonParser.PrintContext ctx) {
        int line = ctx.getStart().getLine();
        Print print = new Print(line);
        for (int i=0;i<ctx.expression().size();i++) {
            print.addExpresion(visit(ctx.expression(i)));
        }
        return print;
    }

    @Override
    public Statement visitArray(PythonParser.ArrayContext ctx) {
        int line =  ctx.start.getLine();
        Array array = new Array(line);
        for (int i=0;i<ctx.expression().size();i++) {
            array.addExpression(visit(ctx.expression(i)));
        }
        return array;
    }

    @Override
    public Statement visitAdd(PythonParser.AddContext ctx) {
        Statement left = visit(ctx.getChild(0));
        Statement right = visit(ctx.getChild(2));
        int line = ctx.getStart().getLine();
        return new Add(left, right,line);
    }

    @Override
    public Statement visitOr(PythonParser.OrContext ctx) {
        int line = ctx.start.getLine();
        Statement left = visit(ctx.getChild(0));
        Statement right = visit(ctx.getChild(2));
        return new Or(left, right,line);
    }

    @Override
    public Statement visitBracketExprtion(PythonParser.BracketExprtionContext ctx) {
        int line = ctx.start.getLine();
        Statement expression = visit(ctx.getChild(1));
        return new BracketExpression(expression,line);
    }

    @Override
    public Statement visitGreaterEqual(PythonParser.GreaterEqualContext ctx) {
        int line = ctx.start.getLine();
        Statement left = visit(ctx.getChild(0));
        Statement right = visit(ctx.getChild(2));
        return new GreaterEqual(left, right,line);
    }

    @Override
    public Statement visitLessThan(PythonParser.LessThanContext ctx) {
        int line = ctx.start.getLine();
        Statement left = visit(ctx.getChild(0));
        Statement right = visit(ctx.getChild(2));
        return new LessThan(left, right,line);
    }

    @Override
    public Statement visitIdentifier(PythonParser.IdentifierContext ctx) {
        int line = ctx.start.getLine();
        String id = ctx.ID().getText();
        if (symTab.lookup(ctx.ID().getText()) == null) {
            System.out.println("Error: symbol '" +ctx.ID().getText() + "' not defined!  line:"+line);
        }
        return new Identifier(id,line);
    }

    @Override
    public Statement visitNegative(PythonParser.NegativeContext ctx) {
        Statement expression = visit(ctx.getChild(0));
        return new Negative(expression);
    }

    @Override
    public Statement visitNumber(PythonParser.NumberContext ctx) {
        int line = ctx.getStart().getLine();
        return new Number(ctx.NUMBER().getText(),line);
    }

    @Override
    public Statement visitBool(PythonParser.BoolContext ctx) {
        int line =  ctx.getStart().getLine();
        String value = ctx.getChild(0).getText();
        boolean boolValue = Boolean.parseBoolean(value);
        return new Bool(boolValue,line);
    }

    @Override
    public Statement visitGreaterThan(PythonParser.GreaterThanContext ctx) {
        int line = ctx.start.getLine();
        Statement left = visit(ctx.getChild(0));
        Statement right = visit(ctx.getChild(2));
        return new GreaterThan(left, right,line);
    }

    @Override
    public Statement visitEqual(PythonParser.EqualContext ctx) {
        int line = ctx.start.getLine();
        Statement left = visit(ctx.getChild(0));
        Statement right = visit(ctx.getChild(2));
        return new Equal(left, right,line);
    }

    @Override
    public Statement visitMultipication(PythonParser.MultipicationContext ctx) {
        Statement left = visit(ctx.getChild(0));
        Statement right = visit(ctx.getChild(2));
        int line =  ctx.getStart().getLine();
        return new Multipication(left, right, line);
    }

    @Override
    public Statement visitDivision(PythonParser.DivisionContext ctx) {
        int line = ctx.start.getLine();
        Statement left = visit(ctx.getChild(0));
        Statement right = visit(ctx.getChild(2));
        return new Division(left, right,line);
    }

    @Override
    public Statement visitFunctionCall(PythonParser.FunctionCallContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.ID().getText(),line);

        if (symTab.lookup(ctx.ID().getText()) == null) {
            System.out.println("Error: symbol '" +ctx.ID().getText() + "' not defined!  line:"+line);
        }
        FunctionCall functionCall = new FunctionCall(id,line);
        for (int i = 0; i < ctx.argument().size(); i++) {
            if(ctx.argument(i)!=null) {
                functionCall.addArgament(visit(ctx.argument(i)));
            }
        }
        return functionCall ;
    }

    @Override
    public Statement visitStringValue(PythonParser.StringValueContext ctx) {
        String stringValue = ctx.STRING().getText();
        int line = ctx.start.getLine();
        return new StringValue(stringValue,line);
    }

    @Override
    public Statement visitSub(PythonParser.SubContext ctx) {
        int line = ctx.start.getLine();
        Statement left = visit(ctx.getChild(0));
        Statement right = visit(ctx.getChild(2));
        return new Sub(left, right,line);
    }

    @Override
    public Statement visitMod(PythonParser.ModContext ctx) {
        int line = ctx.start.getLine();
        Statement left = visit(ctx.getChild(0));
        Statement right = visit(ctx.getChild(2));
        return new Mod(left, right,line);
    }

    @Override
    public Statement visitNotEqual(PythonParser.NotEqualContext ctx) {
        int line = ctx.start.getLine();
        Statement left = visit(ctx.getChild(0));
        Statement right = visit(ctx.getChild(2));
        return new NotEqual(left, right,line);
    }

    @Override
    public Statement visitLessEqual(PythonParser.LessEqualContext ctx) {
        int line = ctx.start.getLine();
        Statement left = visit(ctx.getChild(0));
        Statement right = visit(ctx.getChild(2));
        return new LessEqual(left, right,line);
    }


    @Override
    public Statement visitArrayExpr(PythonParser.ArrayExprContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Statement visitAnd(PythonParser.AndContext ctx) {
        int line = ctx.start.getLine();
        Statement left = visit(ctx.getChild(0));
        Statement right = visit(ctx.getChild(2));
        return new And(left, right,line);
    }

    @Override
    public Statement visitListIndex(PythonParser.ListIndexContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.ID().getText(),line);
        if (symTab.lookup(ctx.ID().getText()) == null) {
            System.out.println("Error: symbol '" + id.toString() + "' not defined!  line:"+line);
        }
        Statement index = visit(ctx.getChild(2));
        return new ListIndex(id, index,line);
    }

    @Override
    public Statement visitNone(PythonParser.NoneContext ctx) {
        return new None();
    }

    @Override
    public Statement visitPower(PythonParser.PowerContext ctx) {
        int line = ctx.start.getLine();
        Statement left = visit(ctx.getChild(0));
        Statement right = visit(ctx.getChild(2));
        return new Power(left, right, line);
    }

    @Override
    public Statement visitBlockFun(PythonParser.BlockFunContext ctx) {
        int line = ctx.start.getLine();
        symTab.pushScope();
        for(String parameter : temporaryParameters){
            symTab.insert(parameter);
        }
        temporaryParameters.clear();
        Return ret = null;
        if(ctx.return_() != null) {
            ret = (Return) visit(ctx.return_());
        }
        BlockFun blockFun = new BlockFun(ret,line);
        for(int j=0;j<ctx.functionContent().size();j++){
            blockFun.add(visit(ctx.functionContent(j)));
        }
        symTab.popScope();
        return blockFun;
    }


    @Override
    public Statement visitBlockConditionInFun(PythonParser.BlockConditionInFunContext ctx) {
        int line = ctx.start.getLine();
        for(String parameter : temporaryParameters){
            symTab.insert(parameter);
        }
        temporaryParameters.clear();
        Return ret = null;
        if(ctx.return_() != null) {
            ret = (Return) visit(ctx.return_());
        }
        BlockConditionInFun blockConditionInFun = new BlockConditionInFun(ret,line);
        for(int j=0;j<ctx.functionContent().size();j++){
            blockConditionInFun.add(visit(ctx.functionContent(j)));
        }
        return blockConditionInFun;
    }

    @Override
    public Statement visitFunctionContent(PythonParser.FunctionContentContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Statement visitIfInFun(PythonParser.IfInFunContext ctx) {
        int line= ctx.start.getLine();
        Statement condition = visit(ctx.expression());
        BlockConditionInFun body = (BlockConditionInFun) visit(ctx.blockConditionInFun());
        ElseInFunction elseStatement = null;
        if (ctx.elseInFun() != null) {
            elseStatement = (ElseInFunction) visit(ctx.elseInFun());
        }

        IfInFunction ifStatement = new IfInFunction(condition,body,elseStatement,line);
        for(int i = 0;i<ctx.elifInFun().size();i++){
            ifStatement.addElifStatement((ElifInFunction) visit(ctx.elifInFun(i)));
        }
        return ifStatement;
    }

    @Override
    public Statement visitElifInFun(PythonParser.ElifInFunContext ctx) {
        int line =  ctx.start.getLine();
        Statement condition = visit(ctx.expression());
        BlockConditionInFun body = (BlockConditionInFun) visit(ctx.blockConditionInFun());
        return new ElifInFunction(condition,body,line);
    }

    @Override
    public Statement visitElseInFun(PythonParser.ElseInFunContext ctx) {
        int line =  ctx.start.getLine();
        BlockConditionInFun body = (BlockConditionInFun) visit(ctx.blockConditionInFun());
        return new ElseInFunction(body,line);
    }

    @Override
    public Statement visitWhileInFun(PythonParser.WhileInFunContext ctx) {
        int line = ctx.start.getLine();
        Statement condition = visit(ctx.expression());
        BlockFun block = (BlockFun) visit(ctx.blockFun());
        return new WhileInFun(condition,block,line);
    }

    @Override
    public Statement visitForInFun(PythonParser.ForInFunContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.ID().getText(),line);
        Statement statement = visit(ctx.expression());
        BlockFun block = (BlockFun) visit(ctx.blockFun());
        return new ForInFun(id,statement,block,line);
    }


    @Override
    public Statement visitClassDef(PythonParser.ClassDefContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.ID().getText(),line);
        symTab.insert(ctx.ID().getText());
        Block body = (Block) visit(ctx.block());
        ClassDef classDef = new ClassDef(id,body,line);
        for (int j = 0; j < ctx.inheritance().size(); j++) {
            classDef.addInheritance((Inheritance) visit(ctx.inheritance(j)));
        }
        return classDef;

    }

    @Override
    public Statement visitInheritance(PythonParser.InheritanceContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.ID().getText(),line);
        return new Inheritance(id,line);
    }

    @Override
    public Statement visitAssignmentID(PythonParser.AssignmentIDContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.ID().getText(),line);
        Statement expression = visit(ctx.expression());
        symTab.insert(ctx.ID().getText());
        symTab.setAttribute(ctx.ID().getText(), "value", expression.toString());
        return new AssignmentID(id, expression,line);
    }

    @Override
    public Statement visitAssignmentOpj(PythonParser.AssignmentOpjContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.getChild(0).getText(),line);
        if (symTab.lookup(ctx.getChild(0).getText()) == null) {
            System.out.println("Error: symbol '" +ctx.getChild(0).getText()+ "' not defined!  line:"+line);
        }
        Statement expression = visit(ctx.expression());
        AssignmentOpj assignmentOpj = new AssignmentOpj(id,expression,line);
        for(int i = 0;i<ctx.attribute().size();i++){
            assignmentOpj.addAttribute(visit(ctx.attribute(i)));
        }
        return assignmentOpj;
    }

    @Override
    public Statement visitAttributeAccess(PythonParser.AttributeAccessContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.ID().getText(),line);
        if (symTab.lookup(ctx.ID().getText()) == null) {
            System.out.println("Error: symbol '" +ctx.ID().getText()+ "' not defined!  line:"+line);
        }
        FunctionAccess functionAccess = null;
        if(ctx.functionAccess() != null) {
            functionAccess = (FunctionAccess) visit(ctx.functionAccess());
        }
        AttributeAccess attributeAccess = new AttributeAccess(id,functionAccess,line);
        for(int i = 0 ; i< ctx.attribute().size();i++){
            attributeAccess.addAttribute(visit(ctx.attribute(i)));
        }
        return attributeAccess;
    }

    @Override
    public Statement visitFunctionAccess(PythonParser.FunctionAccessContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.ID().getText(),line);
        FunctionAccess functionAccess = new FunctionAccess(id,line);
        for (int i = 0; i < ctx.argument().size(); i++) {
            if(ctx.argument(i)!=null) {
                functionAccess.addArgament(visit(ctx.argument(i)));
            }
        }
        return functionAccess ;
    }

    @Override
    public Statement visitFunctionCallExp(PythonParser.FunctionCallExpContext ctx) {
        return visit(ctx.getChild(0));
    }


    @Override
    public Statement visitArgument(PythonParser.ArgumentContext ctx) {
        return  visit(ctx.getChild(0));
    }

    @Override
    public Statement visitDictionary(PythonParser.DictionaryContext ctx) {
        int line = ctx.start.getLine();
        Dictionary dictionary = new Dictionary(line);
        for(int i = 0;i<ctx.dictionaryElement().size();i++){
            dictionary.addElement((DictionaryElement) visit(ctx.dictionaryElement(i)));
        }
        return dictionary;
    }

    @Override
    public Statement visitDictionaryElement(PythonParser.DictionaryElementContext ctx) {
        int line  =  ctx.start.getLine();
        Statement key = visit(ctx.getChild(0));
        Statement value = visit(ctx.getChild(2));
        return new DictionaryElement(key,value,line);
    }

    @Override
    public Statement visitDictionaryExp(PythonParser.DictionaryExpContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Statement visitSet(PythonParser.SetContext ctx) {
        int line = ctx.start.getLine();
        Set set = new Set(line);
        for (int i=0;i<ctx.expression().size();i++) {
            set.addExpression(visit(ctx.expression(i)));
        }
        return set;
    }

    @Override
    public Statement visitSetExpr(PythonParser.SetExprContext ctx) {
        return visit(ctx.getChild(0));
    }

    @Override
    public Statement visitGlobalIdentifier(PythonParser.GlobalIdentifierContext ctx) {
        int line = ctx.start.getLine();
        GlobalIdentifier globalIdentifier = new GlobalIdentifier(line);
        for(int i = 0;i<ctx.ID().size();i++){
            Identifier id = new Identifier(ctx.ID(i).getText(),line);
            symTab.insertGlobal(ctx.ID(i).getText());
            globalIdentifier.addIdentifier(id);
        }
        return globalIdentifier;
    }

    @Override
    public Statement visitListIndexExp(PythonParser.ListIndexExpContext ctx) {
        return visit(ctx.getChild(0));
    }


    @Override
    public Statement visitAssignmentListIdx(PythonParser.AssignmentListIdxContext ctx) {
        int line = ctx.start.getLine();
        ListIndex listIndex = (ListIndex) visit(ctx.listIndex());
        Statement expression = visit(ctx.expression());
        AssignmentListIdx assignmentListIdx = new AssignmentListIdx(listIndex,expression,line);
        for (int i =0;i<ctx.attribute().size();i++){
            assignmentListIdx.addAttribute(visit(ctx.attribute(i)));
        }
        return assignmentListIdx;
    }

    @Override
    public Statement visitIdentifierAttribute(PythonParser.IdentifierAttributeContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.ID().getText(),line);
        return new IdentifierAttribute(id,line);
    }

    @Override
    public Statement visitListIndexAttribute(PythonParser.ListIndexAttributeContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.ID().getText(),line);
        Statement index = visit(ctx.getChild(2));
        return new ListIndexAttribute(id, index,line);
    }

    @Override
    public Statement visitListIdxAttributeAccess(PythonParser.ListIdxAttributeAccessContext ctx) {
        int line = ctx.start.getLine();
        ListIndex id = (ListIndex) visit(ctx.listIndex());
        FunctionAccess functionAccess = null;
        if(ctx.functionAccess() != null) {
            functionAccess = (FunctionAccess) visit(ctx.functionAccess());
        }
        ListIdxAttributeAccess listIdxAttributeAccess = new ListIdxAttributeAccess(id,functionAccess,line);
        for(int i = 0 ; i< ctx.attribute().size();i++){
            listIdxAttributeAccess.addAttribute(visit(ctx.attribute(i)));
        }
        return listIdxAttributeAccess;
    }

    @Override
    public Statement visitNot(PythonParser.NotContext ctx) {
        int line = ctx.start.getLine();
        Statement expression = visit(ctx.expression());
        return new Not(expression,line);
    }

    @Override
    public Statement visitRoute(PythonParser.RouteContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.ID().getText(),line);
        if (symTab.lookup(ctx.ID().getText()) == null) {
            System.out.println("Error: symbol '" +ctx.ID().getText()+ "' not defined!  line:"+line);
        }
        FunctionAccess functionAccess = (FunctionAccess) visit(ctx.functionAccess());
        return new Route(id,functionAccess,line);
    }


    @Override
    public Statement visitImportStmt(PythonParser.ImportStmtContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.ID(0).getText(),line);
        symTab.insert(ctx.ID(0).getText());
        return new ImportStmt(id,line);
    }

    @Override
    public Statement visitFromImport(PythonParser.FromImportContext ctx) {
        int line = ctx.start.getLine();
        Identifier id = new Identifier(ctx.ID(0).getText(),line);
        symTab.insert(ctx.ID(0).getText());
        ImportElemnets importElemnets = (ImportElemnets) visit(ctx.importElements());
        FromImport fromImport = new FromImport(id,importElemnets,line);
        for(int i = 1;i<ctx.ID().size();i++){
            Identifier attribute = new Identifier(ctx.ID(i).getText(),line);
            fromImport.addAttribute(attribute);
        }
        return fromImport;
    }

    @Override
    public Statement visitImportElements(PythonParser.ImportElementsContext ctx) {
        int line = ctx.start.getLine();
        ImportElemnets importElemnets = new ImportElemnets(line);
        for(int i = 0;i<ctx.ID().size();i++){
            symTab.insert(ctx.ID(i).getText());
            Identifier id = new Identifier(ctx.ID(i).getText(),line);
            importElemnets.addAttribute(id);
        }
        return importElemnets;
    }

    @Override
    public Statement visitStatementInBlock(PythonParser.StatementInBlockContext ctx) {
        return visit(ctx.getChild(0));
    }


}
