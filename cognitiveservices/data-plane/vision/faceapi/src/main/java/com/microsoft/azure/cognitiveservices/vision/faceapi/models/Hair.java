/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.cognitiveservices.vision.faceapi.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Properties describing hair attributes.
 */
public class Hair {
    /**
     * A number describing confidence level of whether the person is bald.
     */
    @JsonProperty(value = "bald")
    private double bald;

    /**
     * A boolean value describing whether the hair is visible in the image.
     */
    @JsonProperty(value = "invisible")
    private boolean invisible;

    /**
     * An array of candidate colors and confidence level in the presence of
     * each.
     */
    @JsonProperty(value = "hairColor")
    private List<HairColor> hairColor;

    /**
     * Get a number describing confidence level of whether the person is bald.
     *
     * @return the bald value
     */
    public double bald() {
        return this.bald;
    }

    /**
     * Set a number describing confidence level of whether the person is bald.
     *
     * @param bald the bald value to set
     * @return the Hair object itself.
     */
    public Hair withBald(double bald) {
        this.bald = bald;
        return this;
    }

    /**
     * Get a boolean value describing whether the hair is visible in the image.
     *
     * @return the invisible value
     */
    public boolean invisible() {
        return this.invisible;
    }

    /**
     * Set a boolean value describing whether the hair is visible in the image.
     *
     * @param invisible the invisible value to set
     * @return the Hair object itself.
     */
    public Hair withInvisible(boolean invisible) {
        this.invisible = invisible;
        return this;
    }

    /**
     * Get an array of candidate colors and confidence level in the presence of each.
     *
     * @return the hairColor value
     */
    public List<HairColor> hairColor() {
        return this.hairColor;
    }

    /**
     * Set an array of candidate colors and confidence level in the presence of each.
     *
     * @param hairColor the hairColor value to set
     * @return the Hair object itself.
     */
    public Hair withHairColor(List<HairColor> hairColor) {
        this.hairColor = hairColor;
        return this;
    }

}
