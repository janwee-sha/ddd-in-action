package com.janwee.dddinaction.product_management.domain.model.gluttonous_aggregate;

import java.util.Collection;

//面向持久化的Product资源库
public interface ProductRepository {
    Collection<Product> allProductsOfTenant();

    String nextId();

    Product productOfId(String productId);

    void remove(Product product);

    void removeAll(Collection<Product> products);

    void save(Product product);

    void saveAll(Collection<Product> products);
}
