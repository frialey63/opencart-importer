package org.pjp.opencart.db.repository;

import org.pjp.opencart.db.model.OcProductToStore;
import org.pjp.opencart.db.model.OcProductToStorePK;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OcProductToStoreRepository extends CrudRepository<OcProductToStore, OcProductToStorePK> {

}
