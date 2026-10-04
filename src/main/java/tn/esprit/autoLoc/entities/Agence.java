package tn.esprit.autoLoc.entities;


import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.AnyDiscriminatorImplicitValues;

@Entity
@Table(name="Agence")
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @ToString
public class Agence {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAgence;

    private String nom;
    private String ville;
    private String adresse;
    private String telephone;

}
