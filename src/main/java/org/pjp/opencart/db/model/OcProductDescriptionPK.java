package org.pjp.opencart.db.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the oc_product_description database table.
 * 
 */
@Embeddable
public class OcProductDescriptionPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private int productId;

	@Column(name="language_id")
	private int languageId;

	public OcProductDescriptionPK() {
		super();
	}
	
	
	public OcProductDescriptionPK(int productId, int languageId) {
		super();
		this.productId = productId;
		this.languageId = languageId;
	}

	public int getProductId() {
		return this.productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
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
		if (!(other instanceof OcProductDescriptionPK)) {
			return false;
		}
		OcProductDescriptionPK castOther = (OcProductDescriptionPK)other;
		return 
			(this.productId == castOther.productId)
			&& (this.languageId == castOther.languageId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.productId;
		hash = hash * prime + this.languageId;
		
		return hash;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OcProductDescriptionPK [productId=");
		builder.append(productId);
		builder.append(", languageId=");
		builder.append(languageId);
		builder.append("]");
		return builder.toString();
	}
	
}