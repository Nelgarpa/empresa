package com.example.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Inventario;


@Repository
public interface InventarioRepository extends MongoRepository<Inventario, String> {
	
	List<Inventario> findByNombreContainingIgnoreCaseAndUsuarioContainingIgnoreCaseAndObraContainingIgnoreCase(String nombre, String usuario, String obra);
	
}