package bts.sio.azurimmo.service;

import bts.sio.azurimmo.model.Contrat;
import bts.sio.azurimmo.model.Locataire;
import bts.sio.azurimmo.repository.ContratRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class ContratService {

    @Autowired
    private ContratRepository contratRepository;

    /*public List<Contrat> getContratParAssocie(long associeId) {
        return contratRepository.findByAssocieId(associeId);
    }*/

    public List<Contrat> getAllContrats() {
        return contratRepository.findAll();
    }

    public Contrat getContratById(Long id) {
        Optional<Contrat> contrat = contratRepository.findById(id);
        return contrat.orElse(null);
    }

    public Contrat saveContrat(Contrat contrat) {
        if (contrat.getId() != null && contrat.getId() == 0) {
            contrat.setId(null);
        }
        return contratRepository.save(contrat);
    }

    public List<Contrat> getContratsParAppartement(long id) {
        return contratRepository.findByAppartement_Id(id);
    }

    public Locataire getLocataireFromContrat(Long contratId) {
        Optional<Contrat> contrat = contratRepository.findById(contratId);
        return contrat.map(Contrat::getLocataire).orElse(null);
    }

}