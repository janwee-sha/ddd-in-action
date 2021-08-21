package com.janwee.dddinaction.com.janwee.product_management.domain.model.aggregate_with_id;

//团队仓库
public interface TeamRepository {
    Team teamOfId(String teamId);
}
