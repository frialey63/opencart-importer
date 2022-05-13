package org.pjp.opencart.db.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oc_product_to_layout database table.
 * 
 */
@Entity
@Table(name="oc_product_to_layout")
@NamedQuery(name="OcProductToLayout.findAll", query="SELECT o FROM OcProductToLayout o")
public class OcProductToLayout implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OcProductToLayoutPK id;

	@Column(name="layout_id")
	private int layoutId;

	public OcProductToLayout() {
		super();
	}

	public OcProductToLayout(OcProductToLayoutPK id, int layoutId) {
		super();
		this.id = id;
		this.layoutId = layoutId;
	}

	public OcProductToLayoutPK getId() {
		return this.id;
	}

	public void setId(OcProductToLayoutPK id) {
		this.id = id;
	}

	public int getLayoutId() {
		return this.layoutId;
	}

	public void setLayoutId(int layoutId) {
		this.layoutId = layoutId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OcProductToLayout [id=");
		builder.append(id);
		builder.append(", layoutId=");
		builder.append(layoutId);
		builder.append("]");
		return builder.toString();
	}

}