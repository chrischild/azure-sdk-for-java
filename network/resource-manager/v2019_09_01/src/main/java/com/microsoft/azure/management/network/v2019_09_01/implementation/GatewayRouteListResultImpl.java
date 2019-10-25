/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01.implementation;

import com.microsoft.azure.management.network.v2019_09_01.GatewayRouteListResult;
import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import java.util.List;
import com.microsoft.azure.management.network.v2019_09_01.GatewayRoute;

class GatewayRouteListResultImpl extends WrapperImpl<GatewayRouteListResultInner> implements GatewayRouteListResult {
    private final NetworkManager manager;
    GatewayRouteListResultImpl(GatewayRouteListResultInner inner, NetworkManager manager) {
        super(inner);
        this.manager = manager;
    }

    @Override
    public NetworkManager manager() {
        return this.manager;
    }

    @Override
    public List<GatewayRoute> value() {
        return this.inner().value();
    }

}
