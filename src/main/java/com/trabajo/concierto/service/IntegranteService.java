package com.trabajo.concierto.service;

import com.trabajo.concierto.models.Integrante;
import com.trabajo.concierto.repository.IIntegranteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IntegranteService implements IIntegranteService{
    @Autowired
    private IIntegranteRepository ir;
    @Override
    public List<Integrante> findAll() {
        return ir.findAll();
    }

    @Override
    public List<Integrante> findByBandaId(Long bandaId) {
        return ir.findByBandaId(bandaId);
    }

    @Override
    public List<Integrante> findByInstrumento(String instrumento) {
        return ir.findByInstrumento(instrumento);
    }

    @Override
    public Integrante save(Integrante e) {
        return ir.save(e);
    }

    @Override
    public Integrante findById(Long id) {
        return ir.findById(id).orElse(null);
    }
}
