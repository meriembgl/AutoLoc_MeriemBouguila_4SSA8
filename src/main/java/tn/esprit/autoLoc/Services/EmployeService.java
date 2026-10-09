package tn.esprit.autoLoc.Services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tn.esprit.autoLoc.Repositories.EmployeRepositorie;
import tn.esprit.autoLoc.entities.Employe;

import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class EmployeService implements IEmployeService {

    private final EmployeRepositorie employeRepo;

    @Override
    public Employe ajouterEmploye(Employe employe) {
        return employeRepo.save(employe);
    }

    @Override
    public Employe modifierEmploye(Employe employe) {
        if (employe.getIdEmploye() == null ||
                !employeRepo.existsById(employe.getIdEmploye())) {
            throw new RuntimeException("Employé introuvable");
        }
        return employeRepo.save(employe);
    }

    @Override
    @Transactional(readOnly = true)
    public Employe recupererEmployeParId(Long id) {
        return employeRepo.findById(id)
                .orElseThrow(() ->
                        new RuntimeException("Employé introuvable : " + id));
    }

    @Override
    @Transactional(readOnly = true)
    public List<Employe> recupererTousLesEmployes() {
        return employeRepo.findAll();
    }

    @Override
    public void supprimerEmploye(Long id) {
        if (!employeRepo.existsById(id)) {
            throw new RuntimeException("Employé introuvable : " + id);
        }
        employeRepo.deleteById(id);
    }
}