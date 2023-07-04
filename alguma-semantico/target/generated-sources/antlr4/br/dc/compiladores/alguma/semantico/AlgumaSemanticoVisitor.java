// Generated from br\dc\compiladores\alguma\semantico\AlgumaSemantico.g4 by ANTLR 4.12.0
package br.dc.compiladores.alguma.semantico;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link AlgumaSemanticoParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface AlgumaSemanticoVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#programa}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrograma(AlgumaSemanticoParser.ProgramaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#declaracoes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracoes(AlgumaSemanticoParser.DeclaracoesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#decl_local_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecl_local_global(AlgumaSemanticoParser.Decl_local_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#declaracao_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_local(AlgumaSemanticoParser.Declaracao_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#variavel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariavel(AlgumaSemanticoParser.VariavelContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#identificador}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentificador(AlgumaSemanticoParser.IdentificadorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#dimensao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensao(AlgumaSemanticoParser.DimensaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(AlgumaSemanticoParser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#tipo_basico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico(AlgumaSemanticoParser.Tipo_basicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_basico_ident(AlgumaSemanticoParser.Tipo_basico_identContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#tipo_estendido}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo_estendido(AlgumaSemanticoParser.Tipo_estendidoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#valor_constante}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValor_constante(AlgumaSemanticoParser.Valor_constanteContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#registro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegistro(AlgumaSemanticoParser.RegistroContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#declaracao_global}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracao_global(AlgumaSemanticoParser.Declaracao_globalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#parametro}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametro(AlgumaSemanticoParser.ParametroContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(AlgumaSemanticoParser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#corpo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCorpo(AlgumaSemanticoParser.CorpoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#cmd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmd(AlgumaSemanticoParser.CmdContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#cmdLeia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdLeia(AlgumaSemanticoParser.CmdLeiaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#cmdEscreva}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEscreva(AlgumaSemanticoParser.CmdEscrevaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#cmdSe}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdSe(AlgumaSemanticoParser.CmdSeContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#cmdCaso}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdCaso(AlgumaSemanticoParser.CmdCasoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#cmdPara}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdPara(AlgumaSemanticoParser.CmdParaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdEnquanto(AlgumaSemanticoParser.CmdEnquantoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#cmdFaca}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdFaca(AlgumaSemanticoParser.CmdFacaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdAtribuicao(AlgumaSemanticoParser.CmdAtribuicaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#cmdChamada}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdChamada(AlgumaSemanticoParser.CmdChamadaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#cmdRetorne}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCmdRetorne(AlgumaSemanticoParser.CmdRetorneContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelecao(AlgumaSemanticoParser.SelecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#item_selecao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitItem_selecao(AlgumaSemanticoParser.Item_selecaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#constantes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantes(AlgumaSemanticoParser.ConstantesContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#numero_intervalo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumero_intervalo(AlgumaSemanticoParser.Numero_intervaloContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#op_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_unario(AlgumaSemanticoParser.Op_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_aritmetica(AlgumaSemanticoParser.Exp_aritmeticaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#termo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo(AlgumaSemanticoParser.TermoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#fator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator(AlgumaSemanticoParser.FatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#op1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp1(AlgumaSemanticoParser.Op1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#op2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp2(AlgumaSemanticoParser.Op2Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#op3}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp3(AlgumaSemanticoParser.Op3Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#parcela}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela(AlgumaSemanticoParser.ParcelaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#parcela_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_unario(AlgumaSemanticoParser.Parcela_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_nao_unario(AlgumaSemanticoParser.Parcela_nao_unarioContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#exp_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp_relacional(AlgumaSemanticoParser.Exp_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#op_relacional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_relacional(AlgumaSemanticoParser.Op_relacionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#expressao}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressao(AlgumaSemanticoParser.ExpressaoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#termo_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermo_logico(AlgumaSemanticoParser.Termo_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#fator_logico}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFator_logico(AlgumaSemanticoParser.Fator_logicoContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#parcela_logica}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParcela_logica(AlgumaSemanticoParser.Parcela_logicaContext ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#op_logico_1}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_1(AlgumaSemanticoParser.Op_logico_1Context ctx);
	/**
	 * Visit a parse tree produced by {@link AlgumaSemanticoParser#op_logico_2}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_logico_2(AlgumaSemanticoParser.Op_logico_2Context ctx);
}