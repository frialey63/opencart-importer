package org.pjp.opencart.db.repository;

import org.pjp.opencart.db.model.OcProductToLayout;
import org.pjp.opencart.db.model.OcProductToLayoutPK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcProductToLayoutRepository extends CrudRepository<OcProductToLayout, OcProductToLayoutPK> {

}
