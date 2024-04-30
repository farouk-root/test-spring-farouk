package tn.esprit.ski.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.ski.entities.Utilisateur;
import tn.esprit.ski.repository.UtilisateurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class UtilisateurServiceImpl implements IUtilisateurService {
    UtilisateurRepository utilisateurRepository;
    @Override
    public Utilisateur ajouterUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public Utilisateur modifierUtilisateur(Utilisateur utilisateur) {
        return utilisateurRepository.save(utilisateur);
    }

    @Override
    public void supprimerUtilisateur(Long id) {
        utilisateurRepository.deleteById(id);
    }

    @Override
    public Utilisateur chercherUtilisateur(Long id) {
        return null;
    }

    @Override
    public List<Utilisateur> listerUtilisateurs() {
        return utilisateurRepository.findAll();
    }
}
