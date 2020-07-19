package com.nicolas.canionapi.domain.model;

import java.sql.Date;
import javax.persistence.*;

@Entity
@Table(name = "token")
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_token")
    private Long id;

    //TODO:Trocar para usuario
    @Column(name = "id_usuario")
    private int idUsuario;

    @Column(name = "tipo_token")
    private String tipoToken;

    @Column(name = "token")
    private String token;

    @Column(name = "dt_criacao")
    private Date dataCriacao;

    @Column(name = "dt_validade")
    private Date dataValidade;

    @Column(name = "usado")
    private Boolean usado;

    @Column(name = "expirado")
    private Boolean expirado;

}