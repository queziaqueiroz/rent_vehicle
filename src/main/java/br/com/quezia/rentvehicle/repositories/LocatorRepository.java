package br.com.quezia.rentvehicle.repositories;

import br.com.quezia.rentvehicle.entities.Locator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocatorRepository extends JpaRepository<Locator, Long> {
}
