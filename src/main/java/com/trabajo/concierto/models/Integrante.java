package com.trabajo.concierto.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Table(name = "integrantes")
public class Integrante implements Serializable {
    @Id
    @Getter
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column
    @Getter
    @Setter
    private String name;
    @Column
    @Getter
    @Setter
    private String instrumento;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "banda_id" )
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @Setter
    @Getter
    private Banda banda;
}
