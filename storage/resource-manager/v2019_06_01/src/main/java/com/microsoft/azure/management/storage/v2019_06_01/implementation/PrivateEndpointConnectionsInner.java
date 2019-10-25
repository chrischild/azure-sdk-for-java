/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.storage.v2019_06_01.implementation;

import retrofit2.Retrofit;
import com.google.common.reflect.TypeToken;
import com.microsoft.azure.management.storage.v2019_06_01.ErrorResponseException;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import com.microsoft.rest.ServiceResponse;
import com.microsoft.rest.Validator;
import java.io.IOException;
import okhttp3.ResponseBody;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.HTTP;
import retrofit2.http.Path;
import retrofit2.http.PUT;
import retrofit2.http.Query;
import retrofit2.Response;
import rx.functions.Func1;
import rx.Observable;

/**
 * An instance of this class provides access to all the operations defined
 * in PrivateEndpointConnections.
 */
public class PrivateEndpointConnectionsInner {
    /** The Retrofit service to perform REST calls. */
    private PrivateEndpointConnectionsService service;
    /** The service client containing this operation class. */
    private StorageManagementClientImpl client;

    /**
     * Initializes an instance of PrivateEndpointConnectionsInner.
     *
     * @param retrofit the Retrofit instance built from a Retrofit Builder.
     * @param client the instance of the service client containing this operation class.
     */
    public PrivateEndpointConnectionsInner(Retrofit retrofit, StorageManagementClientImpl client) {
        this.service = retrofit.create(PrivateEndpointConnectionsService.class);
        this.client = client;
    }

    /**
     * The interface defining all the services for PrivateEndpointConnections to be
     * used by Retrofit to perform actually REST calls.
     */
    interface PrivateEndpointConnectionsService {
        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storage.v2019_06_01.PrivateEndpointConnections get" })
        @GET("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}")
        Observable<Response<ResponseBody>> get(@Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("subscriptionId") String subscriptionId, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storage.v2019_06_01.PrivateEndpointConnections put" })
        @PUT("subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}")
        Observable<Response<ResponseBody>> put(@Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("subscriptionId") String subscriptionId, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Body PrivateEndpointConnectionInner properties, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

        @Headers({ "Content-Type: application/json; charset=utf-8", "x-ms-logging-context: com.microsoft.azure.management.storage.v2019_06_01.PrivateEndpointConnections delete" })
        @HTTP(path = "subscriptions/{subscriptionId}/resourceGroups/{resourceGroupName}/providers/Microsoft.Storage/storageAccounts/{accountName}/privateEndpointConnections/{privateEndpointConnectionName}", method = "DELETE", hasBody = true)
        Observable<Response<ResponseBody>> delete(@Path("resourceGroupName") String resourceGroupName, @Path("accountName") String accountName, @Path("subscriptionId") String subscriptionId, @Path("privateEndpointConnectionName") String privateEndpointConnectionName, @Query("api-version") String apiVersion, @Header("accept-language") String acceptLanguage, @Header("User-Agent") String userAgent);

    }

    /**
     * Gets the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage Account
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionInner object if successful.
     */
    public PrivateEndpointConnectionInner get(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return getWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName).toBlocking().single().body();
    }

    /**
     * Gets the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage Account
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionInner> getAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, final ServiceCallback<PrivateEndpointConnectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(getWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Gets the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage Account
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<PrivateEndpointConnectionInner> getAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return getWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName).map(new Func1<ServiceResponse<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner>() {
            @Override
            public PrivateEndpointConnectionInner call(ServiceResponse<PrivateEndpointConnectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Gets the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage Account
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<ServiceResponse<PrivateEndpointConnectionInner>> getWithServiceResponseAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.get(resourceGroupName, accountName, this.client.subscriptionId(), privateEndpointConnectionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateEndpointConnectionInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateEndpointConnectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateEndpointConnectionInner> clientResponse = getDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateEndpointConnectionInner> getDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateEndpointConnectionInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateEndpointConnectionInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Update the state of specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage Account
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     * @return the PrivateEndpointConnectionInner object if successful.
     */
    public PrivateEndpointConnectionInner put(String resourceGroupName, String accountName, String privateEndpointConnectionName, PrivateEndpointConnectionInner properties) {
        return putWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName, properties).toBlocking().single().body();
    }

