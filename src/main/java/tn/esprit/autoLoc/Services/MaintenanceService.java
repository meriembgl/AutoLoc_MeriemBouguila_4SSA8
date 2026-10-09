package tn.esprit.autoLoc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autoLoc.Repositories.MaintenanceRepositorie;
import tn.esprit.autoLoc.entities.Maintenance;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class MaintenanceService implements IMaintenanceService {

    private final MaintenanceRepositorie maintenanceRepo;

    @Override
    public Maintenance ajouterMaintenance(Maintenance maintenance) {
        return maintenanceRepo.save(maintenance);
    }

    @Override
    public Maintenance modifierMaintenance(Maintenance maintenance) {
        if (maintenance.getIdMaintenance() == null ||
                !maintenanceRepo.existsById(maintenance.getIdMaintenance())) {
            throw new RuntimeException("Maintenance introuvable");
        }
        return maintenanceRepo.save(maintenance);
    }

    @Override
    @Transactional(readOnly = true)
    public Maintenance recupererMaintenanceParId(Long id) {
        return maintenanceRepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Maintenance introuvable : " + id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Maintenance> recupererToutesLesMaintenances() {
        return maintenanceRepo.findAll();
    }

    @Override
    public void supprimerMaintenance(Long id) {
        if (!maintenanceRepo.existsById(id)) {
            throw new RuntimeException("Maintenance introuvable : " + id);
        }
        maintenanceRepo.deleteById(id);
    }
}