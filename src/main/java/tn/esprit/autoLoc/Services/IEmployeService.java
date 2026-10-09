package tn.esprit.autoLoc.Services;

import tn.esprit.autoLoc.entities.Employe;
import java.util.List;

public interface IEmployeService {
    Employe ajouterEmploye(Employe employe);
    Employe modifierEmploye(Employe employe);
    Employe recupererEmployeParId(Long id);
    List<Employe> recupererTousLesEmployes();
    void supprimerEmploye(Long id);
}