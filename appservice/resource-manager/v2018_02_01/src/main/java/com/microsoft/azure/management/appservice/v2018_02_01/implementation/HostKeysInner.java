/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice.v2018_02_01.implementation;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.management.appservice.v2018_02_01.ProxyOnlyResource;

/**
 * Functions host level keys.
 */
@JsonFlatten
public class HostKeysInner extends ProxyOnlyResource {
    /**
     * Secret key.
     */
    @JsonProperty(value = "properties.masterKey")
    private String masterKey;

    /**
     * Host level function keys.
     */
    @JsonProperty(value = "properties.functionKeys")
    private Map<String, String> functionKeys;

    /**
     * System keys.
     */
    @JsonProperty(value = "properties.systemKeys")
    private Map<String, String> systemKeys;

    /**
     * Get secret key.
     *
     * @return the masterKey value
     */
    public String masterKey() {
        return this.masterKey;
    }

    /**
     * Set secret key.
     *
     * @param masterKey the masterKey value to set
     * @return the HostKeysInner object itself.
     */
    public HostKeysInner withMasterKey(String masterKey) {
        this.masterKey = masterKey;
        return this;
    }

    /**
     * Get host level function keys.
     *
     * @return the functionKeys value
     */
    public Map<String, String> functionKeys() {
        return this.functionKeys;
    }

    /**
     * Set host level function keys.
     *
     * @param functionKeys the functionKeys value to set
     * @return the HostKeysInner object itself.
     */
    public HostKeysInner withFunctionKeys(Map<String, String> functionKeys) {
        this.functionKeys = functionKeys;
        return this;
    }

    /**
     * Get system keys.
     *
     * @return the systemKeys value
     */
    public Map<String, String> systemKeys() {
        return this.systemKeys;
    }

    /**
     * Set system keys.
     *
     * @param systemKeys the systemKeys value to set
     * @return the HostKeysInner object itself.
     */
    public HostKeysInner withSystemKeys(Map<String, String> systemKeys) {
        this.systemKeys = systemKeys;
        return this;
    }

}