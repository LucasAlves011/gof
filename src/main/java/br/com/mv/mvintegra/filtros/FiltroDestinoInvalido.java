package br.com.mv.mvintegra.filtros;

import br.com.mv.mvintegra.Filtro;
import br.com.mv.mvintegra.Requisicao;

public class FiltroDestinoInvalido implements Filtro {
    private Filtro proximo;

    @Override
    public void aplicarFiltro(Requisicao requisicao, StringBuilder log) {
        if (requisicao.getDestino() == null || requisicao.getDestino().isEmpty()
                || requisicao.getDestino().length() < 5) {
            log.append("\n-Destino inválido");
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
