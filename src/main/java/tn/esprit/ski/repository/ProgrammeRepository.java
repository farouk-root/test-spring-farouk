package tn.esprit.ski.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.ski.entities.Programme;

public interface ProgrammeRepository extends JpaRepository<Programme,Long> {
}
