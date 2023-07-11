package br.dc.compiladores.alguma.semantico;

import br.dc.compiladores.alguma.semantico.TabelaDeSimbolos.TipoAlguma;

public class AlgumaSemantico extends AlgumaBaseVisitor<Void> {

    Escopos pilhaDeTabelas = new Escopos();
    String erroSemantico;

    @Override
    public Void visitPrograma(AlgumaParser.ProgramaContext ctx) {
        return super.visitPrograma(ctx);
    }

    @Override
    public Void visitCorpo(AlgumaParser.CorpoContext ctx) { 
        pilhaDeTabelas.criarNovoEscopo();
        
        super.visitCorpo(ctx); 
        pilhaDeTabelas.abandonarEscopo();
        return null;
    }
    

    @Override
    public Void visitDeclaracao_local(AlgumaParser.Declaracao_localContext ctx){
        if (ctx.v1 != null){
            String srtTipoVar = ctx.v1.tipo().getText();
            TabelaDeSimbolos escopoAtual = pilhaDeTabelas.obterEscopoAtual();
            if (!AlgumaSemanticoUtils.ehTipoBasico(srtTipoVar)){
                // Reporta erro de tipo inexistente
                erroSemantico = "tipo "+srtTipoVar+" nao declarado";
                AlgumaSemanticoUtils.adicionarErroSemantico(ctx.v1.start, erroSemantico);
            }
            TipoAlguma tipoVar = TipoAlguma.INVALIDO;
            switch(srtTipoVar){
                case "LITERAL":
                    tipoVar = TipoAlguma.LITERAL;
                    break;
                case "INTEIRO":
                    tipoVar = TipoAlguma.INTEIRO;
                    break;
                case "REAL":
                    tipoVar = TipoAlguma.REAL;
                    break;
                case "LOGICO":
                    tipoVar = TipoAlguma.LOGICO;
                    break;
                default:
                    // Nunca irá acontecer, pois o analisador sintático não permite
                    break;
            }
            for (var v : ctx.v1.identificador()){
                escopoAtual.adicionar(v.getText(), tipoVar);
            }
        } else if (ctx.v2 != null){
            // WIP
        } else if (ctx.v3 != null){
            // WIP
        } else{
            // Se a execução chegar até aqui, é porque deu erro no compilador!
        }

        return super.visitDeclaracao_local(ctx);
    }

    @Override
    public Void visitCmdLeia(AlgumaParser.CmdLeiaContext ctx){
        for (var v : ctx.identificador()){
            boolean foiDeclarado = false;
            for (TabelaDeSimbolos t : pilhaDeTabelas.percorrerEscoposAninhados()){
                if (t.existe(v.getText())){
                    foiDeclarado = true;            
                }
            }
            if (!foiDeclarado){
                // Reporta erro de variável não existente
                erroSemantico = "identificador "+v.getText()+" nao declarado";
                AlgumaSemanticoUtils.adicionarErroSemantico(ctx.start, erroSemantico);
            }
        }

        return null;
    }

    /* 
    @Override
    public Void visitCmdEscreva(AlgumaParser.CmdEscrevaContext ctx){
        

        return super.visitCmdEscreva(ctx);
    }
    */

    /* 
    @Override
    public Void visitExp_aritmetica(AlgumaParser.Exp_aritmeticaContext ctx){
        AlgumaSemanticoUtils.verificarTipo(tabela, ctx);

        return super.visitExp_aritmetica(ctx);
    }
    */
}