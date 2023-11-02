package com.blamovi.apiblamovi.dtos;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

public record UsuarioDto(

    @NotBlank String nome,
    @NotBlank @Email(message = "O email deve estar em um formato válido!") String email,

    @NotBlank String senha,

    @NotBlank String apelido,

    String foto
){

}
