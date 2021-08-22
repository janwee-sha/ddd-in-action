package com.janwee.dddinaction.com.janwee.collaboration.domain.model.forum;

import com.janwee.dddinaction.com.janwee.collaboration.domain.model.collaborator.Author;

public class Discussion {
    private String id;
    private String forumId;
    private Author author;
    private String subject;

    public Discussion(String id, String forumId, Author author, String subject) {
        this.id = id;
        this.forumId = forumId;
        this.author = author;
        this.subject = subject;
    }
}
