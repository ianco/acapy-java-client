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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * DIDEndpointWithType
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class DIDEndpointWithType {
    public static final String SERIALIZED_NAME_DID = "did";
    @SerializedName(SERIALIZED_NAME_DID)
    private String did;
    public static final String SERIALIZED_NAME_ENDPOINT = "endpoint";
    @SerializedName(SERIALIZED_NAME_ENDPOINT)
    private String endpoint;

    /**
     * Endpoint type to set (default &#39;Endpoint&#39;); affects only public or posted DIDs
     */
    @JsonAdapter(EndpointTypeEnum.Adapter.class)
    public enum EndpointTypeEnum {
        ENDPOINT("Endpoint"),

        PROFILE("Profile"),

        LINKEDDOMAINS("LinkedDomains");

        private String value;

        EndpointTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static EndpointTypeEnum fromValue(String value) {
            for (EndpointTypeEnum b : EndpointTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<EndpointTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final EndpointTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public EndpointTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return EndpointTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ENDPOINT_TYPE = "endpoint_type";
    @SerializedName(SERIALIZED_NAME_ENDPOINT_TYPE)
    private EndpointTypeEnum endpointType;
}
