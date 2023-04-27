package com.janwee.dddinaction.authentication.domain;

//将认证服务的接口类放在领域层中
public interface AuthenticationService {
    UserDescriptor authenticate(String tenantId, String username, String password);
}
