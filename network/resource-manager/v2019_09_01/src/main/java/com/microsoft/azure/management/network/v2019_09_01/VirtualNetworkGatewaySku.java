/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * VirtualNetworkGatewaySku details.
 */
public class VirtualNetworkGatewaySku {
    /**
     * Gateway SKU name. Possible values include: 'Basic', 'HighPerformance',
     * 'Standard', 'UltraPerformance', 'VpnGw1', 'VpnGw2', 'VpnGw3', 'VpnGw4',
     * 'VpnGw5', 'VpnGw1AZ', 'VpnGw2AZ', 'VpnGw3AZ', 'VpnGw4AZ', 'VpnGw5AZ',
     * 'ErGw1AZ', 'ErGw2AZ', 'ErGw3AZ'.
     */
    @JsonProperty(value = "name")
    private VirtualNetworkGatewaySkuName name;

    /**
     * Gateway SKU tier. Possible values include: 'Basic', 'HighPerformance',
     * 'Standard', 'UltraPerformance', 'VpnGw1', 'VpnGw2', 'VpnGw3', 'VpnGw4',
     * 'VpnGw5', 'VpnGw1AZ', 'VpnGw2AZ', 'VpnGw3AZ', 'VpnGw4AZ', 'VpnGw5AZ',
     * 'ErGw1AZ', 'ErGw2AZ', 'ErGw3AZ'.
     */
    @JsonProperty(value = "tier")
    private VirtualNetworkGatewaySkuTier tier;

    /**
     * The capacity.
     */
    @JsonProperty(value = "capacity", access = JsonProperty.Access.WRITE_ONLY)
    private Integer capacity;

    /**
     * Get gateway SKU name. Possible values include: 'Basic', 'HighPerformance', 'Standard', 'UltraPerformance', 'VpnGw1', 'VpnGw2', 'VpnGw3', 'VpnGw4', 'VpnGw5', 'VpnGw1AZ', 'VpnGw2AZ', 'VpnGw3AZ', 'VpnGw4AZ', 'VpnGw5AZ', 'ErGw1AZ', 'ErGw2AZ', 'ErGw3AZ'.
     *
     * @return the name value
     */
    public VirtualNetworkGatewaySkuName name() {
        return this.name;
    }

    /**
     * Set gateway SKU name. Possible values include: 'Basic', 'HighPerformance', 'Standard', 'UltraPerformance', 'VpnGw1', 'VpnGw2', 'VpnGw3', 'VpnGw4', 'VpnGw5', 'VpnGw1AZ', 'VpnGw2AZ', 'VpnGw3AZ', 'VpnGw4AZ', 'VpnGw5AZ', 'ErGw1AZ', 'ErGw2AZ', 'ErGw3AZ'.
     *
     * @param name the name value to set
     * @return the VirtualNetworkGatewaySku object itself.
     */
    public VirtualNetworkGatewaySku withName(VirtualNetworkGatewaySkuName name) {
        this.name = name;
        return this;
    }

    /**
     * Get gateway SKU tier. Possible values include: 'Basic', 'HighPerformance', 'Standard', 'UltraPerformance', 'VpnGw1', 'VpnGw2', 'VpnGw3', 'VpnGw4', 'VpnGw5', 'VpnGw1AZ', 'VpnGw2AZ', 'VpnGw3AZ', 'VpnGw4AZ', 'VpnGw5AZ', 'ErGw1AZ', 'ErGw2AZ', 'ErGw3AZ'.
     *
     * @return the tier value
     */
    public VirtualNetworkGatewaySkuTier tier() {
        return this.tier;
    }

    /**
     * Set gateway SKU tier. Possible values include: 'Basic', 'HighPerformance', 'Standard', 'UltraPerformance', 'VpnGw1', 'VpnGw2', 'VpnGw3', 'VpnGw4', 'VpnGw5', 'VpnGw1AZ', 'VpnGw2AZ', 'VpnGw3AZ', 'VpnGw4AZ', 'VpnGw5AZ', 'ErGw1AZ', 'ErGw2AZ', 'ErGw3AZ'.
     *
     * @param tier the tier value to set
     * @return the VirtualNetworkGatewaySku object itself.
     */
    public VirtualNetworkGatewaySku withTier(VirtualNetworkGatewaySkuTier tier) {
        this.tier = tier;
        return this;
    }

    /**
     * Get the capacity.
     *
     * @return the capacity value
     */
    public Integer capacity() {
        return this.capacity;
    }

}
