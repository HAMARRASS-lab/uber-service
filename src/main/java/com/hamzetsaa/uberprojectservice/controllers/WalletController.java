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
import com.hamzetsaa.uberprojectservice.entities.Wallet;
import com.hamzetsaa.uberprojectservice.services.WalletService;

@RestController
@RequestMapping(value = "/api")
public class WalletController {

	private WalletService walletService;

	@Autowired
	public WalletController(WalletService theWalletService) {

		walletService = theWalletService;
	}
	@GetMapping(value = "/wallets")
	public List<Wallet> findAll() {

		return walletService.findAll();
	}
	
	@GetMapping(value = "/wallets/{idWallet}")
	public Optional<Wallet> getWallet(@PathVariable int idWallet) {

		Optional<Wallet> theWallet = walletService.findById(idWallet);

		if (theWallet == null) {

			throw new RuntimeException(" the Wallet is not found " + idWallet);

		}
		return theWallet;
	}
	@PostMapping("/wallets")
	public Wallet addWallet(@RequestBody Wallet theWallet) {

		/* theVille.setIdVille(0); */
		walletService.save(theWallet);

		return theWallet;
	}
	
	@PutMapping("/wallets")
	public Wallet updateWallet(@RequestBody Wallet theWallet) {

		walletService.save(theWallet);

		return theWallet;
	}
	@DeleteMapping(value = "/wallets/{idWallet}")
	public String deleteWallet(@PathVariable int idWallet) {

		Optional<Wallet> theWallet = walletService.findById(idWallet);

		if (theWallet == null) {

			throw new RuntimeException(" the id of Chauffeur is not found " + idWallet);
		}
		walletService.deleteById(idWallet);

		return " the Wallet was deleted " + idWallet;

	}
}
