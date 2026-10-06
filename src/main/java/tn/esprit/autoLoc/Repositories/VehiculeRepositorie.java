package tn.esprit.autoLoc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoLoc.entities.Vehicule;

@Repository
public interface VehiculeRepositorie extends JpaRepository<Vehicule, Long> {
}
