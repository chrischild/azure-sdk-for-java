/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import rx.Observable;
import com.microsoft.azure.management.network.v2019_08_01.implementation.ServiceTagsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ServiceTags.
 */
public interface ServiceTags extends HasInner<ServiceTagsInner> {
    /**
     * Gets a list of service tag information resources.
     *
     * @param location The location that will be used as a reference for version (not as a filter based on location, you will get the list of service tags with prefix details across all regions but limited to the cloud that your subscription belongs to).
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ServiceTagsListResult> listAsync(String location);

}
