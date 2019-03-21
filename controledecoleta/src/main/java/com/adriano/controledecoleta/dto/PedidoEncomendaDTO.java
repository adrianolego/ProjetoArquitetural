package com.adriano.controledecoleta.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PedidoEncomendaDTO implements Serializable {

    @JsonIgnore
    private String idEncomenda;
    private FreteDTO frete;
    private RemetenteDTO remetente;
    private DestinatarioDTO destinatario;
    @JsonIgnore
    private LocalDateTime dataHoraRecebimento;
    @JsonIgnore
    private String nomeOperador;
    private String observacao;
}