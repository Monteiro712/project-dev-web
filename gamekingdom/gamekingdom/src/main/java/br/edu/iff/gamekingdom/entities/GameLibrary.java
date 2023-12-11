package br.edu.iff.gamekingdom.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
public class GameLibrary implements Serializable{
    private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "games")
    private String games;
    public GameLibrary(String games) {
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
