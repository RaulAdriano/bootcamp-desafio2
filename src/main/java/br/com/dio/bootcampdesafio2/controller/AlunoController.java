package br.com.dio.bootcampdesafio2.controller;

import br.com.dio.bootcampdesafio2.form.AlunoForm;
import br.com.dio.bootcampdesafio2.model.Aluno;
import br.com.dio.bootcampdesafio2.model.AvaliacaoFisica;
import br.com.dio.bootcampdesafio2.service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    @Autowired
    private AlunoService service;

    @GetMapping
    public List<Aluno> getAll(){
        return service.getAll();
    }

    @PostMapping
    public Aluno create (@RequestBody AlunoForm form){
        return service.create(form);
    }

    @GetMapping("/avaliacoes/{id}")
    public List<AvaliacaoFisica> getAllAvaliacaoFisicaId(@PathVariable Long id){
        return service.getAllAvaliacaoFisica(id);
    }

}
