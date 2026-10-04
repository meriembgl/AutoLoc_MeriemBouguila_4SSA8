package tn.esprit.autoLoc.entities;


import jakarta.persistence.*;
import lombok.*;
import org.springframework.cglib.core.Local;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Contrat")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Contrat {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idContrat;
    private LocalDate dateSignature;
    private BigDecimal montantTotal;
    private boolean valide;
}
