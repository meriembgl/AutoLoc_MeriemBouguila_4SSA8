package tn.esprit.autoLoc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autoLoc.Repositories.PaiementRepositorie;
import tn.esprit.autoLoc.entities.Paiement;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class PaiementService implements IPaiementService {

    private final PaiementRepositorie paiementRepo;

    @Override
    public Paiement ajouterPaiement(Paiement paiement) {
        return paiementRepo.save(paiement);
    }

    @Override
    public Paiement modifierPaiement(Paiement paiement) {
        if (paiement.getIdPaiement() == null ||
                !paiementRepo.existsById(paiement.getIdPaiement())) {
            throw new RuntimeException("Paiement introuvable");
        }
        return paiementRepo.save(paiement);
    }

    @Override
    @Transactional(readOnly = true)
    public Paiement recupererPaiementParId(Long id) {
        return paiementRepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Paiement introuvable : " + id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Paiement> recupererTousLesPaiements() {
        return paiementRepo.findAll();
    }

    @Override
    public void supprimerPaiement(Long id) {
        if (!paiementRepo.existsById(id)) {
            throw new RuntimeException("Paiement introuvable : " + id);
        }
        paiementRepo.deleteById(id);
    }
}