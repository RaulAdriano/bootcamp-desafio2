package br.com.dio.bootcampdesafio2.service;

import br.com.dio.bootcampdesafio2.form.AvaliacaoFisicaForm;
import br.com.dio.bootcampdesafio2.model.Aluno;
import br.com.dio.bootcampdesafio2.model.AvaliacaoFisica;
import br.com.dio.bootcampdesafio2.repository.AlunoRepository;
import br.com.dio.bootcampdesafio2.repository.AvaliacaoFisicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AvaliacaoFisicaService {

    @Autowired
    private AvaliacaoFisicaRepository avaliacaoRepository;

    @Autowired
    private AlunoRepository alunoRepository;

    public AvaliacaoFisica create(AvaliacaoFisicaForm form){
        AvaliacaoFisica avaliacaoFisica = new AvaliacaoFisica();
        Aluno aluno = alunoRepository.findById(form.getAlunoId()).get();

        avaliacaoFisica.setAluno(aluno);
        avaliacaoFisica.setPeso(form.getPeso());
        avaliacaoFisica.setAltura(form.getAltura());

        return avaliacaoRepository.save(avaliacaoFisica);

    }

    public AvaliacaoFisica get(Long id){
        return null;
    }

    public List<AvaliacaoFisica> getAll(){
        return avaliacaoRepository.findAll();
    }

    public AvaliacaoFisica update(Long id, AvaliacaoFisicaUpdateForm formUpdate){
        return null;
    }

    public AvaliacaoFisica delete(Long id){
        return null;
    }

}
