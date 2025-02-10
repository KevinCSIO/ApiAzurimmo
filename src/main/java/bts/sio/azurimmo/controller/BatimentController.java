package bts.sio.azurimmo.controller;

import bts.sio.azurimmo.model.Batiment;
import bts.sio.azurimmo.repository.BatimentRepository;
import bts.sio.azurimmo.service.BatimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/batiments")
public class BatimentController {

    @Autowired
    private BatimentService batimentService;

    // 📌 Récupérer tous les bâtiments
    @GetMapping("/")
    public List<Batiment> getAllBatiments() {
        return batimentService.getAllBatiments();
    }

    // 📌 Récupérer un bâtiment spécifique par ID
    @GetMapping("/{id}")
    public Batiment getBatimentById(@PathVariable Long id) {
        return batimentService.getBatimentById(id);
    }
}
