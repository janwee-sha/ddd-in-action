package com.janwee.dddinaction.identityaccess.domain;

public interface AccessService {
    User userInRole(String userName,String roleName);
}
