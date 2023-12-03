package br.edu.iff.gamekingdom.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/api/v1/games")
public class GamesController {

	@PostMapping("")
	@ResponseBody
	public String addGame(Long id, String title, double price, boolean isWishlist, String platforms, String digitalStores) {
		return "game added.";
	}

	@PutMapping("/{id}")
	@ResponseBody
	public String updateGame(@PathVariable("id")Long id, String title, double price, boolean isWishlist, String platforms, String digitalStores) {
		return "game updated.";
	}

	@DeleteMapping("/{id}")
	@ResponseBody

	public String deleteGame(@PathVariable("id") Long id) {
		return "game deleted";
	}

	@GetMapping("/{id}")
	@ResponseBody

	public String findGame(@PathVariable("id") Long id) {
		return "game found";
	}

	@GetMapping("")
	@ResponseBody

	public String listAll() {
		return "all games is there.";
	}

}