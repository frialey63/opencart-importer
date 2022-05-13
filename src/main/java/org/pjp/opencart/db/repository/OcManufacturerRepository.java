package org.pjp.opencart.db.repository;

import java.util.Optional;

import org.pjp.opencart.db.model.OcManufacturer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcManufacturerRepository extends CrudRepository<OcManufacturer, Integer> {

	public Optional<OcManufacturer> findFirstByName(String name);
}
