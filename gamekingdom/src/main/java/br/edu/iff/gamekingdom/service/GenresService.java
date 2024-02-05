package br.edu.iff.gamekingdom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import br.edu.iff.gamekingdom.entities.Genres;
import br.edu.iff.gamekingdom.entities.Games;
import br.edu.iff.gamekingdom.repository.GenresRepository;

import java.util.List;

@Service
public class GenresService {

    private final GenresRepository genresRepository;

    @Autowired
    public GenresService(GenresRepository genresRepository) {
        this.genresRepository = genresRepository;
    }

    public Genres addGenre(Genres genre) {
        // Lógica para adicionar um novo gênero
        return genresRepository.save(genre);
    }

    public Genres updateGenre(Long id, Genres genre) {
        // Lógica para atualizar um gênero existente
        Genres existingGenre = genresRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Genre not found"));
        existingGenre.setName(genre.getName());
        // Adicione lógica para atualizar outros campos, se necessário
        return genresRepository.save(existingGenre);
    }

    public void deleteGenre(Long id) {
        // Lógica para deletar um gênero
        genresRepository.deleteById(id);
    }

    public List<Genres> listAllGenres() {
        // Lógica para retornar todos os gêneros
        return genresRepository.findAll();
    }

    public Genres findGenreById(Long id) {
        // Lógica para buscar um gênero pelo ID
        return genresRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Genre not found with id: " + id));
    }
}

