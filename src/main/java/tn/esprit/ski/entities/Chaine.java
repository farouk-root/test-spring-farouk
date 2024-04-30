package tn.esprit.ski.entities;

import jakarta.persistence.*;
import lombok.*;

@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "chaine")

public class Chaine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="chId")
    private long chId;
    @Column(name="nomCh")
    private String chNom;
    @Column(name="themeCh")
    @Enumerated(EnumType.STRING)
    private Thematique chTheme;
}
