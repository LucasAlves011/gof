package br.com.mv.mvintegra.filtros;

import br.com.mv.mvintegra.Filtro;
import br.com.mv.mvintegra.Requisicao;

import java.time.LocalDateTime;

public class FiltroDataLimite implements Filtro {

    private Filtro proximo;

    @Override
    public void aplicarFiltro(Requisicao requisicao, StringBuilder log) {
        if (requisicao.getDataHora().isAfter(LocalDateTime.now().plusDays(7))) {
            log.append("\n-Requisição com data maior que 7 dias");
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
