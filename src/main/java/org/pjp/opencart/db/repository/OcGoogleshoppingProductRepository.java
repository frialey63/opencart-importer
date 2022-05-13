package org.pjp.opencart.db.repository;

import org.pjp.opencart.db.model.OcGoogleshoppingProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcGoogleshoppingProductRepository extends CrudRepository<OcGoogleshoppingProduct, Integer> {

}
