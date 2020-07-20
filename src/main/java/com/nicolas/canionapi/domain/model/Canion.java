package com.nicolas.canionapi.domain.model;

import java.time.LocalTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
public class Canion {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "cidade_id", nullable = false)
	private Cidade cidade;
	
	@Column(nullable = false)
	private String nomePrincipal;

	@ElementCollection
	@CollectionTable(name = "canions_outrosnomes")
	private List<String> outrosNomes; 
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = true)
	private EnumSituacaoCanion situacao;
	
	@Column(nullable = true)
	private float notaUsuarios;
	
	@Column(nullable = true)
	private LocalTime aproximacaoTempo;
	
	@Column(nullable = true)
	private float aproximacaoDistancia;
	
	@Column(nullable = true)
	private LocalTime progressaoTempo;
	
	@Column(nullable = true)
	private float progressaoDistancia;

	@Column(nullable = true)
	private LocalTime regressoTempo;
	
	@Column(nullable = true)
	private float regressoDistancia;
	
	@Column(nullable = true)
	private Integer qtdRapeis;
	
	@Column(nullable = true)
	private Integer maiorRapel;
	
	@Column(nullable = true)
	private float desnivel;
	
	@Column(nullable = true)
	private boolean equipado;
	
	
	//#################################

	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "croqui_id", referencedColumnName = "id")
	private Croqui croqui;
	
	@OneToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "proprietario_id", referencedColumnName = "id")
	private Proprietario proprietario;
	
	
	//##################################
	
	
//	@Column(nullable = true)
//	@Embedded
//	@AttributeOverrides({
//	  @AttributeOverride( name = "firstName", column = @Column(name = "contact_first_name")),
//	  @AttributeOverride( name = "lastName", column = @Column(name = "contact_last_name")),
//	  @AttributeOverride( name = "phone", column = @Column(name = "contact_phone"))
//	})
//	private Localizacao estacionamentoEntrada;
//	
//	@Column(nullable = true)
//	private Localizacao trilhaEntrada;
//	
//	@Column(nullable = true)
//	private Localizacao trilhaSaida;
//	
//	@Column(nullable = true)
//	private Localizacao estacionamentoSaida;
//	
}