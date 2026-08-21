package com.danilo.curriculoautomatizador.presentation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AutomacaoRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Automatizador de currículos iniciado!");
    }
}