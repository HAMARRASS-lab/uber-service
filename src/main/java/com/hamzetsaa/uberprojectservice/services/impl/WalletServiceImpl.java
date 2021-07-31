package com.hamzetsaa.uberprojectservice.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hamzetsaa.uberprojectservice.entities.Wallet;
import com.hamzetsaa.uberprojectservice.repositories.WalletRepository;
import com.hamzetsaa.uberprojectservice.services.WalletService;
@Service
public class WalletServiceImpl implements WalletService {

	private WalletRepository walletRepository;
	@Autowired
	public void  WalletServiceImpl(WalletRepository theWalletRepository) {
		walletRepository= theWalletRepository;
	}
	
	@Override
	public List<Wallet> findAll() {
		// TODO Auto-generated method stub
		return walletRepository.findAll();
	}

	@Override
	public Optional<Wallet> findById(int idWallet) {
		// TODO Auto-generated method stub
		return walletRepository.findById(idWallet);
	}

	@Override
	public void save(Wallet theWallet) {
		walletRepository.save(theWallet);

	}

	@Override
	public void deleteById(int idWallet) {
		walletRepository.deleteById(idWallet);

	}

}
