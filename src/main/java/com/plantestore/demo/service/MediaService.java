package com.plantestore.demo.service;

import com.plantestore.demo.models.Media;
import com.plantestore.demo.repositories.MediaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MediaService {
    private final MediaRepository mediaRepository;

    public void saveMedie(Media media) {
        mediaRepository.save(media);
    }
}
