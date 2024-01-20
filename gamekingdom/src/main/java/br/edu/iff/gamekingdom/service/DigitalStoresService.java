package br.edu.iff.gamekingdom.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import br.edu.iff.gamekingdom.entities.DigitalStores;
import br.edu.iff.gamekingdom.repository.DigitalStoresRepository;

@Service
public class DigitalStoresService {

    private final DigitalStoresRepository digitalStoresRepository;

    @Autowired
    public DigitalStoresService(DigitalStoresRepository digitalStoresRepository) {
        this.digitalStoresRepository = digitalStoresRepository;
    }

    public DigitalStores findStoreByName(String name) {
        return digitalStoresRepository.findByName(name);
    }

    // Outros métodos do serviço, se necessário
}
