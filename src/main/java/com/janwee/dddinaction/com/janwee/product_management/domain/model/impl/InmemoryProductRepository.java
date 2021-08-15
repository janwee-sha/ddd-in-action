package com.janwee.dddinaction.com.janwee.product_management.domain.model.impl;

import com.janwee.dddinaction.com.janwee.product_management.domain.model.Product;
import com.janwee.dddinaction.com.janwee.product_management.domain.model.ProductRepository;

import java.util.*;

public class InmemoryProductRepository implements ProductRepository {
    private Map<String, Product> store;

    public InmemoryProductRepository() {
        this.store = new HashMap<>();
    }

    public Collection<Product> allProductsOfTenant() {
        return new HashSet<>(this.store.values());
    }

    public String nextId() {
        return UUID.randomUUID().toString();
    }

    public Product productOfId(String productId) {
        return this.store.get(productId);
    }

    public void remove(Product product) {
        this.store.remove(product.productId());
    }

    public void removeAll(Collection<Product> products) {
        for (Product product : products) {
            this.remove(product);
        }
    }

    public void save(Product product) {
        this.store.put(product.productId(), product);
    }

    public void saveAll(Collection<Product> products) {
        for (Product product : products) {
            this.save(product);
        }
    }
}
