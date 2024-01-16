package com.Cardapio.Controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Cardapio.Dto.CardapioDto;
import com.Cardapio.Dto.CardapioSalvarDto;
import com.Cardapio.Modelo.Cardapio;
import com.Cardapio.Repositorio.CardapioRepositorio;

@RestController
@RequestMapping("cardapio")
public class CardapioControle {
	
	@Autowired
	private CardapioRepositorio repositorio;
	@CrossOrigin(origins = "*",allowedHeaders = "*")
	@GetMapping
	public Iterable<CardapioDto>buscar(){
		return repositorio.findAll().stream().map(CardapioDto::new).toList();
	}
	@CrossOrigin(origins = "*",allowedHeaders = "*")
	@PostMapping
	public void salvarCardapio(@RequestBody CardapioSalvarDto salvar) {
		var cardapio =  new Cardapio(salvar);
		repositorio.save(cardapio);
	}

}
