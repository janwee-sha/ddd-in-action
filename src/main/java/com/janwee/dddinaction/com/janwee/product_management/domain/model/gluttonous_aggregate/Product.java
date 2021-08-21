package com.janwee.dddinaction.com.janwee.product_management.domain.model.gluttonous_aggregate;

import java.util.Set;

//产品聚合初次尝试：臃肿的聚合
public class Product {
    private String id;
    private String name;
    private Set<BacklogItem> backlogItems;
    private Set<Release> releases;
    private Set<Sprint> sprints;
    private String description;

    public String productId() {
        return this.id;
    }
}
