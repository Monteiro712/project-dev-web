package br.edu.iff.gamekingdom.entities;

import jakarta.persistence.*;

@Entity
public class Genres {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    public Genres(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Genres() {

    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
}
