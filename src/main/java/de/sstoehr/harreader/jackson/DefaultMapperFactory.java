package de.sstoehr.harreader.jackson;

import de.sstoehr.harreader.HarReaderMode;
import tools.jackson.databind.ObjectMapper;
import tools.jackson.databind.json.JsonMapper;
import tools.jackson.databind.module.SimpleModule;
import java.time.ZonedDateTime;
import static tools.jackson.databind.DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES;
import static tools.jackson.databind.cfg.DateTimeFeature.ADJUST_DATES_TO_CONTEXT_TIME_ZONE;

public class DefaultMapperFactory implements MapperFactory {

    public ObjectMapper instance(HarReaderMode mode) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public ObjectMapper instance() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private JsonMapper.Builder builder() {
        return JsonMapper.builder().configure(ADJUST_DATES_TO_CONTEXT_TIME_ZONE, false).configure(FAIL_ON_NULL_FOR_PRIMITIVES, false);
    }
}
