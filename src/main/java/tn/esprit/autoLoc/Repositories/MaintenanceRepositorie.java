package tn.esprit.autoLoc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoLoc.entities.Maintenance;

@Repository
public interface MaintenanceRepositorie extends JpaRepository<Maintenance, Long> {
}
