package org.pjp.opencart.db.repository;

import org.pjp.opencart.db.model.OcProduct;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcProductRepository extends CrudRepository<OcProduct, Integer> {

}
