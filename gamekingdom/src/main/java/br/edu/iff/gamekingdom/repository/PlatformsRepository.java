package br.edu.iff.gamekingdom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.iff.gamekingdom.entities.Platforms;
import br.edu.iff.gamekingdom.entities.Games;

@Repository
public interface PlatformsRepository extends JpaRepository<Platforms, Long> {

    Platforms findByGames(Games game);
}
