package com.janwee.dddinaction.product_management.domain.model.aggregate_with_value_obj;

//将产品聚合根包含的待定项实体建模成值对象
public class ProductBacklogItem {
    private final String id;
    private int ordering;

    public ProductBacklogItem(String id, int ordering) {
        this.id = id;
        this.ordering = ordering;
    }

    private void setOrdering(int ordering) {
        this.ordering = ordering;
    }

    //可以修改ProductBacklogItem内部状态的方法被声明为了private,达到了“最小知识”的目的
    public void reorder(String backlogItemId, int ordering) {
        if (backlogItemId.equals(this.id)) {
            this.setOrdering(ordering);
        } else if (this.ordering >= ordering) {
            this.setOrdering(ordering + 1);
        }
    }
}
