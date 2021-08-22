package com.janwee.dddinaction.com.janwee.collaboration.domain.model.forum;

import com.janwee.dddinaction.com.janwee.collaboration.domain.model.collaborator.Author;
import com.janwee.dddinaction.com.janwee.event.domain.DomainEventPublisher;

public class Forum {
    private String id;
    private boolean closed;

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }

    public Discussion startDiscussion(String discussionId, Author author, String subject) {
        if (this.isClosed()) {
            throw new IllegalStateException("Forum is closed.");
        }

        Discussion discussion = new Discussion(discussionId, this.id, author, subject);
        DomainEventPublisher.instance().publish(new DiscussionStarted(discussionId, author.name()));
        return discussion;
    }
}
