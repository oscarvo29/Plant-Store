package com.plantestore.demo.repositories;

import com.plantestore.demo.models.Media;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MediaRepository extends JpaRepository<Media, Long> {
}
