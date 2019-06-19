package org.studyeasy.showroom.hibernate.entities;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlRootElement;




//@XmlRootElement
@Entity(name="brands")
@Table(name="brands")
public class BrandEntity {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="brandId")
	int brandId;
	@Column(name="brandName")
	String BrandName;
	public BrandEntity() {
		
	}
	public BrandEntity(int brandId, String brandName) {
		super();
		this.brandId = brandId;
		BrandName = brandName;
	}
	public int getBrandId() {
		return brandId;
	}
	public void setBrandId(int brandId) {
		this.brandId = brandId;
	}
	public String getBrandName() {
		return BrandName;
	}
	public void setBrandName(String brandName) {
		BrandName = brandName;
	}
	

}
