package com.learning.julie.booking.model;

import java.util.ArrayList;
import java.util.List;

public class Bucket {

	private List<Product> products = new ArrayList<>();

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(final List<Product> products) {
		this.products = products;
	}

	public void add(Product product){
		this.products.add(product);
	}
}
