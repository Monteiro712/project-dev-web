package br.edu.iff.gamekingdom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.iff.gamekingdom.entities.Games;
import br.edu.iff.gamekingdom.entities.Genres;
import br.edu.iff.gamekingdom.entities.Platforms;
import br.edu.iff.gamekingdom.entities.DigitalStores;
import br.edu.iff.gamekingdom.repository.GamesRepository;

import java.util.List;

@Service
public class GamesService {

    private final GamesRepository gamesRepository;

    @Autowired
    public GamesService(GamesRepository gamesRepository) {
        this.gamesRepository = gamesRepository;
    }

    public List<Games> findGamesByGenre(Genres genre) {
        return gamesRepository.findByGenres(genre);
    }

    public List<Games> findGamesByPlatform(Platforms platform) {
        return gamesRepository.findByPlatforms(platform);
    }

    public List<Games> findGamesByDigitalStore(DigitalStores digitalStore) {
        return gamesRepository.findByDigitalStores(digitalStore);
    }

    // Outros métodos do serviço, se necessário
}
