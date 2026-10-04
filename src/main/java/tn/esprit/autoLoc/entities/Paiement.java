package tn.esprit.autoLoc.entities;


import jakarta.persistence.*;
import lombok.*;
import tn.esprit.autoLoc.entities.enums.ModePaiement;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Paiment")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Paiement {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaiement;
    private BigDecimal montant;
    private LocalDate datePaiment;
    private ModePaiement modePaiement;
}
