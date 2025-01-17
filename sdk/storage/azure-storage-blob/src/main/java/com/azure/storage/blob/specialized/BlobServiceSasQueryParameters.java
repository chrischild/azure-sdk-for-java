// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.blob.specialized;

import com.azure.storage.blob.models.UserDelegationKey;
import com.azure.storage.blob.BlobClientBuilder;
import com.azure.storage.common.BaseSasQueryParameters;
import com.azure.storage.common.Constants;
import com.azure.storage.common.IpRange;
import com.azure.storage.common.SASProtocol;
import com.azure.storage.common.Utility;

import java.time.OffsetDateTime;
import java.util.Map;

/**
 * Represents the components that make up an Azure Storage SAS' query parameters. This type is not constructed directly
 * by the user; it is only generated by the {@link BlobServiceSasSignatureValues} type. Once generated, it can be set on
 * a {@link BlobClientBuilder} object to be constructed as part of a URL or it can be encoded into a {@code String} and
 * appended to a URL directly (though caution should be taken here in case there are existing query parameters, which
 * might affect the appropriate means of appending these query parameters). NOTE: Instances of this class are immutable
 * to ensure thread safety.
 */
public final class BlobServiceSasQueryParameters extends BaseSasQueryParameters {

    private final String identifier;

    private final String keyOid;

    private final String keyTid;

    private final OffsetDateTime keyStart;

    private final OffsetDateTime keyExpiry;

    private final String keyService;

    private final String keyVersion;

    private final String resource;

    private final String cacheControl;

    private final String contentDisposition;

    private final String contentEncoding;

    private final String contentLanguage;

    private final String contentType;

