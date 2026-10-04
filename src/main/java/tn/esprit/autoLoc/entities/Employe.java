package tn.esprit.autoLoc.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import tn.esprit.autoLoc.entities.enums.RoleEmploye;

@Entity
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Employe {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEmploye;

    private String nom;
    private String prenom;
    private RoleEmploye role;
}
