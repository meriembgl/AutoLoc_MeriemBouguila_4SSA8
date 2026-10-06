package tn.esprit.autoLoc.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.autoLoc.entities.Reservation;

@Repository
public interface ReservationRepositorie extends JpaRepository <Reservation, Long> {
}
