package com.janwee.dddinaction.identityaccess.domain;

public class GroupMember {
    private String name;
    private GroupMemberType type;

    public GroupMember(String name, GroupMemberType type) {
        this.name = name;
        this.type = type;
    }
}
