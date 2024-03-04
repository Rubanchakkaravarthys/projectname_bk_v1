package com.example.demo.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Product;
@Repository
public interface ProductRepo extends JpaRepository<Product,Integer>{
	@Query (value = "select * from products where name= :name",nativeQuery = true )
	List<Product> findByName(String name);
	
//	
//	@Query (value = "select * from products where price= :p1 and price=p2",nativeQuery = true )
//	List<Product> findPrice(String p1,String p2);
}



