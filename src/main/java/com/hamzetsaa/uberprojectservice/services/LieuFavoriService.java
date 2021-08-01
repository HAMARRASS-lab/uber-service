package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.LieuFavori;

public interface LieuFavoriService {

	public List <LieuFavori> findAll();

	public Optional<LieuFavori> findById(int idLieuFavori);

	public void save(LieuFavori theLieuFavori);

	public void deleteById ( int idLieuFavori);
}
