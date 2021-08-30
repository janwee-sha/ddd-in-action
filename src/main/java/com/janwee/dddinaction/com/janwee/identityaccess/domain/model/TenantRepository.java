package com.janwee.dddinaction.com.janwee.identityaccess.domain.model;

public interface TenantRepository {
    Tenant tenantOfId(TenantId tenantId);
}
