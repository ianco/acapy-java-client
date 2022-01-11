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
 * V20CredExRecord
 */

@lombok.Data
@lombok.AllArgsConstructor
@lombok.NoArgsConstructor
@lombok.Builder
public class V20CredExRecord {
    public static final String SERIALIZED_NAME_AUTO_ISSUE = "auto_issue";
    @SerializedName(SERIALIZED_NAME_AUTO_ISSUE)
    private Boolean autoIssue;
    public static final String SERIALIZED_NAME_AUTO_OFFER = "auto_offer";
    @SerializedName(SERIALIZED_NAME_AUTO_OFFER)
    private Boolean autoOffer;
    public static final String SERIALIZED_NAME_AUTO_REMOVE = "auto_remove";
    @SerializedName(SERIALIZED_NAME_AUTO_REMOVE)
    private Boolean autoRemove;
    public static final String SERIALIZED_NAME_BY_FORMAT = "by_format";
    @SerializedName(SERIALIZED_NAME_BY_FORMAT)
    private V20CredExRecordByFormat byFormat;
    public static final String SERIALIZED_NAME_CONNECTION_ID = "connection_id";
    @SerializedName(SERIALIZED_NAME_CONNECTION_ID)
    private String connectionId;
    public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
    @SerializedName(SERIALIZED_NAME_CREATED_AT)
    private String createdAt;
    public static final String SERIALIZED_NAME_CRED_EX_ID = "cred_ex_id";
    @SerializedName(SERIALIZED_NAME_CRED_EX_ID)
    private String credExId;
    public static final String SERIALIZED_NAME_CRED_ISSUE = "cred_issue";
    @SerializedName(SERIALIZED_NAME_CRED_ISSUE)
    private V20CredIssue credIssue;
    public static final String SERIALIZED_NAME_CRED_OFFER = "cred_offer";
    @SerializedName(SERIALIZED_NAME_CRED_OFFER)
    private V20CredOffer credOffer;
    public static final String SERIALIZED_NAME_CRED_PREVIEW = "cred_preview";
    @SerializedName(SERIALIZED_NAME_CRED_PREVIEW)
    private V20CredPreview credPreview;
    public static final String SERIALIZED_NAME_CRED_PROPOSAL = "cred_proposal";
    @SerializedName(SERIALIZED_NAME_CRED_PROPOSAL)
    private V20CredProposal credProposal;
    public static final String SERIALIZED_NAME_CRED_REQUEST = "cred_request";
    @SerializedName(SERIALIZED_NAME_CRED_REQUEST)
    private V20CredRequest credRequest;
    public static final String SERIALIZED_NAME_ERROR_MSG = "error_msg";
    @SerializedName(SERIALIZED_NAME_ERROR_MSG)
    private String errorMsg;

    /**
     * Issue-credential exchange initiator: self or external
     */
    @JsonAdapter(InitiatorEnum.Adapter.class)
    public enum InitiatorEnum {
        SELF("self"),

        EXTERNAL("external");

        private String value;

        InitiatorEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static InitiatorEnum fromValue(String value) {
            for (InitiatorEnum b : InitiatorEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<InitiatorEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final InitiatorEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public InitiatorEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return InitiatorEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_INITIATOR = "initiator";
    @SerializedName(SERIALIZED_NAME_INITIATOR)
    private InitiatorEnum initiator;
    public static final String SERIALIZED_NAME_PARENT_THREAD_ID = "parent_thread_id";
    @SerializedName(SERIALIZED_NAME_PARENT_THREAD_ID)
    private String parentThreadId;

    /**
     * Issue-credential exchange role: holder or issuer
     */
    @JsonAdapter(RoleEnum.Adapter.class)
    public enum RoleEnum {
        ISSUER("issuer"),

        HOLDER("holder");

        private String value;

        RoleEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static RoleEnum fromValue(String value) {
            for (RoleEnum b : RoleEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<RoleEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final RoleEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public RoleEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return RoleEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_ROLE = "role";
    @SerializedName(SERIALIZED_NAME_ROLE)
    private RoleEnum role;

    /**
     * Issue-credential exchange state
     */
    @JsonAdapter(StateEnum.Adapter.class)
    public enum StateEnum {
        PROPOSAL_SENT("proposal-sent"),

        PROPOSAL_RECEIVED("proposal-received"),

        OFFER_SENT("offer-sent"),

        OFFER_RECEIVED("offer-received"),

        REQUEST_SENT("request-sent"),

        REQUEST_RECEIVED("request-received"),

        CREDENTIAL_ISSUED("credential-issued"),

        CREDENTIAL_RECEIVED("credential-received"),

        DONE("done"),

        CREDENTIAL_REVOKED("credential-revoked");

        private String value;

        StateEnum(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        public static StateEnum fromValue(String value) {
            for (StateEnum b : StateEnum.values()) {
                if (b.value.equals(value)) {
                    return b;
                }
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        public static class Adapter extends TypeAdapter<StateEnum> {
            @Override
            public void write(final JsonWriter jsonWriter, final StateEnum enumeration) throws IOException {
                jsonWriter.value(enumeration.getValue());
            }

            @Override
            public StateEnum read(final JsonReader jsonReader) throws IOException {
                String value = jsonReader.nextString();
                return StateEnum.fromValue(value);
            }
        }
    }

    public static final String SERIALIZED_NAME_STATE = "state";
    @SerializedName(SERIALIZED_NAME_STATE)
    private StateEnum state;
    public static final String SERIALIZED_NAME_THREAD_ID = "thread_id";
    @SerializedName(SERIALIZED_NAME_THREAD_ID)
    private String threadId;
    public static final String SERIALIZED_NAME_TRACE = "trace";
    @SerializedName(SERIALIZED_NAME_TRACE)
    private Boolean trace;
    public static final String SERIALIZED_NAME_UPDATED_AT = "updated_at";
    @SerializedName(SERIALIZED_NAME_UPDATED_AT)
    private String updatedAt;
}
