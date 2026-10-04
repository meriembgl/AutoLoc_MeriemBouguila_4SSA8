package tn.esprit.autoLoc.entities;


import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "Maintenance")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString
public class Maintenance {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idMaintenance;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    private String description;
}
