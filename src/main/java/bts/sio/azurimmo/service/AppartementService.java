package bts.sio.azurimmo.service;

import java.util.List;
import java.util.Optional;

import bts.sio.azurimmo.model.Batiment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bts.sio.azurimmo.model.Appartement;
import bts.sio.azurimmo.repository.AppartementRepository;
import lombok.Data;

@Data
@Service
public class AppartementService {

    @Autowired
    private AppartementRepository appartementRepository;

    public List<Appartement> getAllAppartements(){
        return appartementRepository.findAll();
    }

    public Appartement getAppartementById(Long id) {
        Optional<Appartement> appartement = appartementRepository.findById(id);
        return appartement.orElse(null);
    }

    public Appartement saveAppartement(Appartement appartement) {
        Appartement savedAppartement = appartementRepository.save(appartement);
        return savedAppartement;
    }
    public List<Appartement> findByVille(String ville) {
        return appartementRepository.findByBatiment_Ville(ville);
    }

    public List<Appartement> getAppartementsParBatiment(long id) {
        return appartementRepository.findByBatiment_Id(id);
    }

    public List<Appartement> getAppartementsParSurface(float surface) {
        return appartementRepository.findBySurfaceGreaterThan(surface);
    }
}