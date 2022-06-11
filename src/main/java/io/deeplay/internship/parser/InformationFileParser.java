package io.deeplay.internship.parser;

import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.deeplay.internship.data.Creature;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class  InformationFileParser {

    static List<Creature> creatureList = new ArrayList<>();

    public static List<Creature>  parse(InputStream is) throws IOException {
        var mapper = new ObjectMapper();
        var parser = mapper.getFactory().createParser(is);

        if (parser.nextToken() != JsonToken.START_ARRAY) {
            throw new IllegalStateException("");
        }

        while (parser.nextToken() != JsonToken.END_ARRAY) {
            creatureList.add(mapper.readValue(parser, Creature.class));
        }
        return creatureList;
    }
}
