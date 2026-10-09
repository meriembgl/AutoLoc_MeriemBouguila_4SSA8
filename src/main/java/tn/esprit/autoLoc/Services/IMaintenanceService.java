package tn.esprit.autoLoc.Services;

import tn.esprit.autoLoc.entities.Maintenance;
import java.util.List;

public interface IMaintenanceService {
    Maintenance ajouterMaintenance(Maintenance maintenance);
    Maintenance modifierMaintenance(Maintenance maintenance);
    Maintenance recupererMaintenanceParId(Long id);
    List<Maintenance> recupererToutesLesMaintenances();
    void supprimerMaintenance(Long id);
}