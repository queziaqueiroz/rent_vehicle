package br.com.quezia.rentvehicle.controllers;

import br.com.quezia.rentvehicle.entities.TipoCombustivel;
import br.com.quezia.rentvehicle.entities.Vehicle;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.json.GsonBuilderUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLOutput;

@Slf4j
@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {

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
}
