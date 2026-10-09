package tn.esprit.autoLoc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autoLoc.Repositories.EquipementRepositorie;
import tn.esprit.autoLoc.entities.Equipement;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class EquipementService implements IEquipementService {

    private final EquipementRepositorie equipementRepo;

    @Override
    public Equipement ajouterEquipement(Equipement equipement) {
        return equipementRepo.save(equipement);
    }

    @Override
    public Equipement modifierEquipement(Equipement equipement) {
        if (equipement.getIdEquipement() == null ||
                !equipementRepo.existsById(equipement.getIdEquipement())) {
            throw new RuntimeException("Équipement introuvable");
        }
        return equipementRepo.save(equipement);
    }

    @Override
    @Transactional(readOnly = true)
    public Equipement recupererEquipementParId(Long id) {
        return equipementRepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Équipement introuvable : " + id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Equipement> recupererTousLesEquipements() {
        return equipementRepo.findAll();
    }

    @Override
    public void supprimerEquipement(Long id) {
        if (!equipementRepo.existsById(id)) {
            throw new RuntimeException("Équipement introuvable : " + id);
        }
        equipementRepo.deleteById(id);
    }
}