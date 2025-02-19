package bts.sio.azurimmo.controller;

import bts.sio.azurimmo.model.Appartement;
import bts.sio.azurimmo.model.Batiment;
import bts.sio.azurimmo.repository.BatimentRepository;
import bts.sio.azurimmo.service.BatimentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/batiments")
@CrossOrigin(origins = {"http://127.0.0.1:3000","http://localhost:3000" })

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

    @PostMapping("/")
    public Batiment createBatiment(@RequestBody Batiment batiment) {
        return batimentService.saveBatiment(batiment);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Boolean> deleteBatiment(@PathVariable Long id){
        return ResponseEntity.ok(batimentService.deleteBatiment(id));
    }


}
