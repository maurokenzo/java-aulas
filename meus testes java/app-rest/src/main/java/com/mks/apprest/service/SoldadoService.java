package com.mks.apprest.service;

import com.mks.apprest.controller.request.SoldadoEditRequest;
import com.mks.apprest.dto.Soldado;
import org.springframework.stereotype.Service;

@Service
public class SoldadoService {

    public Soldado buscarSoldado(String cpf) {
        Soldado soldado = new Soldado();
        soldado.setCpf(cpf);
        soldado.setNome("Jaque");
        soldado.setRaca("India");
        soldado.setArma("Lança");
        return soldado;
    }

    public void criarSoldado(Soldado soldado) {

    }

    public void alterarSoldado(String cpf, SoldadoEditRequest soldadoEditRequest) {

    }
}