    /**
     * Update the state of specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage Account
     * @param properties The private endpoint connection properties.
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<PrivateEndpointConnectionInner> putAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, PrivateEndpointConnectionInner properties, final ServiceCallback<PrivateEndpointConnectionInner> serviceCallback) {
        return ServiceFuture.fromResponse(putWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName, properties), serviceCallback);
    }

    /**
     * Update the state of specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage Account
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<PrivateEndpointConnectionInner> putAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, PrivateEndpointConnectionInner properties) {
        return putWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName, properties).map(new Func1<ServiceResponse<PrivateEndpointConnectionInner>, PrivateEndpointConnectionInner>() {
            @Override
            public PrivateEndpointConnectionInner call(ServiceResponse<PrivateEndpointConnectionInner> response) {
                return response.body();
            }
        });
    }

    /**
     * Update the state of specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage Account
     * @param properties The private endpoint connection properties.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable to the PrivateEndpointConnectionInner object
     */
    public Observable<ServiceResponse<PrivateEndpointConnectionInner>> putWithServiceResponseAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, PrivateEndpointConnectionInner properties) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        if (properties == null) {
            throw new IllegalArgumentException("Parameter properties is required and cannot be null.");
        }
        Validator.validate(properties);
        return service.put(resourceGroupName, accountName, this.client.subscriptionId(), privateEndpointConnectionName, this.client.apiVersion(), properties, this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<PrivateEndpointConnectionInner>>>() {
                @Override
                public Observable<ServiceResponse<PrivateEndpointConnectionInner>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<PrivateEndpointConnectionInner> clientResponse = putDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<PrivateEndpointConnectionInner> putDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<PrivateEndpointConnectionInner, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<PrivateEndpointConnectionInner>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

    /**
     * Deletes the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage Account
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @throws ErrorResponseException thrown if the request is rejected by server
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent
     */
    public void delete(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        deleteWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName).toBlocking().single().body();
    }

    /**
     * Deletes the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage Account
     * @param serviceCallback the async ServiceCallback to handle successful and failed responses.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceFuture} object
     */
    public ServiceFuture<Void> deleteAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName, final ServiceCallback<Void> serviceCallback) {
        return ServiceFuture.fromResponse(deleteWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName), serviceCallback);
    }

    /**
     * Deletes the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage Account
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<Void> deleteAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        return deleteWithServiceResponseAsync(resourceGroupName, accountName, privateEndpointConnectionName).map(new Func1<ServiceResponse<Void>, Void>() {
            @Override
            public Void call(ServiceResponse<Void> response) {
                return response.body();
            }
        });
    }

    /**
     * Deletes the specified private endpoint connection associated with the storage account.
     *
     * @param resourceGroupName The name of the resource group within the user's subscription. The name is case insensitive.
     * @param accountName The name of the storage account within the specified resource group. Storage account names must be between 3 and 24 characters in length and use numbers and lower-case letters only.
     * @param privateEndpointConnectionName The name of the private endpoint connection associated with the Storage Account
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the {@link ServiceResponse} object if successful.
     */
    public Observable<ServiceResponse<Void>> deleteWithServiceResponseAsync(String resourceGroupName, String accountName, String privateEndpointConnectionName) {
        if (resourceGroupName == null) {
            throw new IllegalArgumentException("Parameter resourceGroupName is required and cannot be null.");
        }
        if (accountName == null) {
            throw new IllegalArgumentException("Parameter accountName is required and cannot be null.");
        }
        if (this.client.subscriptionId() == null) {
            throw new IllegalArgumentException("Parameter this.client.subscriptionId() is required and cannot be null.");
        }
        if (privateEndpointConnectionName == null) {
            throw new IllegalArgumentException("Parameter privateEndpointConnectionName is required and cannot be null.");
        }
        if (this.client.apiVersion() == null) {
            throw new IllegalArgumentException("Parameter this.client.apiVersion() is required and cannot be null.");
        }
        return service.delete(resourceGroupName, accountName, this.client.subscriptionId(), privateEndpointConnectionName, this.client.apiVersion(), this.client.acceptLanguage(), this.client.userAgent())
            .flatMap(new Func1<Response<ResponseBody>, Observable<ServiceResponse<Void>>>() {
                @Override
                public Observable<ServiceResponse<Void>> call(Response<ResponseBody> response) {
                    try {
                        ServiceResponse<Void> clientResponse = deleteDelegate(response);
                        return Observable.just(clientResponse);
                    } catch (Throwable t) {
                        return Observable.error(t);
                    }
                }
            });
    }

    private ServiceResponse<Void> deleteDelegate(Response<ResponseBody> response) throws ErrorResponseException, IOException, IllegalArgumentException {
        return this.client.restClient().responseBuilderFactory().<Void, ErrorResponseException>newInstance(this.client.serializerAdapter())
                .register(200, new TypeToken<Void>() { }.getType())
                .register(204, new TypeToken<Void>() { }.getType())
                .registerError(ErrorResponseException.class)
                .build(response);
    }

}
