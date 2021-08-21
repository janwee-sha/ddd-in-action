package com.janwee.dddinaction.com.janwee.product_management.domain.model.aggregate_with_id;

//使用表示引用建模对象后，在调用聚合行为方法之前，使用资源库或领域服务来获取所需的对象
public class ProductBacklogItemService {
    private final BacklogItemRepository backlogItemRepo;
    private final TeamRepository teamRepo;

    public ProductBacklogItemService(BacklogItemRepository backlogItemRepo, TeamRepository teamRepo) {
        this.backlogItemRepo = backlogItemRepo;
        this.teamRepo = teamRepo;
    }

    public void assignTeamMemberToTask(String backlogItemId, String taskId, String teamMemberId) {
        BacklogItem backlogItem = backlogItemRepo.backlogItemOfId(backlogItemId);
        Team team = teamRepo.teamOfId(backlogItem.teamId());
        backlogItem.assignTeamMemberToTask(teamMemberId, team, taskId);
    }
}
