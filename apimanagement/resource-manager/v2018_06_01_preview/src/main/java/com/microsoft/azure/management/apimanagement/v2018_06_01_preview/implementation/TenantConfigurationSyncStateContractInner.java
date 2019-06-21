/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.apimanagement.v2018_06_01_preview.implementation;

import org.joda.time.DateTime;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Tenant Configuration Synchronization State.
 */
public class TenantConfigurationSyncStateContractInner {
    /**
     * The name of Git branch.
     */
    @JsonProperty(value = "branch")
    private String branch;

    /**
     * The latest commit Id.
     */
    @JsonProperty(value = "commitId")
    private String commitId;

    /**
     * value indicating if last sync was save (true) or deploy (false)
     * operation.
     */
    @JsonProperty(value = "isExport")
    private Boolean isExport;

    /**
     * value indicating if last synchronization was later than the
     * configuration change.
     */
    @JsonProperty(value = "isSynced")
    private Boolean isSynced;

    /**
     * value indicating whether Git configuration access is enabled.
     */
    @JsonProperty(value = "isGitEnabled")
    private Boolean isGitEnabled;

    /**
     * The date of the latest synchronization. The date conforms to the
     * following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     */
    @JsonProperty(value = "syncDate")
    private DateTime syncDate;

    /**
     * The date of the latest configuration change. The date conforms to the
     * following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601
     * standard.
     */
    @JsonProperty(value = "configurationChangeDate")
    private DateTime configurationChangeDate;

    /**
     * Get the name of Git branch.
     *
     * @return the branch value
     */
    public String branch() {
        return this.branch;
    }

    /**
     * Set the name of Git branch.
     *
     * @param branch the branch value to set
     * @return the TenantConfigurationSyncStateContractInner object itself.
     */
    public TenantConfigurationSyncStateContractInner withBranch(String branch) {
        this.branch = branch;
        return this;
    }

    /**
     * Get the latest commit Id.
     *
     * @return the commitId value
     */
    public String commitId() {
        return this.commitId;
    }

    /**
     * Set the latest commit Id.
     *
     * @param commitId the commitId value to set
     * @return the TenantConfigurationSyncStateContractInner object itself.
     */
    public TenantConfigurationSyncStateContractInner withCommitId(String commitId) {
        this.commitId = commitId;
        return this;
    }

    /**
     * Get value indicating if last sync was save (true) or deploy (false) operation.
     *
     * @return the isExport value
     */
    public Boolean isExport() {
        return this.isExport;
    }

    /**
     * Set value indicating if last sync was save (true) or deploy (false) operation.
     *
     * @param isExport the isExport value to set
     * @return the TenantConfigurationSyncStateContractInner object itself.
     */
    public TenantConfigurationSyncStateContractInner withIsExport(Boolean isExport) {
        this.isExport = isExport;
        return this;
    }

    /**
     * Get value indicating if last synchronization was later than the configuration change.
     *
     * @return the isSynced value
     */
    public Boolean isSynced() {
        return this.isSynced;
    }

    /**
     * Set value indicating if last synchronization was later than the configuration change.
     *
     * @param isSynced the isSynced value to set
     * @return the TenantConfigurationSyncStateContractInner object itself.
     */
    public TenantConfigurationSyncStateContractInner withIsSynced(Boolean isSynced) {
        this.isSynced = isSynced;
        return this;
    }

    /**
     * Get value indicating whether Git configuration access is enabled.
     *
     * @return the isGitEnabled value
     */
    public Boolean isGitEnabled() {
        return this.isGitEnabled;
    }

    /**
     * Set value indicating whether Git configuration access is enabled.
     *
     * @param isGitEnabled the isGitEnabled value to set
     * @return the TenantConfigurationSyncStateContractInner object itself.
     */
    public TenantConfigurationSyncStateContractInner withIsGitEnabled(Boolean isGitEnabled) {
        this.isGitEnabled = isGitEnabled;
        return this;
    }

    /**
     * Get the date of the latest synchronization. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the syncDate value
     */
    public DateTime syncDate() {
        return this.syncDate;
    }

    /**
     * Set the date of the latest synchronization. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @param syncDate the syncDate value to set
     * @return the TenantConfigurationSyncStateContractInner object itself.
     */
    public TenantConfigurationSyncStateContractInner withSyncDate(DateTime syncDate) {
        this.syncDate = syncDate;
        return this;
    }

    /**
     * Get the date of the latest configuration change. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @return the configurationChangeDate value
     */
    public DateTime configurationChangeDate() {
        return this.configurationChangeDate;
    }

    /**
     * Set the date of the latest configuration change. The date conforms to the following format: `yyyy-MM-ddTHH:mm:ssZ` as specified by the ISO 8601 standard.
     *
     * @param configurationChangeDate the configurationChangeDate value to set
     * @return the TenantConfigurationSyncStateContractInner object itself.
     */
    public TenantConfigurationSyncStateContractInner withConfigurationChangeDate(DateTime configurationChangeDate) {
        this.configurationChangeDate = configurationChangeDate;
        return this;
    }

}