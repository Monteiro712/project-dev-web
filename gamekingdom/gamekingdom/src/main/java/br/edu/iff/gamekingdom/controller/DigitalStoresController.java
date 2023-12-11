package br.edu.iff.gamekingdom.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/stores")
public class DigitalStoresController {

	@PostMapping("")
	@ResponseBody

	public String addStore(Long id, String name, String url) {
		return "game added.";
	}

	@PutMapping("/{id}")
	@ResponseBody

	public String updateStore(@PathVariable("id")Long id, String name, String url) {
		return "game updated.";
	}

	@DeleteMapping("/{id}")
	@ResponseBody

	public String deleteStore(@PathVariable("id") Long id) {
		return "store deleted";
	}

	@GetMapping("/{id}")
	@ResponseBody

	public String findStore(@PathVariable("id") Long id) {
		return "store found";
	}

	@GetMapping("")
	@ResponseBody

	public String listAll() {
		return "all stores is there.";
	}
}
