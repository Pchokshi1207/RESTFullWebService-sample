package org.studyeasy.showroom.services;

import java.util.List;

import org.studyeasy.showroom.hibernate.DAO.ProductsDAO;
import org.studyeasy.showroom.hibernate.entities.ProductEntity;

public class ProductService {
	ProductsDAO DAO=new ProductsDAO();

	public List<ProductEntity> getProductByBrand(int brandId) {
		List<ProductEntity> Productlist=DAO.getProductByBrand(brandId);
		return Productlist;
	}

	public List<ProductEntity> getProductByBrandAndCategory(int brandId,
			String category) {
		List<ProductEntity> Productlist=DAO.getProductByBrandAndCategory(brandId,category);
		return Productlist;
		
	}

}
