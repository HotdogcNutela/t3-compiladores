// Generated from br\dc\compiladores\alguma\semantico\AlgumaSemantico.g4 by ANTLR 4.12.0
package br.dc.compiladores.alguma.semantico;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link AlgumaSemanticoParser}.
 */
public interface AlgumaSemanticoListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#programa}.
	 * @param ctx the parse tree
	 */
	void enterPrograma(AlgumaSemanticoParser.ProgramaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#programa}.
	 * @param ctx the parse tree
	 */
	void exitPrograma(AlgumaSemanticoParser.ProgramaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracoes(AlgumaSemanticoParser.DeclaracoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#declaracoes}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracoes(AlgumaSemanticoParser.DeclaracoesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void enterDecl_local_global(AlgumaSemanticoParser.Decl_local_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#decl_local_global}.
	 * @param ctx the parse tree
	 */
	void exitDecl_local_global(AlgumaSemanticoParser.Decl_local_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_local(AlgumaSemanticoParser.Declaracao_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#declaracao_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_local(AlgumaSemanticoParser.Declaracao_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#variavel}.
	 * @param ctx the parse tree
	 */
	void enterVariavel(AlgumaSemanticoParser.VariavelContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#variavel}.
	 * @param ctx the parse tree
	 */
	void exitVariavel(AlgumaSemanticoParser.VariavelContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#identificador}.
	 * @param ctx the parse tree
	 */
	void enterIdentificador(AlgumaSemanticoParser.IdentificadorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#identificador}.
	 * @param ctx the parse tree
	 */
	void exitIdentificador(AlgumaSemanticoParser.IdentificadorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void enterDimensao(AlgumaSemanticoParser.DimensaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#dimensao}.
	 * @param ctx the parse tree
	 */
	void exitDimensao(AlgumaSemanticoParser.DimensaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(AlgumaSemanticoParser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(AlgumaSemanticoParser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico(AlgumaSemanticoParser.Tipo_basicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#tipo_basico}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico(AlgumaSemanticoParser.Tipo_basicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void enterTipo_basico_ident(AlgumaSemanticoParser.Tipo_basico_identContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#tipo_basico_ident}.
	 * @param ctx the parse tree
	 */
	void exitTipo_basico_ident(AlgumaSemanticoParser.Tipo_basico_identContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void enterTipo_estendido(AlgumaSemanticoParser.Tipo_estendidoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#tipo_estendido}.
	 * @param ctx the parse tree
	 */
	void exitTipo_estendido(AlgumaSemanticoParser.Tipo_estendidoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void enterValor_constante(AlgumaSemanticoParser.Valor_constanteContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#valor_constante}.
	 * @param ctx the parse tree
	 */
	void exitValor_constante(AlgumaSemanticoParser.Valor_constanteContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#registro}.
	 * @param ctx the parse tree
	 */
	void enterRegistro(AlgumaSemanticoParser.RegistroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#registro}.
	 * @param ctx the parse tree
	 */
	void exitRegistro(AlgumaSemanticoParser.RegistroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracao_global(AlgumaSemanticoParser.Declaracao_globalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#declaracao_global}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracao_global(AlgumaSemanticoParser.Declaracao_globalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void enterParametro(AlgumaSemanticoParser.ParametroContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#parametro}.
	 * @param ctx the parse tree
	 */
	void exitParametro(AlgumaSemanticoParser.ParametroContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(AlgumaSemanticoParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(AlgumaSemanticoParser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void enterCorpo(AlgumaSemanticoParser.CorpoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#corpo}.
	 * @param ctx the parse tree
	 */
	void exitCorpo(AlgumaSemanticoParser.CorpoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void enterCmd(AlgumaSemanticoParser.CmdContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#cmd}.
	 * @param ctx the parse tree
	 */
	void exitCmd(AlgumaSemanticoParser.CmdContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void enterCmdLeia(AlgumaSemanticoParser.CmdLeiaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#cmdLeia}.
	 * @param ctx the parse tree
	 */
	void exitCmdLeia(AlgumaSemanticoParser.CmdLeiaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void enterCmdEscreva(AlgumaSemanticoParser.CmdEscrevaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#cmdEscreva}.
	 * @param ctx the parse tree
	 */
	void exitCmdEscreva(AlgumaSemanticoParser.CmdEscrevaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void enterCmdSe(AlgumaSemanticoParser.CmdSeContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#cmdSe}.
	 * @param ctx the parse tree
	 */
	void exitCmdSe(AlgumaSemanticoParser.CmdSeContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void enterCmdCaso(AlgumaSemanticoParser.CmdCasoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#cmdCaso}.
	 * @param ctx the parse tree
	 */
	void exitCmdCaso(AlgumaSemanticoParser.CmdCasoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void enterCmdPara(AlgumaSemanticoParser.CmdParaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#cmdPara}.
	 * @param ctx the parse tree
	 */
	void exitCmdPara(AlgumaSemanticoParser.CmdParaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void enterCmdEnquanto(AlgumaSemanticoParser.CmdEnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#cmdEnquanto}.
	 * @param ctx the parse tree
	 */
	void exitCmdEnquanto(AlgumaSemanticoParser.CmdEnquantoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void enterCmdFaca(AlgumaSemanticoParser.CmdFacaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#cmdFaca}.
	 * @param ctx the parse tree
	 */
	void exitCmdFaca(AlgumaSemanticoParser.CmdFacaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void enterCmdAtribuicao(AlgumaSemanticoParser.CmdAtribuicaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#cmdAtribuicao}.
	 * @param ctx the parse tree
	 */
	void exitCmdAtribuicao(AlgumaSemanticoParser.CmdAtribuicaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void enterCmdChamada(AlgumaSemanticoParser.CmdChamadaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#cmdChamada}.
	 * @param ctx the parse tree
	 */
	void exitCmdChamada(AlgumaSemanticoParser.CmdChamadaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void enterCmdRetorne(AlgumaSemanticoParser.CmdRetorneContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#cmdRetorne}.
	 * @param ctx the parse tree
	 */
	void exitCmdRetorne(AlgumaSemanticoParser.CmdRetorneContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#selecao}.
	 * @param ctx the parse tree
	 */
	void enterSelecao(AlgumaSemanticoParser.SelecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#selecao}.
	 * @param ctx the parse tree
	 */
	void exitSelecao(AlgumaSemanticoParser.SelecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void enterItem_selecao(AlgumaSemanticoParser.Item_selecaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#item_selecao}.
	 * @param ctx the parse tree
	 */
	void exitItem_selecao(AlgumaSemanticoParser.Item_selecaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#constantes}.
	 * @param ctx the parse tree
	 */
	void enterConstantes(AlgumaSemanticoParser.ConstantesContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#constantes}.
	 * @param ctx the parse tree
	 */
	void exitConstantes(AlgumaSemanticoParser.ConstantesContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void enterNumero_intervalo(AlgumaSemanticoParser.Numero_intervaloContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#numero_intervalo}.
	 * @param ctx the parse tree
	 */
	void exitNumero_intervalo(AlgumaSemanticoParser.Numero_intervaloContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void enterOp_unario(AlgumaSemanticoParser.Op_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#op_unario}.
	 * @param ctx the parse tree
	 */
	void exitOp_unario(AlgumaSemanticoParser.Op_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExp_aritmetica(AlgumaSemanticoParser.Exp_aritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#exp_aritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExp_aritmetica(AlgumaSemanticoParser.Exp_aritmeticaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#termo}.
	 * @param ctx the parse tree
	 */
	void enterTermo(AlgumaSemanticoParser.TermoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#termo}.
	 * @param ctx the parse tree
	 */
	void exitTermo(AlgumaSemanticoParser.TermoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#fator}.
	 * @param ctx the parse tree
	 */
	void enterFator(AlgumaSemanticoParser.FatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#fator}.
	 * @param ctx the parse tree
	 */
	void exitFator(AlgumaSemanticoParser.FatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#op1}.
	 * @param ctx the parse tree
	 */
	void enterOp1(AlgumaSemanticoParser.Op1Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#op1}.
	 * @param ctx the parse tree
	 */
	void exitOp1(AlgumaSemanticoParser.Op1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#op2}.
	 * @param ctx the parse tree
	 */
	void enterOp2(AlgumaSemanticoParser.Op2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#op2}.
	 * @param ctx the parse tree
	 */
	void exitOp2(AlgumaSemanticoParser.Op2Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#op3}.
	 * @param ctx the parse tree
	 */
	void enterOp3(AlgumaSemanticoParser.Op3Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#op3}.
	 * @param ctx the parse tree
	 */
	void exitOp3(AlgumaSemanticoParser.Op3Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#parcela}.
	 * @param ctx the parse tree
	 */
	void enterParcela(AlgumaSemanticoParser.ParcelaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#parcela}.
	 * @param ctx the parse tree
	 */
	void exitParcela(AlgumaSemanticoParser.ParcelaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_unario(AlgumaSemanticoParser.Parcela_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#parcela_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_unario(AlgumaSemanticoParser.Parcela_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void enterParcela_nao_unario(AlgumaSemanticoParser.Parcela_nao_unarioContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#parcela_nao_unario}.
	 * @param ctx the parse tree
	 */
	void exitParcela_nao_unario(AlgumaSemanticoParser.Parcela_nao_unarioContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void enterExp_relacional(AlgumaSemanticoParser.Exp_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#exp_relacional}.
	 * @param ctx the parse tree
	 */
	void exitExp_relacional(AlgumaSemanticoParser.Exp_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void enterOp_relacional(AlgumaSemanticoParser.Op_relacionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#op_relacional}.
	 * @param ctx the parse tree
	 */
	void exitOp_relacional(AlgumaSemanticoParser.Op_relacionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void enterExpressao(AlgumaSemanticoParser.ExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#expressao}.
	 * @param ctx the parse tree
	 */
	void exitExpressao(AlgumaSemanticoParser.ExpressaoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void enterTermo_logico(AlgumaSemanticoParser.Termo_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#termo_logico}.
	 * @param ctx the parse tree
	 */
	void exitTermo_logico(AlgumaSemanticoParser.Termo_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void enterFator_logico(AlgumaSemanticoParser.Fator_logicoContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#fator_logico}.
	 * @param ctx the parse tree
	 */
	void exitFator_logico(AlgumaSemanticoParser.Fator_logicoContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void enterParcela_logica(AlgumaSemanticoParser.Parcela_logicaContext ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#parcela_logica}.
	 * @param ctx the parse tree
	 */
	void exitParcela_logica(AlgumaSemanticoParser.Parcela_logicaContext ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_1(AlgumaSemanticoParser.Op_logico_1Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#op_logico_1}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_1(AlgumaSemanticoParser.Op_logico_1Context ctx);
	/**
	 * Enter a parse tree produced by {@link AlgumaSemanticoParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void enterOp_logico_2(AlgumaSemanticoParser.Op_logico_2Context ctx);
	/**
	 * Exit a parse tree produced by {@link AlgumaSemanticoParser#op_logico_2}.
	 * @param ctx the parse tree
	 */
	void exitOp_logico_2(AlgumaSemanticoParser.Op_logico_2Context ctx);
}