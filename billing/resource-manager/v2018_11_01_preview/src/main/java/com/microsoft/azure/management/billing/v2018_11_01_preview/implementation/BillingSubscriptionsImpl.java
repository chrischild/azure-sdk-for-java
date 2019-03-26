/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.billing.v2018_11_01_preview.implementation;

import com.microsoft.azure.arm.model.implementation.WrapperImpl;
import com.microsoft.azure.management.billing.v2018_11_01_preview.BillingSubscriptions;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.billing.v2018_11_01_preview.TransferBillingSubscriptionResult;
import com.microsoft.azure.management.billing.v2018_11_01_preview.InvoiceSectionBillingAccountBillingSubscriptionSummary;

class BillingSubscriptionsImpl extends WrapperImpl<BillingSubscriptionsInner> implements BillingSubscriptions {
    private final BillingManager manager;

    BillingSubscriptionsImpl(BillingManager manager) {
        super(manager.inner().billingSubscriptions());
        this.manager = manager;
    }

    public BillingManager manager() {
        return this.manager;
    }

    private InvoiceSectionBillingAccountBillingSubscriptionSummaryImpl wrapModel(BillingSubscriptionSummaryInner inner) {
        return  new InvoiceSectionBillingAccountBillingSubscriptionSummaryImpl(inner, manager());
    }

    @Override
    public Observable<TransferBillingSubscriptionResult> transferAsync(String billingAccountName, String invoiceSectionName, String billingSubscriptionName) {
        BillingSubscriptionsInner client = this.inner();
        return client.transferAsync(billingAccountName, invoiceSectionName, billingSubscriptionName)
        .map(new Func1<TransferBillingSubscriptionResultInner, TransferBillingSubscriptionResult>() {
            @Override
            public TransferBillingSubscriptionResult call(TransferBillingSubscriptionResultInner inner) {
                return new TransferBillingSubscriptionResultImpl(inner, manager());
            }
        });
    }

    @Override
    public Observable<InvoiceSectionBillingAccountBillingSubscriptionSummary> getAsync(String billingAccountName, String invoiceSectionName, String billingSubscriptionName) {
        BillingSubscriptionsInner client = this.inner();
        return client.getAsync(billingAccountName, invoiceSectionName, billingSubscriptionName)
        .map(new Func1<BillingSubscriptionSummaryInner, InvoiceSectionBillingAccountBillingSubscriptionSummary>() {
            @Override
            public InvoiceSectionBillingAccountBillingSubscriptionSummary call(BillingSubscriptionSummaryInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
