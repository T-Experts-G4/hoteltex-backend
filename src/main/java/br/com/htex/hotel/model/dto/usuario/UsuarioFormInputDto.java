package br.com.htex.hotel.model.dto.usuario;

import javax.validation.constraints.NotBlank;

public record UsuarioFormInputDto(
        @NotBlank(message = "O campo precisa ser preenchido")
        String email,
        @NotBlank(message = "O campo precisa ser preenchido")
        String senha
) {
}