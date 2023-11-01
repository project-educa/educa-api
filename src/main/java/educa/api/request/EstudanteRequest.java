package educa.api.request;

import educa.api.request.domain.Usuario;
import lombok.Data;

import javax.persistence.Column;
import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
public class EstudanteRequest {

    @Size(min = 3)
    @NotBlank
    private String nome;
    @Size(min = 3)
    @NotBlank
    private String sobrenome;
    @Past
    @NotNull
    private LocalDate dataNasc;
    @Column(unique = true)
    @Email
    @NotBlank
    private String email;
    @Size(min = 8)
    @NotBlank
    private String senha;

    public Usuario converter() {
        return new Usuario(nome, sobrenome, dataNasc, email, senha);
    }
}
