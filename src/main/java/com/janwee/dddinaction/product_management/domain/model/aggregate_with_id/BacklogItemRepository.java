package com.janwee.dddinaction.product_management.domain.model.aggregate_with_id;

//待定项仓库
public interface BacklogItemRepository {
    BacklogItem backlogItemOfId(String backlogItemId);
}
