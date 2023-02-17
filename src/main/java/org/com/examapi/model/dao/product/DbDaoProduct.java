package org.com.examapi.model.dao.product;

import org.com.examapi.model.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
@Service
public class DbDaoProduct implements IDaoProduct{
    @Autowired
    private ProductRepository productRepository;
    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public Product getById(Integer id) {
        return null;
    }

    @Override
    public Product add(Product item) {
        return null;
    }

    @Override
    public Product update(Product item) {
        return null;
    }

    @Override
    public Product delete(Integer id) {
        return null;
    }
}
