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

import java.util.HashMap;
import java.util.Map;

/**
 * IndyProofRequest
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class IndyProofRequest {
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    public static final String SERIALIZED_NAME_NON_REVOKED = "non_revoked";
    @SerializedName(SERIALIZED_NAME_NON_REVOKED)
    private IndyProofRequestNonRevoked nonRevoked;
    public static final String SERIALIZED_NAME_NONCE = "nonce";
    @SerializedName(SERIALIZED_NAME_NONCE)
    private String nonce;
    public static final String SERIALIZED_NAME_REQUESTED_ATTRIBUTES = "requested_attributes";
    @SerializedName(SERIALIZED_NAME_REQUESTED_ATTRIBUTES)
    private Map<String, IndyProofReqAttrSpec> requestedAttributes = new HashMap<>();
    public static final String SERIALIZED_NAME_REQUESTED_PREDICATES = "requested_predicates";
    @SerializedName(SERIALIZED_NAME_REQUESTED_PREDICATES)
    private Map<String, IndyProofReqPredSpec> requestedPredicates = new HashMap<>();
    public static final String SERIALIZED_NAME_VERSION = "version";
    @SerializedName(SERIALIZED_NAME_VERSION)
    private String version;
}
