package org.pjp.opencart.db.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


/**
 * The persistent class for the oc_product database table.
 * 
 */
@Entity
@Table(name="oc_product")
@NamedQuery(name="OcProduct.findAll", query="SELECT o FROM OcProduct o")
public class OcProduct implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="product_id")
	private int productId;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_added")
	private Date dateAdded;

	@Temporal(TemporalType.DATE)
	@Column(name="date_available")
	private Date dateAvailable;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="date_modified")
	private Date dateModified;

	private String ean;

	private double height;

	private String image;

	private String isbn;

	private String jan;

	private double length;

	@Column(name="length_class_id")
	private int lengthClassId;

	private String location;

	@Column(name="manufacturer_id")
	private int manufacturerId;

	private int minimum;

	private String model;

	private String mpn;

	private int points;

	private double price;

	private int quantity;

	private byte shipping;

	private String sku;

	@Column(name="sort_order")
	private int sortOrder;

	private byte status;

	@Column(name="stock_status_id")
	private int stockStatusId;

	private byte subtract;

	@Column(name="tax_class_id")
	private int taxClassId;

	private String upc;

	private int viewed;

	private double weight;

	@Column(name="weight_class_id")
	private int weightClassId;

	private double width;

	public OcProduct() {
		super();
	}

	public OcProduct(int productId, String model, int manufacturerId, String mpn, Date date, String location, double price, int quantity, int minimum, double weight, double length, double width, double height, String image) {
		super();
		this.productId = productId;
		this.dateAdded = date;
		this.dateAvailable = date;
		this.dateModified = date;
		this.ean = "";
		this.height = height;
		this.isbn = "";
		this.jan = "";
		this.image = image;
		this.length = length;
		this.lengthClassId = 1;
		this.location = location;
		this.manufacturerId = manufacturerId;
		this.minimum = minimum;
		this.model = model;
		this.mpn = mpn;
		this.points = 0;
		this.price = price;
		this.quantity = quantity;
		this.shipping = 1;
		this.sku = "";
		this.sortOrder = 0;
		this.status = 1;
		this.stockStatusId = 6;
		this.subtract = 1;
		this.taxClassId = 9;
		this.upc = "";
		this.viewed = 0;
		this.weight = weight;
		this.weightClassId = 1;
		this.width = width;
	}

	public int getProductId() {
		return this.productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public Date getDateAdded() {
		return this.dateAdded;
	}

	public void setDateAdded(Date dateAdded) {
		this.dateAdded = dateAdded;
	}

	public Date getDateAvailable() {
		return this.dateAvailable;
	}

	public void setDateAvailable(Date dateAvailable) {
		this.dateAvailable = dateAvailable;
	}

	public Date getDateModified() {
		return this.dateModified;
	}

	public void setDateModified(Date dateModified) {
		this.dateModified = dateModified;
	}

	public String getEan() {
		return this.ean;
	}

	public void setEan(String ean) {
		this.ean = ean;
	}

	public double getHeight() {
		return this.height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getImage() {
		return this.image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getIsbn() {
		return this.isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getJan() {
		return this.jan;
	}

	public void setJan(String jan) {
		this.jan = jan;
	}

	public double getLength() {
		return this.length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getLengthClassId() {
		return this.lengthClassId;
	}

	public void setLengthClassId(int lengthClassId) {
		this.lengthClassId = lengthClassId;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public int getManufacturerId() {
		return this.manufacturerId;
	}

	public void setManufacturerId(int manufacturerId) {
		this.manufacturerId = manufacturerId;
	}

	public int getMinimum() {
		return this.minimum;
	}

	public void setMinimum(int minimum) {
		this.minimum = minimum;
	}

	public String getModel() {
		return this.model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMpn() {
		return this.mpn;
	}

	public void setMpn(String mpn) {
		this.mpn = mpn;
	}

	public int getPoints() {
		return this.points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public double getPrice() {
		return this.price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public byte getShipping() {
		return this.shipping;
	}

	public void setShipping(byte shipping) {
		this.shipping = shipping;
	}

	public String getSku() {
		return this.sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public int getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(int sortOrder) {
		this.sortOrder = sortOrder;
	}

	public byte getStatus() {
		return this.status;
	}

	public void setStatus(byte status) {
		this.status = status;
	}

	public int getStockStatusId() {
		return this.stockStatusId;
	}

	public void setStockStatusId(int stockStatusId) {
		this.stockStatusId = stockStatusId;
	}

	public byte getSubtract() {
		return this.subtract;
	}

	public void setSubtract(byte subtract) {
		this.subtract = subtract;
	}

	public int getTaxClassId() {
		return this.taxClassId;
	}

	public void setTaxClassId(int taxClassId) {
		this.taxClassId = taxClassId;
	}

	public String getUpc() {
		return this.upc;
	}

	public void setUpc(String upc) {
		this.upc = upc;
	}

	public int getViewed() {
		return this.viewed;
	}

	public void setViewed(int viewed) {
		this.viewed = viewed;
	}

	public double getWeight() {
		return this.weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public int getWeightClassId() {
		return this.weightClassId;
	}

	public void setWeightClassId(int weightClassId) {
		this.weightClassId = weightClassId;
	}

	public double getWidth() {
		return this.width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("OcProduct [productId=");
		builder.append(productId);
		builder.append(", dateAdded=");
		builder.append(dateAdded);
		builder.append(", dateAvailable=");
		builder.append(dateAvailable);
		builder.append(", dateModified=");
		builder.append(dateModified);
		builder.append(", ean=");
		builder.append(ean);
		builder.append(", height=");
		builder.append(height);
		builder.append(", image=");
		builder.append(image);
		builder.append(", isbn=");
		builder.append(isbn);
		builder.append(", jan=");
		builder.append(jan);
		builder.append(", length=");
		builder.append(length);
		builder.append(", lengthClassId=");
		builder.append(lengthClassId);
		builder.append(", location=");
		builder.append(location);
		builder.append(", manufacturerId=");
		builder.append(manufacturerId);
		builder.append(", minimum=");
		builder.append(minimum);
		builder.append(", model=");
		builder.append(model);
		builder.append(", mpn=");
		builder.append(mpn);
		builder.append(", points=");
		builder.append(points);
		builder.append(", price=");
		builder.append(price);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", shipping=");
		builder.append(shipping);
		builder.append(", sku=");
		builder.append(sku);
		builder.append(", sortOrder=");
		builder.append(sortOrder);
		builder.append(", status=");
		builder.append(status);
		builder.append(", stockStatusId=");
		builder.append(stockStatusId);
		builder.append(", subtract=");
		builder.append(subtract);
		builder.append(", taxClassId=");
		builder.append(taxClassId);
		builder.append(", upc=");
		builder.append(upc);
		builder.append(", viewed=");
		builder.append(viewed);
		builder.append(", weight=");
		builder.append(weight);
		builder.append(", weightClassId=");
		builder.append(weightClassId);
		builder.append(", width=");
		builder.append(width);
		builder.append("]");
		return builder.toString();
	}

}