package tn.esprit.autoLoc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autoLoc.Repositories.ReservationRepositorie;
import tn.esprit.autoLoc.entities.Reservation;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ReservationService implements IReservationService {

    private final ReservationRepositorie reservationRepo;

    @Override
    public Reservation ajouterReservation(Reservation reservation) {
        return reservationRepo.save(reservation);
    }

    @Override
    public Reservation modifierReservation(Reservation reservation) {
        if (reservation.getIdReservation() == null ||
                !reservationRepo.existsById(reservation.getIdReservation())) {
            throw new RuntimeException("Réservation introuvable");
        }
        return reservationRepo.save(reservation);
    }

    @Override
    @Transactional(readOnly = true)
    public Reservation recupererReservationParId(Long id) {
        return reservationRepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Réservation introuvable : " + id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Reservation> recupererToutesLesReservations() {
        return reservationRepo.findAll();
    }

    @Override
    public void supprimerReservation(Long id) {
        if (!reservationRepo.existsById(id)) {
            throw new RuntimeException("Réservation introuvable : " + id);
        }
        reservationRepo.deleteById(id);
    }
}