/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation.ServiceFabricManager;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation.OperationResultInner;

/**
 * Type representing OperationResult.
 */
public interface OperationResult extends HasInner<OperationResultInner>, HasManager<ServiceFabricManager> {
    /**
     * @return the display value.
     */
    AvailableOperationDisplay display();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the nextLink value.
     */
    String nextLink();

    /**
     * @return the origin value.
     */
    String origin();

}