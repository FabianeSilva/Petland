package com.petland.cadastros.model.entity;

import com.petland.cadastros.model.Endereco;
import com.petland.cadastros.model.Perfil;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;


@Data
@Entity(name = "petland_db")
@Table(name = "tab_cadastro")
public class CadastroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter(AccessLevel.NONE)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nome;
    @Embedded
    private Perfil perfil;
    @Embedded
    private Endereco endereco;

}
