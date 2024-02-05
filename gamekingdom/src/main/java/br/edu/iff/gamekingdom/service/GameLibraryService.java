package br.edu.iff.gamekingdom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.iff.gamekingdom.entities.GameLibrary;
import br.edu.iff.gamekingdom.entities.Person;
import br.edu.iff.gamekingdom.repository.GameLibraryRepository;

@Service
public class GameLibraryService {

    private final GameLibraryRepository gameLibraryRepository;

    @Autowired
    public GameLibraryService(GameLibraryRepository gameLibraryRepository) {
        this.gameLibraryRepository = gameLibraryRepository;
    }

    public GameLibrary findLibraryByPerson(Person person) {
        return gameLibraryRepository.findByPerson(person);
    }

    // Outros métodos do serviço, se necessário
}
