package com.wolken.wolkenapp;

import com.wolken.wolkenapp.dto.ElectronicsProductsDTO;

public class ElectronicsProductTester {
	public static void main(String[] args) {
		ElectronicsProductsDTO electronicsDTO =new ElectronicsProductsDTO();
		electronicsDTO.setProductId(1234);
		electronicsDTO.setProductName("Fan");
		electronicsDTO.setPrice(3000.00);
		electronicsDTO.setType("home Applicance");
		electronicsDTO.setRating(3.0);
		System.out.println(electronicsDTO);
		ElectronicsProductsDTO electronicsDTO1 =new ElectronicsProductsDTO();
		electronicsDTO1.setProductId(1234);
		electronicsDTO1.setPrice(3000.00);
		electronicsDTO1.setType("home applainace");
		electronicsDTO1.setRating(3.5);
		System.out.println(electronicsDTO1);
		System.out.println(electronicsDTO.hashCode());
		System.out.println(electronicsDTO1.hashCode());
		System.out.println(electronicsDTO.equals(electronicsDTO1));
	}
	}


