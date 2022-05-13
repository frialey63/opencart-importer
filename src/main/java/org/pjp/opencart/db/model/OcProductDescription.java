package org.pjp.opencart.db.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oc_product_description database table.
 * 
 */
@Entity
@Table(name="oc_product_description")
@NamedQuery(name="OcProductDescription.findAll", query="SELECT o FROM OcProductDescription o")
public class OcProductDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OcProductDescriptionPK id;

	@Lob
	private String description;

	@Column(name="meta_description")
	private String metaDescription;

	@Column(name="meta_keyword")
	private String metaKeyword;

	@Column(name="meta_title")
	private String metaTitle;

	private String name;

	@Lob
	private String tag;

	public OcProductDescription() {
		super();
	}
	
	public OcProductDescription(OcProductDescriptionPK id, String description, String name, String tag) {
		super();
		this.id = id;
		this.description = description;
		this.metaDescription = "";
		this.metaKeyword = "";
		this.metaTitle = "";
		this.name = name;
		this.tag = tag;
	}

	public OcProductDescriptionPK getId() {
		return this.id;
	}

	public void setId(OcProductDescriptionPK id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMetaDescription() {
		return this.metaDescription;
	}

	public void setMetaDescription(String metaDescription) {
		this.metaDescription = metaDescription;
	}

	public String getMetaKeyword() {
		return this.metaKeyword;
	}

	public void setMetaKeyword(String metaKeyword) {
		this.metaKeyword = metaKeyword;
	}

	public String getMetaTitle() {
		return this.metaTitle;
	}

	public void setMetaTitle(String metaTitle) {
		this.metaTitle = metaTitle;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OcProductDescription [id=");
		builder.append(id);
		builder.append(", description=");
		builder.append(description);
		builder.append(", metaDescription=");
		builder.append(metaDescription);
		builder.append(", metaKeyword=");
		builder.append(metaKeyword);
		builder.append(", metaTitle=");
		builder.append(metaTitle);
		builder.append(", name=");
		builder.append(name);
		builder.append(", tag=");
		builder.append(tag);
		builder.append("]");
		return builder.toString();
	}

}