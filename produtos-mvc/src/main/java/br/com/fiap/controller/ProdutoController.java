package br.com.fiap.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.fiap.repository.ProdutoRepository;

@Controller
public class ProdutoController {

	ProdutoRepository repo = new ProdutoRepository();
	// Busca
	@RequestMapping(value = {"/produto", "/"}, method = RequestMethod.GET)
	public String findAll(Model model) {
			
		model.addAttribute("produtos", repo.findAll());
		return "produtos";
	}

}
