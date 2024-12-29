package br.com.projeto.models.usuario;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public record ResetDTO(
        @NotBlank String email,
        @NotBlank @Size(min = 8,message = "A senha deve ter pelo menos 8 caracteres") String codigo,
        @NotBlank String senha,
        @NotBlank String confirmacaoSenha) {
}
