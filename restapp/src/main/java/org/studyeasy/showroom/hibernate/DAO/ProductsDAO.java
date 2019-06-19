package org.studyeasy.showroom.hibernate.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.studyeasy.showroom.hibernate.entities.BrandEntity;
import org.studyeasy.showroom.hibernate.entities.ProductEntity;

public class ProductsDAO {
	SessionFactory factory=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(ProductEntity.class).addAnnotatedClass(BrandEntity.class).buildSessionFactory();

	public List<ProductEntity> getProductByBrand(int brandId) {
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		List<ProductEntity> Productlist;
		String hql="from products where brandId='"+brandId+"'";
		Productlist=session.createQuery(hql).getResultList();
		return Productlist;
	}

	public List<ProductEntity> getProductByBrandAndCategory(int brandId,
			String category) {
		
		Session session=factory.getCurrentSession();
		session.beginTransaction();
		List<ProductEntity> Productlist;
		String hql="from products where brandId='"+brandId+"' and category='"+category+"'";
		Productlist=session.createQuery(hql).getResultList();
		return Productlist;
	}
	

}
