package tn.esprit.autoLoc.entities;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Equipement")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Equipement {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idEquipement;
    private String libelle;
}
