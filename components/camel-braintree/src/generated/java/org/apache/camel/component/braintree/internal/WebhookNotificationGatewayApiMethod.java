
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.braintreegateway.WebhookNotificationGateway;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.braintreegateway.WebhookNotificationGateway
 */
public enum WebhookNotificationGatewayApiMethod implements ApiMethod {

    PARSE(
        com.braintreegateway.WebhookNotification.class,
        "parse",
        arg("signature", String.class),
        arg("payload", String.class)),

    VERIFY(
        String.class,
        "verify",
        arg("challenge", String.class));

    private static final WebhookNotificationGatewayApiMethod[] CACHED_ENUM_VALUES = values();

    private final ApiMethod apiMethod;

    private WebhookNotificationGatewayApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(WebhookNotificationGateway.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public String toString() { return apiMethod.getName(); }

    public static WebhookNotificationGatewayApiMethod fromValue(String value) throws IllegalArgumentException {
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
