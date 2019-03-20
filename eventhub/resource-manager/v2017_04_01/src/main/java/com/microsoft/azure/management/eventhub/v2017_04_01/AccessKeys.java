/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2017_04_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.eventhub.v2017_04_01.implementation.EventHubManager;
import com.microsoft.azure.management.eventhub.v2017_04_01.implementation.AccessKeysInner;

/**
 * Type representing AccessKeys.
 */
public interface AccessKeys extends HasInner<AccessKeysInner>, HasManager<EventHubManager> {
    /**
     * @return the aliasPrimaryConnectionString value.
     */
    String aliasPrimaryConnectionString();

    /**
     * @return the aliasSecondaryConnectionString value.
     */
    String aliasSecondaryConnectionString();

    /**
     * @return the keyName value.
     */
    String keyName();

    /**
     * @return the primaryConnectionString value.
     */
    String primaryConnectionString();

    /**
     * @return the primaryKey value.
     */
    String primaryKey();

    /**
     * @return the secondaryConnectionString value.
     */
    String secondaryConnectionString();

    /**
     * @return the secondaryKey value.
     */
    String secondaryKey();

}