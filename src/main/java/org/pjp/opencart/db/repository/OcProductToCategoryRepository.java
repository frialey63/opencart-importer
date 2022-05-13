package org.pjp.opencart.db.repository;

import org.pjp.opencart.db.model.OcProductToCategory;
import org.pjp.opencart.db.model.OcProductToCategoryPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcProductToCategoryRepository extends CrudRepository<OcProductToCategory, OcProductToCategoryPK> {

}
