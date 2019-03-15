package com.adriano.controledecoleta.model;

public class Frete {
    
    private String idEncomenda;
    private Double distanciaKM;
    private String urgencia;
    private String classificacaoEnvio;
    private String classificacaoTransporte;
    private boolean existeCargaRetorno;

    public String getIdEncomenda() {
        return idEncomenda;
    }

    public Frete setIdEncomenda(String idEncomenda) {
        this.idEncomenda = idEncomenda;
        return this;
    }

    public Double getDistanciaKM() {
        return distanciaKM;
    }

    public Frete setDistanciaKM(Double distanciaKM) {
        this.distanciaKM = distanciaKM;
        return this;
    }

    public String getUrgencia() {
        return urgencia;
    }

    public Frete setUrgencia(String urgencia) {
        this.urgencia = urgencia;
        return this;
    }

    public String getClassificacaoEnvio() {
        return classificacaoEnvio;
    }

    public Frete setClassificacaoEnvio(String classificacaoEnvio) {
        this.classificacaoEnvio = classificacaoEnvio;
        return this;
    }

    public String getClassificacaoTransporte() {
        return classificacaoTransporte;
    }

    public Frete setClassificacaoTransporte(String classificacaoTransporte) {
        this.classificacaoTransporte = classificacaoTransporte;
        return this;
    }

    public boolean isExisteCargaRetorno() {
        return existeCargaRetorno;
    }

    public Frete setExisteCargaRetorno(boolean existeCargaRetorno) {
        this.existeCargaRetorno = existeCargaRetorno;
        return this;
    }

    @Override
    public String toString() {
        return "Frete{" +
                "idEncomenda='" + idEncomenda + '\'' +
                ", distanciaKM=" + distanciaKM +
                ", urgencia='" + urgencia + '\'' +
                ", classificacaoEnvio='" + classificacaoEnvio + '\'' +
                ", classificacaoTransporte='" + classificacaoTransporte + '\'' +
                ", existeCargaRetorno=" + existeCargaRetorno +
                '}';
    }
}
