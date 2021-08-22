package com.janwee.dddinaction.com.janwee.identityaccess.domain.model;

public interface AccessService {
    User userInRole(String userName,String roleName);
}
