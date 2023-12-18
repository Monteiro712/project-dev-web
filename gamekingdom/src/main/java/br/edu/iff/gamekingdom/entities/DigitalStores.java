package br.edu.iff.gamekingdom.entities;

import jakarta.persistence.*;

@Entity
public class DigitalStores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column (name = "url")
    private String url;

    public DigitalStores(Long id, String name, String url) {
        this.id = id;
        this.name = name;
        this.url = url;
    }
    public DigitalStores() {

    }
}
