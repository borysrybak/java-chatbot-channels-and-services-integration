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
 * A thumbnail card (card with a single, small thumbnail image).
 */
public class ThumbnailCard {
    /**
     * Title of the card.
     */
    @JsonProperty(value = "title")
    private String title;

    /**
     * Subtitle of the card.
     */
    @JsonProperty(value = "subtitle")
    private String subtitle;

    /**
     * Text for the card.
     */
    @JsonProperty(value = "text")
    private String text;

    /**
     * Array of images for the card.
     */
    @JsonProperty(value = "images")
    private List<CardImage> images;

    /**
     * Set of actions applicable to the current card.
     */
    @JsonProperty(value = "buttons")
    private List<CardAction> buttons;

    /**
     * This action will be activated when user taps on the card itself.
     */
    @JsonProperty(value = "tap")
    private CardAction tap;

    /**
     * Get the title value.
     *
     * @return the title value
     */
    public String title() {
        return this.title;
    }

    /**
     * Set the title value.
     *
     * @param title the title value to set
     * @return the ThumbnailCard object itself.
     */
    public ThumbnailCard withTitle(String title) {
        this.title = title;
        return this;
    }

    /**
     * Get the subtitle value.
     *
     * @return the subtitle value
     */
    public String subtitle() {
        return this.subtitle;
    }

    /**
     * Set the subtitle value.
     *
     * @param subtitle the subtitle value to set
     * @return the ThumbnailCard object itself.
     */
    public ThumbnailCard withSubtitle(String subtitle) {
        this.subtitle = subtitle;
        return this;
    }

    /**
     * Get the text value.
     *
     * @return the text value
     */
    public String text() {
        return this.text;
    }

    /**
     * Set the text value.
     *
     * @param text the text value to set
     * @return the ThumbnailCard object itself.
     */
    public ThumbnailCard withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Get the images value.
     *
     * @return the images value
     */
    public List<CardImage> images() {
        return this.images;
    }

    /**
     * Set the images value.
     *
     * @param images the images value to set
     * @return the ThumbnailCard object itself.
     */
    public ThumbnailCard withImages(List<CardImage> images) {
        this.images = images;
        return this;
    }

    /**
     * Get the buttons value.
     *
     * @return the buttons value
     */
    public List<CardAction> buttons() {
        return this.buttons;
    }

    /**
     * Set the buttons value.
     *
     * @param buttons the buttons value to set
     * @return the ThumbnailCard object itself.
     */
    public ThumbnailCard withButtons(List<CardAction> buttons) {
        this.buttons = buttons;
        return this;
    }

    /**
     * Get the tap value.
     *
     * @return the tap value
     */
    public CardAction tap() {
        return this.tap;
    }

    /**
     * Set the tap value.
     *
     * @param tap the tap value to set
     * @return the ThumbnailCard object itself.
     */
    public ThumbnailCard withTap(CardAction tap) {
        this.tap = tap;
        return this;
    }

}
