package br.fepi.socialbooks.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.fepi.socialbooks.domain.Livro;

@RestController
public class LivrosResources {
	
	@RequestMapping(value = "/livros",method = RequestMethod.GET)
	public Livro listar() {
		
		Livro livro1 = new Livro("Arte da guerra"); 
		Livro livro2 = new Livro("O pequieno príncipe");
		Livro livro3 = new Livro("1984");
		
		return livro3;
		
	}
	

}
