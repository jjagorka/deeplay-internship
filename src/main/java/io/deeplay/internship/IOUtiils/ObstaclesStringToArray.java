package io.deeplay.internship.IOUtiils;

import io.deeplay.internship.data.Creature;
import io.deeplay.internship.parser.InformationFileParser;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ObstaclesStringToArray {
    public static List<Integer> listObstacles(String inputObstacles, String inputCreature, String informationFilePath) throws IOException {

        List<Integer> listObstacles = new ArrayList<>();
        Creature ourCreature = null;
        List<Creature> creatures;

        try (InputStream is = new FileInputStream(informationFilePath)) {
            creatures = InformationFileParser.parse(is);
        }

        for (Creature creature : creatures) {
            if (creature.creatureRace().equals(inputCreature)) {
                ourCreature = creature;
            }
        }

        if (ourCreature == null) {
            throw new IOException("Wrong Json file");
        }

        for (int i = 0; i < inputObstacles.length(); i++) {
            Integer value = ourCreature.obstacleCost().get(inputObstacles.charAt(i));
            if (value == null) {
                throw new IOException("Wrong Json file");
            }
            listObstacles.add(value);
        }

        return listObstacles;
    }
}
