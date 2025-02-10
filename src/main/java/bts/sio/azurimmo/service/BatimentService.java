package bts.sio.azurimmo.service;

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

    public List<Batiment> getAllBatiments() {
        return batimentRepository.findAll();
    }

    public Batiment getBatimentById(Long id) {
        Optional<Batiment> batiment = batimentRepository.findById(id);
        return batiment.orElse(null);
    }
}