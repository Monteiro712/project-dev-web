package br.edu.iff.gamekingdom.controller;


import br.edu.iff.gamekingdom.entities.Genres;
import br.edu.iff.gamekingdom.service.GenresService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/genres")
public class GenresController {

    private final GenresService genresService;

    public GenresController(GenresService genresService) {
        this.genresService = genresService;
    }

    @PostMapping
    public ResponseEntity<Genres> addGenre(@RequestBody Genres genre) {
        Genres newGenre = genresService.addGenre(genre);
        return ResponseEntity.status(HttpStatus.CREATED).body(newGenre);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Genres> updateGenre(@PathVariable Long id, @RequestBody Genres genre) {
        Genres updatedGenre = genresService.updateGenre(id, genre);
        return ResponseEntity.ok(updatedGenre);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteGenre(@PathVariable Long id) {
        genresService.deleteGenre(id);
        return ResponseEntity.ok("Genre deleted");
    }

    @GetMapping
    public ResponseEntity<List<Genres>> listAllGenres() {
        List<Genres> genres = genresService.listAllGenres();
        return ResponseEntity.ok(genres);
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Genres> findGenreById(@PathVariable("id") Long id) {
        Genres genre = genresService.findGenreById(id);
        return ResponseEntity.ok(genre);
    }
}
