package br.ufc.quixada.academia.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import br.ufc.quixada.academia.model.Aluno;
import br.ufc.quixada.academia.service.AlunoService;

@Controller
public class AlunoController {

	@Autowired
	private AlunoService service;

	// @GetMapping("cadastrar")
	// public ModelAndView cadastrar() {
	// return new ModelAndView("aluno/cadastrar");
	// }

	@GetMapping("/")
	public ModelAndView findAll() {

		ModelAndView mv = new ModelAndView("index");
		mv.addObject("alunos", service.findAll());

		return mv;
	}

	@GetMapping("add")
	public ModelAndView add(Aluno aluno) {

		ModelAndView mv = new ModelAndView("cadastroAlu");
		mv.addObject("aluno", aluno);

		return mv;		
	}

	@GetMapping("edit/{id}")
	public ModelAndView edit(@PathVariable("id") Long id) {

		return add(service.findOne(id));
	}

	@GetMapping("delete/{id}")
	public ModelAndView delete(@PathVariable("id") Long id) {

		service.delete(id);

		return findAll();
	}

	@PostMapping("save")
	public ModelAndView save(@Valid Aluno aluno, BindingResult result) {

		if (result.hasErrors()) {
			return add(aluno);
		}

		service.save(aluno);

		return findAll();
	}
}
