package tn.esprit.ski.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "utlisateur")

public class Utilisateur implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="idUsr")
    private long usrId;
    @Column(name="nomUsr")
    private String usrNom;
    @Column(name="DateInscription")
    @Temporal(TemporalType.DATE)
    private Date usrDateInscription;
    @Enumerated(EnumType.STRING)
    private Profession profession;
    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Programme> programmes;
}
