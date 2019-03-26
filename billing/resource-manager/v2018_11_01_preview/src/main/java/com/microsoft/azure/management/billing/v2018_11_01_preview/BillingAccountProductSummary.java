/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.ProductSummaryInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.billing.v2018_11_01_preview.implementation.BillingManager;
import org.joda.time.DateTime;

/**
 * Type representing BillingAccountProductSummary.
 */
public interface BillingAccountProductSummary extends HasInner<ProductSummaryInner>, HasManager<BillingManager> {
    /**
     * @return the availabilityId value.
     */
    String availabilityId();

    /**
     * @return the billingFrequency value.
     */
    BillingFrequency billingFrequency();

    /**
     * @return the billingProfileId value.
     */
    String billingProfileId();

    /**
     * @return the billingProfileName value.
     */
    String billingProfileName();

    /**
     * @return the displayName value.
     */
    String displayName();

    /**
     * @return the endDate value.
     */
    DateTime endDate();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the invoiceSectionId value.
     */
    String invoiceSectionId();

    /**
     * @return the invoiceSectionName value.
     */
    String invoiceSectionName();

    /**
     * @return the lastCharge value.
     */
    Amount lastCharge();

    /**
     * @return the lastChargeDate value.
     */
    DateTime lastChargeDate();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the parentProductId value.
     */
    String parentProductId();

    /**
     * @return the productType value.
     */
    String productType();

    /**
     * @return the productTypeId value.
     */
    String productTypeId();

    /**
     * @return the purchaseDate value.
     */
    DateTime purchaseDate();

    /**
     * @return the quantity value.
     */
    Double quantity();

    /**
     * @return the skuDescription value.
     */
    String skuDescription();

    /**
     * @return the skuId value.
     */
    String skuId();

    /**
     * @return the status value.
     */
    ProductStatusType status();

    /**
     * @return the type value.
     */
    String type();

}
