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
 * SchemaSendRequest
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class SchemaSendRequest {
    public static final String SERIALIZED_NAME_ATTRIBUTES = "attributes";
    @SerializedName(SERIALIZED_NAME_ATTRIBUTES)
    private List<String> attributes = new ArrayList<>();
    public static final String SERIALIZED_NAME_SCHEMA_NAME = "schema_name";
    @SerializedName(SERIALIZED_NAME_SCHEMA_NAME)
    private String schemaName;
    public static final String SERIALIZED_NAME_SCHEMA_VERSION = "schema_version";
    @SerializedName(SERIALIZED_NAME_SCHEMA_VERSION)
    private String schemaVersion;
}
