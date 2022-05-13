package org.pjp.opencart.db.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the oc_product_to_category database table.
 * 
 */
@Embeddable
public class OcProductToCategoryPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private int productId;

	@Column(name="category_id")
	private int categoryId;

	public OcProductToCategoryPK() {
		super();
	}
	
	public OcProductToCategoryPK(int productId, int categoryId) {
		super();
		this.productId = productId;
		this.categoryId = categoryId;
	}

	public int getProductId() {
		return this.productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OcProductToCategoryPK)) {
			return false;
		}
		OcProductToCategoryPK castOther = (OcProductToCategoryPK)other;
		return 
			(this.productId == castOther.productId)
			&& (this.categoryId == castOther.categoryId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.productId;
		hash = hash * prime + this.categoryId;
		
		return hash;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OcProductToCategoryPK [productId=");
		builder.append(productId);
		builder.append(", categoryId=");
		builder.append(categoryId);
		builder.append("]");
		return builder.toString();
	}
	
	
}