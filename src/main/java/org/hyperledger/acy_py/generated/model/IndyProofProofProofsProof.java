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
 * IndyProofProofProofsProof
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class IndyProofProofProofsProof {
    public static final String SERIALIZED_NAME_NON_REVOC_PROOF = "non_revoc_proof";
    @SerializedName(SERIALIZED_NAME_NON_REVOC_PROOF)
    private IndyNonRevocProof nonRevocProof;
    public static final String SERIALIZED_NAME_PRIMARY_PROOF = "primary_proof";
    @SerializedName(SERIALIZED_NAME_PRIMARY_PROOF)
    private IndyPrimaryProof primaryProof;
}
