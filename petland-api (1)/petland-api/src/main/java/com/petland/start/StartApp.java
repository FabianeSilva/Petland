package com.petland.start;

import com.petland.cadastros.model.*;
import com.petland.cadastros.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import jakarta.persistence.*;
@Component
public class StartApp implements ApplicationRunner {

    @Autowired
    private AnimalRepository repository;
    @Override
    public void run(ApplicationArguments args) throws Exception {

        /*
        Cadastro gleyson = new Cadastro();
        gleyson.setNome("Gleyson Sampaio");

        Perfil perfil = new Perfil();
        perfil.setCliente(true);
        perfil.setFornecedor(false);
        perfil.setPrestador(false);

        Endereco endereco =new Endereco();
        endereco.setLogradouro("Rua das Flores");
        endereco.setNumero("123");

        gleyson.setPerfil(perfil);
        gleyson.setEndereco(endereco);

        Animal thor = new Animal();
        thor.setNome("Thor");
        thor.setAniversario(LocalDate.of(2023,12,20));
        thor.setEspecie(AnimalEspecie.CACHORRO);

        repository.save(thor);  */

    }
}
