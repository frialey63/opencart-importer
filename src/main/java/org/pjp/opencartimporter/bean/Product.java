package org.pjp.opencartimporter.bean;

public class Product {

	private final String eposNowID;
	private final String model;
	private final int quantity;
	private final String image;
	private final String manufacturerName;
	private final float price;
	private final String attributes;
	private final String name;
	private final String description;
	private final String categoryName;
	
	public Product(String eposNowID, String model, int quantity, String image, String manufacturerName, float price, String attributes, String name, String description, String categoryName) {
		super();
		this.eposNowID = eposNowID;
		this.model = model;
		this.quantity = quantity;
		this.image = image;
		this.manufacturerName = manufacturerName;
		this.price = price;
		this.attributes = attributes;
		this.name = name;
		this.description = description;
		this.categoryName = categoryName;
	}

	public String getEposNowID() {
		return eposNowID;
	}

	public String getModel() {
		return model;
	}

	public int getQuantity() {
		return quantity;
	}

	public String getImage() {
		return image;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public float getPrice() {
		return price;
	}

	public String getAttributes() {
		return attributes;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getCategoryName() {
		return categoryName;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Product [eposNowID=");
		builder.append(eposNowID);
		builder.append(", model=");
		builder.append(model);
		builder.append(", quantity=");
		builder.append(quantity);
		builder.append(", image=");
		builder.append(image);
		builder.append(", manufacturerName=");
		builder.append(manufacturerName);
		builder.append(", price=");
		builder.append(price);
		builder.append(", attributes=");
		builder.append(attributes);
		builder.append(", name=");
		builder.append(name);
		builder.append(", description=");
		builder.append(description);
		builder.append(", categoryName=");
		builder.append(categoryName);
		builder.append("]");
		return builder.toString();
	}
	
	
}
