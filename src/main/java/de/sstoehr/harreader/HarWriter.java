package de.sstoehr.harreader;

import de.sstoehr.harreader.jackson.MapperFactory;
import de.sstoehr.harreader.model.Har;
import tools.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.OutputStream;
import java.io.Writer;

public final class HarWriter extends AbstractHarIO {

    public HarWriter() {
        super();
    }

    public HarWriter(MapperFactory mapperFactory) {
        super(mapperFactory);
    }

    /**
     * Serialize HAR as a string. It's functionally equivalent to calling {@link #writeTo(Writer, Har)} with
     * {@link java.io.StringWriter} and constructing String, but more efficient.
     * @return Serialized HAR as a string
     * @throws HarWriterException if a low-level I/O problem occurs
     */
    public String writeAsString(Har har) throws HarWriterException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Serialize HAR as a byte array. It's functionally equivalent to calling {@link #writeTo(OutputStream, Har)} with
     * {@link java.io.ByteArrayOutputStream} and getting bytes, but more efficient. Encoding used will be UTF-8.
     * @return Serialized HAR as a byte array
     * @throws HarWriterException if a low-level I/O problem occurs
     */
    public byte[] writeAsBytes(Har har) throws HarWriterException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void writeTo(Writer writer, Har har) throws HarWriterException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void writeTo(OutputStream os, Har har) throws HarWriterException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public void writeTo(File file, Har har) throws HarWriterException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private <T> T wrap(IOFunction<ObjectMapper, T> consumer) throws HarWriterException {
        return wrap(getMapperFactory().instance(), consumer, HarWriterException::new);
    }
}
