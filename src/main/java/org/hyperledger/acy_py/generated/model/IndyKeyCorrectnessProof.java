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
 * IndyKeyCorrectnessProof
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class IndyKeyCorrectnessProof {
    public static final String SERIALIZED_NAME_C = "c";
    @SerializedName(SERIALIZED_NAME_C)
    private String c;
    public static final String SERIALIZED_NAME_XR_CAP = "xr_cap";
    @SerializedName(SERIALIZED_NAME_XR_CAP)
    private List<List<String>> xrCap = new ArrayList<>();
    public static final String SERIALIZED_NAME_XZ_CAP = "xz_cap";
    @SerializedName(SERIALIZED_NAME_XZ_CAP)
    private String xzCap;
}
