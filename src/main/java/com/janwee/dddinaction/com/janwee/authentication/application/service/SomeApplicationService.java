package com.janwee.dddinaction.com.janwee.authentication.application.service;

import com.janwee.dddinaction.com.janwee.authentication.domain.model.UserDescriptor;
import com.janwee.dddinaction.com.janwee.authentication.domain.service.AuthenticationService;
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
