package tn.esprit.ski.controller;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tn.esprit.ski.entities.Programme;
import tn.esprit.ski.service.IProgrammeService;
@RestController
@AllArgsConstructor
@RequestMapping("/programme")
public class ProgrammeController {
    private final IProgrammeService programmeService;
    @PostMapping("/addWithChaine")
    public ResponseEntity<Programme> addProgrammeWithChaine(@RequestBody Programme programme) {
        Programme savedProgramme = programmeService.ajouterProgrammeEtChaine(programme);
        return ResponseEntity.ok(savedProgramme);
    }

    @PostMapping("/addWithChaine/{idChaine}")
    public ResponseEntity<Programme> addProgrammeWithChaine(@RequestBody Programme programme, @PathVariable Long idChaine) {
        Programme savedProgramme = programmeService.ajouterProgrammeEtAffecterChaine(programme, idChaine);
        return ResponseEntity.ok(savedProgramme);
    }

}
