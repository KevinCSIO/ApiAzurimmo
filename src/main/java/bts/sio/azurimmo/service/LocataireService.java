package bts.sio.azurimmo.service;

import bts.sio.azurimmo.model.Locataire;
import bts.sio.azurimmo.repository.LocataireRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class LocataireService {

    @Autowired
    private LocataireRepository locataireRepository;

    public List<Locataire> getAllLocataires() {
        return locataireRepository.findAll();
    }

    public Locataire getLocataireById(Long id) {
        Optional<Locataire> locataire = locataireRepository.findById(id);
        return locataire.orElse(null);
    }

    public List<Locataire> getLocatairesParContrat(long id) {
        return locataireRepository.findByContrat_Id(id);
    }

}
