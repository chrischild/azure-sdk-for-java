/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation;

import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.ClusterCodeVersionsListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import rx.Observable;
import java.util.List;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.ClusterCodeVersionsResult;

class ClusterCodeVersionsListResultImpl extends WrapperImpl<ClusterCodeVersionsListResultInner> implements ClusterCodeVersionsListResult {
    private final ServiceFabricManager manager;
    private String location;
    private String subscriptionId;
    private String clusterVersion;

    ClusterCodeVersionsListResultImpl(ClusterCodeVersionsListResultInner inner,  ServiceFabricManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public ServiceFabricManager manager() {
        return this.manager;
    }



    @Override
    public String nextLink() {
        return this.inner().nextLink();
    }

    @Override
    public List<ClusterCodeVersionsResult> value() {
        return this.inner().value();
    }

}