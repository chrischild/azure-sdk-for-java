/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.servicefabric.v2017_07_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.Applications;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.ApplicationResourceList;
import com.microsoft.azure.management.servicefabric.v2017_07_01_preview.ApplicationResource;

class ApplicationsImpl extends WrapperImpl<ApplicationsInner> implements Applications {
    private final ServiceFabricManager manager;

    ApplicationsImpl(ServiceFabricManager manager) {
        super(manager.inner().applications());
        this.manager = manager;
    }

    public ServiceFabricManager manager() {
        return this.manager;
    }

    @Override
    public ApplicationResourceImpl define(String name) {
        return wrapModel(name);
    }

    private ApplicationResourceImpl wrapModel(ApplicationResourceInner inner) {
        return  new ApplicationResourceImpl(inner, manager());
    }

    private ApplicationResourceImpl wrapModel(String name) {
        return new ApplicationResourceImpl(name, this.manager());
    }

    @Override
    public Observable<ApplicationResourceList> listAsync(String subscriptionId, String resourceGroupName, String clusterName, String apiVersion) {
        ApplicationsInner client = this.inner();
        return client.listAsync(subscriptionId, resourceGroupName, clusterName, apiVersion)
        .map(new Func1<ApplicationResourceListInner, ApplicationResourceList>() {
            @Override
            public ApplicationResourceList call(ApplicationResourceListInner inner) {
                return new ApplicationResourceListImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<ApplicationResource> getAsync(String subscriptionId, String resourceGroupName, String clusterName, String applicationName, String apiVersion) {
        ApplicationsInner client = this.inner();
        return client.getAsync(subscriptionId, resourceGroupName, clusterName, applicationName, apiVersion)
        .map(new Func1<ApplicationResourceInner, ApplicationResource>() {
            @Override
            public ApplicationResource call(ApplicationResourceInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public Completable deleteAsync(String subscriptionId, String resourceGroupName, String clusterName, String applicationName, String apiVersion) {
        ApplicationsInner client = this.inner();
        return client.deleteAsync(subscriptionId, resourceGroupName, clusterName, applicationName, apiVersion).toCompletable();
    }

}
