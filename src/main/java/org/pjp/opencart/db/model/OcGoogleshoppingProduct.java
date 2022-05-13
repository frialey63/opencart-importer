package org.pjp.opencart.db.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the oc_googleshopping_product database table.
 * 
 */
@Entity
@Table(name="oc_googleshopping_product")
@NamedQuery(name="OcGoogleshoppingProduct.findAll", query="SELECT o FROM OcGoogleshoppingProduct o")
public class OcGoogleshoppingProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="product_advertise_google_id")
	private int productAdvertiseGoogleId;

	private Byte adult;

	@Column(name="age_group")
	private String ageGroup;

	private int clicks;

	private Integer color;

	@Column(name="`condition`")
	private String condition;

	@Column(name="conversion_value")
	private double conversionValue;

	private int conversions;

	private double cost;

	@Column(name="destination_status")
	private String destinationStatus;

	private String gender;

	@Column(name="google_product_category")
	private String googleProductCategory;

	@Column(name="has_issues")
	private Byte hasIssues;

	private int impressions;

	@Column(name="is_bundle")
	private Byte isBundle;

	@Column(name="is_modified")
	private byte isModified;

	private Integer multipack;

	@Column(name="product_id")
	private int productId;

	private Integer size;

	@Column(name="size_system")
	private String sizeSystem;

	@Column(name="size_type")
	private String sizeType;

	@Column(name="store_id")
	private int storeId;

	public OcGoogleshoppingProduct() {
		super();
	}

	public OcGoogleshoppingProduct(int productAdvertiseGoogleId, double conversionValue, int conversions, double cost, String destinationStatus, int impressions, byte isModified, int productId, int storeId) {
		super();
		this.productAdvertiseGoogleId = productAdvertiseGoogleId;
		this.clicks = 0;
		this.conversionValue = conversionValue;
		this.conversions = conversions;
		this.cost = cost;
		this.destinationStatus = destinationStatus;
		this.impressions = impressions;
		this.isModified = isModified;
		this.productId = productId;
		this.storeId = storeId;
	}

	public int getProductAdvertiseGoogleId() {
		return this.productAdvertiseGoogleId;
	}

	public void setProductAdvertiseGoogleId(int productAdvertiseGoogleId) {
		this.productAdvertiseGoogleId = productAdvertiseGoogleId;
	}

	public Byte getAdult() {
		return this.adult;
	}

	public void setAdult(Byte adult) {
		this.adult = adult;
	}

	public String getAgeGroup() {
		return this.ageGroup;
	}

	public void setAgeGroup(String ageGroup) {
		this.ageGroup = ageGroup;
	}

	public int getClicks() {
		return this.clicks;
	}

	public void setClicks(int clicks) {
		this.clicks = clicks;
	}

	public Integer getColor() {
		return this.color;
	}

	public void setColor(Integer color) {
		this.color = color;
	}

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public double getConversionValue() {
		return this.conversionValue;
	}

	public void setConversionValue(double conversionValue) {
		this.conversionValue = conversionValue;
	}

	public int getConversions() {
		return this.conversions;
	}

	public void setConversions(int conversions) {
		this.conversions = conversions;
	}

	public double getCost() {
		return this.cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getDestinationStatus() {
		return this.destinationStatus;
	}

	public void setDestinationStatus(String destinationStatus) {
		this.destinationStatus = destinationStatus;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getGoogleProductCategory() {
		return this.googleProductCategory;
	}

	public void setGoogleProductCategory(String googleProductCategory) {
		this.googleProductCategory = googleProductCategory;
	}

	public Byte getHasIssues() {
		return this.hasIssues;
	}

	public void setHasIssues(Byte hasIssues) {
		this.hasIssues = hasIssues;
	}

	public int getImpressions() {
		return this.impressions;
	}

	public void setImpressions(int impressions) {
		this.impressions = impressions;
	}

	public Byte getIsBundle() {
		return this.isBundle;
	}

	public void setIsBundle(Byte isBundle) {
		this.isBundle = isBundle;
	}

	public byte getIsModified() {
		return this.isModified;
	}

	public void setIsModified(byte isModified) {
		this.isModified = isModified;
	}

	public Integer getMultipack() {
		return this.multipack;
	}

	public void setMultipack(Integer multipack) {
		this.multipack = multipack;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Integer getSize() {
		return this.size;
	}

	public void setSize(Integer size) {
		this.size = size;
	}

	public String getSizeSystem() {
		return this.sizeSystem;
	}

	public void setSizeSystem(String sizeSystem) {
		this.sizeSystem = sizeSystem;
	}

	public String getSizeType() {
		return this.sizeType;
	}

	public void setSizeType(String sizeType) {
		this.sizeType = sizeType;
	}

	public int getStoreId() {
		return this.storeId;
	}

	public void setStoreId(int storeId) {
		this.storeId = storeId;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OcGoogleshoppingProduct [productAdvertiseGoogleId=");
		builder.append(productAdvertiseGoogleId);
		builder.append(", adult=");
		builder.append(adult);
		builder.append(", ageGroup=");
		builder.append(ageGroup);
		builder.append(", clicks=");
		builder.append(clicks);
		builder.append(", color=");
		builder.append(color);
		builder.append(", condition=");
		builder.append(condition);
		builder.append(", conversionValue=");
		builder.append(conversionValue);
		builder.append(", conversions=");
		builder.append(conversions);
		builder.append(", cost=");
		builder.append(cost);
		builder.append(", destinationStatus=");
		builder.append(destinationStatus);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", googleProductCategory=");
		builder.append(googleProductCategory);
		builder.append(", hasIssues=");
		builder.append(hasIssues);
		builder.append(", impressions=");
		builder.append(impressions);
		builder.append(", isBundle=");
		builder.append(isBundle);
		builder.append(", isModified=");
		builder.append(isModified);
		builder.append(", multipack=");
		builder.append(multipack);
		builder.append(", productId=");
		builder.append(productId);
		builder.append(", size=");
		builder.append(size);
		builder.append(", sizeSystem=");
		builder.append(sizeSystem);
		builder.append(", sizeType=");
		builder.append(sizeType);
		builder.append(", storeId=");
		builder.append(storeId);
		builder.append("]");
		return builder.toString();
	}

}