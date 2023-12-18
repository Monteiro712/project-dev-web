package br.edu.iff.gamekingdom.controller;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/genres")
public class GenresController {

    @PostMapping("")
    @ResponseBody

    public String addGenre(Long id, String name) {
        return "genre added.";
    }

    @PutMapping("/{id}")
    @ResponseBody

    public String updateGenre(@PathVariable("id")Long id, String name) {
        return "genre updated.";
    }

    @DeleteMapping("/{id}")
    @ResponseBody

    public String deleteGenre(@PathVariable("id") Long id) {
        return "genre deleted";
    }

    @GetMapping("/{id}")
    @ResponseBody

    public String findGenre(@PathVariable("id") Long id) {
        return "genre found";
    }

    @GetMapping("")
    @ResponseBody

    public String listAll() {
        return "all genre is there.";
    }
}
