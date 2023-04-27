package com.janwee.dddinaction.collaboration.domain.forum;

import com.janwee.dddinaction.collaboration.domain.collaborator.Author;

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
