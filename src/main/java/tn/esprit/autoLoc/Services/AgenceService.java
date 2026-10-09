package tn.esprit.autoLoc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoLoc.Repositories.AgenceRepositorie;
import tn.esprit.autoLoc.entities.Agence;

import java.util.List;
@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {
    private AgenceRepositorie agenceRepo;
    @Override
    public Agence ajouterAgence(Agence agence) {
        return agenceRepo.save(agence);
    }

    @Override
    public void supprimerAgence(Long id) {
        agenceRepo.deleteById(id);
    }

    @Override
    public List<Agence> recupereAgence() {
        List<Agence> agences = agenceRepo.findAll();
        return agences;
    }

    @Override
    public Agence modifAgence(Agence agence) {

        return null;
    }
}
