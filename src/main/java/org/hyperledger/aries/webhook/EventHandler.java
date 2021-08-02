/*
 * Copyright (c) 2020-2021 - for information on the respective copyright owner
 * see the NOTICE file and/or the repository at
 * https://github.com/hyperledger-labs/acapy-java-client
 *
 * SPDX-License-Identifier: Apache-2.0
 */
package org.hyperledger.aries.webhook;

import org.hyperledger.aries.api.message.ProblemReport;
import org.hyperledger.aries.api.connection.ConnectionRecord;
import org.hyperledger.aries.api.issue_credential_v1.V1CredentialExchange;
import org.hyperledger.aries.api.message.BasicMessage;
import org.hyperledger.aries.api.message.PingEvent;
import org.hyperledger.aries.api.present_proof.PresentationExchangeRecord;

import lombok.extern.slf4j.Slf4j;
import org.hyperledger.aries.api.revocation.RevocationEvent;
import org.hyperledger.aries.api.endorser.EndorseTransactionEvent;

@Slf4j
public abstract class EventHandler {

    private final EventParser parser = new EventParser();

    public void handleEvent(String eventType, String json) {

        handleRaw(eventType, json);

        try {
            if ("connections".equals(eventType)) {
                parser.parseValueSave(json, ConnectionRecord.class).ifPresent(this::handleConnection);
            } else if ("present_proof".equals(eventType)) {
                parser.parsePresentProof(json).ifPresent(this::handleProof);
            } else if ("issue_credential".equals(eventType)) {
                parser.parseValueSave(json, V1CredentialExchange.class).ifPresent(this::handleCredential);
            } else if ("basicmessages".equals(eventType)) {
                parser.parseValueSave(json, BasicMessage.class).ifPresent(this::handleBasicMessage);
            } else if ("ping".equals(eventType)) {
                parser.parseValueSave(json, PingEvent.class).ifPresent(this::handlePing);
            } else if ("issuer_cred_rev".equals(eventType)) {
                parser.parseValueSave(json, RevocationEvent.class).ifPresent(this::handleRevocation);
            } else if ("endorse_transaction".equals(eventType)) {
                parser.parseValueSave(json, EndorseTransactionEvent.class).ifPresent(this::handleEndorseTransaction);
            } else if ("problem_report".equals(eventType)) {
                parser.parseValueSave(json, ProblemReport.class).ifPresent(this::handleProblemReport);
            }
        } catch (Exception e) {
            log.error("Error in webhook event handler:", e);
        }
    }

    public void handleConnection(ConnectionRecord connection) {
        log.debug("Connection Event: {}", connection);
    }

    public void handleProof(PresentationExchangeRecord proof) {
        log.debug("Present Proof Event: {}", proof);
    }

    public void handleCredential(V1CredentialExchange credential) {
        log.debug("Issue Credential Event: {}", credential);
    }

    public void handleBasicMessage(BasicMessage message) {
        log.debug("Basic Message: {}", message);
    }

    public void handlePing(PingEvent ping) {
        log.debug("Ping: {}", ping);
    }

    public void handleRevocation(RevocationEvent revocation) {
        log.debug("Revocation: {}", revocation);
    }

    public void handleEndorseTransaction(EndorseTransactionEvent transaction) {
        log.debug("Endorse Transaction: {}", transaction);
    }

    public void handleProblemReport(ProblemReport report) {
        log.debug("Problem Report: {}", report);
    }

    public void handleRaw(String eventType, String json) {
        if (log.isTraceEnabled()) {
            log.trace("Received event: {}, body:\n {}", eventType, parser.prettyJson(json));
        }
    }
}
