package tn.esprit.autoLoc.Services;

import tn.esprit.autoLoc.entities.Vehicule;
import java.util.List;

public interface IVehiculeService {
    Vehicule ajouterVehicule(Vehicule vehicule);
    Vehicule modifierVehicule(Vehicule vehicule);
    Vehicule recupererVehiculeParId(Long id);
    List<Vehicule> recupererTousLesVehicules();
    void supprimerVehicule(Long id);
}