package com.adriano.controledesac.document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Remetente implements Serializable {

    private String nome;
    private String logradouro;
    private String numero;
    private String bairro;
    private String cidade;
    private String cep;
    private String telefone;
    private String celular;
    private String email;

}
