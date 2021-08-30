package com.janwee.dddinaction.com.janwee.identityaccess.application.model;

import lombok.Getter;
import lombok.Setter;

//使用基本类型构造租户创建命令对象
@Getter
@Setter
public class ProvisionTenantCommand {
    private String tenantName;
    private String tenantDescription;
    private boolean isActive;
    private String adminFirstName;
    private String adminLastName;
    private String emailAddress;
    private String primaryTelephone;
    private String secondaryTelephone;
    private String addressStreet;
    private String addressCity;
    private String addressProvince;
    private String addressPostalCode;
    private String addressCountryCode;
    private String timeZone;
}
