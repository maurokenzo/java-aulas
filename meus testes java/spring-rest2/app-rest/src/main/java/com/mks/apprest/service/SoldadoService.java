package com.mks.apprest.service;

import com.mks.apprest.controller.request.SoldadoEditRequest;
import com.mks.apprest.dto.Soldado;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String cpf) {
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Jaque");
        soldado.setRaca("India");
        soldado.setArma("Faca");
        return soldado;
    }

    public void criarSoldado(Soldado soldado) {

    }

    public void alterarSoldado(String cpf, SoldadoEditRequest soldadoEditRequest) {

    }

    public void deletarSoldado(String cpf) {
    }

    public List<Soldado> buscarSoldados() {
        Soldado soldado1 = new Soldado();
        soldado1.setCpf("30303030");
        soldado1.setNome("Sheila");
        soldado1.setRaca("Ponteira");
        soldado1.setArma("Cortada");
        Soldado soldado2 = new Soldado();
        soldado2.setCpf("70707070");
        soldado2.setNome("Jaque");
        soldado2.setRaca("India");
        soldado2.setArma("Defesa");
        return Arrays.asList(soldado1, soldado2);
    }
}
