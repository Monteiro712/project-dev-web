package br.edu.iff.gamekingdom.entities;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
public class Person implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column (name = "name")
    private String name;

    @OneToOne(mappedBy = "person")
    private Login login;
    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GameLibrary> libraryName;

    public Person(Long id, String name, Login login, List<GameLibrary> libraryName) {
        super();
        this.id = id;
        this.name = name;
        this.login = login;
        this.libraryName = libraryName;
    }

    public Person() {

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

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public List<GameLibrary> getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(List<GameLibrary> libraryName) {
        this.libraryName = libraryName;
    }
}
