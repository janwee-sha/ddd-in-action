package com.janwee.dddinaction.com.janwee.collaboration.domain.service;

import com.janwee.dddinaction.com.janwee.collaboration.domain.model.collaborator.Author;
import com.janwee.dddinaction.com.janwee.collaboration.domain.model.collaborator.Creator;
import com.janwee.dddinaction.com.janwee.identityaccess.domain.model.Tenant;
//领域服务中的工厂
public interface CollaboratorService {
    Author authorFrom(Tenant tenant, String id);

    Creator creatorFrom(Tenant tenant, String id);
}
