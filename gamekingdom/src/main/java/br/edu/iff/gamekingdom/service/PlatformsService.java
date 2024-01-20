package br.edu.iff.gamekingdom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.iff.gamekingdom.entities.Platforms;
import br.edu.iff.gamekingdom.entities.Games;
import br.edu.iff.gamekingdom.repository.PlatformsRepository;

@Service
public class PlatformsService {

    private final PlatformsRepository platformsRepository;

    @Autowired
    public PlatformsService(PlatformsRepository platformsRepository) {
        this.platformsRepository = platformsRepository;
    }

    public Platforms findPlatformByGame(Games game) {
        return platformsRepository.findByGames(game);
    }

    // Outros métodos do serviço, se necessário
}
