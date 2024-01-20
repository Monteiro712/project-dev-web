package br.edu.iff.gamekingdom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.iff.gamekingdom.entities.Games;
import br.edu.iff.gamekingdom.entities.Genres;
import br.edu.iff.gamekingdom.entities.Platforms;
import br.edu.iff.gamekingdom.entities.DigitalStores;

import java.util.List;

@Repository
public interface GamesRepository extends JpaRepository<Games, Long> {

    List<Games> findByGenres(Genres genre);

    List<Games> findByPlatforms(Platforms platform);

    List<Games> findByDigitalStores(DigitalStores digitalStore);
}
