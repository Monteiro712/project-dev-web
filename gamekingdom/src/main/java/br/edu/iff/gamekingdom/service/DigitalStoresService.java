package br.edu.iff.gamekingdom.service;

import br.edu.iff.gamekingdom.entities.Games;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import br.edu.iff.gamekingdom.entities.DigitalStores;
import br.edu.iff.gamekingdom.repository.DigitalStoresRepository;

import java.util.List;

@Service
public class DigitalStoresService {

    private final DigitalStoresRepository digitalStoresRepository;

    @Autowired
    public DigitalStoresService(DigitalStoresRepository digitalStoresRepository) {
        this.digitalStoresRepository = digitalStoresRepository;
    }

    public DigitalStores addStore(DigitalStores store) {

        return digitalStoresRepository.save(store);
    }

    public DigitalStores updateStore(Long id, DigitalStores store) {

        DigitalStores existingStore = digitalStoresRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Store not found"));
        existingStore.setName(store.getName());
        existingStore.setUrl(store.getUrl());

        return digitalStoresRepository.save(existingStore);
    }

    public void deleteStore(Long id) {

        digitalStoresRepository.deleteById(id);
    }

    public List<DigitalStores> listAllStores() {

        return digitalStoresRepository.findAll();
    }

    public DigitalStores findDigitalStoreById(Long id) {
        // Lógica para buscar um jogo pelo ID
        return digitalStoresRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("digital store not found with id: " + id));
    }
}
