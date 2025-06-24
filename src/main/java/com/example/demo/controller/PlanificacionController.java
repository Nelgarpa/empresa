package com.example.demo.controller;

import com.example.demo.models.Partida;
import com.example.demo.models.Planificacion;
import com.example.demo.repository.PlanificacionRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/planificaciones")
@CrossOrigin(origins = "*")
public class PlanificacionController {

    private final PlanificacionRepository repo;

    public PlanificacionController(PlanificacionRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Planificacion> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Planificacion create(@RequestBody Planificacion planificacion) {
        return repo.save(planificacion);
    }

    @PutMapping("/{id}/marcar")
    public Planificacion marcarPartidaComoGestionada(@PathVariable String id, @RequestParam String nombrePartida) {
        Planificacion plan = repo.findById(id).orElseThrow();
        for (Partida p : plan.getPartidas()) {
            if (p.getNombre().equalsIgnoreCase(nombrePartida)) {
                p.setEstado("gestionada");
            }
        }
        return repo.save(plan);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }
}
