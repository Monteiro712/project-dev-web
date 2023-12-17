package br.edu.iff.gamekingdom.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.List;

@Entity
public class GameLibrary implements Serializable{
    private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToMany
    @JoinTable(
            name = "gamelib_games",
            joinColumns = @JoinColumn(name = "gamelibrary_id"),
            inverseJoinColumns = @JoinColumn(name = "games_id"))
    private List<Games> games;
    @ManyToOne
    @JoinColumn(name = "person_id")
    private Person person;
    public GameLibrary(Long id, List<Games> games, Person person) {
        this.id = id;
        this.games = games;
        this.person = person;
    }
    public GameLibrary() {

    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public List<Games> getGames() {
        return games;
    }

    public void setGames(List<Games> games) {
        this.games = games;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
