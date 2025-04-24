package bts.sio.azurimmo.repository;

import bts.sio.azurimmo.model.Locataire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LocataireRepository extends JpaRepository<Locataire, Long> {
    List<Locataire> findByContrat_Id(long id);
}