// Generated from Java8.g4 by ANTLR 4.9.3
package me.tomassetti.examples.MarkupParser;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link Java8Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface Java8Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link Java8Parser#chat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChat(Java8Parser.ChatContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#line}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLine(Java8Parser.LineContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage(Java8Parser.MessageContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(Java8Parser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommand(Java8Parser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#emoticon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmoticon(Java8Parser.EmoticonContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#link}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLink(Java8Parser.LinkContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#color}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColor(Java8Parser.ColorContext ctx);
	/**
	 * Visit a parse tree produced by {@link Java8Parser#mention}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMention(Java8Parser.MentionContext ctx);
}