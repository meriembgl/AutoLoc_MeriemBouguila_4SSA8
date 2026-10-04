package tn.esprit.autoLoc.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import tn.esprit.autoLoc.entities.enums.CategorieVehicule;
import tn.esprit.autoLoc.entities.enums.StatutVehicule;

import java.math.BigDecimal;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Vehicule {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idVehicule;
    private String immatriculation;
    private String marque;
    private String modele;
    private CategorieVehicule categorie;
    private BigDecimal tarifJournalier;
    private StatutVehicule statut;

}
