package br.edu.iff.gamekingdom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import br.edu.iff.gamekingdom.entities.Platforms;
import br.edu.iff.gamekingdom.entities.Games;
import br.edu.iff.gamekingdom.repository.PlatformsRepository;

import java.util.List;

@Service
public class PlatformsService {

    private final PlatformsRepository platformsRepository;

    @Autowired
    public PlatformsService(PlatformsRepository platformsRepository) {
        this.platformsRepository = platformsRepository;
    }

    public Platforms addPlatform(Platforms platform) {
        // Lógica para adicionar uma nova plataforma
        return platformsRepository.save(platform);
    }

    public Platforms updatePlatform(Long id, Platforms platform) {
        // Lógica para atualizar uma plataforma existente
        Platforms existingPlatform = platformsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Platform not found"));
        existingPlatform.setName(platform.getName());
        // Adicione lógica para atualizar outros campos, se necessário
        return platformsRepository.save(existingPlatform);
    }

    public void deletePlatform(Long id) {
        // Lógica para deletar uma plataforma
        platformsRepository.deleteById(id);
    }

    public List<Platforms> listAllPlatforms() {
        // Lógica para retornar todas as plataformas
        return platformsRepository.findAll();
    }

    public Platforms findPlatformById(Long id) {
        // Lógica para buscar uma plataforma pelo ID
        return platformsRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Platform not found with id: " + id));
    }
}
