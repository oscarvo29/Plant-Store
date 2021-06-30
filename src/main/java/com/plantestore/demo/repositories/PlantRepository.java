package com.plantestore.demo.repositories;

import com.plantestore.demo.models.Plant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PlantRepository extends JpaRepository<Plant, Long> {
}
