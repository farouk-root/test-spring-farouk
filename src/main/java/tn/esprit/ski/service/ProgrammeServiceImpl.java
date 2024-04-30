package tn.esprit.ski.service;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.ski.entities.Chaine;
import tn.esprit.ski.entities.Programme;
import tn.esprit.ski.repository.ChaineRepository;
import tn.esprit.ski.repository.ProgrammeRepository;
@Service
@AllArgsConstructor
public class ProgrammeServiceImpl implements IProgrammeService{

    @Autowired // Inject the necessary repositories
    private ProgrammeRepository programmeRepository;
    private ChaineRepository chaineRepository; // Assuming you have a ChaineRepository

    @Override
    public Programme ajouterProgrammeEtChaine(Programme p) {

        if (p.getChaine() != null) {
            Chaine existingChaine = chaineRepository.findById(p.getChaine().getChId()).orElse(null);
            if (existingChaine == null) {
                existingChaine = chaineRepository.save(p.getChaine());
            }
            p.setChaine(existingChaine);
        }
        return programmeRepository.save(p);
    }

    @Override
    public Programme ajouterProgrammeEtAffecterChaine(Programme p, Long idChaine) {
        Chaine existingChaine = chaineRepository.findById(idChaine).orElse(null);
        if (existingChaine == null) {
            throw new RuntimeException("Chaine not found");
        }
        p.setChaine(existingChaine);
        return programmeRepository.save(p);
    }

}
