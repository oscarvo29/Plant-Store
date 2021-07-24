package com.plantestore.demo.Data;

import com.plantestore.demo.models.Media;
import com.plantestore.demo.models.Plant;
import com.plantestore.demo.service.MediaService;
import com.plantestore.demo.service.PlantService;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class InitData {
    private final PlantService plantService;
    private final MediaService mediaService;

    @Bean
    @Profile("!testing")
    public void InsertDefaultData() {
        plantService.saveOne(new Plant("Oscars plante", "Hvid", 150.5, 10.0, "Tåsinge"));
        plantService.saveOne(new Plant("Oscars plante", "Hvid", 150.5, 10.0, "Tåsinge"));
        plantService.saveOne(new Plant("Oscars plante", "Hvid", 150.5, 10.0, "Tåsinge"));
        plantService.saveOne(new Plant("Oscars plante", "Hvid", 150.5, 10.0, "Tåsinge"));

        mediaService.saveMedie(new Media( 1L, "daadada", plantService.findById(1L)));
        mediaService.saveMedie(new Media( 2L, "daadada", plantService.findById(1L)));
        mediaService.saveMedie(new Media( 3L, "daadada", plantService.findById(2L)));
        mediaService.saveMedie(new Media( 4L, "daadada", plantService.findById(1L)));
        mediaService.saveMedie(new Media( 5L, "daadada", plantService.findById(2L)));
    }
}

