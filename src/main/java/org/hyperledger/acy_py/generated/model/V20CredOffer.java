/*
 * aca-py client
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0.7.3
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
 * V20CredOffer
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class V20CredOffer {
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
    public static final String SERIALIZED_NAME_FORMATS = "formats";
    @SerializedName(SERIALIZED_NAME_FORMATS)
    private List<V20CredFormat> formats = new ArrayList<>();
    public static final String SERIALIZED_NAME_OFFERS_TILDE_ATTACH = "offers~attach";
    @SerializedName(SERIALIZED_NAME_OFFERS_TILDE_ATTACH)
    private List<AttachDecorator> offersTildeAttach = new ArrayList<>();
    public static final String SERIALIZED_NAME_REPLACEMENT_ID = "replacement_id";
    @SerializedName(SERIALIZED_NAME_REPLACEMENT_ID)
    private String replacementId;
}
