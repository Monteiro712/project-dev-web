package br.edu.iff.gamekingdom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.iff.gamekingdom.entities.Login;
import br.edu.iff.gamekingdom.entities.Person;
import br.edu.iff.gamekingdom.repository.LoginRepository;

@Service
public class LoginService {

    private final LoginRepository loginRepository;

    @Autowired
    public LoginService(LoginRepository loginRepository) {
        this.loginRepository = loginRepository;
    }

    public Login findLoginByPerson(Person person) {
        return loginRepository.findByPerson(person);
    }

    public Login findLoginByEmail(String email) {
        return loginRepository.findByEmail(email);
    }

    // Outros métodos do serviço, se necessário
}
