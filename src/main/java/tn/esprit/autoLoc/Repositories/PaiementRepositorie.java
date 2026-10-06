package tn.esprit.autoLoc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoLoc.entities.Paiement;

@Repository
public interface PaiementRepositorie extends JpaRepository<Paiement, Long> {
}
