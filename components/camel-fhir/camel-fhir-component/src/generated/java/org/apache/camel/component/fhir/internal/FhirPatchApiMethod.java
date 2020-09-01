
/*
 * Camel ApiMethod Enumeration generated by camel-api-component-maven-plugin
 */
package org.apache.camel.component.fhir.internal;

import java.lang.reflect.Method;
import java.util.List;

import org.apache.camel.component.fhir.api.FhirPatch;

import org.apache.camel.support.component.ApiMethod;
import org.apache.camel.support.component.ApiMethodArg;
import org.apache.camel.support.component.ApiMethodImpl;

import static org.apache.camel.support.component.ApiMethodArg.arg;

/**
 * Camel {@link ApiMethod} Enumeration for org.apache.camel.component.fhir.api.FhirPatch
 */
public enum FhirPatchApiMethod implements ApiMethod {

    PATCHBYID(
        ca.uhn.fhir.rest.api.MethodOutcome.class,
        "patchById",
        arg("patchBody", String.class),
        arg("id", org.hl7.fhir.instance.model.api.IIdType.class),
        arg("preferReturn", ca.uhn.fhir.rest.api.PreferReturnEnum.class),
        arg("extraParameters", java.util.Map.class)),

    PATCHBYID_1(
        ca.uhn.fhir.rest.api.MethodOutcome.class,
        "patchById",
        arg("patchBody", String.class),
        arg("stringId", String.class),
        arg("preferReturn", ca.uhn.fhir.rest.api.PreferReturnEnum.class),
        arg("extraParameters", java.util.Map.class)),

    PATCHBYURL(
        ca.uhn.fhir.rest.api.MethodOutcome.class,
        "patchByUrl",
        arg("patchBody", String.class),
        arg("url", String.class),
        arg("preferReturn", ca.uhn.fhir.rest.api.PreferReturnEnum.class),
        arg("extraParameters", java.util.Map.class));

    private static final FhirPatchApiMethod[] CACHED_ENUM_VALUES = values();

    private final ApiMethod apiMethod;

    private FhirPatchApiMethod(Class<?> resultType, String name, ApiMethodArg... args) {
        this.apiMethod = new ApiMethodImpl(FhirPatch.class, resultType, name, args);
    }

    @Override
    public String getName() { return apiMethod.getName(); }

    @Override
    public String toString() { return apiMethod.getName(); }

    public static FhirPatchApiMethod fromValue(String value) throws IllegalArgumentException {
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
