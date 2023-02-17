package org.com.examapi.model.dao.orderproduct;

import org.com.examapi.model.entity.OrderProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DbDaoOrderProduct implements IDaoOrderProduct{
    @Autowired
    private OrderProductRepository orderProductRepository;
    @Override
    public List<OrderProduct> findAll() {
        return null;
    }

    @Override
    public OrderProduct getById(Integer id) {
        return null;
    }

    @Override
    public OrderProduct add(OrderProduct item) {
        return null;
    }

    @Override
    public OrderProduct update(OrderProduct item) {
        return null;
    }

    @Override
    public OrderProduct delete(Integer id) {
        return null;
    }
}
