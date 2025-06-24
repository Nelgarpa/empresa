package com.example.demo.repository;

import com.example.demo.models.ParteDiario;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ParteDiarioRepository extends MongoRepository<ParteDiario, String> {
    List<ParteDiario> findByTrabajadorId(String trabajadorId);
}
