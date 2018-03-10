package br.ufc.quixada.academia.repository;


import org.springframework.data.repository.CrudRepository;
import br.ufc.quixada.academia.model.Aluno;

public interface AlunoRepository extends CrudRepository<Aluno, Long>{
		
}
