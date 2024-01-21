package br.edu.iff.gamekingdom.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import br.edu.iff.gamekingdom.entities.Login;
import br.edu.iff.gamekingdom.entities.Person;

@Repository
public interface LoginRepository extends JpaRepository<Login, Long> {

    Login findByPerson(Person person);

    Login findByEmail(String email);
}
