package com.hamzetsaa.uberprojectservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hamzetsaa.uberprojectservice.entities.Wallet;

public interface WalletRepository extends JpaRepository<Wallet, Integer>{

}
