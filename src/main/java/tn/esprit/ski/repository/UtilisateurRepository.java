package tn.esprit.ski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ski.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long> {

}
