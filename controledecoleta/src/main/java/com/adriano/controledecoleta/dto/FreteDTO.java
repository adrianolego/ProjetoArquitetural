package com.adriano.controledecoleta.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FreteDTO implements Serializable {

    private Double distanciaKM;
    private String urgencia;
    private String classificacaoEnvio;
    private String classificacaoTransporte;
    private boolean existeCargaRetorno;
}
