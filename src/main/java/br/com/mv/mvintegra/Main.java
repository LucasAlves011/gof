package br.com.mv.mvintegra;

import br.com.mv.mvintegra.filtros.FiltroDataLimite;
import br.com.mv.mvintegra.filtros.FiltroDestinoInvalido;
import br.com.mv.mvintegra.filtros.FiltroXmlNulo;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Requisicao requisicao = new Requisicao("serv12", "", LocalDateTime.now().plusDays(10));
        StringBuilder log = new StringBuilder();

        FiltroDataLimite filtroDataLimite = new FiltroDataLimite();
        FiltroDestinoInvalido filtroDestinoInvalido = new FiltroDestinoInvalido();
        FiltroXmlNulo filtroXmlNulo = new FiltroXmlNulo();

        filtroDataLimite.setProximo(filtroDestinoInvalido);
        filtroDataLimite.getProximo().setProximo(filtroXmlNulo);

        filtroDataLimite.aplicarFiltro(requisicao, log);

        if (!log.isEmpty()) {
            System.out.println("Requisição inválida, motivos: " + log.toString());
        } else {
            System.out.println("Requisição válida");
        }
    }
}