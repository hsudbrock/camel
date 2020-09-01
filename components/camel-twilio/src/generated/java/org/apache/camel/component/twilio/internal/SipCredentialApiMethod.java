
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.twilio.rest.api.v2010.account.sip.credentiallist.Credential;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.twilio.rest.api.v2010.account.sip.credentiallist.Credential
 */
public enum SipCredentialApiMethod implements ApiMethod {

    CREATOR(
        com.twilio.rest.api.v2010.account.sip.credentiallist.CredentialCreator.class,
        "creator",
        arg("pathCredentialListSid", String.class),
        arg("username", String.class),
        arg("password", String.class)),

    CREATOR_1(
        com.twilio.rest.api.v2010.account.sip.credentiallist.CredentialCreator.class,
        "creator",
        arg("pathAccountSid", String.class),
        arg("pathCredentialListSid", String.class),
        arg("username", String.class),
        arg("password", String.class)),

    DELETER(
        com.twilio.rest.api.v2010.account.sip.credentiallist.CredentialDeleter.class,
        "deleter",
        arg("pathCredentialListSid", String.class),
        arg("pathSid", String.class)),

    DELETER_1(
        com.twilio.rest.api.v2010.account.sip.credentiallist.CredentialDeleter.class,
        "deleter",
        arg("pathAccountSid", String.class),
        arg("pathCredentialListSid", String.class),
        arg("pathSid", String.class)),

    FETCHER(
        com.twilio.rest.api.v2010.account.sip.credentiallist.CredentialFetcher.class,
        "fetcher",
        arg("pathCredentialListSid", String.class),
        arg("pathSid", String.class)),

    FETCHER_1(
        com.twilio.rest.api.v2010.account.sip.credentiallist.CredentialFetcher.class,
        "fetcher",
        arg("pathAccountSid", String.class),
        arg("pathCredentialListSid", String.class),
        arg("pathSid", String.class)),

    READER(
        com.twilio.rest.api.v2010.account.sip.credentiallist.CredentialReader.class,
        "reader",
        arg("pathCredentialListSid", String.class)),

    READER_1(
        com.twilio.rest.api.v2010.account.sip.credentiallist.CredentialReader.class,
        "reader",
        arg("pathAccountSid", String.class),
        arg("pathCredentialListSid", String.class)),

    UPDATER(
        com.twilio.rest.api.v2010.account.sip.credentiallist.CredentialUpdater.class,
        "updater",
        arg("pathCredentialListSid", String.class),
        arg("pathSid", String.class)),

    UPDATER_1(
        com.twilio.rest.api.v2010.account.sip.credentiallist.CredentialUpdater.class,
        "updater",
        arg("pathAccountSid", String.class),
        arg("pathCredentialListSid", String.class),
        arg("pathSid", String.class));

    private static final SipCredentialApiMethod[] CACHED_ENUM_VALUES = values();

    private final ApiMethod apiMethod;

    private SipCredentialApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Credential.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public String toString() { return apiMethod.getName(); }

    public static SipCredentialApiMethod fromValue(String value) throws IllegalArgumentException {
        for (int i = 0; i < CACHED_ENUM_VALUES.length; i++) {
            if (CACHED_ENUM_VALUES[i].getName().equalsIgnoreCase(value)) {
                return CACHED_ENUM_VALUES[i];
            }
        }
        throw new IllegalArgumentException("Invalid value " + value);
    }

    @Override
    public Class<?> getResultType() { return apiMethod.getResultType(); }

    @Override
    public List<String> getArgNames() { return apiMethod.getArgNames(); }

    @Override
    public List<Class<?>> getArgTypes() { return apiMethod.getArgTypes(); }

    @Override
    public Method getMethod() { return apiMethod.getMethod(); }
}
