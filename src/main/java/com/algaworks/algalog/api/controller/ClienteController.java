package com.algaworks.algalog.api.controller;

import com.algaworks.algalog.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {
    @GetMapping("/clientes")
    public List<Cliente> listar(){
        Cliente client1 = new Cliente();
        client1.setNome("Ronaldo");
        client1.setId(1L);
        client1.setEmail("dev.joseronaldo@gmail.com");
        client1.setTelefone("99 99999-9999");

        Cliente client2 = new Cliente();
        client1.setNome("Natan");
        client1.setId(2L);
        client1.setEmail("natan@gmail.com");
        client1.setTelefone("99 99777-7777");

        return Arrays.asList(client1,client2);
    }
}
