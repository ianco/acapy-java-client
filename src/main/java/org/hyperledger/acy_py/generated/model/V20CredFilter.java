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
 * V20CredFilter
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class V20CredFilter {
    public static final String SERIALIZED_NAME_INDY = "indy";
    @SerializedName(SERIALIZED_NAME_INDY)
    private V20CredFilterIndy indy;
    public static final String SERIALIZED_NAME_LD_PROOF = "ld_proof";
    @SerializedName(SERIALIZED_NAME_LD_PROOF)
    private LDProofVCDetail ldProof;
}
