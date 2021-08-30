package com.janwee.dddinaction.com.janwee.identityaccess.application.service;

import com.janwee.dddinaction.com.janwee.identityaccess.application.model.ProvisionTenantCommand;
import com.janwee.dddinaction.com.janwee.identityaccess.application.model.TenantData;
import com.janwee.dddinaction.com.janwee.identityaccess.application.model.TenantDataTransformer;
import com.janwee.dddinaction.com.janwee.identityaccess.domain.model.Tenant;
import com.janwee.dddinaction.com.janwee.identityaccess.domain.model.TenantId;
import com.janwee.dddinaction.com.janwee.identityaccess.domain.model.TenantRepository;

import java.time.LocalDate;

//租户身份应用服务
public class TenantIdentityService {
    private TenantRepository tenantRepo;

    //激活租户
    public void activateTenant(TenantId tenantId) {
        this.nonNullTenant(tenantId).active();
    }

    //邀请其他租户
    public String offerLimitedRegistrationInvitation(TenantId tenantId, LocalDate startDate, LocalDate utilDate) {
        return null;
    }

    //禁用租户
    public String offerOpenEndedRegistrationInvitation(TenantId tenantId) {
        return null;
    }

    //创建租户
    public TenantData provisionTenant(ProvisionTenantCommand command) {
        return null;
    }

    //获取租户
    public TenantData tenant(TenantId tenantId) {
        return TenantDataTransformer.toData(this.tenantRepo.tenantOfId(tenantId));
    }

    private Tenant nonNullTenant(TenantId tenantId) {
        Tenant tenant = this.tenantRepo.tenantOfId(tenantId);

        if (tenant == null) {
            throw new IllegalArgumentException("Tenant does not exist");

        }
        return tenant;
    }
}
