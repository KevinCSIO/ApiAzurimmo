package bts.sio.azurimmo.service;

import bts.sio.azurimmo.model.Garant;
import bts.sio.azurimmo.repository.GarantRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class GarantService {

    @Autowired
    private GarantRepository garantRepository;

    public List<Garant> getAllGarants() {
        return garantRepository.findAll();
    }

    public Garant getGarantById(Long id) {
        Optional<Garant> garant = garantRepository.findById(id);
        return garant.orElse(null);
    }
}
