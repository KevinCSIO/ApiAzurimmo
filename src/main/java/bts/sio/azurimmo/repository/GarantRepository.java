package bts.sio.azurimmo.repository;

import bts.sio.azurimmo.model.Garant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GarantRepository extends JpaRepository<Garant, Long> {
}
