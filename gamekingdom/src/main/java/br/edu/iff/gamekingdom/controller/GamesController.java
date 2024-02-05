package br.edu.iff.gamekingdom.controller;

import br.edu.iff.gamekingdom.entities.Games;
import br.edu.iff.gamekingdom.service.GamesService;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/games")
public class GamesController {

	private final GamesService gamesService;

	public GamesController(GamesService gamesService) {
		this.gamesService = gamesService;
	}

	@PostMapping
	public ResponseEntity<Games> addGame(@RequestBody Games game) {
		Games newGame = gamesService.addGame(game);
		return ResponseEntity.status(HttpStatus.CREATED).body(newGame);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Games> updateGame(@PathVariable Long id, @RequestBody Games game) {
		Games updatedGame = gamesService.updateGame(id, game);
		return ResponseEntity.ok(updatedGame);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deleteGame(@PathVariable Long id) {
		gamesService.deleteGame(id);
		return ResponseEntity.ok("Game deleted");
	}

	@GetMapping
	public ResponseEntity<List<Games>> listAllGames() {
		List<Games> games = gamesService.listAllGames();
		return ResponseEntity.ok(games);
	}

	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Games> findGameById(@PathVariable("id") Long id) {
		Games game = gamesService.findGameById(id);
		return ResponseEntity.ok(game);
	}
}