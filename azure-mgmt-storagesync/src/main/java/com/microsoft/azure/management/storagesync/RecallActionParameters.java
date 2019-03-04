/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storagesync;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The parameters used when calling recall action on server endpoint.
 */
public class RecallActionParameters {
    /**
     * Pattern of the files.
     */
    @JsonProperty(value = "pattern")
    private String pattern;

    /**
     * Recall path.
     */
    @JsonProperty(value = "recallPath")
    private String recallPath;

    /**
     * Get pattern of the files.
     *
     * @return the pattern value
     */
    public String pattern() {
        return this.pattern;
    }

    /**
     * Set pattern of the files.
     *
     * @param pattern the pattern value to set
     * @return the RecallActionParameters object itself.
     */
    public RecallActionParameters withPattern(String pattern) {
        this.pattern = pattern;
        return this;
    }

    /**
     * Get recall path.
     *
     * @return the recallPath value
     */
    public String recallPath() {
        return this.recallPath;
    }

    /**
     * Set recall path.
     *
     * @param recallPath the recallPath value to set
     * @return the RecallActionParameters object itself.
     */
    public RecallActionParameters withRecallPath(String recallPath) {
        this.recallPath = recallPath;
        return this;
    }

}
