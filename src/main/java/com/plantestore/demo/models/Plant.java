package com.plantestore.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@ToString
@Getter @Setter
@NoArgsConstructor
@AllArgsConstructor
public class Plant {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long plantId;
    private String name;
    private String color;
    private double height;
    private double weight;
    private String location;

    @JsonBackReference(value = "media")
    @OneToMany(mappedBy = "plant")
    Set<Media> media = new HashSet<>();

    public Plant(String name, String color, double height, double weight, String location) {
        this.name = name;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.location = location;
    }
}
