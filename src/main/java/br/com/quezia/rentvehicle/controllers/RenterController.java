package br.com.quezia.rentvehicle.controllers;

import br.com.quezia.rentvehicle.entities.Renter;
import br.com.quezia.rentvehicle.entities.Vehicle;
import br.com.quezia.rentvehicle.repositories.RenterRepository;
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
@RequestMapping("/api/renter")
public class RenterController {
    @Autowired
    private RenterRepository renterRepository;

@GetMapping("/{id}")
    public ResponseEntity <?> getRenter(@PathVariable("id") long id){
    Optional<Renter> renterFromBase = renterRepository.findById(id);
    if (renterFromBase.isPresent()) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(renterFromBase);
    }
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ID not found");
}
    @PostMapping()
    public ResponseEntity <?> postRenter(@RequestBody Renter renter){
        Renter newRenter = renterRepository.save(renter);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(newRenter.getId()).toUri();
        return ResponseEntity.created(uri).build();}
}