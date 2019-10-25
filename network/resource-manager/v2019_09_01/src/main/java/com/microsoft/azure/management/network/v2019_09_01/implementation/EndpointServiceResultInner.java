/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.SubResource;

/**
 * Endpoint service.
 */
public class EndpointServiceResultInner extends SubResource {
    /**
     * Name of the endpoint service.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /**
     * Type of the endpoint service.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /**
     * Get name of the endpoint service.
     *
     * @return the name value
     */
    public String name() {
        return this.name;
    }

    /**
     * Get type of the endpoint service.
     *
     * @return the type value
     */
    public String type() {
        return this.type;
    }

}
