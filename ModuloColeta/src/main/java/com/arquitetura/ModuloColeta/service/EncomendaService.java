package com.arquitetura.ModuloColeta.service;

import com.arquitetura.ModuloColeta.model.*;
import com.arquitetura.ModuloColeta.model.enuns.OrigemFreteEnum;
import com.arquitetura.ModuloColeta.model.interfaces.FreteInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EncomendaService {

    @Autowired
    ClassificacaoTransporte classificacaoTransporte;

    @Autowired
    ClassificacaoEnvio classificacaoEnvio;

    @Autowired
    Urgencia urgencia;

    public void gerarPedido(Encomenda encomenda) {

        List<Frete> freteList = new ArrayList<>();
        freteList.add(new Frete(OrigemFreteEnum.INTERNO).obterValorFrete());
        freteList.add(new Frete(OrigemFreteEnum.EXTERNO).obterValorFrete());
        Frete menorFrete = FreteInterface.calcularMenorFrete(freteList);

        encomenda.setValorFrete(menorFrete.getValorFrete());
        encomenda.setOrigemFrete(menorFrete.getOrigem());


        classificacaoTransporte.obterClassificacaoTransporte();
        classificacaoEnvio.obterClassificacaoEnvio();
        urgencia.obterUrgencia();
        encomenda.salvarPedido(encomenda);
    }
}
