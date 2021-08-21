package com.janwee.dddinaction.com.janwee.identityaccess.domain.model;

//使用枚举类型表示值对象
public enum GroupMemberType {
    GROUP {
        public boolean isGroup() {
            return true;
        }
    },
    USER {
        public boolean isUser() {
            return true;
        }
    };

    public boolean isGroup() {
        return false;
    }

    public boolean isUser() {
        return false;
    }
}
