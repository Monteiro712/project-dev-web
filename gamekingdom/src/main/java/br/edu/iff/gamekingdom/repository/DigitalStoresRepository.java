package br.edu.iff.gamekingdom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.iff.gamekingdom.entities.DigitalStores;

@Repository
public interface DigitalStoresRepository extends JpaRepository<DigitalStores, Long> {
    DigitalStores findByName(String name);
}

