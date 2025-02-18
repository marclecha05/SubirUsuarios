package com.example.demo.controller;


import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.beans.factory.annotation.Autowired;


import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;


@SpringBootTest
public class UsuarioControllerTest {


    @Autowired
    private UsuarioController usuarioController;


    @Test
    void contextLoads() {
        // Verifica que el controlador se haya cargado correctamente en el contexto
        assertThat(usuarioController).isNotNull();
    }
}
