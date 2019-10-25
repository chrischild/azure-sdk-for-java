/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_08_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.AzureServiceFuture;
import com.microsoft.azure.CloudException;
import com.microsoft.azure.ListOperationCallback;
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
import retrofit2.http.Url;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in LoadBalancerLoadBalancingRules.
 */
public class LoadBalancerLoadBalancingRulesInner {
    /** The Retrofit service to perform REST calls. */
    private LoadBalancerLoadBalancingRulesService service;
    /** The service client containing this operation class. */
    private NetworkManagementClientImpl client;

    /**
     * Initializes an instance of LoadBalancerLoadBalancingRulesInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public LoadBalancerLoadBalancingRulesInner(Retrofit retrofit, NetworkManagementClientImpl client) {
        this.service = retrofit.create(LoadBalancerLoadBalancingRulesService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for LoadBalancerLoadBalancingRules to be
     * used by Retrofit to perform actually REST calls.
     */
    interface LoadBalancerLoadBalancingRulesService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_08_01.LoadBalancerLoadBalancingRules list" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/loadBalancingRules")
        Observable<Response<ResponseBody>> list(@Path("resourceGroupName") String resourceGroupName, @Path("loadBalancerName") String loadBalancerName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_08_01.LoadBalancerLoadBalancingRules get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Network/loadBalancers/{loadBalancerName}/loadBalancingRules/{loadBalancingRuleName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("loadBalancerName") String loadBalancerName, @Path("loadBalancingRuleName") String loadBalancingRuleName, @Path("subscriptionId") String subscriptionId, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.network.v2019_08_01.LoadBalancerLoadBalancingRules listNext" })
        @GET
        Observable<Response<ResponseBody>> listNext(@Url String nextUrl, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;LoadBalancingRuleInner&gt; object if successful.
     */
    public PagedList<LoadBalancingRuleInner> list(final String resourceGroupName, final String loadBalancerName) {
        ServiceResponse<Page<LoadBalancingRuleInner>> response = listSinglePageAsync(resourceGroupName, loadBalancerName).toBlocking().single();
        return new PagedList<LoadBalancingRuleInner>(response.body()) {
            @Override
            public Page<LoadBalancingRuleInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<LoadBalancingRuleInner>> listAsync(final String resourceGroupName, final String loadBalancerName, final ListOperationCallback<LoadBalancingRuleInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listSinglePageAsync(resourceGroupName, loadBalancerName),
            new Func1<String, Observable<ServiceResponse<Page<LoadBalancingRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LoadBalancingRuleInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;LoadBalancingRuleInner&gt; object
     */
    public Observable<Page<LoadBalancingRuleInner>> listAsync(final String resourceGroupName, final String loadBalancerName) {
        return listWithServiceResponseAsync(resourceGroupName, loadBalancerName)
            .map(new Func1<ServiceResponse<Page<LoadBalancingRuleInner>>, Page<LoadBalancingRuleInner>>() {
                @Override
                public Page<LoadBalancingRuleInner> call(ServiceResponse<Page<LoadBalancingRuleInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;LoadBalancingRuleInner&gt; object
     */
    public Observable<ServiceResponse<Page<LoadBalancingRuleInner>>> listWithServiceResponseAsync(final String resourceGroupName, final String loadBalancerName) {
        return listSinglePageAsync(resourceGroupName, loadBalancerName)
            .concatMap(new Func1<ServiceResponse<Page<LoadBalancingRuleInner>>, Observable<ServiceResponse<Page<LoadBalancingRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LoadBalancingRuleInner>>> call(ServiceResponse<Page<LoadBalancingRuleInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
    ServiceResponse<PageImpl<LoadBalancingRuleInner>> * @param resourceGroupName The name of the resource group.
    ServiceResponse<PageImpl<LoadBalancingRuleInner>> * @param loadBalancerName The name of the load balancer.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;LoadBalancingRuleInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<LoadBalancingRuleInner>>> listSinglePageAsync(final String resourceGroupName, final String loadBalancerName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (loadBalancerName == null) {
            throw new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-08-01";
        return service.list(resourceGroupName, loadBalancerName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<LoadBalancingRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LoadBalancingRuleInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<LoadBalancingRuleInner>> result = listDelegate(response);
                        return Observable.just(new ServiceResponse<Page<LoadBalancingRuleInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<LoadBalancingRuleInner>> listDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<LoadBalancingRuleInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<LoadBalancingRuleInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the LoadBalancingRuleInner object if successful.
     */
    public LoadBalancingRuleInner get(String resourceGroupName, String loadBalancerName, String loadBalancingRuleName) {
        return getWithServiceResponseAsync(resourceGroupName, loadBalancerName, loadBalancingRuleName).toBlocking().single().body();
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<LoadBalancingRuleInner> getAsync(String resourceGroupName, String loadBalancerName, String loadBalancingRuleName, final ServiceCallback<LoadBalancingRuleInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, loadBalancerName, loadBalancingRuleName), serviceCallback);
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoadBalancingRuleInner object
     */
    public Observable<LoadBalancingRuleInner> getAsync(String resourceGroupName, String loadBalancerName, String loadBalancingRuleName) {
        return getWithServiceResponseAsync(resourceGroupName, loadBalancerName, loadBalancingRuleName).map(new Func1<ServiceResponse<LoadBalancingRuleInner>, LoadBalancingRuleInner>() {
            @Override
            public LoadBalancingRuleInner call(ServiceResponse<LoadBalancingRuleInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the specified load balancer load balancing rule.
     *
     * @param resourceGroupName The name of the resource group.
     * @param loadBalancerName The name of the load balancer.
     * @param loadBalancingRuleName The name of the load balancing rule.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the LoadBalancingRuleInner object
     */
    public Observable<ServiceResponse<LoadBalancingRuleInner>> getWithServiceResponseAsync(String resourceGroupName, String loadBalancerName, String loadBalancingRuleName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (loadBalancerName == null) {
            throw new IllegalArgumentException("Parameter loadBalancerName is required and cannot be null.");
        }
        if (loadBalancingRuleName == null) {
            throw new IllegalArgumentException("Parameter loadBalancingRuleName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        final String apiVersion = "2019-08-01";
        return service.get(resourceGroupName, loadBalancerName, loadBalancingRuleName, this.client.subscriptionId(), apiVersion, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<LoadBalancingRuleInner>>>() {
                @Override
                public Observable<ServiceResponse<LoadBalancingRuleInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<LoadBalancingRuleInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<LoadBalancingRuleInner> getDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<LoadBalancingRuleInner, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<LoadBalancingRuleInner>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws CloudException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PagedList&lt;LoadBalancingRuleInner&gt; object if successful.
     */
    public PagedList<LoadBalancingRuleInner> listNext(final String nextPageLink) {
        ServiceResponse<Page<LoadBalancingRuleInner>> response = listNextSinglePageAsync(nextPageLink).toBlocking().single();
        return new PagedList<LoadBalancingRuleInner>(response.body()) {
            @Override
            public Page<LoadBalancingRuleInner> nextPage(String nextPageLink) {
                return listNextSinglePageAsync(nextPageLink).toBlocking().single().body();
            }
        };
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @param serviceFuture the ServiceFuture object tracking the Retrofit calls
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<List<LoadBalancingRuleInner>> listNextAsync(final String nextPageLink, final ServiceFuture<List<LoadBalancingRuleInner>> serviceFuture, final ListOperationCallback<LoadBalancingRuleInner> serviceCallback) {
        return AzureServiceFuture.fromPageResponse(
            listNextSinglePageAsync(nextPageLink),
            new Func1<String, Observable<ServiceResponse<Page<LoadBalancingRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LoadBalancingRuleInner>>> call(String nextPageLink) {
                    return listNextSinglePageAsync(nextPageLink);
                }
            },
            serviceCallback);
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;LoadBalancingRuleInner&gt; object
     */
    public Observable<Page<LoadBalancingRuleInner>> listNextAsync(final String nextPageLink) {
        return listNextWithServiceResponseAsync(nextPageLink)
            .map(new Func1<ServiceResponse<Page<LoadBalancingRuleInner>>, Page<LoadBalancingRuleInner>>() {
                @Override
                public Page<LoadBalancingRuleInner> call(ServiceResponse<Page<LoadBalancingRuleInner>> response) {
                    return response.body();
                }
            });
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
     * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PagedList&lt;LoadBalancingRuleInner&gt; object
     */
    public Observable<ServiceResponse<Page<LoadBalancingRuleInner>>> listNextWithServiceResponseAsync(final String nextPageLink) {
        return listNextSinglePageAsync(nextPageLink)
            .concatMap(new Func1<ServiceResponse<Page<LoadBalancingRuleInner>>, Observable<ServiceResponse<Page<LoadBalancingRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LoadBalancingRuleInner>>> call(ServiceResponse<Page<LoadBalancingRuleInner>> page) {
                    String nextPageLink = page.body().nextPageLink();
                    if (nextPageLink == null) {
                        return Observable.just(page);
                    }
                    return Observable.just(page).concatWith(listNextWithServiceResponseAsync(nextPageLink));
                }
            });
    }

    /**
     * Gets all the load balancing rules in a load balancer.
     *
    ServiceResponse<PageImpl<LoadBalancingRuleInner>> * @param nextPageLink The NextLink from the previous successful call to List operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the PagedList&lt;LoadBalancingRuleInner&gt; object wrapped in {@link ServiceResponse} if successful.
     */
    public Observable<ServiceResponse<Page<LoadBalancingRuleInner>>> listNextSinglePageAsync(final String nextPageLink) {
        if (nextPageLink == null) {
            throw new IllegalArgumentException("Parameter nextPageLink is required and cannot be null.");
        }
        String nextUrl = String.format("%s", nextPageLink);
        return service.listNext(nextUrl, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Page<LoadBalancingRuleInner>>>>() {
                @Override
                public Observable<ServiceResponse<Page<LoadBalancingRuleInner>>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PageImpl<LoadBalancingRuleInner>> result = listNextDelegate(response);
                        return Observable.just(new ServiceResponse<Page<LoadBalancingRuleInner>>(result.body(), result.response()));
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PageImpl<LoadBalancingRuleInner>> listNextDelegate(Response<ResponseBody> response) throws CloudException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PageImpl<LoadBalancingRuleInner>, CloudException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PageImpl<LoadBalancingRuleInner>>() { }.getType())
                .registerError(CloudException.class)
                .build(response);
    }

}
