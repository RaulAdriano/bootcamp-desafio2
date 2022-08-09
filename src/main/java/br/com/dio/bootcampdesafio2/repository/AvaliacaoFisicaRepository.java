package br.com.dio.bootcampdesafio2.repository;

import br.com.dio.bootcampdesafio2.model.AvaliacaoFisica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AvaliacaoFisicaRepository  extends JpaRepository<AvaliacaoFisica,Long> {
}
