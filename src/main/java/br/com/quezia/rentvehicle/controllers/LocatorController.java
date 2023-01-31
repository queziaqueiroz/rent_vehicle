package br.com.quezia.rentvehicle.controllers;

import br.com.quezia.rentvehicle.entities.Locator;
import br.com.quezia.rentvehicle.repositories.LocatorRepository;
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
@RequestMapping("/api/locator")
public class LocatorController {
    @Autowired
    private LocatorRepository locatorRepository;

@GetMapping("/{id}")
    public ResponseEntity <?> getLocator(@PathVariable("id") long id){
    Optional<Locator> locatorFromBase = locatorRepository.findById(id);
    if (locatorFromBase.isPresent()) {
        return ResponseEntity.status(HttpStatus.ACCEPTED).body(locatorFromBase);
    }
    return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ID not found");
}
    @PostMapping()
    public ResponseEntity <?> postLocator(@RequestBody Locator locator){
        Locator newLocator = locatorRepository.save(locator);
        URI uri = ServletUriComponentsBuilder.fromCurrentRequest()
                .path("/{id}").buildAndExpand(newLocator.getId()).toUri();
        return ResponseEntity.created(uri).build();

}
}