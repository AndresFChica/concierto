package com.trabajo.concierto.service;

import com.trabajo.concierto.models.Banda;

import java.util.List;

public interface IBandaService {
    public List<Banda> findAll();
    public Banda findByID(Long id);
    public Banda save(Banda e);
}
