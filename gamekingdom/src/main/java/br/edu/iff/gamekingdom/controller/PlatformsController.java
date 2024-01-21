package br.edu.iff.gamekingdom.controller;

import br.edu.iff.gamekingdom.entities.Platforms;
import br.edu.iff.gamekingdom.service.PlatformsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/api/v1/platform")
public class PlatformsController {

	private final PlatformsService platformsService;

	public PlatformsController(PlatformsService platformsService) {
		this.platformsService = platformsService;
	}

	@PostMapping
	public ResponseEntity<Platforms> addPlatform(@RequestBody Platforms platform) {
		Platforms newPlatform = platformsService.addPlatform(platform);
		return ResponseEntity.status(HttpStatus.CREATED).body(newPlatform);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Platforms> updatePlatform(@PathVariable Long id, @RequestBody Platforms platform) {
		Platforms updatedPlatform = platformsService.updatePlatform(id, platform);
		return ResponseEntity.ok(updatedPlatform);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<String> deletePlatform(@PathVariable Long id) {
		platformsService.deletePlatform(id);
		return ResponseEntity.ok("Platform deleted");
	}

	@GetMapping
	public ResponseEntity<List<Platforms>> listAllPlatforms() {
		List<Platforms> platforms = platformsService.listAllPlatforms();
		return ResponseEntity.ok(platforms);
	}

	@GetMapping("/{id}")
	@ResponseBody
	public ResponseEntity<Platforms> findPlatformById(@PathVariable("id") Long id) {
		Platforms platform = platformsService.findPlatformById(id);
		return ResponseEntity.ok(platform);
	}
}