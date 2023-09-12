package com.trabajo.concierto.service;

import com.trabajo.concierto.models.Integrante;

import java.util.List;

public interface IIntegranteService {
    public List<Integrante> findAll();
    public List<Integrante> findByBandaId(Long bandaId);
    public List<Integrante> findByInstrumento(String instrumento);
    public Integrante save(Integrante e);
    public Integrante findById(Long id);
}
