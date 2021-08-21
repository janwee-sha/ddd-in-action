package com.janwee.dddinaction.com.janwee.identityaccess.domain.model;

public class Group {
    private String name;

    protected GroupMember toGroupMember() {
        return new GroupMember(this.name, GroupMemberType.GROUP);
    }
}
