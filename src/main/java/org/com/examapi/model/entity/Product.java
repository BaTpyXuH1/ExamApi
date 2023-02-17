package org.com.examapi.model.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "product_t")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private Integer price;
    @Column
    private boolean isHave;


    public Product() {}

    public Product(Integer id, String name, Integer price, boolean isHave) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.isHave = isHave;
    }



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public boolean isHave() {
        return isHave;
    }

    public void setHave(boolean have) {
        isHave = have;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", isHave=" + isHave +
                '}';
    }
}
