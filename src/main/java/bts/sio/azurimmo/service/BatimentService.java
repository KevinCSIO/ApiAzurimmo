package bts.sio.azurimmo.service;

import bts.sio.azurimmo.dto.BatimentDto;
import bts.sio.azurimmo.model.Batiment;
import bts.sio.azurimmo.repository.BatimentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BatimentService {

    @Autowired
    private BatimentRepository batimentRepository;

    public Batiment saveBatiment(BatimentDto batiment) {
        Batiment _batiment;
        if (batiment.getId() == 0) {
            _batiment = new Batiment();
        }else{
            _batiment=batimentRepository.findById(batiment.getId()).get();
        }
        batiment.updateTo(_batiment);
        Batiment savedBatiment=batimentRepository.save(_batiment);
        return savedBatiment;
    }

    public List<Batiment> getAllBatiments() {
        return batimentRepository.findAll();
    }

    public Batiment getBatimentById(Long id) {
        Optional<Batiment> batiment = batimentRepository.findById(id);
        return batiment.orElse(null);
    }

    public boolean deleteBatiment(Long batimentId) {
        Optional<Batiment> optBat = batimentRepository.findById(batimentId);
        if (optBat.isPresent()) {
            batimentRepository.delete(optBat.get());
            return true;
        }
        return false;
    }
}