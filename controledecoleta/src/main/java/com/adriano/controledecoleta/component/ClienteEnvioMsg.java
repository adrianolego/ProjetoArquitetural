package com.adriano.controledecoleta.component;

import com.adriano.controledecoleta.model.PedidoEncomenda;
import com.adriano.controledecoleta.sender.DadosEncomenda;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClienteEnvioMsg implements DadosEncomenda {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Value("${config.mail.exchange}")
    private String mailExchange;
    @Value("${config.mail.sendQueue}")
    private String sendMailQueue;

    @Override
    public void enviarDadosEncomendaFila(PedidoEncomenda encomenda) {
        rabbitTemplate.convertAndSend(mailExchange, sendMailQueue, encomenda);
    }

}
