package br.com.mv.mvintegra.filtros;

import br.com.mv.mvintegra.Filtro;
import br.com.mv.mvintegra.Requisicao;

public class FiltroXmlNulo implements Filtro {

    private Filtro proximo;

    @Override
    public void aplicarFiltro(Requisicao requisicao, StringBuilder log) {
        if (requisicao.getXmlConteudo() == null || requisicao.getXmlConteudo().isEmpty()){
            log.append("\n-Xml vazio ou nulo");
        }

        if (proximo != null)
            proximo.aplicarFiltro(requisicao,log);
    }

    @Override
    public void setProximo(Filtro filtro) {
        this.proximo = filtro;
    }

    @Override
    public Filtro getProximo() {
        return proximo;
    }
}
