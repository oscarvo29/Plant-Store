package com.plantestore.demo.restcontrollers;

import com.plantestore.demo.models.Plant;
import com.plantestore.demo.service.PlantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/plant")
@AllArgsConstructor
public class PlantController {
    private final PlantService plantService;

    @GetMapping("/get-by-id/{id}")
    public Plant getById(@PathVariable Long id) {
        return plantService.findById(id);
    }

    @GetMapping("/get-all")
    public List<Plant> getAll() {
        return plantService.getAll();
    }

    @PostMapping("/create-one")
    public void createOne(@RequestBody Plant plant) {
        plantService.saveOne(plant);
    }
}
