package br.edu.iff.gamekingdom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
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

    public Games addGame(Games game) {
        // Lógica para adicionar um novo jogo
        return gamesRepository.save(game);
    }

    public Games updateGame(Long id, Games game) {
        // Lógica para atualizar um jogo existente
        Games existingGame = gamesRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Game not found"));
        existingGame.setTitle(game.getTitle());
        existingGame.setPrice(game.getPrice());
        existingGame.setWishlist(game.isWishlist());
        // Adicione lógica para atualizar outros campos, se necessário
        return gamesRepository.save(existingGame);
    }

    public void deleteGame(Long id) {
        // Lógica para deletar um jogo
        gamesRepository.deleteById(id);
    }

    public List<Games> listAllGames() {
        // Lógica para retornar todos os jogos
        return gamesRepository.findAll();
    }

    public Games findGameById(Long id) {
        // Lógica para buscar um jogo pelo ID
        return gamesRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Game not found with id: " + id));
    }
}
