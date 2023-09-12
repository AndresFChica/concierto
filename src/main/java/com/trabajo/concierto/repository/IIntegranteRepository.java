package com.trabajo.concierto.repository;

import com.trabajo.concierto.models.Integrante;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IIntegranteRepository extends JpaRepository<Integrante, Long> {
    List<Integrante> findByBandaId(Long bandaId);
    List<Integrante> findByInstrumento(String instrumento);
}
