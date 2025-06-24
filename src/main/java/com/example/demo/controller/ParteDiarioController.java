package com.example.demo.controller;

import com.example.demo.models.ParteDiario;
import com.example.demo.repository.ParteDiarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/partes")
@CrossOrigin(origins = "*")
public class ParteDiarioController {

    private final ParteDiarioRepository repo;

    public ParteDiarioController(ParteDiarioRepository repo) {
        this.repo = repo;
    }

    @GetMapping("/trabajador/{trabajadorId}")
    public List<ParteDiario> getByTrabajador(@PathVariable String trabajadorId) {
        return repo.findByTrabajadorId(trabajadorId);
    }

    @PostMapping
    public ParteDiario create(@RequestBody ParteDiario parte) {
        return repo.save(parte);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
