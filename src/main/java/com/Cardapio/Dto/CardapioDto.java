package com.Cardapio.Dto;

import com.Cardapio.Modelo.Cardapio;

public record CardapioDto(Long id,String titulo,String imagem,Integer preco) {
	public CardapioDto(Cardapio cardapio) {
		this(cardapio.getId(),cardapio.getTitlo(),cardapio.getImagem(),cardapio.getPreco());
		
	}

}
