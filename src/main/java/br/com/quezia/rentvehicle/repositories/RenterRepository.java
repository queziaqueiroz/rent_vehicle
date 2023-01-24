package br.com.quezia.rentvehicle.repositories;

import br.com.quezia.rentvehicle.entities.Renter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RenterRepository extends JpaRepository<Renter, Long> {
}
