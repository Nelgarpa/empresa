package com.example.demo.controller;



import com.example.demo.models.Inventario;
import com.example.demo.repository.InventarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/inventario")
@CrossOrigin(origins = "*")
public class InventarioController {

    private final InventarioRepository repo;

    public InventarioController(InventarioRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Inventario> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Inventario create(@RequestBody Inventario inv) {
        return repo.save(inv);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
    
    @GetMapping("/buscarInventario")
    public List<Inventario> buscar(
        @RequestParam(required = false) String nombre,
        @RequestParam(required = false) String usuario,
        @RequestParam(required = false) String obra
    ) {
        return repo.findByNombreContainingIgnoreCaseAndUsuarioContainingIgnoreCaseAndObraContainingIgnoreCase(
            nombre != null ? nombre : "",
            usuario != null ? usuario : "",
            obra != null ? obra : ""
        );
    }
}