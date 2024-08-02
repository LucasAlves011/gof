package br.com.mv.mvintegra;

import java.time.LocalDateTime;

public class Requisicao {

    private String destino;
    private String xmlConteudo;
    private LocalDateTime dataHora;

    public Requisicao(String destino, String xmlConteudo, LocalDateTime dataHora) {
        this.destino = destino;
        this.xmlConteudo = xmlConteudo;
        this.dataHora = dataHora;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getXmlConteudo() {
        return xmlConteudo;
    }

    public void setXmlConteudo(String xmlConteudo) {
        this.xmlConteudo = xmlConteudo;
    }
}
