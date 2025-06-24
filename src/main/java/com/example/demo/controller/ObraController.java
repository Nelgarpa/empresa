package com.example.demo.controller;

import com.example.demo.models.Obra;
import com.example.demo.repository.ObraRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/obras")
@CrossOrigin(origins = "*")
public class ObraController {

    private final ObraRepository repo;

    public ObraController(ObraRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Obra> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Obra create(@RequestBody Obra obra) {
        return repo.save(obra);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
