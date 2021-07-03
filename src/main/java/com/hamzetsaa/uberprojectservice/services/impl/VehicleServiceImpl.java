/*
 * package com.hamzetsaa.uberprojectservice.services.impl;
 * 
 * import com.hamzetsaa.uberprojectservice.entities.Vehicle; import
 * com.hamzetsaa.uberprojectservice.repositories.VehicleRepository; import
 * com.hamzetsaa.uberprojectservice.services.VehicleService; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.stereotype.Service;
 * 
 * import java.util.List; import java.util.Optional;
 * 
 * @Service public class VehicleServiceImpl implements VehicleService {
 * 
 * private final VehicleRepository vehicleRepository;
 * 
 * @Autowired public VehicleServiceImpl(VehicleRepository vehicleRepository) {
 * this.vehicleRepository = vehicleRepository; }
 * 
 * @Override public List<Vehicle> findAll() { return
 * vehicleRepository.findAll(); }
 * 
 * @Override public Optional<Vehicle> findById(Long id) { return
 * vehicleRepository.findById(id); }
 * 
 * @Override public Vehicle save(Vehicle vehicle) { return
 * vehicleRepository.save(vehicle); }
 * 
 * @Override public void deleteById(Long id) { vehicleRepository.deleteById(id);
 * }
 * 
 * @Override public List<Vehicle> findByNameContains(String name) { return
 * vehicleRepository.findByNameContains(name); } }
 */