package br.com.quezia.rentvehicle.controllers;

import br.com.quezia.rentvehicle.entities.TipoCombustivel;
import br.com.quezia.rentvehicle.entities.Vehicle;
import br.com.quezia.rentvehicle.repositories.VehicleRepository;
import jdk.internal.platform.cgroupv1.SubSystem;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.sql.SQLOutput;

@Slf4j
@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {
    @Autowired
    private VehicleRepository vehicleRepository;

    @GetMapping("/{id}")
    public ResponseEntity <?> getVehicle(@PathVariable("id") long id){
        Vehicle fromBase = new Vehicle();
        fromBase.setMotor(1.8);
        fromBase.setCombustivel(TipoCombustivel.GASOLINA);
        String retornoDizOla = Vehicle.dizOla("Fiat");
        log.info("Logando valueof do tipode combustivel {}", TipoCombustivel.valueOf("GASOLINA"));
        log.info("Logando o diz Ola {}",retornoDizOla);
        return ResponseEntity.ok(fromBase);
    }
    @PostMapping()
    public ResponseEntity <?> postVehicle(@RequestBody Vehicle vehicle){
        Vehicle newVihicle = vehicleRepository.save(vehicle);
        return ResponseEntity.status(HttpStatus.CREATED).body(vehicle);
    }
}
