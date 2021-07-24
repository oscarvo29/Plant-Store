package com.plantestore.demo.service;

import com.plantestore.demo.models.Plant;
import com.plantestore.demo.repositories.PlantRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlantService {
    private final PlantRepository plantRepository;

    public void saveOne(Plant plant) {
        plantRepository.save(plant);
    }

    public List<Plant> getAll() {
        return plantRepository.findAll();
    }

    public Plant findById(Long id) {
        return plantRepository.findById(id).get();
    }

    public void delete(Long id) {
        plantRepository.deleteById(id);
    }

}
