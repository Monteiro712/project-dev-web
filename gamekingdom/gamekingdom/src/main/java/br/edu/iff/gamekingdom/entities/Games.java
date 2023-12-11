package br.edu.iff.gamekingdom.entities;

import jakarta.persistence.*;

import java.io.Serializable;

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
    @Column(name = "genre")
    private Genres genre;
    /*@Column(name = "platforms")
    private List<Platforms> platforms;
    @Column(name = "digital_stores")
    private List<DigitalStores> digitalStores;*/

    public Games(Long id, String title, double price, boolean isWishlist, Genres genre) {
        this.id = id;
        this.title = title;
        this.price = price;
        this.isWishlist = isWishlist;
        this.genre = genre;
      
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

    public Genres getGenre() {
        return genre;
    }

    public void setGenre(Genres genre) {
        this.genre = genre;
    }

    /*public List<Platforms> getPlatforms() {
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
    }*/
}

