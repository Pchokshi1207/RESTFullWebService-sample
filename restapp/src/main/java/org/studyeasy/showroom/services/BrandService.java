package org.studyeasy.showroom.services;

import java.util.List;

import org.studyeasy.showroom.hibernate.DAO.BrandsDAO;
import org.studyeasy.showroom.hibernate.entities.BrandEntity;
import org.studyeasy.showroom.resources.Brands;

public class BrandService {
	BrandsDAO DAO=new BrandsDAO();

	public List<BrandEntity> getBrands() {
		List<BrandEntity> list=DAO.getBrands();
		return list;
	}

	public void addBrand(BrandEntity brand) {
		DAO.addBrand(brand);
		
	}

	public void updateBrand(BrandEntity updatedBrand) {
		DAO.updateBrand(updatedBrand);
		
	}

	public void deleteBrand(int brandId) {
		// TODO Auto-generated method stub
		DAO.deleteBrand(brandId);
		
	}

	/*
	public List<BrandEntity> getBrandsById(int brandId) {
		List<BrandEntity> list=DAO.getBrandsById(brandId);
		return list;
	}
	*/

	public BrandEntity getBrandById(int brandId) {
		return DAO.getBrandById(brandId);
		
	}

}
