package com.example.demo.controller;

import com.example.demo.models.Pedido;
import com.example.demo.repository.PedidoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin(origins = "*")
public class PedidoController {

    private final PedidoRepository repo;

    public PedidoController(PedidoRepository repo) {
        this.repo = repo;
    }

    @GetMapping
    public List<Pedido> getAll() {
        return repo.findAll();
    }

    @PostMapping
    public Pedido create(@RequestBody Pedido pedido) {
        return repo.save(pedido);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repo.deleteById(id);
    }

    @PutMapping("/{id}/estado")
    public Pedido marcarEntregado(@PathVariable String id, @RequestParam String chequeadoPor) {
        Pedido pedido = repo.findById(id).orElseThrow();
        pedido.setEstado("entregado");
        pedido.setChequeadoPor(chequeadoPor);
        return repo.save(pedido);
    }
}
