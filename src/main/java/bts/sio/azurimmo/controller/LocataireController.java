package bts.sio.azurimmo.controller;

import bts.sio.azurimmo.model.Locataire;
import bts.sio.azurimmo.service.LocataireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/locataires")
public class LocataireController {

    @Autowired
    private LocataireService locataireService;

    @GetMapping("/")
    public List<Locataire> getAllLocataires() {
        return locataireService.getAllLocataires();
    }

    @GetMapping("/{id}")
    public Locataire getLocataireById(@PathVariable Long id) {
        return locataireService.getLocataireById(id);
    }

    @GetMapping("/contrats/{contratId}")
    public List<Locataire> getLocatairesParContrat(@PathVariable Long contratId) {
        return locataireService.getLocatairesParContrat(contratId);
    }
}
