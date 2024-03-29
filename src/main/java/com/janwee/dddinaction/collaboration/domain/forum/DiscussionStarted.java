package com.janwee.dddinaction.collaboration.domain.forum;

import com.janwee.dddinaction.event.domain.DomainEvent;

public class DiscussionStarted implements DomainEvent {
    private final String discussionId;
    private final String discussionAuthorName;

    public DiscussionStarted(String discussionId, String discussionAuthorName) {
        this.discussionId = discussionId;
        this.discussionAuthorName = discussionAuthorName;
    }

    public String description() {
        return "Discussion of " + this.discussionId + " by author " + discussionAuthorName + " started.";
    }
}
