package br.edu.iff.gamekingdom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.iff.gamekingdom.entities.Genres;
import br.edu.iff.gamekingdom.entities.Games;

@Repository
public interface GenresRepository extends JpaRepository<Genres, Long> {

    Genres findByGames(Games game);
}
