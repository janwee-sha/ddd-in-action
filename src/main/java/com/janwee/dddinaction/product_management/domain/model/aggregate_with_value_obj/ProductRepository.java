package com.janwee.dddinaction.product_management.domain.model.aggregate_with_value_obj;

//产品仓库
public interface ProductRepository {
    String nextId();
    void add(Product product);
}
