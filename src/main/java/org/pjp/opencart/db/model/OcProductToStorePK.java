package org.pjp.opencart.db.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the oc_product_to_store database table.
 * 
 */
@Embeddable
public class OcProductToStorePK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(name="product_id")
	private int productId;

	@Column(name="store_id")
	private int storeId;

	public OcProductToStorePK() {
		super();
	}
	
	public OcProductToStorePK(int productId, int storeId) {
		super();
		this.productId = productId;
		this.storeId = storeId;
	}

	public int getProductId() {
		return this.productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public int getStoreId() {
		return this.storeId;
	}
	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof OcProductToStorePK)) {
			return false;
		}
		OcProductToStorePK castOther = (OcProductToStorePK)other;
		return 
			(this.productId == castOther.productId)
			&& (this.storeId == castOther.storeId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.productId;
		hash = hash * prime + this.storeId;
		
		return hash;
	}



	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OcProductToStorePK [productId=");
		builder.append(productId);
		builder.append(", storeId=");
		builder.append(storeId);
		builder.append("]");
		return builder.toString();
	}
	
	
}