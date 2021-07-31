package com.hamzetsaa.uberprojectservice.services;

import java.util.List;
import java.util.Optional;

import com.hamzetsaa.uberprojectservice.entities.Wallet;

public interface WalletService {

	public List <Wallet> findAll();

	public Optional<Wallet> findById(int idWallet);

	public void save(Wallet theWallet);

	public void deleteById ( int idWallet);
}
