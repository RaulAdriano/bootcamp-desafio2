package br.com.dio.bootcampdesafio2.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.*;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoForm {

    @NotEmpty(message = "preencha o campo corretamente")
    @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres")
    private String nome;

    @NotEmpty(message = "preencha o campo corretamente")
    @CPF(message = "'${validatedValue}' é invalido")
    private String cpf;

    @NotEmpty(message = "preencha o campo corretamente")
    @Size(min = 3, max = 50, message = "'${validatedValue}' precisa estar entre {min} e {max} caracteres")
    private String bairro;

    @NotNull(message = "preencha o campo corretamente")
    @Past(message = "Data '${validatedValue}' é invalida")
    private LocalDate dataDeNascimento;
}
