package tn.esprit.autoLoc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoLoc.entities.Client;

@Repository
public interface ClientRepositorie extends JpaRepository<Client, Long> {
}
