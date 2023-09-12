package com.trabajo.concierto.controller;

import com.trabajo.concierto.service.IIntegranteService;
import com.trabajo.concierto.models.Integrante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/integrante")
public class IntegranteController {
    @Autowired
    private IIntegranteService is;

    @GetMapping("/listar")
    public List<Integrante> list(){
        return is.findAll();
    }
    @GetMapping("/listar/banda/{id}")
    public List<Integrante> listIntegrantes(@PathVariable Long id){
        return is.findByBandaId(id);
    }
    @PostMapping()
    public Integrante save(@RequestBody Integrante e){
        e.setInstrumento(e.getInstrumento().toLowerCase());
        return is.save(e);
    }
    @GetMapping("/{instrumento}")
    public List<Integrante> findInstrumento(@PathVariable String instrumento){
        return is.findByInstrumento(instrumento.toLowerCase());
    }
}
