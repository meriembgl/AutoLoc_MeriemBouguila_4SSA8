package tn.esprit.autoLoc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoLoc.entities.Agence;

@Repository
public interface AgenceRepositorie extends JpaRepository<Agence, Long> {
}
