package com.janwee.dddinaction.product_management.domain.model.aggregate_with_id;

//待定项聚合
public class BacklogItem {
    private String id;
    private String productId;
    private String teamId;
    private String summary;
    private String story;

    public String teamId() {
        return this.teamId;
    }

    public String summary() {
        return this.summary;
    }

    public String story() {
        return this.story;
    }

    public void assignTeamMemberToTask(String teamMemberId, Team team, String taskId) {
        //some code
    }
}
