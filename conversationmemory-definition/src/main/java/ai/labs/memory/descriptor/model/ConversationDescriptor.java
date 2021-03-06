package ai.labs.memory.descriptor.model;

import ai.labs.memory.model.ConversationState;
import ai.labs.memory.model.Deployment;
import ai.labs.resources.rest.model.ResourceDescriptor;
import lombok.Getter;
import lombok.Setter;

/**
 * @author ginccc
 */
@Getter
@Setter
public class ConversationDescriptor extends ResourceDescriptor {
    public enum ViewState {
        UNSEEN,
        SEEN
    }

    private String botName;
    private ViewState viewState;
    private int conversationStepSize;
    private String createdByUserName;
    private Deployment.Environment environment;
    private ConversationState conversationState;
}

