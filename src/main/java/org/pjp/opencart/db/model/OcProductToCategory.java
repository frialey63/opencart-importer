package org.pjp.opencart.db.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oc_product_to_category database table.
 * 
 */
@Entity
@Table(name="oc_product_to_category")
@NamedQuery(name="OcProductToCategory.findAll", query="SELECT o FROM OcProductToCategory o")
public class OcProductToCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OcProductToCategoryPK id;

	public OcProductToCategory() {
		super();
	}

	public OcProductToCategory(OcProductToCategoryPK id) {
		super();
		this.id = id;
	}

	public OcProductToCategoryPK getId() {
		return this.id;
	}

	public void setId(OcProductToCategoryPK id) {
		this.id = id;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OcProductToCategory [id=");
		builder.append(id);
		builder.append("]");
		return builder.toString();
	}

}