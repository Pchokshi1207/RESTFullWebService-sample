package org.studyeasy.showroom.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.studyeasy.showroom.hibernate.entities.ProductEntity;
import org.studyeasy.showroom.services.ProductService;

@Path("/showroom/brands")
public class Products {
	ProductService productService=new ProductService();
	
	@GET
	@Path("/{brandId}/products")
	@Produces(MediaType.APPLICATION_JSON)
	public List<ProductEntity> getProductByBrand(@PathParam("brandId") int brandId,
			@QueryParam("category") String category,@QueryParam("start") int start,@QueryParam("size") int size) {
		List<ProductEntity> Productlist;
		if(category != null){
			Productlist=productService.getProductByBrandAndCategory(brandId,category);
			
		}else{
		Productlist=productService.getProductByBrand(brandId);
		//return Productlist;
		}
		if(size>0){
			Productlist=Productlist.subList(start, size);
		}
		return Productlist;
	}

}
