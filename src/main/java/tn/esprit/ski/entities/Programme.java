package tn.esprit.ski.entities;


import jakarta.persistence.*;
import lombok.*;

import java.util.Set;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "programme")

public class Programme {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="prId")
    private long prId;
    @Column(name="nomPr")
    private String prNom;
    @ManyToMany(mappedBy="programmes", cascade = CascadeType.ALL)
    private Set<Utilisateur> utilisateurs;
    @ManyToOne(cascade = CascadeType.ALL)
    Chaine chaine;
}
