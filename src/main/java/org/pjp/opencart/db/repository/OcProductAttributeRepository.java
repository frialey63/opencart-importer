package org.pjp.opencart.db.repository;

import org.pjp.opencart.db.model.OcProductAttribute;
import org.pjp.opencart.db.model.OcProductAttributePK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcProductAttributeRepository extends CrudRepository<OcProductAttribute, OcProductAttributePK> {

}
