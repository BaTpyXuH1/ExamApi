package org.com.examapi.model.dao.orderproduct;

import org.com.examapi.model.entity.OrderProduct;
import org.springframework.data.repository.CrudRepository;

public interface OrderProductRepository extends CrudRepository<OrderProduct,Integer> {
}
