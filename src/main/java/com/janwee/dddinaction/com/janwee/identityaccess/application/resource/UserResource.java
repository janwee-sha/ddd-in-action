package com.janwee.dddinaction.com.janwee.identityaccess.application.resource;

import com.janwee.dddinaction.com.janwee.identityaccess.domain.model.AccessService;
import com.janwee.dddinaction.com.janwee.identityaccess.domain.model.User;

//REST资源
public class UserResource {
    private AccessService accessService;

    public ResponseEntity<User> getUserInRole(String userName, String roleName) {
        User user = null;
        try {
            user = accessService.userInRole(userName, roleName);
        } catch (Exception e) {
            //跳过异常
        }
        if (user == null) {
            return new ResponseEntity<>(user);
        } else {
            return ResponseEntity.noContent();
        }
    }
}
