package com.Cardapio.Modelo;

import com.Cardapio.Dto.CardapioSalvarDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "cardapio")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "id")
public class Cardapio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titlo;
	private String imagem;
	private Integer preco;
	
	public Cardapio(CardapioSalvarDto salvar) {
		this.titlo = salvar.titulo();
		this.imagem = salvar.imagem();
		this.preco = salvar.preco();
	}

}
