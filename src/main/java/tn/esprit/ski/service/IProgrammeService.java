package tn.esprit.ski.service;

import tn.esprit.ski.entities.Programme;

public interface IProgrammeService {
     Programme ajouterProgrammeEtChaine (Programme p );
     Programme ajouterProgrammeEtAffecterChaine (Programme p , Long idChaine);
}
