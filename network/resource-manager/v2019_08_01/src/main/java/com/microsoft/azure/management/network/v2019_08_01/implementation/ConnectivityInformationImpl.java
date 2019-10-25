/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import com.microsoft.azure.management.network.v2019_08_01.ConnectivityInformation;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.network.v2019_08_01.ConnectionStatus;
import java.util.List;
import com.microsoft.azure.management.network.v2019_08_01.ConnectivityHop;

class ConnectivityInformationImpl extends WrapperImpl<ConnectivityInformationInner> implements ConnectivityInformation {
    private final NetworkManager manager;
    ConnectivityInformationImpl(ConnectivityInformationInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public Integer avgLatencyInMs() {
        return this.inner().avgLatencyInMs();
    }

    @Override
    public ConnectionStatus connectionStatus() {
        return this.inner().connectionStatus();
    }

    @Override
    public List<ConnectivityHop> hops() {
        return this.inner().hops();
    }

    @Override
    public Integer maxLatencyInMs() {
        return this.inner().maxLatencyInMs();
    }

    @Override
    public Integer minLatencyInMs() {
        return this.inner().minLatencyInMs();
    }

    @Override
    public Integer probesFailed() {
        return this.inner().probesFailed();
    }

    @Override
    public Integer probesSent() {
        return this.inner().probesSent();
    }

}
