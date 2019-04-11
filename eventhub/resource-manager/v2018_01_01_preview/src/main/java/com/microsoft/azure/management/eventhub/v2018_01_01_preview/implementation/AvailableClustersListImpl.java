/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventhub.v2018_01_01_preview.implementation;

import com.microsoft.azure.management.eventhub.v2018_01_01_preview.AvailableClustersList;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.Map;

class AvailableClustersListImpl extends WrapperImpl<AvailableClustersListInner> implements AvailableClustersList {
    private final EventHubManager manager;
    AvailableClustersListImpl(AvailableClustersListInner inner, EventHubManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public EventHubManager manager() {
        return this.manager;
    }

    @Override
    public Map<String, Integer> availableClusters() {
        return this.inner().availableClusters();
    }

}