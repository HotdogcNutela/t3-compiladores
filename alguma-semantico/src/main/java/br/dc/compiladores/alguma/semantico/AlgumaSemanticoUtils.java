package br.dc.compiladores.alguma.semantico;

import java.util.ArrayList;
import java.util.List;
import org.antlr.v4.runtime.Token;

import br.dc.compiladores.alguma.semantico.TabelaDeSimbolos.TipoAlguma;

public class AlgumaSemanticoUtils {
    public static List<String> errosSemanticos = new ArrayList<>();
    
    public static void adicionarErroSemantico(Token t, String mensagem) {
        int linha = t.getLine();
        //int coluna = t.getCharPositionInLine();
        errosSemanticos.add(String.format("Linha %d: %s", linha, mensagem));
    }
    
    public static boolean ehTipoBasico(String tipoVar){
        if (tipoVar.equals("literal") || 
            tipoVar.equals("inteiro") || 
            tipoVar.equals("real") || 
            tipoVar.equals("logico"))
        {
            return true;
        }
        return false;
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaParser.Exp_aritmeticaContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;
        for (var ta : ctx.termo()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(tabela, ta);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Expressão " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }

        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaParser.TermoContext ctx) {
        TabelaDeSimbolos.TipoAlguma ret = null;

        for (var fa : ctx.fator()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(tabela, fa);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Termo " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaParser.FatorContext ctx){
        TabelaDeSimbolos.TipoAlguma ret = null;

        for (var pa : ctx.parcela()) {
            TabelaDeSimbolos.TipoAlguma aux = verificarTipo(tabela, pa);
            if (ret == null) {
                ret = aux;
            } else if (ret != aux && aux != TabelaDeSimbolos.TipoAlguma.INVALIDO) {
                adicionarErroSemantico(ctx.start, "Termo " + ctx.getText() + " contém tipos incompatíveis");
                ret = TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
        }
        return ret;
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(TabelaDeSimbolos tabela, AlgumaParser.ParcelaContext ctx){
        if (ctx.parcela_unario().NUM_INT() != null){
            return TabelaDeSimbolos.TipoAlguma.INTEIRO;
        }
        if (ctx.parcela_unario().NUM_REAL() != null){
            return TabelaDeSimbolos.TipoAlguma.REAL;
        }
        if (ctx.parcela_unario().IDENT() != null){
            String nomeVar = ctx.parcela_unario().IDENT().getText();
            if (!tabela.existe(nomeVar)){
                // Reporta erro de variável inexistente
                // WIP
                return TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
            return verificarTipo(tabela, nomeVar);
        }
        if (ctx.parcela_unario().p1 != null){
            String nomeVar = ctx.parcela_unario().identificador().IDENT(0).getText();
            if (!tabela.existe(nomeVar)){
                // Reporta erro de variável inexistente
                // WIP
                return TabelaDeSimbolos.TipoAlguma.INVALIDO;
            }
            return verificarTipo(tabela, nomeVar);
        }

        // Se não for nenhum dos tipos acimas, é porque é uma expressão entre parênteses
        return verificarTipo(tabela, ctx.parcela_unario().expressao(0).termo_logico(0)
                .fator_logico(0).parcela_logica().exp_relacional().exp_aritmetica(0));
    }

    public static TabelaDeSimbolos.TipoAlguma verificarTipo(TabelaDeSimbolos tabela, String nomeVar) {
        return tabela.verificar(nomeVar);
    }
}