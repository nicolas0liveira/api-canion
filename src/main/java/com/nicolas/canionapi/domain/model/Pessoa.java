package com.nicolas.canionapi.domain.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table(name = "pessoa")
@Inheritance(strategy = InheritanceType.JOINED)
public class Pessoa {
	
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;
    
    @Enumerated(EnumType.STRING)
    @Column(nullable = true)
    private EnumSexo sexo;
    
    @Column(nullable = true, name = "dt_nascimento", columnDefinition = "date")
    private LocalDate dataNascimento;
    
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "pessoa_id",referencedColumnName = "id", nullable = false)
    
//	@ElementCollection
//	@CollectionTable(
//				name = "enderecos", 
//				joinColumns = @JoinColumn(name = "pessoa_id", nullable = true))
	private List<Endereco> enderecos = new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "pessoa_id",referencedColumnName = "id", nullable = false)
    
   	private List<Telefone> telefones = new ArrayList<>();
    
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true /*, fetch = FetchType.EAGER*/)
    @JoinColumn(name = "pessoa_id",referencedColumnName = "id", nullable = false)
   	private List<EnderecoEmail> emails = new ArrayList<>();
    
//  @JsonIgnore
//	@CreationTimestamp
//	@Column(nullable = false, columnDefinition = "datetime", name = "criado_em")
//	private LocalDateTime dataCriacao;
//
//	@JsonIgnore
//	@UpdateTimestamp
//	@Column(nullable = false, columnDefinition = "datetime", name = "ultima_atualizacao")
//	private LocalDateTime dataUltimaAtualizacao;
}
