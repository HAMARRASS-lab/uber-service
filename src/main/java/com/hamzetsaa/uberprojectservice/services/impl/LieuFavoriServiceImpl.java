package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.LieuFavori;
import com.hamzetsaa.uberprojectservice.repositories.LieuFavoriRepository;
import com.hamzetsaa.uberprojectservice.services.LieuFavoriService;
@Service
public class LieuFavoriServiceImpl implements LieuFavoriService {

	private LieuFavoriRepository lieuFavoriRepository;
	@Autowired
	public void  LieuFavoriServiceImpl(LieuFavoriRepository theLieuFavoriRepository) {
		lieuFavoriRepository= theLieuFavoriRepository;
	}
	
	@Override
	public List<LieuFavori> findAll() {
		return lieuFavoriRepository.findAll();
	}

	@Override
	public Optional<LieuFavori> findById(int idLieuFavori) {
		return lieuFavoriRepository.findById(idLieuFavori);
	}

	@Override
	public void save(LieuFavori theLieuFavori) {
		lieuFavoriRepository.save(theLieuFavori);

	}

	@Override
	public void deleteById(int idLieuFavori) {
		lieuFavoriRepository.deleteById(idLieuFavori);

	}

}
