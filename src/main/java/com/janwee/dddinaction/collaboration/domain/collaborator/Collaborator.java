package com.janwee.dddinaction.collaboration.domain.collaborator;

import java.io.Serializable;

//协作上下文中的基础对象
public abstract class Collaborator implements Serializable {
    private String id;
    private String name;
    private String emailAddress;
}