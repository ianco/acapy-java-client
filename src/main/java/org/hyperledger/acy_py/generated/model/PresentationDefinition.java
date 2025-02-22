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
 * PresentationDefinition
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class PresentationDefinition {
    public static final String SERIALIZED_NAME_FORMAT = "format";
    @SerializedName(SERIALIZED_NAME_FORMAT)
    private ClaimFormat format;
    public static final String SERIALIZED_NAME_ID = "id";
    @SerializedName(SERIALIZED_NAME_ID)
    private String id;
    public static final String SERIALIZED_NAME_INPUT_DESCRIPTORS = "input_descriptors";
    @SerializedName(SERIALIZED_NAME_INPUT_DESCRIPTORS)
    private List<InputDescriptors> inputDescriptors = null;
    public static final String SERIALIZED_NAME_NAME = "name";
    @SerializedName(SERIALIZED_NAME_NAME)
    private String name;
    public static final String SERIALIZED_NAME_PURPOSE = "purpose";
    @SerializedName(SERIALIZED_NAME_PURPOSE)
    private String purpose;
    public static final String SERIALIZED_NAME_SUBMISSION_REQUIREMENTS = "submission_requirements";
    @SerializedName(SERIALIZED_NAME_SUBMISSION_REQUIREMENTS)
    private List<SubmissionRequirements> submissionRequirements = null;
}
