package br.edu.iff.gamekingdom.entities;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class GameLibrary {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "games")
    private List<Games> games;
    public GameLibrary(List<Games> games) {
        this.games = games;
    }
    public GameLibrary() {

    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
}
