package io.deeplay.internship.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void testGetResultForHuman1() throws Exception {
        assertEquals(10, Solution.getResult("STWSWTPPTPTTPWPP","Human"));
    }

    @Test
    void testGetResultForHuman2() throws Exception {
        assertEquals(13, Solution.getResult("TWSTSWTTSPTPPWPS","Human"));
    }

    @Test
    void testGetResultForHuman3() throws Exception {
        assertEquals(11, Solution.getResult("PSPTWTSTPSSSWTPW","Human"));
    }

    @Test
    void testGetResultForHuman4() throws Exception {
        assertEquals(12, Solution.getResult("WWWWWWWWWWWWWWWW","Human"));
    }

    @Test
    void testGetResultForHuman5() throws Exception {
        assertEquals(9, Solution.getResult("WPPSSPTPTSPWSTSP","Human"));
    }

    @Test
    void testGetResultForSwamper1() throws Exception {
        assertEquals(15, Solution.getResult("STWSWTPPTPTTPWPP","Swamper"));
    }

    @Test
    void testGetResultForSwamper2() throws Exception {
        assertEquals(12, Solution.getResult("TWSTSWTTSPTPPWPS","Swamper"));
    }

    @Test
    void testGetResultForSwamper3() throws Exception {
        assertEquals(12, Solution.getResult("PSPTWTSTPSSSWTPW","Swamper"));
    }

    @Test
    void testGetResultForSwamper4() throws Exception {
        assertEquals(12, Solution.getResult("WWWWWWWWWWWWWWWW","Swamper"));
    }

    @Test
    void testGetResultForSwamper5() throws Exception {
        assertEquals(12, Solution.getResult("WPPSSPTPTSPWSTSP","Swamper"));
    }

    @Test
    void testGetResultForWoodman1() throws Exception {
        assertEquals(12, Solution.getResult("STWSWTPPTPTTPWPP","Woodman"));
    }

    @Test
    void testGetResultForWoodman2() throws Exception {
        assertEquals(15, Solution.getResult("TWSTSWTTSPTPPWPS","Woodman"));
    }

    @Test
    void testGetResultForWoodman3() throws Exception {
        assertEquals(15, Solution.getResult("PSPTWTSTPSSSWTPW","Woodman"));
    }

    @Test
    void testGetResultForWoodman4() throws Exception {
        assertEquals(18, Solution.getResult("WWWWWWWWWWWWWWWW","Woodman"));
    }

    @Test
    void testGetResultForWoodman5() throws Exception {
        assertEquals(13, Solution.getResult("WPPSSPTPTSPWSTSP","Woodman"));
    }

    @Test
    void testGetResultForAnotherCreature() throws Exception {
        assertEquals(6, Solution.getResult("SPPSTPTPTSPWSTSP","Bigfoot","src/test/resources/information_2.json"));
    }

    @Test
    void testGetResultForAnotherCreature2() throws Exception {
        assertEquals(8, Solution.getResult("PSPTWTSTPSSSWTPW","Venom","src/test/resources/information_2.json"));
    }

    @Test
    void testGetResultForAnotherCreatureAndAnotherObstacles() throws Exception {
        assertEquals(8, Solution.getResult("RAHNNHRAARNHAHHA","Spider-Man","src/test/resources/information_2.json"));
    }
}