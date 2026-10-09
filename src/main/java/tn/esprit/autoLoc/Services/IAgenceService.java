package tn.esprit.autoLoc.Services;

import tn.esprit.autoLoc.entities.Agence;

import java.util.List;

public interface IAgenceService {
    Agence ajouterAgence(Agence agence);
    void supprimerAgence(Long id);
    List<Agence> recupereAgence ();
    Agence modifAgence(Agence agence);
}
