/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.2
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.hyperledger.acy_py.generated.model;

import com.google.gson.annotations.SerializedName;

/**
 * CredentialDefinitionSendRequest
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class CredentialDefinitionSendRequest {
    public static final String SERIALIZED_NAME_REVOCATION_REGISTRY_SIZE = "revocation_registry_size";
    @SerializedName(SERIALIZED_NAME_REVOCATION_REGISTRY_SIZE)
    private Integer revocationRegistrySize;
    public static final String SERIALIZED_NAME_SCHEMA_ID = "schema_id";
    @SerializedName(SERIALIZED_NAME_SCHEMA_ID)
    private String schemaId;
    public static final String SERIALIZED_NAME_SUPPORT_REVOCATION = "support_revocation";
    @SerializedName(SERIALIZED_NAME_SUPPORT_REVOCATION)
    private Boolean supportRevocation;
    public static final String SERIALIZED_NAME_TAG = "tag";
    @SerializedName(SERIALIZED_NAME_TAG)
    private String tag;
}
