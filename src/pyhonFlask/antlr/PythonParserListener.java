// Generated from D:/java_projects/WebPythonCompiler/src/pyhonFlask/antlr/PythonParser.g4 by ANTLR 4.13.2
package pyhonFlask.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PythonParser}.
 */
public interface PythonParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(PythonParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(PythonParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PythonParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PythonParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#statementInBlock}.
	 * @param ctx the parse tree
	 */
	void enterStatementInBlock(PythonParser.StatementInBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#statementInBlock}.
	 * @param ctx the parse tree
	 */
	void exitStatementInBlock(PythonParser.StatementInBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#globalIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterGlobalIdentifier(PythonParser.GlobalIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#globalIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitGlobalIdentifier(PythonParser.GlobalIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#route}.
	 * @param ctx the parse tree
	 */
	void enterRoute(PythonParser.RouteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#route}.
	 * @param ctx the parse tree
	 */
	void exitRoute(PythonParser.RouteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void enterImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importStmt}.
	 * @param ctx the parse tree
	 */
	void exitImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#fromImport}.
	 * @param ctx the parse tree
	 */
	void enterFromImport(PythonParser.FromImportContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#fromImport}.
	 * @param ctx the parse tree
	 */
	void exitFromImport(PythonParser.FromImportContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#importElements}.
	 * @param ctx the parse tree
	 */
	void enterImportElements(PythonParser.ImportElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#importElements}.
	 * @param ctx the parse tree
	 */
	void exitImportElements(PythonParser.ImportElementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#if}.
	 * @param ctx the parse tree
	 */
	void enterIf(PythonParser.IfContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#if}.
	 * @param ctx the parse tree
	 */
	void exitIf(PythonParser.IfContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#elif}.
	 * @param ctx the parse tree
	 */
	void enterElif(PythonParser.ElifContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#elif}.
	 * @param ctx the parse tree
	 */
	void exitElif(PythonParser.ElifContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#else}.
	 * @param ctx the parse tree
	 */
	void enterElse(PythonParser.ElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#else}.
	 * @param ctx the parse tree
	 */
	void exitElse(PythonParser.ElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#while}.
	 * @param ctx the parse tree
	 */
	void enterWhile(PythonParser.WhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#while}.
	 * @param ctx the parse tree
	 */
	void exitWhile(PythonParser.WhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#for}.
	 * @param ctx the parse tree
	 */
	void enterFor(PythonParser.ForContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#for}.
	 * @param ctx the parse tree
	 */
	void exitFor(PythonParser.ForContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void enterClassDef(PythonParser.ClassDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 */
	void exitClassDef(PythonParser.ClassDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void enterInheritance(PythonParser.InheritanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#inheritance}.
	 * @param ctx the parse tree
	 */
	void exitInheritance(PythonParser.InheritanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(PythonParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(PythonParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#blockCondition}.
	 * @param ctx the parse tree
	 */
	void enterBlockCondition(PythonParser.BlockConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#blockCondition}.
	 * @param ctx the parse tree
	 */
	void exitBlockCondition(PythonParser.BlockConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDef(PythonParser.FunctionDefContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#functionDef}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDef(PythonParser.FunctionDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#blockFun}.
	 * @param ctx the parse tree
	 */
	void enterBlockFun(PythonParser.BlockFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#blockFun}.
	 * @param ctx the parse tree
	 */
	void exitBlockFun(PythonParser.BlockFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#functionContent}.
	 * @param ctx the parse tree
	 */
	void enterFunctionContent(PythonParser.FunctionContentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#functionContent}.
	 * @param ctx the parse tree
	 */
	void exitFunctionContent(PythonParser.FunctionContentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#ifInFun}.
	 * @param ctx the parse tree
	 */
	void enterIfInFun(PythonParser.IfInFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#ifInFun}.
	 * @param ctx the parse tree
	 */
	void exitIfInFun(PythonParser.IfInFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#elifInFun}.
	 * @param ctx the parse tree
	 */
	void enterElifInFun(PythonParser.ElifInFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#elifInFun}.
	 * @param ctx the parse tree
	 */
	void exitElifInFun(PythonParser.ElifInFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#elseInFun}.
	 * @param ctx the parse tree
	 */
	void enterElseInFun(PythonParser.ElseInFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#elseInFun}.
	 * @param ctx the parse tree
	 */
	void exitElseInFun(PythonParser.ElseInFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#whileInFun}.
	 * @param ctx the parse tree
	 */
	void enterWhileInFun(PythonParser.WhileInFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#whileInFun}.
	 * @param ctx the parse tree
	 */
	void exitWhileInFun(PythonParser.WhileInFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#forInFun}.
	 * @param ctx the parse tree
	 */
	void enterForInFun(PythonParser.ForInFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#forInFun}.
	 * @param ctx the parse tree
	 */
	void exitForInFun(PythonParser.ForInFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#blockConditionInFun}.
	 * @param ctx the parse tree
	 */
	void enterBlockConditionInFun(PythonParser.BlockConditionInFunContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#blockConditionInFun}.
	 * @param ctx the parse tree
	 */
	void exitBlockConditionInFun(PythonParser.BlockConditionInFunContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#parameter}.
	 * @param ctx the parse tree
	 */
	void enterParameter(PythonParser.ParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#parameter}.
	 * @param ctx the parse tree
	 */
	void exitParameter(PythonParser.ParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void enterArgument(PythonParser.ArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 */
	void exitArgument(PythonParser.ArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#return}.
	 * @param ctx the parse tree
	 */
	void enterReturn(PythonParser.ReturnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#return}.
	 * @param ctx the parse tree
	 */
	void exitReturn(PythonParser.ReturnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentID}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentID(PythonParser.AssignmentIDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentID}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentID(PythonParser.AssignmentIDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentOpj}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOpj(PythonParser.AssignmentOpjContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentOpj}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOpj(PythonParser.AssignmentOpjContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AssignmentListIdx}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentListIdx(PythonParser.AssignmentListIdxContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AssignmentListIdx}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentListIdx(PythonParser.AssignmentListIdxContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IdentifierAttribute}
	 * labeled alternative in {@link PythonParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierAttribute(PythonParser.IdentifierAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IdentifierAttribute}
	 * labeled alternative in {@link PythonParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierAttribute(PythonParser.IdentifierAttributeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListIndexAttribute}
	 * labeled alternative in {@link PythonParser#attribute}.
	 * @param ctx the parse tree
	 */
	void enterListIndexAttribute(PythonParser.ListIndexAttributeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListIndexAttribute}
	 * labeled alternative in {@link PythonParser#attribute}.
	 * @param ctx the parse tree
	 */
	void exitListIndexAttribute(PythonParser.ListIndexAttributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(PythonParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(PythonParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(PythonParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(PythonParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(PythonParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(PythonParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#set}.
	 * @param ctx the parse tree
	 */
	void enterSet(PythonParser.SetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#set}.
	 * @param ctx the parse tree
	 */
	void exitSet(PythonParser.SetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void enterDictionary(PythonParser.DictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dictionary}.
	 * @param ctx the parse tree
	 */
	void exitDictionary(PythonParser.DictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#dictionaryElement}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryElement(PythonParser.DictionaryElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#dictionaryElement}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryElement(PythonParser.DictionaryElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#listIndex}.
	 * @param ctx the parse tree
	 */
	void enterListIndex(PythonParser.ListIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#listIndex}.
	 * @param ctx the parse tree
	 */
	void exitListIndex(PythonParser.ListIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Add}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAdd(PythonParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAdd(PythonParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOr(PythonParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOr(PythonParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BracketExprtion}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBracketExprtion(PythonParser.BracketExprtionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BracketExprtion}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBracketExprtion(PythonParser.BracketExprtionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AttributeAccess}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAttributeAccess(PythonParser.AttributeAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AttributeAccess}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAttributeAccess(PythonParser.AttributeAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DictionaryExp}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDictionaryExp(PythonParser.DictionaryExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DictionaryExp}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDictionaryExp(PythonParser.DictionaryExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListIndexExp}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListIndexExp(PythonParser.ListIndexExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListIndexExp}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListIndexExp(PythonParser.ListIndexExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterEqual}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterEqual(PythonParser.GreaterEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterEqual}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterEqual(PythonParser.GreaterEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessThan(PythonParser.LessThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessThan(PythonParser.LessThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PythonParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PythonParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNegative(PythonParser.NegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNegative(PythonParser.NegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumber(PythonParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumber(PythonParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterBool(PythonParser.BoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitBool(PythonParser.BoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SetExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSetExpr(PythonParser.SetExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SetExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSetExpr(PythonParser.SetExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThan(PythonParser.GreaterThanContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThan(PythonParser.GreaterThanContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqual(PythonParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqual(PythonParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Multipication}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultipication(PythonParser.MultipicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Multipication}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultipication(PythonParser.MultipicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Division}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivision(PythonParser.DivisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivision(PythonParser.DivisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringValue(PythonParser.StringValueContext ctx);
	/**
	 * Exit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringValue(PythonParser.StringValueContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSub(PythonParser.SubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSub(PythonParser.SubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMod(PythonParser.ModContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMod(PythonParser.ModContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqual(PythonParser.NotEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqual(PythonParser.NotEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code LessEqual}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLessEqual(PythonParser.LessEqualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code LessEqual}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLessEqual(PythonParser.LessEqualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FunctionCallExp}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExp(PythonParser.FunctionCallExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FunctionCallExp}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExp(PythonParser.FunctionCallExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNot(PythonParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNot(PythonParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterArrayExpr(PythonParser.ArrayExprContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitArrayExpr(PythonParser.ArrayExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ListIdxAttributeAccess}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterListIdxAttributeAccess(PythonParser.ListIdxAttributeAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ListIdxAttributeAccess}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitListIdxAttributeAccess(PythonParser.ListIdxAttributeAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAnd(PythonParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAnd(PythonParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code None}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNone(PythonParser.NoneContext ctx);
	/**
	 * Exit a parse tree produced by the {@code None}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNone(PythonParser.NoneContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Power}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPower(PythonParser.PowerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPower(PythonParser.PowerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PythonParser#functionAccess}.
	 * @param ctx the parse tree
	 */
	void enterFunctionAccess(PythonParser.FunctionAccessContext ctx);
	/**
	 * Exit a parse tree produced by {@link PythonParser#functionAccess}.
	 * @param ctx the parse tree
	 */
	void exitFunctionAccess(PythonParser.FunctionAccessContext ctx);
}