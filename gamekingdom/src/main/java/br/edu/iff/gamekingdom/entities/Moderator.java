package br.edu.iff.gamekingdom.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Moderator extends Person{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Moderator(Long id, String name, String login) {
        super(id, name, login);

    }
    public Moderator() {

    }
    public void editPost() {

    }
    public void createAd() {

    }
}
