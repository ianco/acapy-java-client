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
 * DIFPresSpec
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class DIFPresSpec {
    public static final String SERIALIZED_NAME_ISSUER_ID = "issuer_id";
    @SerializedName(SERIALIZED_NAME_ISSUER_ID)
    private String issuerId;
    public static final String SERIALIZED_NAME_PRESENTATION_DEFINITION = "presentation_definition";
    @SerializedName(SERIALIZED_NAME_PRESENTATION_DEFINITION)
    private PresentationDefinition presentationDefinition;
    public static final String SERIALIZED_NAME_RECORD_IDS = "record_ids";
    @SerializedName(SERIALIZED_NAME_RECORD_IDS)
    private Object recordIds;
    public static final String SERIALIZED_NAME_REVEAL_DOC = "reveal_doc";
    @SerializedName(SERIALIZED_NAME_REVEAL_DOC)
    private Object revealDoc;
}
