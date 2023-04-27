package com.janwee.dddinaction.product_management.domain.model.aggregate_with_value_obj;

//产品领域服务
public class ProductService {
    private ProductRepository productRepo;

    public String newProduct(String productName, String productDescription) {
        Product product = new Product(productRepo.nextId(), productName, productDescription);
        productRepo.add(product);
        return product.id();
    }
}
