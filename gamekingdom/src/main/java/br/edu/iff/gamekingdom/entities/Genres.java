package br.edu.iff.gamekingdom.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Genres implements Serializable{
    private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @ManyToMany
    @JoinTable(
            name = "genres_games",
            joinColumns = @JoinColumn(name = "genres_id"),
            inverseJoinColumns = @JoinColumn(name = "games_id"))
    private List<Games> games;

    public Genres(Long id, String name, List<Games> games) {
        this.id = id;
        this.name = name;
        this.games = games;
    }
    public Genres() {

    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Games> getGames() {
        return games;
    }

    public void setGames(List<Games> games) {
        this.games = games;
    }
}
