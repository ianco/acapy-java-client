/*
 * Copyright (c) 2020-2021 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/hyperledger-labs/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.aries.api.issue_credential_v2;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hyperledger.acy_py.generated.model.AttachDecorator;
import org.hyperledger.acy_py.generated.model.V20CredFormat;
import org.hyperledger.aries.api.credentials.CredentialPreview;

import java.util.ArrayList;
import java.util.List;

/**
 * V20CredProposal
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class V20CredProposal {
    @SerializedName("@id")
    private String id;

    @SerializedName("@type")
    private String type;

    private String comment;

    private CredentialPreview credentialPreview;

    @SerializedName("filters~attach")
    private List<AttachDecorator> filtersAttach = new ArrayList<>();

    private List<V20CredFormat> formats = new ArrayList<>();
}
