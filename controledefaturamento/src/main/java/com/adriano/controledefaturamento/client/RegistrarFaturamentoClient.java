package com.adriano.controledefaturamento.client;

import com.adriano.controledefaturamento.model.PedidoEncomenda;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface RegistrarFaturamentoClient {

    @GetMapping
    boolean registrarFaturamento(@RequestBody PedidoEncomenda encomenda);
}
