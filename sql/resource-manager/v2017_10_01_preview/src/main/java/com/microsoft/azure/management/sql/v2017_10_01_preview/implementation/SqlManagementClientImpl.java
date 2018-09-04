/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.sql.v2017_10_01_preview.implementation;

import com.microsoft.azure.AzureClient;
import com.microsoft.azure.AzureServiceClient;
import com.microsoft.rest.credentials.ServiceClientCredentials;
import com.microsoft.rest.RestClient;

/**
 * Initializes a new instance of the SqlManagementClientImpl class.
 */
public class SqlManagementClientImpl extends AzureServiceClient {
    /** the {@link AzureClient} used for long running operations. */
    private AzureClient azureClient;

    /**
     * Gets the {@link AzureClient} used for long running operations.
     * @return the azure client;
     */
    public AzureClient getAzureClient() {
        return this.azureClient;
    }

    /** The subscription ID that identifies an Azure subscription. */
    private String subscriptionId;

    /**
     * Gets The subscription ID that identifies an Azure subscription.
     *
     * @return the subscriptionId value.
     */
    public String subscriptionId() {
        return this.subscriptionId;
    }

    /**
     * Sets The subscription ID that identifies an Azure subscription.
     *
     * @param subscriptionId the subscriptionId value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withSubscriptionId(String subscriptionId) {
        this.subscriptionId = subscriptionId;
        return this;
    }

    /** The API version to use for the request. */
    private String apiVersion;

    /**
     * Gets The API version to use for the request.
     *
     * @return the apiVersion value.
     */
    public String apiVersion() {
        return this.apiVersion;
    }

    /** Gets or sets the preferred language for the response. */
    private String acceptLanguage;

    /**
     * Gets Gets or sets the preferred language for the response.
     *
     * @return the acceptLanguage value.
     */
    public String acceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * Sets Gets or sets the preferred language for the response.
     *
     * @param acceptLanguage the acceptLanguage value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withAcceptLanguage(String acceptLanguage) {
        this.acceptLanguage = acceptLanguage;
        return this;
    }

    /** Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30. */
    private int longRunningOperationRetryTimeout;

    /**
     * Gets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @return the longRunningOperationRetryTimeout value.
     */
    public int longRunningOperationRetryTimeout() {
        return this.longRunningOperationRetryTimeout;
    }

    /**
     * Sets Gets or sets the retry timeout in seconds for Long Running Operations. Default value is 30.
     *
     * @param longRunningOperationRetryTimeout the longRunningOperationRetryTimeout value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withLongRunningOperationRetryTimeout(int longRunningOperationRetryTimeout) {
        this.longRunningOperationRetryTimeout = longRunningOperationRetryTimeout;
        return this;
    }

    /** When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true. */
    private boolean generateClientRequestId;

    /**
     * Gets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @return the generateClientRequestId value.
     */
    public boolean generateClientRequestId() {
        return this.generateClientRequestId;
    }

    /**
     * Sets When set to true a unique x-ms-client-request-id value is generated and included in each request. Default is true.
     *
     * @param generateClientRequestId the generateClientRequestId value.
     * @return the service client itself
     */
    public SqlManagementClientImpl withGenerateClientRequestId(boolean generateClientRequestId) {
        this.generateClientRequestId = generateClientRequestId;
        return this;
    }

    /**
     * The DatabaseOperationsInner object to access its operations.
     */
    private DatabaseOperationsInner databaseOperations;

    /**
     * Gets the DatabaseOperationsInner object to access its operations.
     * @return the DatabaseOperationsInner object.
     */
    public DatabaseOperationsInner databaseOperations() {
        return this.databaseOperations;
    }

    /**
     * The ElasticPoolOperationsInner object to access its operations.
     */
    private ElasticPoolOperationsInner elasticPoolOperations;

    /**
     * Gets the ElasticPoolOperationsInner object to access its operations.
     * @return the ElasticPoolOperationsInner object.
     */
    public ElasticPoolOperationsInner elasticPoolOperations() {
        return this.elasticPoolOperations;
    }

    /**
     * The DatabaseVulnerabilityAssessmentScansInner object to access its operations.
     */
    private DatabaseVulnerabilityAssessmentScansInner databaseVulnerabilityAssessmentScans;

    /**
     * Gets the DatabaseVulnerabilityAssessmentScansInner object to access its operations.
     * @return the DatabaseVulnerabilityAssessmentScansInner object.
     */
    public DatabaseVulnerabilityAssessmentScansInner databaseVulnerabilityAssessmentScans() {
        return this.databaseVulnerabilityAssessmentScans;
    }

    /**
     * The CapabilitiesInner object to access its operations.
     */
    private CapabilitiesInner capabilities;

    /**
     * Gets the CapabilitiesInner object to access its operations.
     * @return the CapabilitiesInner object.
     */
    public CapabilitiesInner capabilities() {
        return this.capabilities;
    }

    /**
     * The DatabasesInner object to access its operations.
     */
    private DatabasesInner databases;

    /**
     * Gets the DatabasesInner object to access its operations.
     * @return the DatabasesInner object.
     */
    public DatabasesInner databases() {
        return this.databases;
    }

    /**
     * The ElasticPoolsInner object to access its operations.
     */
    private ElasticPoolsInner elasticPools;

