package org.pjp.opencart.db.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oc_manufacturer database table.
 * 
 */
@Entity
@Table(name="oc_manufacturer")
@NamedQuery(name="OcManufacturer.findAll", query="SELECT o FROM OcManufacturer o")
public class OcManufacturer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="manufacturer_id")
	private int manufacturerId;

	private String image;

	private String name;

	@Column(name="sort_order")
	private int sortOrder;

	public OcManufacturer() {
		super();
	}

	public int getManufacturerId() {
		return this.manufacturerId;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OcManufacturer [manufacturerId=");
		builder.append(manufacturerId);
		builder.append(", image=");
		builder.append(image);
		builder.append(", name=");
		builder.append(name);
		builder.append(", sortOrder=");
		builder.append(sortOrder);
		builder.append("]");
		return builder.toString();
	}

}