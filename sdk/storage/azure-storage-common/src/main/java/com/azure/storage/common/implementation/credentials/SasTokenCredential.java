// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.storage.common.implementation.credentials;

import com.azure.core.implementation.util.ImplUtils;

import java.util.Map;

/**
 * Holds a SAS token used for authenticating requests.
 */
public final class SasTokenCredential {
    private static final String SIGNATURE = "sig";

    private final String sasToken;

    /**
     * Creates a SAS token credential from the passed SAS token.
     *
     * @param sasToken SAS token used to authenticate requests with the service.
     */
    private SasTokenCredential(String sasToken) {
        this.sasToken = sasToken;
    }

    /**
     * @return the SAS token
     */
    public String getSasToken() {
        return sasToken;
    }

    /**
     * Creates a SAS token credential from the passed SAS token.
     *
     * <p>This method expects a pre-formatted SAS token. Each service offers helper classes to make it easier to
     * generate the SAS token.</p>
     *
     * @param sasToken SAS token
     * @return a SAS token credential if {@code sasToken} is not {@code null} or empty, otherwise null.
     */
    public static SasTokenCredential fromSasTokenString(String sasToken) {
        if (ImplUtils.isNullOrEmpty(sasToken)) {
            return null;
        }

        if (sasToken.charAt(0) == '?') {
            sasToken = sasToken.substring(1);
        }

        return new SasTokenCredential(sasToken);
    }

    /**
     * Creates a SAS token credential from the passed query string parameters.
     *
     * <p>The entries in the passed map will be combined into a query string that is used as the SAS token.</p>
     *
     * <p><strong>Code Samples</strong></p>
     *
     * {@codesnippet com.azure.storage.common.credentials.SASTokenCredential.fromQueryParameters#Map}
     *
     * @param queryParameters URL query parameters
     * @return a SAS token credential if {@code queryParameters} is not {@code null} and has
     * the signature ("sig") query parameter, otherwise returns {@code null}.
     */
    public static SasTokenCredential fromQueryParameters(Map<String, String> queryParameters) {
        if (ImplUtils.isNullOrEmpty(queryParameters) || !queryParameters.containsKey(SIGNATURE)) {
            return null;
        }

        StringBuilder sb = new StringBuilder();
        for (Map.Entry<String, String> kvp : queryParameters.entrySet()) {
            if (sb.length() != 0) {
                sb.append("&");
            }

            sb.append(kvp.getKey()).append("=").append(kvp.getValue());
        }

        return new SasTokenCredential(sb.toString());
    }
}
