package tn.esprit.autoLoc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autoLoc.Repositories.ContratRepositorie;
import tn.esprit.autoLoc.entities.Contrat;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class ContratService implements IContratService {

    private final ContratRepositorie contratRepo;

    @Override
    public Contrat ajouterContrat(Contrat contrat) {
        return contratRepo.save(contrat);
    }

    @Override
    public Contrat modifierContrat(Contrat contrat) {
        if (contrat.getIdContrat() == null ||
                !contratRepo.existsById(contrat.getIdContrat())) {
            throw new RuntimeException("Contrat introuvable");
        }
        return contratRepo.save(contrat);
    }

    @Override
    @Transactional(readOnly = true)
    public Contrat recupererContratParId(Long id) {
        return contratRepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Contrat introuvable : " + id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Contrat> recupererTousLesContrats() {
        return contratRepo.findAll();
    }

    @Override
    public void supprimerContrat(Long id) {
        if (!contratRepo.existsById(id)) {
            throw new RuntimeException("Contrat introuvable : " + id);
        }
        contratRepo.deleteById(id);
    }
}