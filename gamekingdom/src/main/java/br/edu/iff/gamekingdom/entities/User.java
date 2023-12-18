/*package br.edu.iff.gamekingdom.entities;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class User extends Person{
    private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "library_name")
    @ElementCollection
    private List<String>libraryName;
    @OneToOne(mappedBy ="login")
    @Column(name = "login")
    private Login login;

    public User(Long id, String name, List<String> login, List<String> libraryName) {
        super(id, name, login);
        this.libraryName = libraryName;
    }

    public User() {

    }
    public List<String> getLibraryName() {
        return libraryName;
    }

    public void setLibraryName(List<String> libraryName) {
        this.libraryName = libraryName;
    }


}*/
