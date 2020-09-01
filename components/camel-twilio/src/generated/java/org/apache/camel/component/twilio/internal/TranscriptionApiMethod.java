
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.twilio.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.twilio.rest.api.v2010.account.Transcription;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.twilio.rest.api.v2010.account.Transcription
 */
public enum TranscriptionApiMethod implements ApiMethod {

    DELETER(
        com.twilio.rest.api.v2010.account.TranscriptionDeleter.class,
        "deleter",
        arg("pathSid", String.class)),

    DELETER_1(
        com.twilio.rest.api.v2010.account.TranscriptionDeleter.class,
        "deleter",
        arg("pathAccountSid", String.class),
        arg("pathSid", String.class)),

    FETCHER(
        com.twilio.rest.api.v2010.account.TranscriptionFetcher.class,
        "fetcher",
        arg("pathSid", String.class)),

    FETCHER_1(
        com.twilio.rest.api.v2010.account.TranscriptionFetcher.class,
        "fetcher",
        arg("pathAccountSid", String.class),
        arg("pathSid", String.class)),

    READER(
        com.twilio.rest.api.v2010.account.TranscriptionReader.class,
        "reader"),

    READER_1(
        com.twilio.rest.api.v2010.account.TranscriptionReader.class,
        "reader",
        arg("pathAccountSid", String.class));

    private static final TranscriptionApiMethod[] CACHED_ENUM_VALUES = values();

    private final ApiMethod apiMethod;

    private TranscriptionApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(Transcription.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public String toString() { return apiMethod.getName(); }

    public static TranscriptionApiMethod fromValue(String value) throws IllegalArgumentException {
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
