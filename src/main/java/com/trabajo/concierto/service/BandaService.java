package com.trabajo.concierto.service;

import com.trabajo.concierto.models.Banda;
import com.trabajo.concierto.repository.IBandaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BandaService implements IBandaService{
    @Autowired
    private IBandaRepository br;

    @Override
    public List<Banda> findAll() {
        return br.findAll();
    }

    @Override
    public Banda findByID(Long id) {
        return br.findById(id).orElse(null);
    }

    @Override
    public Banda save(Banda e) {
        return br.save(e);
    }
}
