package tn.esprit.ski.controller;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ski.entities.Utilisateur;
import tn.esprit.ski.service.IUtilisateurService;

import java.util.List;

@RestController
@AllArgsConstructor
@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@RequestMapping("/utlisateur")
public class UtilisateurController {
    IUtilisateurService utilisateurService;
    @GetMapping("/getall")
    public List<Utilisateur> getAllUtilisateurs() {
        return utilisateurService.listerUtilisateurs();

    }
    @PostMapping("/add")
    public ResponseEntity<Utilisateur> addUtilisateur(@RequestBody Utilisateur utilisateur) {
        return ResponseEntity.ok(utilisateurService.ajouterUtilisateur(utilisateur));
    }
}
