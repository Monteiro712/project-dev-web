package br.edu.iff.gamekingdom.entities;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
public class Games implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "title")
    private String title;
    @Column(name = "price")
    private double price;
    @Column(name = "wish_list")
    private boolean isWishlist;
    @ManyToMany(mappedBy = "games")
    private List<Genres> genres;
    @ManyToMany(mappedBy = "games")
    private List<Platforms> platforms;
    @ManyToMany(mappedBy = "games")
    private List<DigitalStores> digitalStores;
    @ManyToMany(mappedBy = "games")
    private List<GameLibrary> gameLibraries;

    public Games(Long id, String title, double price, boolean isWishlist, List<Genres> genres, List<Platforms> platforms, List<DigitalStores> digitalStores, List<GameLibrary> gameLibraries) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.isWishlist = isWishlist;
        this.genres = genres;
        this.platforms = platforms;
        this.digitalStores = digitalStores;
        this.gameLibraries = gameLibraries;
    }

    public Games() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWishlist() {
        return isWishlist;
    }

    public void setWishlist(boolean wishlist) {
        isWishlist = wishlist;
    }

    public List<Genres> getGenre() {
        return genres;
    }

    public void setGenre(List<Genres> genres) {
        this.genres = genres;
    }

    public List<Platforms> getPlatforms() {
        return platforms;
    }

    public void setPlatforms(List<Platforms> platforms) {
        this.platforms = platforms;
    }

    public List<DigitalStores> getDigitalStores() {
        return digitalStores;
    }

    public void setDigitalStores(List<DigitalStores> digitalStores) {
        this.digitalStores = digitalStores;
    }

    public List<GameLibrary> getGameLibraries() {
        return gameLibraries;
    }

    public void setGameLibraries(List<GameLibrary> gameLibraries) {
        this.gameLibraries = gameLibraries;
    }
}

