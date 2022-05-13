package org.pjp.opencart.db.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the oc_category_description database table.
 * 
 */
@Entity
@Table(name="oc_category_description")
@NamedQuery(name="OcCategoryDescription.findAll", query="SELECT o FROM OcCategoryDescription o")
public class OcCategoryDescription implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private OcCategoryDescriptionPK id;

	@Lob
	private String description;

	@Column(name="meta_description")
	private String metaDescription;

	@Column(name="meta_keyword")
	private String metaKeyword;

	@Column(name="meta_title")
	private String metaTitle;

	private String name;

	public OcCategoryDescription() {
		super();
	}

	public OcCategoryDescriptionPK getId() {
		return this.id;
	}

	public void setId(OcCategoryDescriptionPK id) {
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OcCategoryDescription [id=");
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
		builder.append("]");
		return builder.toString();
	}

}