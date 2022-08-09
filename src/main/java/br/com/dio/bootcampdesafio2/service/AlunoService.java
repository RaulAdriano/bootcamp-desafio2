package br.com.dio.bootcampdesafio2.service;

import br.com.dio.bootcampdesafio2.form.AlunoForm;
import br.com.dio.bootcampdesafio2.model.Aluno;
import br.com.dio.bootcampdesafio2.model.AvaliacaoFisica;
import br.com.dio.bootcampdesafio2.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository repository;

    public Aluno create(AlunoForm form){
        Aluno aluno = new Aluno();
        aluno.setNome(form.getNome());
        aluno.setCpf(form.getCpf());
        aluno.setBairro(form.getBairro());
        aluno.setDataDeNascimento(form.getDataDeNascimento());

        return repository.save(aluno);
    }

    public Aluno get(Long id){
        return null;
    }

    public List<Aluno> getAll(){
        return repository.findAll();
    }

    public Aluno update(Long id, AlunoUpdateForm formUpdate){
        return null;
    }

    public Aluno delete(Long id){
        return null;
    }

    public List<AvaliacaoFisica> getAllAvaliacaoFisica( Long id) {
        Aluno aluno = repository.findById(id).get();

        return aluno.getAvaliacoes();
    }
}
