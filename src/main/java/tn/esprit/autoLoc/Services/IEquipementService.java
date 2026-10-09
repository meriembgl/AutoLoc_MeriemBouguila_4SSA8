package tn.esprit.autoLoc.Services;

import tn.esprit.autoLoc.entities.Equipement;
import java.util.List;

public interface IEquipementService {
    Equipement ajouterEquipement(Equipement equipement);
    Equipement modifierEquipement(Equipement equipement);
    Equipement recupererEquipementParId(Long id);
    List<Equipement> recupererTousLesEquipements();
    void supprimerEquipement(Long id);
}