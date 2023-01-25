package br.com.quezia.rentvehicle.controllers;

import br.com.quezia.rentvehicle.entities.Renter;
import br.com.quezia.rentvehicle.repositories.RenterRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@RequestMapping("/api/renter")
public class RenterController {
    @Autowired
    private RenterRepository renterRepository;

@GetMapping("/{id}")
    public ResponseEntity <?> getRenter(@PathVariable("id") long id){
    Renter response = new Renter();
    return ResponseEntity.ok(response);
}
    @PostMapping()
    public ResponseEntity <?> postRenter(@RequestBody Renter renter){
        Renter newRenter = renterRepository.save(renter);
        return ResponseEntity.status(HttpStatus.CREATED).body(renter);
}
}
