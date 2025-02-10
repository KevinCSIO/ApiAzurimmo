package bts.sio.azurimmo.repository;
import org.springframework.stereotype.Repository;
import bts.sio.azurimmo.model.Locataire;

import bts.sio.azurimmo.model.Batiment;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface LocataireRepository extends JpaRepository<Locataire, Long> {
}