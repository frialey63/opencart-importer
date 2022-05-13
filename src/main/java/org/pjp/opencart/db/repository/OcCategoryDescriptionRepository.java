package org.pjp.opencart.db.repository;

import java.util.Optional;

import org.pjp.opencart.db.model.OcCategoryDescription;
import org.pjp.opencart.db.model.OcCategoryDescriptionPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcCategoryDescriptionRepository extends CrudRepository<OcCategoryDescription, OcCategoryDescriptionPK> {

	public Optional<OcCategoryDescription> findFirstByName(String name);
}
