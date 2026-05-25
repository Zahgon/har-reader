package de.sstoehr.harreader;

import de.sstoehr.harreader.jackson.MapperFactory;
import de.sstoehr.harreader.model.Har;
import tools.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.InputStream;

public class HarReader extends AbstractHarIO {

    private static final HarReaderMode DEFAULT_READER_MODE = HarReaderMode.STRICT;

    public HarReader() {
        super();
    }

    public HarReader(MapperFactory mapperFactory) {
        super(mapperFactory);
    }

    public Har readFromFile(File har) throws HarReaderException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Har readFromFile(File har, HarReaderMode mode) throws HarReaderException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Deserialize HAR from the given {@link InputStream}. {@link InputStream} is closed after reading.
     *
     * @param harInputStream {@link InputStream} to read HAR from.
     * @return HAR deserialized from {@link InputStream}
     * @throws HarReaderException if a low-level I/O problem occurs
     */
    public Har readFromInputStream(InputStream harInputStream) throws HarReaderException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Deserialize HAR from the given {@link InputStream}. {@link InputStream} is closed after reading.
     *
     * @param harInputStream {@link InputStream} to read HAR from.
     * @param mode           Reading mode
     * @return HAR deserialized from {@link InputStream}
     * @throws HarReaderException if a low-level I/O problem occurs
     */
    public Har readFromInputStream(InputStream harInputStream, HarReaderMode mode) throws HarReaderException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Har readFromString(String har) throws HarReaderException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public Har readFromString(String har, HarReaderMode mode) throws HarReaderException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Deserialize HAR from the given byte array.
     *
     * @param bytes Byte array to deserialize HAR from
     * @return HAR deserialized from byte array
     * @throws HarReaderException if a low-level I/O problem occurs
     */
    public Har readFromBytes(byte[] bytes) throws HarReaderException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Deserialize HAR from the given byte array.
     *
     * @param bytes Byte array to deserialize HAR from
     * @param mode  Reading mode
     * @return HAR deserialized from byte array
     * @throws HarReaderException if a low-level I/O problem occurs
     */
    public Har readFromBytes(byte[] bytes, HarReaderMode mode) throws HarReaderException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    private <T> T wrap(HarReaderMode mode, IOFunction<ObjectMapper, T> consumer) throws HarReaderException {
        return wrap(getMapperFactory().instance(mode), consumer, HarReaderException::new);
    }
}
