/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for VpnGatewayGeneration.
 */
public final class VpnGatewayGeneration extends ExpandableStringEnum<VpnGatewayGeneration> {
    /** Static value None for VpnGatewayGeneration. */
    public static final VpnGatewayGeneration NONE = fromString("None");

    /** Static value Generation1 for VpnGatewayGeneration. */
    public static final VpnGatewayGeneration GENERATION1 = fromString("Generation1");

    /** Static value Generation2 for VpnGatewayGeneration. */
    public static final VpnGatewayGeneration GENERATION2 = fromString("Generation2");

    /**
     * Creates or finds a VpnGatewayGeneration from its string representation.
     * @param name a name to look for
     * @return the corresponding VpnGatewayGeneration
     */
    @JsonCreator
    public static VpnGatewayGeneration fromString(String name) {
        return fromString(name, VpnGatewayGeneration.class);
    }

    /**
     * @return known VpnGatewayGeneration values
     */
    public static Collection<VpnGatewayGeneration> values() {
        return values(VpnGatewayGeneration.class);
    }
}
