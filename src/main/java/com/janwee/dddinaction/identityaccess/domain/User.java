package com.janwee.dddinaction.identityaccess.domain;

public class User {
    private String username;

    protected GroupMember toGroupMember() {
        return new GroupMember(this.username, GroupMemberType.USER);
    }
}
