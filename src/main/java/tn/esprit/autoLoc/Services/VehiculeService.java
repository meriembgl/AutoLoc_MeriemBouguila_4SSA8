package tn.esprit.autoLoc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autoLoc.Repositories.VehiculeRepositorie;
import tn.esprit.autoLoc.entities.Vehicule;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class VehiculeService implements IVehiculeService {

    private final VehiculeRepositorie vehiculeRepo;

    @Override
    public Vehicule ajouterVehicule(Vehicule vehicule) {
        return vehiculeRepo.save(vehicule);
    }

    @Override
    public Vehicule modifierVehicule(Vehicule vehicule) {
        if (vehicule.getIdVehicule() == null ||
                !vehiculeRepo.existsById(vehicule.getIdVehicule())) {
            throw new RuntimeException("Véhicule introuvable");
        }
        return vehiculeRepo.save(vehicule);
    }

    @Override
    @Transactional(readOnly = true)
    public Vehicule recupererVehiculeParId(Long id) {
        return vehiculeRepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Véhicule introuvable : " + id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Vehicule> recupererTousLesVehicules() {
        return vehiculeRepo.findAll();
    }

    @Override
    public void supprimerVehicule(Long id) {
        if (!vehiculeRepo.existsById(id)) {
            throw new RuntimeException("Véhicule introuvable : " + id);
        }
        vehiculeRepo.deleteById(id);
    }
}