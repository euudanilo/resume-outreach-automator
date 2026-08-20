package com.danilo.curriculoautomatizador;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CurriculoautomatizadorApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(CurriculoautomatizadorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Automatizador de currículos iniciado!");
    }
}