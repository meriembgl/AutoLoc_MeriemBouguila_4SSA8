package tn.esprit.autoLoc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoLoc.entities.Equipement;

@Repository
public interface EquipementRepositorie extends JpaRepository<Equipement, Long> {
}
