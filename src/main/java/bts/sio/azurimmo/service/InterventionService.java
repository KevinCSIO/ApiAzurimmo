package bts.sio.azurimmo.service;

import java.util.List;
import java.util.Optional;

import bts.sio.azurimmo.repository.InterventionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bts.sio.azurimmo.model.Intervention;
import lombok.Data;

@Data
@Service
public class InterventionService {

    @Autowired
    private InterventionRepository interventionRepository;

    public List<Intervention> getAllInterventions(){
        return interventionRepository.findAll();
    }

    public Intervention getInterventionById(Long id) {
        Optional<Intervention> intervention = interventionRepository.findById(id);
        return intervention.orElse(null);
    }
}