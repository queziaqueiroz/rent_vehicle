package br.com.quezia.rentvehicle.controllers;

import br.com.quezia.rentvehicle.entities.Vehicle;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {
    @GetMapping("/{id}")
    public ResponseEntity <?> getVehicle(@PathVariable("id") long id){
        Vehicle fromBase = new Vehicle();
        fromBase.setMotor(1.8);
        return ResponseEntity.ok(fromBase);
    }

}
