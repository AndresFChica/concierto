package com.trabajo.concierto.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name="Bandas")
public class Banda implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Getter
    @Setter
    private Long id;
    @Column
    @Getter
    @Setter
    private String nombre;
    @Column
    @Getter
    @Setter
    private int CantIntegrantes;
    @Column
    @Getter
    @Setter
    private String genero;
    @OneToMany()
    private Set<Integrante> integrantes = new HashSet<>();

}
