package br.edu.iff.gamekingdom.entities;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Genres implements Serializable{
    private static final long serialVersionUID = 1L;
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
