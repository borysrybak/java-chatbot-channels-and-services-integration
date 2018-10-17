/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.bot.schema.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Conversation and its members.
 */
public class ConversationMembers {
    /**
     * Conversation ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * List of members in this conversation.
     */
    @JsonProperty(value = "members")
    private List<ChannelAccount> members;

    /**
     * Get the id value.
     *
     * @return the id value
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set
     * @return the ConversationMembers object itself.
     */
    public ConversationMembers withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get the members value.
     *
     * @return the members value
     */
    public List<ChannelAccount> members() {
        return this.members;
    }

    /**
     * Set the members value.
     *
     * @param members the members value to set
     * @return the ConversationMembers object itself.
     */
    public ConversationMembers withMembers(List<ChannelAccount> members) {
        this.members = members;
        return this;
    }

}
