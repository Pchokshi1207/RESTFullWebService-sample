package org.studyeasy.showroom.resources;

import java.net.URI;
import java.util.List;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.core.UriInfo;

import org.studyeasy.showroom.hibernate.entities.BrandEntity;
import org.studyeasy.showroom.hibernate.entities.ProductEntity;
import org.studyeasy.showroom.services.BrandService;
import org.studyeasy.showroom.services.ProductService;



@Path("/showroom/brands")
public class Brands {
	BrandService service=new BrandService();
	

	@GET
	//@Path("/brands")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BrandEntity> getBrands() {
		List<BrandEntity> list=service.getBrands();
		return list;
	}
	
	/*
	@GET
	@Path("/{brandId}")
	@Produces(MediaType.APPLICATION_JSON)
	public List<BrandEntity> get(@PathParam("brandId") int brandId) {
		List<BrandEntity> list = service.getBrandsById(brandId);
	      return list;
	   }*/
	
	
	@GET
	@Path("/{brandId}")
	@Produces(MediaType.APPLICATION_JSON)
	public BrandEntity getBrandById(@PathParam("brandId") int brandId) {
		
		return service.getBrandById(brandId);
	}
	
	

	@POST
	//@Path("/brands")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Response postBrands(BrandEntity brand,@Context UriInfo uri) {
		URI location=uri.getAbsolutePath();
		service.addBrand(brand);
		return Response.created(location).entity(brand).build();
				//created(location).entity(brand).build();
				//status(Status.CREATED).entity("ok").build();
				
	}
	@PUT
	@Path("/{brandId}")
	@Consumes(MediaType.APPLICATION_JSON)
	public void putBrands(@PathParam("brandId") int brandId,BrandEntity updatedBrand) {
		updatedBrand.setBrandId(brandId);
		service.updateBrand(updatedBrand);
	}
	
	@DELETE
	@Path("/{brandId}")
	//@Consumes(MediaType.APPLICATION_JSON)
	public void deleteBrands(@PathParam("brandId") int brandId) {
		service.deleteBrand(brandId);
	}
	
	/*
	@Path("/{brandId}/products")
	public Products productDelegation(){
		return new Products();
	}
	*/

}
