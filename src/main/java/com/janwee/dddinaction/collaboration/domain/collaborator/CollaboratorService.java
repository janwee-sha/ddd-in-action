package com.janwee.dddinaction.collaboration.domain.collaborator;

import com.janwee.dddinaction.identityaccess.domain.Tenant;
//领域服务中的工厂
public interface CollaboratorService {
    Author authorFrom(Tenant tenant, String id);

    Creator creatorFrom(Tenant tenant, String id);
}
