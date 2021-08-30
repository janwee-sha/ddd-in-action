package com.janwee.dddinaction.com.janwee.collaboration.infra.service;

import com.janwee.dddinaction.com.janwee.collaboration.domain.model.collaborator.Author;
import com.janwee.dddinaction.com.janwee.collaboration.domain.model.collaborator.Creator;
import com.janwee.dddinaction.com.janwee.identityaccess.domain.model.Tenant;
import com.janwee.dddinaction.com.janwee.collaboration.domain.service.CollaboratorService;

//将角色与身份上下文中的用户翻译为协作上下文中的对象的具体实现
// 由于是一个技术上的实现，将该类放置于基础设施层的模块中
public class UserRoleToCollaboratorService implements CollaboratorService {
    public Author authorFrom(Tenant tenant, String id) {
        //...
        return null;
    }

    public Creator creatorFrom(Tenant tenant, String id) {
        //...
        return null;
    }
}
