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
 * AttachDecorator
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class AttachDecorator {
    public static final String SERIALIZED_NAME_AT_ID = "@id";
    @SerializedName(SERIALIZED_NAME_AT_ID)
    private String atId;
    public static final String SERIALIZED_NAME_BYTE_COUNT = "byte_count";
    @SerializedName(SERIALIZED_NAME_BYTE_COUNT)
    private Integer byteCount;
    public static final String SERIALIZED_NAME_DATA = "data";
    @SerializedName(SERIALIZED_NAME_DATA)
    private AttachDecoratorData data;
    public static final String SERIALIZED_NAME_DESCRIPTION = "description";
    @SerializedName(SERIALIZED_NAME_DESCRIPTION)
    private String description;
    public static final String SERIALIZED_NAME_FILENAME = "filename";
    @SerializedName(SERIALIZED_NAME_FILENAME)
    private String filename;
    public static final String SERIALIZED_NAME_LASTMOD_TIME = "lastmod_time";
    @SerializedName(SERIALIZED_NAME_LASTMOD_TIME)
    private String lastmodTime;
    public static final String SERIALIZED_NAME_MIME_TYPE = "mime-type";
    @SerializedName(SERIALIZED_NAME_MIME_TYPE)
    private String mimeType;
}
