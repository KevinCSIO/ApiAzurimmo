package bts.sio.azurimmo.repository;
import org.springframework.stereotype.Repository;
import bts.sio.azurimmo.model.Contrat;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ContratRepository extends JpaRepository<Contrat, Long> {
    List<Contrat> findByAppartement_Id(long id);
    List<Contrat> findByLocataire_Id(Long id);
    Optional<Contrat> findById(Long id);

    //List<Contrat> findByAssocieId(long associeId);
}