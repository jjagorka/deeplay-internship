package io.deeplay.internship.data;

import java.util.Map;

public record Creature(
        String creatureRace,
        Map<Character,Integer> obstacleCost
) {
}
