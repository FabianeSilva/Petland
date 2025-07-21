package com.petland.cadastros.model.dto;

import com.petland.cadastros.model.AnimalEspecie;
import lombok.Data;

import java.time.LocalDate;

@Data
public class AnimalRequest {
    private String nome;
    private LocalDate aniversario;
    private AnimalEspecie especie;
    private Integer tutor;

}
