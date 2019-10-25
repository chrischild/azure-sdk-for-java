/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * An access key for the storage account.
 */
public class StorageAccountKey {
    /**
     * Name of the key.
     */
    @JsonProperty(value = "keyName", access = JsonProperty.Access.WRITE_ONLY)
    private String keyName;

    /**
     * Base 64-encoded value of the key.
     */
    @JsonProperty(value = "value", access = JsonProperty.Access.WRITE_ONLY)
    private String value;

    /**
     * Permissions for the key -- read-only or full permissions. Possible
     * values include: 'Read', 'Full'.
     */
    @JsonProperty(value = "permissions", access = JsonProperty.Access.WRITE_ONLY)
    private KeyPermission permissions;

    /**
     * Get name of the key.
     *
     * @return the keyName value
     */
    public String keyName() {
        return this.keyName;
    }

    /**
     * Get base 64-encoded value of the key.
     *
     * @return the value value
     */
    public String value() {
        return this.value;
    }

    /**
     * Get permissions for the key -- read-only or full permissions. Possible values include: 'Read', 'Full'.
     *
     * @return the permissions value
     */
    public KeyPermission permissions() {
        return this.permissions;
    }

}
