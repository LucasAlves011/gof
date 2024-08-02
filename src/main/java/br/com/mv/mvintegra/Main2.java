package br.com.mv.mvintegra;

import java.time.LocalDateTime;

public class Main2 {
    public static void main(String[] args) {
        Requisicao requisicao = new Requisicao("serv12", "", LocalDateTime.now().plusDays(10));
        StringBuilder log = new StringBuilder();

        if (requisicao.getDataHora().isAfter(LocalDateTime.now().plusDays(7))) {
            log.append("\n-Requisição com data maior que 7 dias");
        }

        if (requisicao.getDestino() == null || requisicao.getDestino().isEmpty() || requisicao.getDestino().length() < 5){
            log.append("\n-Destino inválido");
        }

        if ( requisicao.getXmlConteudo() == null || requisicao.getXmlConteudo().isEmpty()) {
            log.append("\n-XML nulo");
        }

        if (!log.isEmpty()) {
            System.out.println("Requisição inválida, motivos: " + log.toString());
        } else {
            System.out.println("Requisição válida");
        }

    }
}
