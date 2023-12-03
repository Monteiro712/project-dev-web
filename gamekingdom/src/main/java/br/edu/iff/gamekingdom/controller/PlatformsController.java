package br.edu.iff.gamekingdom.controller;

import io.swagger.v3.oas.annotations.Operation;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1/platform")
public class PlatformsController {

	@PostMapping("")
	@ResponseBody
	@Operation(summary = "Add a store")
	public String addPlatform(Long id, String name) {
		return "platform added.";
	}

	@PutMapping("/{id}")
	@ResponseBody
	@Operation(summary = "Update a store")
	public String updatePlatform(@PathVariable("id")Long id, String name) {
		return "platform updated.";
	}

	@DeleteMapping("/{id}")
	@ResponseBody
	@Operation(summary = "Delete a store")
	public String deletePlatform(@PathVariable("id") Long id) {
		return "platform deleted";
	}

	@GetMapping("/{id}")
	@ResponseBody
	@Operation(summary = "Return a store")
	public String findPlatform(@PathVariable("id") Long id) {
		return "platform found";
	}

	@GetMapping("")
	@ResponseBody
	@Operation(summary = "List all platforms")
	public String listAll() {
		return "all platforms is there.";
	}
}
