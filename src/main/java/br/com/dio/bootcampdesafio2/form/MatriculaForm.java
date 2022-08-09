package br.com.dio.bootcampdesafio2.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MatriculaForm {
    @NotNull(message = "preencha o campo corretamente")
    @Positive(message = "O id precisa ser positivo")
    private Long alunoId;
}
