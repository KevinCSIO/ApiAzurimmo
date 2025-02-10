package bts.sio.azurimmo.service;

import java.util.List;
import java.util.Optional;

import bts.sio.azurimmo.model.Appartement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import bts.sio.azurimmo.model.Contrat;
import bts.sio.azurimmo.repository.ContratRepository;
import lombok.Data;

@Data
@Service
public class ContratService {

    @Autowired
    private ContratRepository contratRepository;

    /*public List<Contrat> getContratParAssocie(long associeId) {
        return contratRepository.findByAssocieId(associeId);
    }*/

    public List<Contrat> getAllContrats(){
        return contratRepository.findAll();
    }

    public Contrat getContratById(Long id) {
        Optional<Contrat> contrat = contratRepository.findById(id);
        return contrat.orElse(null);
    }
}