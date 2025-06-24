package com.example.demo.repository;

import com.example.demo.models.Planificacion;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlanificacionRepository extends MongoRepository<Planificacion, String> {
}