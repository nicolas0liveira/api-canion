package com.nicolas.canionapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nicolas.canionapi.domain.model.Localizacao;

@Repository
public interface LocalizacaoRepository extends JpaRepository<Localizacao, Long>{

}
