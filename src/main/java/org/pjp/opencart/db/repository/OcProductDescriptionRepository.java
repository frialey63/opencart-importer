package org.pjp.opencart.db.repository;

import org.pjp.opencart.db.model.OcProductDescription;
import org.pjp.opencart.db.model.OcProductDescriptionPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcProductDescriptionRepository extends CrudRepository<OcProductDescription, OcProductDescriptionPK> {

}
