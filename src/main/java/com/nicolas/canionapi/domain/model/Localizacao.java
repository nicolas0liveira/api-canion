package com.nicolas.canionapi.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@Entity
public class Localizacao {
	
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	//formato trabalhar com radiano ou decimal
	@Column(nullable = false) 
	private String latitudeStr; //13º18'57.82"S -> Radiano WS

	@Column(nullable = false)
	private String longitudeStr; //13º18'57.82"S
	
	
}