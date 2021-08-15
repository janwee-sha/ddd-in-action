package com.janwee.dddinaction.com.janwee.collaboration.domain.model.collaborator;

import java.io.Serializable;

//协作上下文中的基础对象
public abstract class Collaborator implements Serializable {
    private String id;
    private String name;
    private String emailAddress;
}