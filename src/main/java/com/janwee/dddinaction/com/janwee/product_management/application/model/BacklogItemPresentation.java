package com.janwee.dddinaction.com.janwee.product_management.application.model;

import com.janwee.dddinaction.com.janwee.product_management.domain.model.aggregate_with_id.BacklogItem;

//待定项展现模型
public class BacklogItemPresentation {
    private final BacklogItem backlogItem;

    public BacklogItemPresentation(BacklogItem backlogItem) {
        super();
        this.backlogItem = backlogItem;
    }

    //在展现模型中使用多数Java Web框架要求提供的公有getter、setter适配领域模型中使用通用语言的方法命名
    public String getSummary() {
        return this.backlogItem.summary();
    }

    public String getStory() {
        return this.backlogItem.story();
    }

    public void changeSummaryWithType(){

    }
}
