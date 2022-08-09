package br.com.dio.bootcampdesafio2.form;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlunoForm {
    private String nome;
    private String cpf;
    private String bairro;
    private LocalDate dataDeNascimento;
}