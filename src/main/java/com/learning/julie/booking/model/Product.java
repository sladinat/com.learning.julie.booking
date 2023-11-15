package com.learning.julie.booking.model;

public abstract class Product {

	protected double price;

	protected String name;

	public Product(final double price, final String name, final Unit unit) {
		this.price = price;
		this.name = name;
		this.unit = unit;
	}

	protected Unit unit;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(final Unit unit) {
		this.unit = unit;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(final double price) {
		this.price = price;
	}
}

