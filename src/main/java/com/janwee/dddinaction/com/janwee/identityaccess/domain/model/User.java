package com.janwee.dddinaction.com.janwee.identityaccess.domain.model;

public class User {
    private String username;

    protected GroupMember toGroupMember() {
        return new GroupMember(this.username, GroupMemberType.USER);
    }
}
