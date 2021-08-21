package com.janwee.dddinaction.com.janwee.product_management.domain.model.aggregate_with_id;

//将产品作为待定项、冲刺等聚合的父聚合
public class Product {
    private String id;
    private String name;
    private String description;

    public String productId() {
        return this.id;
    }
}
