package de.sstoehr.harreader.model;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;

public enum HttpMethod {

    GET,
    POST,
    PUT,
    HEAD,
    PROPFIND,
    OPTIONS,
    REPORT,
    DELETE,
    CONNECT,
    TRACE,
    CCM_POST,
    PATCH,
    UNKNOWN;

    @Nonnull
    public static HttpMethod fromString(@Nullable String method) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
