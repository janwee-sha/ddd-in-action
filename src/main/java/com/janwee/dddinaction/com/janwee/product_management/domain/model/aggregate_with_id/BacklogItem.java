package com.janwee.dddinaction.com.janwee.product_management.domain.model.aggregate_with_id;

//待定项聚合
public class BacklogItem {
    private String id;
    private String productId;
    private String teamId;

    public String teamId() {
        return this.teamId;
    }

    public void assignTeamMemberToTask(String teamMemberId, Team team, String taskId) {
        //some code
    }
}
