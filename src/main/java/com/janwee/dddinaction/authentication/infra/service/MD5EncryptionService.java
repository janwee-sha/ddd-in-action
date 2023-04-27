package com.janwee.dddinaction.authentication.infra.service;

import com.janwee.dddinaction.authentication.domain.UserDescriptor;
import com.janwee.dddinaction.authentication.domain.AuthenticationService;
import org.springframework.stereotype.Service;

//将技术性的实现类放在基础设施层中
@Service
public class MD5EncryptionService implements AuthenticationService {
    public UserDescriptor authenticate(String tenantId, String username, String password) {
        //实现代码
        return null;
    }
}
