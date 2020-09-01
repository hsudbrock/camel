
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.braintree.internal;

import java.lang.reflect.Method;
import java.util.List;

import com.braintreegateway.CustomerGateway;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for com.braintreegateway.CustomerGateway
 */
public enum CustomerGatewayApiMethod implements ApiMethod {

    ALL(
        com.braintreegateway.ResourceCollection.class,
        "all"),

    CREATE(
        com.braintreegateway.Result.class,
        "create",
        arg("request", com.braintreegateway.CustomerRequest.class)),

    DELETE(
        com.braintreegateway.Result.class,
        "delete",
        arg("id", String.class)),

    FIND(
        com.braintreegateway.Customer.class,
        "find",
        arg("id", String.class)),

    FIND_1(
        com.braintreegateway.Customer.class,
        "find",
        arg("id", String.class),
        arg("associationFilterId", String.class)),

    SEARCH(
        com.braintreegateway.ResourceCollection.class,
        "search",
        arg("query", com.braintreegateway.CustomerSearchRequest.class)),

    UPDATE(
        com.braintreegateway.Result.class,
        "update",
        arg("id", String.class),
        arg("request", com.braintreegateway.CustomerRequest.class));

    private static final CustomerGatewayApiMethod[] CACHED_ENUM_VALUES = values();

    private final ApiMethod apiMethod;

    private CustomerGatewayApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(CustomerGateway.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public String toString() { return apiMethod.getName(); }

    public static CustomerGatewayApiMethod fromValue(String value) throws IllegalArgumentException {
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
