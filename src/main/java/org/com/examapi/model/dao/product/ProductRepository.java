package org.com.examapi.model.dao.product;

import org.com.examapi.model.entity.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product,Integer> {
}
