/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import java.io.IOException;
import java.util.List;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in Operations.
 */
public class OperationsInner {
    /** The Retrofit service to perform REST calls. */
    private OperationsService service;
    /** The service client containing this operation class. */
    private AzureDeploymentManagerImpl client;

    /**
     * Initializes an instance of OperationsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public OperationsInner(Retrofit retrofit, AzureDeploymentManagerImpl client) {
        this.service = retrofit.create(OperationsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for Operations to be
     * used by Retrofit to perform actually REST calls.
     */
    interface OperationsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.deploymentmanager.v2018-09-01-preview.Operations list" })
        @GET("subscriptions/{subscriptionId}/providers/Microsoft.DeploymentManager/operations")
        Observable<Response<ResponseBody>> list(@Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets an operation resource.
     *
     * @return the PagedList<OperationInner> object if successful.
     */
    public PagedList<OperationInner> list() {
        PageImpl<OperationInner> page = new PageImpl<>();
        page.setItems(listWithServiceResponseAsync().toBlocking().single().body());
        page.setNextPageLink(null);
        return new PagedList<OperationInner>(page) {
            @Override
            public Page<OperationInner> nextPage(String nextPageLink) {
                return null;
            }
        };
    }

    /**
     * Gets an operation resource.
     *
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<OperationInner>> listAsync(final ServiceCallback<List<OperationInner>> serviceCallback) {
        return ServiceFuture.fromResponse(listWithServiceResponseAsync(), serviceCallback);
    }

    /**
     * Gets an operation resource.
     *
     * @return the observable to the List&lt;OperationInner&gt; object
     */
    public Observable<Page<OperationInner>> listAsync() {
        return listWithServiceResponseAsync().map(new Func1<ServiceResponse<List<OperationInner>>, Page<OperationInner>>() {
            @Override
            public Page<OperationInner> call(ServiceResponse<List<OperationInner>> response) {
                PageImpl<OperationInner> page = new PageImpl<>();
                page.setItems(response.body());
                return page;
            }
        });
    }

    /**
     * Gets an operation resource.
     *
     * @return the observable to the List&lt;OperationInner&gt; object
     */
    public Observable<ServiceResponse<List<OperationInner>>> listWithServiceResponseAsync() {
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.list(this.client.subscriptionId(), this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<List<OperationInner>>>>() {
                @Override
                public Observable<ServiceResponse<List<OperationInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<OperationInner>> result = listDelegate(response);
                        List<OperationInner> items = null;
                        if (result.body() != null) {
                            items = result.body().items();
                        }
                        ServiceResponse<List<OperationInner>> clientResponse = new ServiceResponse<List<OperationInner>>(items, result.response());
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<OperationInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<OperationInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<OperationInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}