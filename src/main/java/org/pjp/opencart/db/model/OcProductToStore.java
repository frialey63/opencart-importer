package org.pjp.opencart.db.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oc_product_to_store database table.
 * 
 */
@Entity
@Table(name="oc_product_to_store")
@NamedQuery(name="OcProductToStore.findAll", query="SELECT o FROM OcProductToStore o")
public class OcProductToStore implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OcProductToStorePK id;

	public OcProductToStore() {
		super();
	}

	public OcProductToStore(OcProductToStorePK id) {
		super();
		this.id = id;
	}



	public OcProductToStorePK getId() {
		return this.id;
	}

	public void setId(OcProductToStorePK id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OcProductToStore [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

	
}