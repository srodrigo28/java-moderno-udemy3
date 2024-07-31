package com.treinadev.api.models;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "series")
public class SeriesModel {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String nome;
    
    @Column(unique = true, nullable = false)
    private String descricao;

    @CreationTimestamp // adicionado
    @DateTimeFormat(iso = ISO.DATE) // convert data
    private Instant dataCadastro;
    
    @UpdateTimestamp // adicionado
    @DateTimeFormat(iso = ISO.DATE) // convert data
    private Instant dataAtualizacao;
}
