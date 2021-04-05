package com.wolken.wolkenapp.dto;

public class ElectronicsProductsDTO {
	private Integer productId;
	private String productName;
	private Double price;
	private String type;
	private Double Rating;
	
	public ElectronicsProductsDTO() {
		System.out.println(this.getClass().getSimpleName()+"object is created");
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Double getRating() {
		return Rating;
	}

	public void setRating(Double rating) {
		Rating = rating;
	}
	@Override
	public String toString() {
		return "ElectronicsDTO -ProductId"+this.productId+" Product Name"+this.productName+
				" ProductPrize"+this.price+" ProductType"+this.type+" ProductRating"+this.Rating;
	}
	@Override 
	public int hashCode() {
		return this.productId;
	}
	public boolean equals(Object obj) {
		 ElectronicsProductsDTO electronicsProductDTO = (ElectronicsProductsDTO)obj;
		if(obj==null) {
			return false;
		}
		else {
			if (obj !=null) {
				if(obj instanceof ElectronicsProductsDTO) {
					if(this.hashCode()==electronicsProductDTO.hashCode()) {
						return true;
						
					}
				}
			}
			return false;
		}
	}
	
}
