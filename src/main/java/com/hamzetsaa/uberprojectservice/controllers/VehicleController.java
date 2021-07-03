/*
 * package com.hamzetsaa.uberprojectservice.controllers;
 * 
 * import com.hamzetsaa.uberprojectservice.entities.Vehicle; import
 * com.hamzetsaa.uberprojectservice.services.VehicleService; import
 * lombok.extern.slf4j.Slf4j; import
 * org.springframework.beans.factory.annotation.Autowired; import
 * org.springframework.web.bind.annotation.*;
 * 
 * import java.util.List; import java.util.Optional;
 * 
 * @Slf4j
 * 
 * @RestController
 * 
 * @RequestMapping(value = "/vehicles") public class VehicleController {
 * 
 * 
 * private final VehicleService vehicleService;
 * 
 * @Autowired public VehicleController(VehicleService vehicleService) {
 * this.vehicleService = vehicleService; }
 * 
 *//**
	 * la list des vehicules
	 */
/*
 * @GetMapping("/all") public List<Vehicle> findVehicles() {
 * log.info("find vehicles"); return vehicleService.findAll(); }
 * 
 *//**
	 * Consulter un vehicule
	 */
/*
 * @GetMapping public Vehicle getVehicle(@RequestParam(name = "id") Long id) {
 * log.info("find vehicle by id {}", id); return vehicleService.findById(id)
 * .orElseThrow(() -> new RuntimeException("not found")); }
 * 
 *//**
	 * Up date vehicule
	 */
/*
 * @PutMapping(value = "/{id}") public Vehicle updateVehicle(@PathVariable(name
 * = "id") Long id, @RequestBody Vehicle v) {
 * 
 * Optional<Vehicle> vehicle = vehicleService.findById(id);
 * 
 * if (!vehicle.isPresent()) throw new RuntimeException("not exist");
 * 
 * v.setId(id); return vehicleService.save(v); }
 * 
 *//**
	 * Add Vehicule
	 */
/*
 * @PostMapping public Vehicle addVehicle(@RequestBody Vehicle v) {
 * log.info("add vehicle {}", v); return vehicleService.save(v); }
 * 
 *//**
	 * Supprimer un vehicule
	 *//*
		 * @DeleteMapping(value = "/{id}") public void deleteVehicle(@PathVariable(name
		 * = "id") Long id) throws Exception { vehicleService.deleteById(id);
		 * 
		 * Optional<Vehicle> vehicule = vehicleService.findById(id);
		 * 
		 * if (vehicule.isPresent()) { vehicleService.deleteById(id); } else { throw new
		 * Exception("No vehicule record exist for given id"); } }
		 * 
		 * // @GetMapping // public List<Vehicle> findByName(@RequestParam(name =
		 * "name") String name) { // return vehicleService.findByNameContains(name); //
		 * }
		 * 
		 * }
		 */