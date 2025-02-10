package bts.sio.azurimmo.controller;

import bts.sio.azurimmo.model.Appartement;
import bts.sio.azurimmo.model.Batiment;
import bts.sio.azurimmo.service.AppartementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/appartements")
public class AppartementController {

    @Autowired
    private AppartementService appartementService;

    @GetMapping("/")
    public List<Appartement> getAllAppartements() {
        return appartementService.getAllAppartements();
    }

    @GetMapping("/{id}")
    public Appartement getAppartementById(@PathVariable Long id) {
        return appartementService.getAppartementById(id);
    }

    @PostMapping("/")
    public Appartement createAppartement(@RequestBody Appartement appartement) {
        return appartementService.saveAppartement(appartement);
    }

    @GetMapping("/ville/{ville}")
    public List<Appartement> findByVille(@PathVariable String ville) {
        return appartementService.findByVille(ville);
    }

    @GetMapping("/batiment/{batimentId}")
    public List<Appartement> getAppartementsParBatiment(@PathVariable long batimentId) {
        return appartementService.getAppartementsParBatiment(batimentId);
    }

    @GetMapping("/surface/{surface}")
    public List<Appartement> getAppartementsParSurface(@PathVariable float surface) {
        return appartementService.getAppartementsParSurface(surface);
    }
}