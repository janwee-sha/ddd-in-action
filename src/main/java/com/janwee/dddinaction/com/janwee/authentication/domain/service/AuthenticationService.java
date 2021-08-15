package com.janwee.dddinaction.com.janwee.authentication.domain.service;

import com.janwee.dddinaction.com.janwee.authentication.domain.model.UserDescriptor;

//将认证服务的接口类放在领域层中
public interface AuthenticationService {
    UserDescriptor authenticate(String tenantId, String username, String password);
}
