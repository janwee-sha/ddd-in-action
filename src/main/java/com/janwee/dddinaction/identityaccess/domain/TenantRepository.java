package com.janwee.dddinaction.identityaccess.domain;

public interface TenantRepository {
    Tenant tenantOfId(TenantId tenantId);
}