    /**
     * Creates a new {@link BlobServiceSasQueryParameters} object.
     *
     * @param queryParamsMap All query parameters for the request as key-value pairs
     * @param removeSASParametersFromMap When {@code true}, the SAS query parameters will be removed from
     * queryParamsMap
     */
    public BlobServiceSasQueryParameters(Map<String, String[]> queryParamsMap, boolean removeSASParametersFromMap) {
        super(queryParamsMap, removeSASParametersFromMap);
        this.identifier = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_IDENTIFIER,
            removeSASParametersFromMap);
        this.keyOid = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_OBJECT_ID,
            removeSASParametersFromMap);
        this.keyTid = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_TENANT_ID,
            removeSASParametersFromMap);
        this.keyStart = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_KEY_START,
            removeSASParametersFromMap, Utility::parseDate);
        this.keyExpiry = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_KEY_EXPIRY,
            removeSASParametersFromMap, Utility::parseDate);
        this.keyService = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_KEY_SERVICE,
            removeSASParametersFromMap);
        this.keyVersion = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_KEY_VERSION,
            removeSASParametersFromMap);
        this.resource = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_SIGNED_RESOURCE,
            removeSASParametersFromMap);
        this.cacheControl = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CACHE_CONTROL,
            removeSASParametersFromMap);
        this.contentDisposition = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CONTENT_DISPOSITION,
            removeSASParametersFromMap);
        this.contentEncoding = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CONTENT_ENCODING,
            removeSASParametersFromMap);
        this.contentLanguage = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CONTENT_LANGUAGE,
            removeSASParametersFromMap);
        this.contentType = getQueryParameter(queryParamsMap, Constants.UrlConstants.SAS_CONTENT_TYPE,
            removeSASParametersFromMap);
    }

    /**
     * Creates a new {@link BlobServiceSasQueryParameters} object. These objects are only created internally by
     * SASSignatureValues classes.
     *
     * @param version A {@code String} representing the storage version.
     * @param protocol A {@code String} representing the allowed HTTP protocol(s) or {@code null}.
     * @param startTime A {@code java.util.Date} representing the start time for this SAS token or {@code null}.
     * @param expiryTime A {@code java.util.Date} representing the expiry time for this SAS token.
     * @param ipRange A {@link IpRange} representing the range of valid IP addresses for this SAS token or
     * {@code null}.
     * @param identifier A {@code String} representing the signed identifier (only for Service SAS) or {@code null}.
     * @param resource A {@code String} representing the storage container or blob (only for Service SAS).
     * @param permissions A {@code String} representing the storage permissions or {@code null}.
     * @param signature A {@code String} representing the signature for the SAS token.
     */
    BlobServiceSasQueryParameters(String version, SASProtocol protocol, OffsetDateTime startTime,
        OffsetDateTime expiryTime, IpRange ipRange, String identifier, String resource, String permissions,
        String signature, String cacheControl, String contentDisposition, String contentEncoding,
        String contentLanguage, String contentType, UserDelegationKey key) {
        super(version, protocol, startTime, expiryTime, ipRange, permissions, signature);

        this.identifier = identifier;
        this.resource = resource;
        this.cacheControl = cacheControl;
        this.contentDisposition = contentDisposition;
        this.contentEncoding = contentEncoding;
        this.contentLanguage = contentLanguage;
        this.contentType = contentType;

        if (key != null) {
            this.keyOid = key.getSignedOid();
            this.keyTid = key.getSignedTid();
            this.keyStart = key.getSignedStart();
            this.keyExpiry = key.getSignedExpiry();
            this.keyService = key.getSignedService();
            this.keyVersion = key.getSignedVersion();
        } else {
            this.keyOid = null;
            this.keyTid = null;
            this.keyStart = null;
            this.keyExpiry = null;
            this.keyService = null;
            this.keyVersion = null;
        }
    }

    /**
     * @return The signed identifier (only for {@link BlobServiceSasSignatureValues}) or {@code null}. Please see
     * <a href="https://docs.microsoft.com/en-us/rest/api/storageservices/establishing-a-stored-access-policy">here</a>
     * for more information.
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * @return The storage container or blob (only for {@link BlobServiceSasSignatureValues}).
     */
    public String getResource() {
        return resource;
    }

    /**
     * @return The Cache-Control header value when a client accesses the resource with this sas token.
     */
    public String getCacheControl() {
        return cacheControl;
    }

    /**
     * @return The Content-Disposition header value when a client accesses the resource with this sas token.
     */
    public String getContentDisposition() {
        return contentDisposition;
    }

    /**
     * @return The Content-Encoding header value when a client accesses the resource with this sas token.
     */
    public String getContentEncoding() {
        return contentEncoding;
    }

    /**
     * @return The Content-Language header value when a client accesses the resource with this sas token.
     */
    public String getContentLanguage() {
        return contentLanguage;
    }

    /**
     * @return The Content-Type header value when a client accesses the resource with this sas token.
     */
    public String getContentType() {
        return contentType;
    }

    /**
     * @return the object ID of the key.
     */
    public String getKeyOid() {
        return keyOid;
    }

    /**
     * @return the tenant ID of the key.
     */
    public String getKeyTid() {
        return keyTid;
    }

    /**
     * @return the datetime when the key becomes active.
     */
    public OffsetDateTime getKeyStart() {
        return keyStart;
    }

    /**
     * @return the datetime when the key expires.
     */
    public OffsetDateTime getKeyExpiry() {
        return keyExpiry;
    }

    /**
     * @return the services that are permitted by the key.
     */
    public String getKeyService() {
        return keyService;
    }

    /**
     * @return the service version that created the key.
     */
    public String getKeyVersion() {
        return keyVersion;
    }

    UserDelegationKey userDelegationKey() {
        return new UserDelegationKey()
            .setSignedExpiry(this.keyExpiry)
            .setSignedOid(this.keyOid)
            .setSignedService(this.keyService)
            .setSignedStart(this.keyStart)
            .setSignedTid(this.keyTid)
            .setSignedVersion(this.keyVersion);
    }

    /**
     * Encodes all SAS query parameters into a string that can be appended to a URL.
     *
     * @return A {@code String} representing all SAS query parameters.
     */
    public String encode() {
        /*
         We should be url-encoding each key and each value, but because we know all the keys and values will encode to
         themselves, we cheat except for the signature value.
         */
        StringBuilder sb = new StringBuilder();

        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SERVICE_VERSION, this.version);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_PROTOCOL, this.protocol);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_START_TIME, formatQueryParameterDate(this.startTime));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_EXPIRY_TIME, formatQueryParameterDate(this.expiryTime));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_IP_RANGE, this.ipRange);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_IDENTIFIER, this.identifier);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_OBJECT_ID, this.keyOid);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_TENANT_ID, this.keyTid);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_KEY_START,
            formatQueryParameterDate(this.keyStart));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_KEY_EXPIRY,
            formatQueryParameterDate(this.keyExpiry));
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_KEY_SERVICE, this.keyService);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_KEY_VERSION, this.keyVersion);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_RESOURCE, this.resource);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNED_PERMISSIONS, this.permissions);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_SIGNATURE, this.signature);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CACHE_CONTROL, this.cacheControl);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_DISPOSITION, this.contentDisposition);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_ENCODING, this.contentEncoding);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_LANGUAGE, this.contentLanguage);
        tryAppendQueryParameter(sb, Constants.UrlConstants.SAS_CONTENT_TYPE, this.contentType);

        return sb.toString();
    }
}
