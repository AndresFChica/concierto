package com.trabajo.concierto.controller;

import com.trabajo.concierto.service.IBandaService;
import com.trabajo.concierto.models.Banda;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Banda")
public class BandaController {
    @Autowired
    private IBandaService bs;

    @GetMapping("/listar")
    public List<Banda> listar(){
        return bs.findAll();
    }
    @PostMapping("/save")
    public Banda guardar(@RequestBody Banda e){

        return bs.save(e);
    }
    @GetMapping("/listar/{id}")
    public Banda findById(@PathVariable Long id){
        return bs.findByID(id);
    }
}
