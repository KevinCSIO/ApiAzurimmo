package bts.sio.azurimmo.controller;

import bts.sio.azurimmo.model.Contrat;
import bts.sio.azurimmo.service.ContratService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contrats")
public class ContratController {

    @Autowired
    private ContratService contratService;

    /*@GetMapping("/associe/{associeId}")
    public List<Contrat> getContratParAssocie(@PathVariable long associeId) {
        return contratService.getContratParAssocie(associeId);
    }*/

    @GetMapping("/")
    public List<Contrat> getAllContrats() {
        return contratService.getAllContrats();
    }

    @GetMapping("/{id}")
    public Contrat getContratById(@PathVariable Long id) {
        return contratService.getContratById(id);
    }

    @PostMapping("/")
    public Contrat createContrat(@RequestBody Contrat contrat) {
        return contratService.saveContrat(contrat);
    }

    @GetMapping("/appartement/{appartementId}")
    public List<Contrat> getContratsParAppartement(@PathVariable Long appartementId) {
        return contratService.getContratsParAppartement(appartementId);
    }
}