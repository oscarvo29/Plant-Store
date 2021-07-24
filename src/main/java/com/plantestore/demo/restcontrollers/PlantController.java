package com.plantestore.demo.restcontrollers;

import com.plantestore.demo.models.Plant;
import com.plantestore.demo.service.PlantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/plant")
@AllArgsConstructor
@CrossOrigin( origins = "*")
public class PlantController {
    private final PlantService plantService;

    @CrossOrigin( origins = "*")
    @GetMapping("/get-by-id/{id}")
    public Plant getById(@PathVariable Long id) {
        return plantService.findById(id);
    }
    @CrossOrigin( origins = "*")
    @GetMapping("/get-all")
    public List<Plant> getAll() {
        return plantService.getAll();
    }

    @CrossOrigin( origins = "*")
    @PostMapping("/create-one")
    public void createOne(@RequestBody Plant plant) {
        plantService.saveOne(plant);
    }

    @CrossOrigin( origins = "*")
    @PostMapping("/delete-plant/{id}")
    public void deletePlant(@PathVariable Long id) {
       plantService.delete(id);
    }
}
