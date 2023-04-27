package com.janwee.dddinaction.authentication.application;

import com.janwee.dddinaction.authentication.domain.UserDescriptor;
import com.janwee.dddinaction.authentication.domain.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//某应用服务
@Component
public class SomeApplicationService {
    private AuthenticationService authService;

    @Autowired
    public SomeApplicationService(AuthenticationService authService) {
        this.authService = authService;
    }

    public UserDescriptor login(String tenantId, String username, String password) {
        return authService.authenticate(tenantId, username, password);
    }
}
