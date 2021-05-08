package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.*;

import lombok.*;
@Entity
@Data @NoArgsConstructor @AllArgsConstructor @ToString
public class Product implements Serializable {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private  Long id;
	private String name;
	private String description;
	private double currentprice;
	private boolean promotion;
	private boolean selected;
	private boolean available;
	private String photoName;
	
	@ManyToOne
	private Category category;

	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(Long id, String name, String description, double currentprice, boolean promotion, boolean selected,
			boolean available, String photoName) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.currentprice = currentprice;
		this.promotion = promotion;
		this.selected = selected;
		this.available = available;
		this.photoName = photoName;
	}

	public Product(Long id, String name, String description, double currentprice, boolean promotion, boolean selected,
			boolean available, String photoName, Category category) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.currentprice = currentprice;
		this.promotion = promotion;
		this.selected = selected;
		this.available = available;
		this.photoName = photoName;
		this.category = category;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getCurrentprice() {
		return currentprice;
	}

	public void setCurrentprice(double currentprice) {
		this.currentprice = currentprice;
	}

	public boolean isPromotion() {
		return promotion;
	}

	public void setPromotion(boolean promotion) {
		this.promotion = promotion;
	}

	public boolean isSelected() {
		return selected;
	}

	public void setSelected(boolean selected) {
		this.selected = selected;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getPhotoName() {
		return photoName;
	}

	public void setPhotoName(String photoName) {
		this.photoName = photoName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
	
	
}
