package com.janwee.dddinaction.com.janwee.identityaccess.domain.model;

public class GroupMember {
    private String name;
    private GroupMemberType type;

    public GroupMember(String name, GroupMemberType type) {
        this.name = name;
        this.type = type;
    }
}
