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

import java.util.ArrayList;
import java.util.List;

/**
 * V20CredProposal
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class V20CredProposal {
    public static final String SERIALIZED_NAME_AT_ID = "@id";
    @SerializedName(SERIALIZED_NAME_AT_ID)
    private String atId;
    public static final String SERIALIZED_NAME_AT_TYPE = "@type";
    @SerializedName(SERIALIZED_NAME_AT_TYPE)
    private String atType;
    public static final String SERIALIZED_NAME_COMMENT = "comment";
    @SerializedName(SERIALIZED_NAME_COMMENT)
    private String comment;
    public static final String SERIALIZED_NAME_CREDENTIAL_PREVIEW = "credential_preview";
    @SerializedName(SERIALIZED_NAME_CREDENTIAL_PREVIEW)
    private V20CredPreview credentialPreview;
    public static final String SERIALIZED_NAME_FILTERS_TILDE_ATTACH = "filters~attach";
    @SerializedName(SERIALIZED_NAME_FILTERS_TILDE_ATTACH)
    private List<AttachDecorator> filtersTildeAttach = new ArrayList<>();
    public static final String SERIALIZED_NAME_FORMATS = "formats";
    @SerializedName(SERIALIZED_NAME_FORMATS)
    private List<V20CredFormat> formats = new ArrayList<>();
}
