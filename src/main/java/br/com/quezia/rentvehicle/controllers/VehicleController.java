package br.com.quezia.rentvehicle.controllers;

import br.com.quezia.rentvehicle.entities.Vehicle;
import br.com.quezia.rentvehicle.repositories.LocatorRepository;
import br.com.quezia.rentvehicle.repositories.VehicleRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.Optional;

@Slf4j
@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {
    @Autowired
    private VehicleRepository vehicleRepository;
    private LocatorRepository locatorRepository;


    @GetMapping("/{id}")
    public ResponseEntity<?> getVehicle(@PathVariable("id") long id) {
        Optional<Vehicle> vehicleFromBase = vehicleRepository.findById(id);
        if (vehicleFromBase.isPresent()) {
            return ResponseEntity.status(HttpStatus.ACCEPTED).body(vehicleFromBase);
        }
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ID not found");
    }

    @PostMapping()
    public ResponseEntity<?> postVehicle(@RequestBody Vehicle vehicle) {
        Vehicle vehicleFromDatabase = vehicleRepository.save(vehicle);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(vehicleFromDatabase.getId()).toUri();
        return ResponseEntity.created(uri).build();
    }
}
