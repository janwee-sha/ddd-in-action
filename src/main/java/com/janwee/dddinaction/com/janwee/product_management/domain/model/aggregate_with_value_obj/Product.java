package com.janwee.dddinaction.com.janwee.product_management.domain.model.aggregate_with_value_obj;

import java.util.Set;

//产品聚合根
public class Product {
    private final String id;
    private String name;
    private String description;
    private Set<ProductBacklogItem> backlogItems;
    private Set<ProductDiscussion> discussions;

    public Product(String id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public String id() {
        return this.id;
    }

    public void reorderFrom(String backlogItemId, int ordering) {
        for (ProductBacklogItem backlogItem : this.backlogItems) {
            backlogItem.reorder(backlogItemId, ordering);
        }
    }
}
