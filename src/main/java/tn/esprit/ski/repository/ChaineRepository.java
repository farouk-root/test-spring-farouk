package tn.esprit.ski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.ski.entities.Chaine;

@Repository
public interface ChaineRepository extends JpaRepository<Chaine,Long> {
}
