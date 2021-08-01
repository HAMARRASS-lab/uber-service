package com.hamzetsaa.uberprojectservice.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hamzetsaa.uberprojectservice.entities.Chauffeur;
import com.hamzetsaa.uberprojectservice.entities.LieuFavori;
import com.hamzetsaa.uberprojectservice.services.LieuFavoriService;

@RestController
@RequestMapping(value = "/api")
public class LieuFavoriController {

	// injection service object

		private LieuFavoriService lieuFavoriService;
		@Autowired
		public LieuFavoriController(LieuFavoriService theLieuFavoriService) {

			lieuFavoriService = theLieuFavoriService;
		}

		@GetMapping(value = "/lieuFavoris")
		public List<LieuFavori> findAll() {

			return lieuFavoriService.findAll();
		}
		
		@GetMapping(value = "/lieuFavoris/{idLieuFavori}")
		public Optional<LieuFavori> getLieuFavori(@PathVariable int idLieuFavori) {

			Optional<LieuFavori> theLieuFavori = lieuFavoriService.findById(idLieuFavori);

			if (theLieuFavori == null) {

				throw new RuntimeException(" the LieuFavori is not found " + idLieuFavori);

			}
			return theLieuFavori;
		}
		
		@PostMapping("/lieuFavoris")
		public LieuFavori addLieuFavori(@RequestBody LieuFavori theLieuFavori) {

			/* theVille.setIdVille(0); */
			lieuFavoriService.save(theLieuFavori);

			return theLieuFavori;
		}
		
		@PutMapping("/lieuFavoris")
		public LieuFavori updateLieuFavori(@RequestBody LieuFavori theLieuFavori) {

			lieuFavoriService.save(theLieuFavori);

			return theLieuFavori;
		}

		@DeleteMapping(value = "/lieuFavoris/{idLieuFavori}")
		public String deleteLieuFavori(@PathVariable int idLieuFavori) {

			Optional<LieuFavori> theLieuFavori = lieuFavoriService.findById(idLieuFavori);

			if (theLieuFavori == null) {

				throw new RuntimeException(" the id of LieuFavori is not found " + idLieuFavori);
			}
			lieuFavoriService.deleteById(idLieuFavori);

			return " the LieuFavori was deleted " + idLieuFavori;

		}
}
