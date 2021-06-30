package com.plantestore.demo.Data;

import com.plantestore.demo.models.Plant;
import com.plantestore.demo.service.PlantService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class InitData {
    private final PlantService plantService;

    @Bean
    @Profile("!testing")
    public void InsertDefaultData() {
        plantService.saveOne(new Plant("Oscars plante", "Hvid", 150.5, 10.0, "Tåsinge"));
        plantService.saveOne(new Plant("Oscars plante", "Hvid", 150.5, 10.0, "Tåsinge"));
        plantService.saveOne(new Plant("Oscars plante", "Hvid", 150.5, 10.0, "Tåsinge"));
        plantService.saveOne(new Plant("Oscars plante", "Hvid", 150.5, 10.0, "Tåsinge"));
    }
}

