package tn.esprit.ski.service;

import tn.esprit.ski.entities.Utilisateur;

import java.util.List;

public interface IUtilisateurService {
Utilisateur ajouterUtilisateur(Utilisateur utilisateur);
Utilisateur modifierUtilisateur(Utilisateur utilisateur);
void supprimerUtilisateur(Long id);
Utilisateur chercherUtilisateur(Long id);
List <Utilisateur> listerUtilisateurs();

}
