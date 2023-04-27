package com.janwee.dddinaction.identityaccess.domain;

public class Group {
    private String name;

    protected GroupMember toGroupMember() {
        return new GroupMember(this.name, GroupMemberType.GROUP);
    }
}
