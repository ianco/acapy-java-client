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
import java.util.List;

/**
 * IssuerRevRegRecord
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class IssuerRevRegRecord {
    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;
    public static final String SERIALIZED_NAME_CRED_DEF_ID = "cred_def_id";
    @SerializedName(SERIALIZED_NAME_CRED_DEF_ID)
    private String credDefId;
    public static final String SERIALIZED_NAME_ERROR_MSG = "error_msg";
    @SerializedName(SERIALIZED_NAME_ERROR_MSG)
    private String errorMsg;
    public static final String SERIALIZED_NAME_ISSUER_DID = "issuer_did";
    @SerializedName(SERIALIZED_NAME_ISSUER_DID)
    private String issuerDid;
    public static final String SERIALIZED_NAME_MAX_CRED_NUM = "max_cred_num";
    @SerializedName(SERIALIZED_NAME_MAX_CRED_NUM)
    private Integer maxCredNum;
    public static final String SERIALIZED_NAME_PENDING_PUB = "pending_pub";
    @SerializedName(SERIALIZED_NAME_PENDING_PUB)
    private List<String> pendingPub = null;
    public static final String SERIALIZED_NAME_RECORD_ID = "record_id";
    @SerializedName(SERIALIZED_NAME_RECORD_ID)
    private String recordId;

    /**
     * Revocation registry type (specify CL_ACCUM)
     */
    @JsonAdapter(RevocDefTypeEnum.Adapter.class)
    public enum RevocDefTypeEnum {
        CL_ACCUM("CL_ACCUM");

        private String value;

        RevocDefTypeEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RevocDefTypeEnum fromValue(String value) {
            for (RevocDefTypeEnum b : RevocDefTypeEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<RevocDefTypeEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RevocDefTypeEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RevocDefTypeEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RevocDefTypeEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_REVOC_DEF_TYPE = "revoc_def_type";
    @SerializedName(SERIALIZED_NAME_REVOC_DEF_TYPE)
    private RevocDefTypeEnum revocDefType;
    public static final String SERIALIZED_NAME_REVOC_REG_DEF = "revoc_reg_def";
    @SerializedName(SERIALIZED_NAME_REVOC_REG_DEF)
    private IndyRevRegDef revocRegDef;
    public static final String SERIALIZED_NAME_REVOC_REG_ENTRY = "revoc_reg_entry";
    @SerializedName(SERIALIZED_NAME_REVOC_REG_ENTRY)
    private IndyRevRegEntry revocRegEntry;
    public static final String SERIALIZED_NAME_REVOC_REG_ID = "revoc_reg_id";
    @SerializedName(SERIALIZED_NAME_REVOC_REG_ID)
    private String revocRegId;
    public static final String SERIALIZED_NAME_STATE = "state";
    @SerializedName(SERIALIZED_NAME_STATE)
    private String state;
    public static final String SERIALIZED_NAME_TAG = "tag";
    @SerializedName(SERIALIZED_NAME_TAG)
    private String tag;
    public static final String SERIALIZED_NAME_TAILS_HASH = "tails_hash";
    @SerializedName(SERIALIZED_NAME_TAILS_HASH)
    private String tailsHash;
    public static final String SERIALIZED_NAME_TAILS_LOCAL_PATH = "tails_local_path";
    @SerializedName(SERIALIZED_NAME_TAILS_LOCAL_PATH)
    private String tailsLocalPath;
    public static final String SERIALIZED_NAME_TAILS_PUBLIC_URI = "tails_public_uri";
    @SerializedName(SERIALIZED_NAME_TAILS_PUBLIC_URI)
    private String tailsPublicUri;
    public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;
}
