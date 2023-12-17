package br.edu.iff.gamekingdom.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;
@Entity
public class DigitalStores implements Serializable{
    private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @Column (name = "url")
    private String url;
    @ManyToMany
    @JoinTable(
            name = "digitalstores_games",
            joinColumns = @JoinColumn(name = "digitalstores_id"),
            inverseJoinColumns = @JoinColumn(name = "games_id"))
    private List<Games> games;

    public DigitalStores(Long id, String name, String url, List<Games> games) {
        this.id = id;
        this.name = name;
        this.url = url;
        this.games = games;
    }
    public DigitalStores() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public List<Games> getGames() {
        return games;
    }

    public void setGames(List<Games> games) {
        this.games = games;
    }
}
