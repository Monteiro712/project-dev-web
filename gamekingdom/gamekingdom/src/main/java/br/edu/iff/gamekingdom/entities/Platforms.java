package br.edu.iff.gamekingdom.entities;

import java.io.Serializable;

import jakarta.persistence.*;

@Entity
public class Platforms implements Serializable{
    private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;

    public Platforms(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    public Platforms() {

    }
    public void setId(Long id) {
        this.id = id;
    }
    public Long getId() {
        return id;
    }
}
