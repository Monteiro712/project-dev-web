package br.edu.iff.gamekingdom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.iff.gamekingdom.entities.Genres;
import br.edu.iff.gamekingdom.entities.Games;
import br.edu.iff.gamekingdom.repository.GenresRepository;

@Service
public class GenresService {

    private final GenresRepository genresRepository;

    @Autowired
    public GenresService(GenresRepository genresRepository) {
        this.genresRepository = genresRepository;
    }

    public Genres findGenreByGame(Games game) {
        return genresRepository.findByGames(game);
    }

    // Outros métodos do serviço, se necessário
}
