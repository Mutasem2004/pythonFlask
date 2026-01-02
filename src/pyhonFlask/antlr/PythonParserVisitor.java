// Generated from D:/java_projects/WebPythonCompiler/src/pyhonFlask/antlr/PythonParser.g4 by ANTLR 4.13.2
package pyhonFlask.antlr;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PythonParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PythonParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PythonParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(PythonParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PythonParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#statementInBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementInBlock(PythonParser.StatementInBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#globalIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalIdentifier(PythonParser.GlobalIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoute(PythonParser.RouteContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#importStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStmt(PythonParser.ImportStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#fromImport}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromImport(PythonParser.FromImportContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#importElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportElements(PythonParser.ImportElementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf(PythonParser.IfContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#elif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElif(PythonParser.ElifContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#else}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse(PythonParser.ElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#while}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile(PythonParser.WhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor(PythonParser.ForContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#classDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassDef(PythonParser.ClassDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#inheritance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInheritance(PythonParser.InheritanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(PythonParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#blockCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockCondition(PythonParser.BlockConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#functionDef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDef(PythonParser.FunctionDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#blockFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockFun(PythonParser.BlockFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#functionContent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionContent(PythonParser.FunctionContentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#ifInFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfInFun(PythonParser.IfInFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#elifInFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifInFun(PythonParser.ElifInFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#elseInFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElseInFun(PythonParser.ElseInFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#whileInFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileInFun(PythonParser.WhileInFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#forInFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForInFun(PythonParser.ForInFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#blockConditionInFun}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockConditionInFun(PythonParser.BlockConditionInFunContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(PythonParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#argument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgument(PythonParser.ArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#return}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn(PythonParser.ReturnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentID}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentID(PythonParser.AssignmentIDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentOpj}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOpj(PythonParser.AssignmentOpjContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AssignmentListIdx}
	 * labeled alternative in {@link PythonParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentListIdx(PythonParser.AssignmentListIdxContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IdentifierAttribute}
	 * labeled alternative in {@link PythonParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierAttribute(PythonParser.IdentifierAttributeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListIndexAttribute}
	 * labeled alternative in {@link PythonParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListIndexAttribute(PythonParser.ListIndexAttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(PythonParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#print}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint(PythonParser.PrintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(PythonParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet(PythonParser.SetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionary(PythonParser.DictionaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#dictionaryElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryElement(PythonParser.DictionaryElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#listIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListIndex(PythonParser.ListIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Add}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd(PythonParser.AddContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(PythonParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BracketExprtion}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracketExprtion(PythonParser.BracketExprtionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AttributeAccess}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttributeAccess(PythonParser.AttributeAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DictionaryExp}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDictionaryExp(PythonParser.DictionaryExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListIndexExp}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListIndexExp(PythonParser.ListIndexExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterEqual}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterEqual(PythonParser.GreaterEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessThan}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessThan(PythonParser.LessThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Identifier}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PythonParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Negative}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegative(PythonParser.NegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumber(PythonParser.NumberContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Bool}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool(PythonParser.BoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SetExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExpr(PythonParser.SetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GreaterThan}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThan(PythonParser.GreaterThanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Equal}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(PythonParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Multipication}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipication(PythonParser.MultipicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Division}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivision(PythonParser.DivisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code StringValue}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(PythonParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Sub}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSub(PythonParser.SubContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Mod}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMod(PythonParser.ModContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NotEqual}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqual(PythonParser.NotEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LessEqual}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLessEqual(PythonParser.LessEqualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FunctionCallExp}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExp(PythonParser.FunctionCallExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(PythonParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ArrayExpr}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayExpr(PythonParser.ArrayExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ListIdxAttributeAccess}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListIdxAttributeAccess(PythonParser.ListIdxAttributeAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(PythonParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code None}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNone(PythonParser.NoneContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Power}
	 * labeled alternative in {@link PythonParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPower(PythonParser.PowerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PythonParser#functionAccess}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionAccess(PythonParser.FunctionAccessContext ctx);
}