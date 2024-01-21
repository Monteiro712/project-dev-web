package br.edu.iff.gamekingdom.controller;


import br.edu.iff.gamekingdom.entities.DigitalStores;
import br.edu.iff.gamekingdom.service.DigitalStoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/stores")
public class DigitalStoresController {

	private final DigitalStoresService digitalStoresService;

	@Autowired
	public DigitalStoresController(DigitalStoresService digitalStoresService) {
		this.digitalStoresService = digitalStoresService;
	}

	@PostMapping
	public ResponseEntity<DigitalStores> addStore(@RequestBody DigitalStores store) {
		DigitalStores newStore = digitalStoresService.addStore(store);
		return ResponseEntity.status(HttpStatus.CREATED).body(newStore);
	}

	@PutMapping("/{id}")
	public ResponseEntity<DigitalStores> updateStore(@PathVariable Long id, @RequestBody DigitalStores store) {
		DigitalStores updatedStore = digitalStoresService.updateStore(id, store);
		return ResponseEntity.ok(updatedStore);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteStore(@PathVariable Long id) {
		digitalStoresService.deleteStore(id);
		return ResponseEntity.ok("Store deleted");
	}

	@GetMapping
	public ResponseEntity<List<DigitalStores>> listAllStores() {
		List<DigitalStores> stores = digitalStoresService.listAllStores();
		return ResponseEntity.ok(stores);
	}

	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<DigitalStores> findDigitalStoreById(@PathVariable("id") Long id) {
		 DigitalStores game = digitalStoresService.findDigitalStoreById(id);
		return ResponseEntity.ok(game);
	}
}
