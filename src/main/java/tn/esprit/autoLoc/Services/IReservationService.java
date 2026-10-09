package tn.esprit.autoLoc.Services;

import tn.esprit.autoLoc.entities.Reservation;
import java.util.List;

public interface IReservationService {
    Reservation ajouterReservation(Reservation reservation);
    Reservation modifierReservation(Reservation reservation);
    Reservation recupererReservationParId(Long id);
    List<Reservation> recupererToutesLesReservations();
    void supprimerReservation(Long id);
}