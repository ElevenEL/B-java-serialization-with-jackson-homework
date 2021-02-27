package com.thoughtworks.capability.gtb;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;

import java.io.IOException;
import java.util.Objects;

public class NullsToZeroSerializer extends StdSerializer<Integer> {


    protected NullsToZeroSerializer() {
        super(Integer.class);
    }

    @Override
    public void serialize(Integer value, JsonGenerator gen, SerializerProvider provider) throws IOException {
        if (Objects.isNull(value)) {
            gen.writeNumber(0);
        } else {
            gen.writeNumber(value);
        }
    }
}
