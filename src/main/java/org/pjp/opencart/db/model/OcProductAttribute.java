package org.pjp.opencart.db.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oc_product_attribute database table.
 * 
 */
@Entity
@Table(name="oc_product_attribute")
@NamedQuery(name="OcProductAttribute.findAll", query="SELECT o FROM OcProductAttribute o")
public class OcProductAttribute implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OcProductAttributePK id;

	@Lob
	private String text;

	public OcProductAttribute() {
		super();
	}

	public OcProductAttribute(OcProductAttributePK id, String text) {
		super();
		this.id = id;
		this.text = text;
	}

	public OcProductAttributePK getId() {
		return this.id;
	}

	public void setId(OcProductAttributePK id) {
		this.id = id;
	}

	public String getText() {
		return this.text;
	}

	public void setText(String text) {
		this.text = text;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OcProductAttribute [id=");
		builder.append(id);
		builder.append(", text=");
		builder.append(text);
		builder.append("]");
		return builder.toString();
	}

}