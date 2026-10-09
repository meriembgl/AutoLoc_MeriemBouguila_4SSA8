package tn.esprit.autoLoc.Services;

import tn.esprit.autoLoc.entities.Paiement;
import java.util.List;

public interface IPaiementService {
    Paiement ajouterPaiement(Paiement paiement);
    Paiement modifierPaiement(Paiement paiement);
    Paiement recupererPaiementParId(Long id);
    List<Paiement> recupererTousLesPaiements();
    void supprimerPaiement(Long id);
}