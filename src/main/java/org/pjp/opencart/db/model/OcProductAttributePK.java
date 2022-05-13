package org.pjp.opencart.db.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the oc_product_attribute database table.
 * 
 */
@Embeddable
public class OcProductAttributePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private int productId;

	@Column(name="attribute_id")
	private int attributeId;

	@Column(name="language_id")
	private int languageId;

	public OcProductAttributePK() {
		super();
	}
	
	public OcProductAttributePK(int productId, int attributeId, int languageId) {
		super();
		this.productId = productId;
		this.attributeId = attributeId;
		this.languageId = languageId;
	}

	public int getProductId() {
		return this.productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getAttributeId() {
		return this.attributeId;
	}
	public void setAttributeId(int attributeId) {
		this.attributeId = attributeId;
	}
	public int getLanguageId() {
		return this.languageId;
	}
	public void setLanguageId(int languageId) {
		this.languageId = languageId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OcProductAttributePK)) {
			return false;
		}
		OcProductAttributePK castOther = (OcProductAttributePK)other;
		return 
			(this.productId == castOther.productId)
			&& (this.attributeId == castOther.attributeId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.productId;
		hash = hash * prime + this.attributeId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OcProductAttributePK [productId=");
		builder.append(productId);
		builder.append(", attributeId=");
		builder.append(attributeId);
		builder.append(", languageId=");
		builder.append(languageId);
		builder.append("]");
		return builder.toString();
	}
	
}