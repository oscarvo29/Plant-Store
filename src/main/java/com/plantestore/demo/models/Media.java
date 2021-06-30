package com.plantestore.demo.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@ToString
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Media {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long mediaId;
    private String mediaUrl;

    @JsonBackReference(value = "plants")
    @OneToMany(mappedBy = "media")
    Set<Plant> plants = new HashSet<>();

}
