package tn.esprit.autoLoc.Services;

import tn.esprit.autoLoc.entities.Contrat;
import java.util.List;

public interface IContratService {
    Contrat ajouterContrat(Contrat contrat);
    Contrat modifierContrat(Contrat contrat);
    Contrat recupererContratParId(Long id);
    List<Contrat> recupererTousLesContrats();
    void supprimerContrat(Long id);
}