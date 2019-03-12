/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.backup.v2017_07_01;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonSubTypes;

/**
 * Azure Recovery Services Vault specific protection intent item.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "protectionIntentItemType")
@JsonTypeName("AzureWorkloadAutoProtectionIntent")
@JsonSubTypes({
    @JsonSubTypes.Type(name = "AzureWorkloadSQLAutoProtectionIntent", value = AzureWorkloadSQLAutoProtectionIntent.class)
})
public class AzureWorkloadAutoProtectionIntent extends AzureRecoveryServiceVaultProtectionIntent {
}