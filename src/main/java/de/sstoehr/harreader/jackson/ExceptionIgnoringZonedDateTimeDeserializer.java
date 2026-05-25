package de.sstoehr.harreader.jackson;

import tools.jackson.core.JacksonException;
import tools.jackson.core.JsonParser;
import tools.jackson.databind.DeserializationContext;
import tools.jackson.databind.ValueDeserializer;
import tools.jackson.databind.ext.javatime.deser.InstantDeserializer;
import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ExceptionIgnoringZonedDateTimeDeserializer extends ValueDeserializer<ZonedDateTime> {

    @Override
    public ZonedDateTime deserialize(JsonParser jp, DeserializationContext ctxt) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
