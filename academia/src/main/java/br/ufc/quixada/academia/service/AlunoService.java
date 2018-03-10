package br.ufc.quixada.academia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufc.quixada.academia.model.Aluno;
import br.ufc.quixada.academia.repository.AlunoRepository;


@Service
public class AlunoService {
	
	@Autowired
	private AlunoRepository repository;
	
	public List<Aluno> findAll() {
        return  (List<Aluno>) repository.findAll();
    }
     
    public Aluno findOne(Long id) {
        return repository.findOne(id);
    }
     
    public Aluno save(Aluno aluno) {
        return repository.save(aluno);
    }
     
    public void delete(Long id) {
        repository.delete(id);
    }
}