    /**
     * Gets the ElasticPoolsInner object to access its operations.
     * @return the ElasticPoolsInner object.
     */
    public ElasticPoolsInner elasticPools() {
        return this.elasticPools;
    }

    /**
     * The InstanceFailoverGroupsInner object to access its operations.
     */
    private InstanceFailoverGroupsInner instanceFailoverGroups;

    /**
     * Gets the InstanceFailoverGroupsInner object to access its operations.
     * @return the InstanceFailoverGroupsInner object.
     */
    public InstanceFailoverGroupsInner instanceFailoverGroups() {
        return this.instanceFailoverGroups;
    }

    /**
     * The BackupShortTermRetentionPoliciesInner object to access its operations.
     */
    private BackupShortTermRetentionPoliciesInner backupShortTermRetentionPolicies;

    /**
     * Gets the BackupShortTermRetentionPoliciesInner object to access its operations.
     * @return the BackupShortTermRetentionPoliciesInner object.
     */
    public BackupShortTermRetentionPoliciesInner backupShortTermRetentionPolicies() {
        return this.backupShortTermRetentionPolicies;
    }

    /**
     * The TdeCertificatesInner object to access its operations.
     */
    private TdeCertificatesInner tdeCertificates;

    /**
     * Gets the TdeCertificatesInner object to access its operations.
     * @return the TdeCertificatesInner object.
     */
    public TdeCertificatesInner tdeCertificates() {
        return this.tdeCertificates;
    }

    /**
     * The ManagedInstanceTdeCertificatesInner object to access its operations.
     */
    private ManagedInstanceTdeCertificatesInner managedInstanceTdeCertificates;

    /**
     * Gets the ManagedInstanceTdeCertificatesInner object to access its operations.
     * @return the ManagedInstanceTdeCertificatesInner object.
     */
    public ManagedInstanceTdeCertificatesInner managedInstanceTdeCertificates() {
        return this.managedInstanceTdeCertificates;
    }

    /**
     * The ManagedInstanceKeysInner object to access its operations.
     */
    private ManagedInstanceKeysInner managedInstanceKeys;

    /**
     * Gets the ManagedInstanceKeysInner object to access its operations.
     * @return the ManagedInstanceKeysInner object.
     */
    public ManagedInstanceKeysInner managedInstanceKeys() {
        return this.managedInstanceKeys;
    }

    /**
     * The ManagedInstanceEncryptionProtectorsInner object to access its operations.
     */
    private ManagedInstanceEncryptionProtectorsInner managedInstanceEncryptionProtectors;

    /**
     * Gets the ManagedInstanceEncryptionProtectorsInner object to access its operations.
     * @return the ManagedInstanceEncryptionProtectorsInner object.
     */
    public ManagedInstanceEncryptionProtectorsInner managedInstanceEncryptionProtectors() {
        return this.managedInstanceEncryptionProtectors;
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param credentials the management credentials for Azure
     */
    public SqlManagementClientImpl(ServiceClientCredentials credentials) {
        this("https://management.azure.com", credentials);
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param baseUrl the base URL of the host
     * @param credentials the management credentials for Azure
     */
    public SqlManagementClientImpl(String baseUrl, ServiceClientCredentials credentials) {
        super(baseUrl, credentials);
        initialize();
    }

    /**
     * Initializes an instance of SqlManagementClient client.
     *
     * @param restClient the REST client to connect to Azure.
     */
    public SqlManagementClientImpl(RestClient restClient) {
        super(restClient);
        initialize();
    }

    protected void initialize() {
        this.apiVersion = "2017-10-01-preview";
        this.acceptLanguage = "en-US";
        this.longRunningOperationRetryTimeout = 30;
        this.generateClientRequestId = true;
        this.databaseOperations = new DatabaseOperationsInner(restClient().retrofit(), this);
        this.elasticPoolOperations = new ElasticPoolOperationsInner(restClient().retrofit(), this);
        this.databaseVulnerabilityAssessmentScans = new DatabaseVulnerabilityAssessmentScansInner(restClient().retrofit(), this);
        this.capabilities = new CapabilitiesInner(restClient().retrofit(), this);
        this.databases = new DatabasesInner(restClient().retrofit(), this);
        this.elasticPools = new ElasticPoolsInner(restClient().retrofit(), this);
        this.instanceFailoverGroups = new InstanceFailoverGroupsInner(restClient().retrofit(), this);
        this.backupShortTermRetentionPolicies = new BackupShortTermRetentionPoliciesInner(restClient().retrofit(), this);
        this.tdeCertificates = new TdeCertificatesInner(restClient().retrofit(), this);
        this.managedInstanceTdeCertificates = new ManagedInstanceTdeCertificatesInner(restClient().retrofit(), this);
        this.managedInstanceKeys = new ManagedInstanceKeysInner(restClient().retrofit(), this);
        this.managedInstanceEncryptionProtectors = new ManagedInstanceEncryptionProtectorsInner(restClient().retrofit(), this);
        this.azureClient = new AzureClient(this);
    }

    /**
     * Gets the User-Agent header for the client.
     *
     * @return the user agent string.
     */
    @Override
    public String userAgent() {
        return String.format("%s (%s, %s)", super.userAgent(), "SqlManagementClient", "2017-10-01-preview");
    }
}