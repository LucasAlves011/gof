package br.com.mv.mvintegra;

public interface Filtro {

    void aplicarFiltro(Requisicao requisicao , StringBuilder log);

    void setProximo(Filtro filtro);
    Filtro getProximo();
}
