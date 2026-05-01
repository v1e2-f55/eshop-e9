package com.jsp.shopping.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class ProductDto {

	@JsonProperty(access = Access.READ_ONLY)
	private Long id;

	@Size(min = 3, max = 100, message = "Enter Name between 3~100 characters")
	@NotNull(message = "Enter Name")
	private String name;

	@DecimalMin(value = "10", message = "Product Price should be atleast 10 Rs.")
	@DecimalMax(value = "100000", message = "Product Price should be atmost 1 Lakh Rs.")
	@NotNull(message = "Enter Price")
	private Double price;

	@NotEmpty(message = "Enter Category")
	private String category;

	@Size(min = 20, max = 200, message = "Description should be between 20~200 characters")
	@NotNull(message = "Enter Description")
	private String description;

	@Size(min = 20, max = 200, message = "ImageLink should be between 20~200 characters")
	@NotNull(message = "Enter ImageLink")
	private String imageLink;

	@Min(value = 1, message = "Atleast 1 should be Entered")
	@Max(value = 100, message = "Atmost 100 should be Entered")
	@NotNull(message = "Enter Stock")
	private Integer stock;

	public Long getId() { return id; }
	public void setId(Long id) { this.id = id; }

	public String getName() { return name; }
	public void setName(String name) { this.name = name; }

	public Double getPrice() { return price; }
	public void setPrice(Double price) { this.price = price; }

	public String getCategory() { return category; }
	public void setCategory(String category) { this.category = category; }

	public String getDescription() { return description; }
	public void setDescription(String description) { this.description = description; }

	public String getImageLink() { return imageLink; }
	public void setImageLink(String imageLink) { this.imageLink = imageLink; }

	public Integer getStock() { return stock; }
	public void setStock(Integer stock) { this.stock = stock; }
}