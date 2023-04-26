package me.dio.academia.digital.service;

import me.dio.academia.digital.entity.Aluno;
import me.dio.academia.digital.entity.AvaliacaoFisica;
import me.dio.academia.digital.entity.form.AlunoForm;
import me.dio.academia.digital.entity.form.AlunoUpdateForm;

import java.util.List;

public interface IAlunoService {

  Aluno create(AlunoForm form);

  Aluno get(Long id);

  List<Aluno> getAll(String dataDeascimento);

  Aluno update(Long id, AlunoUpdateForm formUpdate);

  void delete(Long id);

  /**
   *
   * @param id do aluno  será recuperada da lista de avaliações
   * @return uma lista com todas as avaliações do aluno de acordo com o Id
   */
  List<AvaliacaoFisica> getAllAvaliacaoFisicaId(Long id);
}
