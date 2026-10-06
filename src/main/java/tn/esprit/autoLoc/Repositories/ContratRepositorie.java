package tn.esprit.autoLoc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoLoc.entities.Contrat;

@Repository
public interface ContratRepositorie extends JpaRepository<Contrat, Long> {
}
