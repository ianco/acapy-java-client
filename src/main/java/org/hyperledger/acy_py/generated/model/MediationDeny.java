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

import java.util.List;

/**
 * MediationDeny
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class MediationDeny {
    public static final String SERIALIZED_NAME_AT_ID = "@id";
    @SerializedName(SERIALIZED_NAME_AT_ID)
    private String atId;
    public static final String SERIALIZED_NAME_AT_TYPE = "@type";
    @SerializedName(SERIALIZED_NAME_AT_TYPE)
    private String atType;
    public static final String SERIALIZED_NAME_MEDIATOR_TERMS = "mediator_terms";
    @SerializedName(SERIALIZED_NAME_MEDIATOR_TERMS)
    private List<String> mediatorTerms = null;
    public static final String SERIALIZED_NAME_RECIPIENT_TERMS = "recipient_terms";
    @SerializedName(SERIALIZED_NAME_RECIPIENT_TERMS)
    private List<String> recipientTerms = null;
}
