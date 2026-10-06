package tn.esprit.autoLoc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoLoc.entities.Employe;

@Repository
public interface EmployeRepositorie extends JpaRepository<Employe, Long> {
}
