package org.com.examapi.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "order_product_t")
public class OrderProduct {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column
    private Integer quantityProduct;
    @ManyToOne
    @JoinColumn(name = "product_id",nullable = false)
    private Product product;


    public OrderProduct(){}

    public OrderProduct(Integer quantityProduct, Product product) {
        this.quantityProduct = quantityProduct;
        this.product = product;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getQuantityProduct() {
        return quantityProduct;
    }

    public void setQuantityProduct(Integer quantityProduct) {
        this.quantityProduct = quantityProduct;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


    @Override
    public String toString() {
        return "OrderProduct{" +
                "id=" + id +
                ", quantityProduct=" + quantityProduct +
                ", product=" + product +

                '}';
    }
}
