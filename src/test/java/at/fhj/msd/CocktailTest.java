package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Class testing the functionalities of the Cocktail class
 *
 * @author      Marian Korosec
 * @author      Tobias Hintermann
 * @version     %I%, %G%
 * @since       1.1
 */
@DisplayName("Testing Cocktail implementation")
class CocktailTest {

    private ArrayList<Liquid> liquids1, liquids2;
    private Cocktail cocktail1, cocktail2;

    /**
     * inits an alcoholic liquid List for each cocktail
     * inits a cocktail for each test
     */
    @BeforeEach
    public void setup() {
        liquids1 = new ArrayList<>();
        liquids1.add(new Liquid("Rum", 0.3, 44.4));
        liquids1.add(new Liquid("Wein", 0.2, 11));
        cocktail1 = new Cocktail("Rum-Wein", liquids1);

        liquids2 = new ArrayList<>();
        liquids2.add(new Liquid("Rum", 0.3, 44.4));
        liquids2.add(new Liquid("Wein", 0.2, 11));
        liquids2.add(new Liquid("Tequilla",1,47));
        cocktail2 = new Cocktail("Rum-Wein-Tequilla", liquids2);
    }

    /**
     * Test Cocktail-Size 1
     */
    @Test
    @DisplayName("Testing getCocktailSize for cocktail nr. 1")
    public void testGetCocktailSize1() {
        assertEquals("NormalSize",cocktail1.getCocktailSize(),
                "Expected \"NormalSize\" but was " + cocktail1.getCocktailSize());
    }

    /**
     * Test Cocktail-Size 2
     */
    @Test
    @DisplayName("Testing getCocktailSize() for cocktail nr. 2")
    public void testGetCocktailSize2() {
        assertEquals("PartySize",cocktail2.getCocktailSize(),
                "Expected \"PartySize\" but was " + cocktail2.getCocktailSize());
    }

    /**
     * Test Cocktail-Size 1 after manipulating
     */
    @Test
    @DisplayName("Testing cocktail size getter with unspecified volume for cocktail nr. 1")
    public void testCocktailSizeGetter1() {
        // manipulate liquid volume, so the cocktail's volume doesn't add up to match any of the sizes
        cocktail1.getLiquids().get(0).setVolume(0.5);
        assertEquals("neither normal nor partysize", cocktail1.getCocktailSize(),
                "Expected size to be \"neither normal nor partysize\", but was "
                        + cocktail1.getCocktailSize());
    }

    /**
     * Test Cocktail-Size 2 after manipulating
     */
    @Test
    @DisplayName("Testing cocktail size getter with unspecified volume for cocktail nr. 2")
    public void testCocktailSizeGetter2() {
        // manipulate liquid volume, so the cocktail's volume doesn't add up to match any of the sizes
        cocktail2.getLiquids().get(0).setVolume(2);
        assertEquals("neither normal nor partysize", cocktail2.getCocktailSize(),
                "Expected size to be \"neither normal nor partysize\", but was "
                        + cocktail2.getCocktailSize());
    }


    /**
     * Test add liquid to Cocktail 1
     */
    @Test
    @DisplayName("Testing addLiquid() for cocktail nr. 1")
    public void testAddLiquid1() {
        cocktail1.addLiquid(new Liquid("Saft",1,0));
        ArrayList<Liquid> testList = new ArrayList<>();
        testList.add(new Liquid("Rum", 0.3, 44.4));
        testList.add(new Liquid("Wein", 0.2, 11));
        testList.add(new Liquid("Saft",1,0));
        assertEquals(testList.contains(new Liquid("Saft",1,0)),
                cocktail1.getLiquids().contains(new Liquid("Saft",1,0)),
                "Expected new Liquid, but was not found in ArrayList");
    }

    /**
     * Test add liquid to Cocktail 2
     */
    @Test
    @DisplayName("Testing addLiquid() for cocktail nr. 2")
    public void testAddLiquid2() {
        cocktail2.addLiquid(new Liquid("Jogurt",1,0));
        ArrayList<Liquid> testList = new ArrayList<>();
        testList.add(new Liquid("Rum", 0.3, 44.4));
        testList.add(new Liquid("Wein", 0.2, 11));
        testList.add(new Liquid("Jogurt",1,0));
        assertEquals(testList.contains(new Liquid("Jogurt",1,0)),
                cocktail2.getLiquids().contains(new Liquid("Jogurt",1,0)),
                "Expected new Liquid, but was not found in ArrayList");
    }

    /**
     * Test getVolume() of Cocktail 1
     */
    @Test
    @DisplayName("Testing getVolume() for cocktail nr. 1")
    public void testGetVolume1() {
        assertEquals(0.5,cocktail1.getVolume(),
                "Expected 0.5, but was " + cocktail1.getVolume());
    }

    /**
     * Test getVolume() of Cocktail 2
     */
    @Test
    @DisplayName("Testing getVolume() for cocktail nr. 2")
    public void testGetVolume2() {
        assertEquals(1.5,cocktail2.getVolume(),
                "Expected 1.5, but was " + cocktail2.getVolume());
    }


    /**
     * Test getAlcoholPercent() of Cocktail 1
     */
    @Test
    @DisplayName("Testing getAlcoholPercent() for cocktail nr. 1")
    public void testGetAlcoholPercent1() {
        assertEquals(31.04,cocktail1.getAlcoholPercent(), 0.01,
                "Expected 31.04, but was " + cocktail1.getAlcoholPercent());
    }

    /**
     * Test getAlcoholPercent() of Cocktail 2
     */
    @Test
    @DisplayName("Testing getAlcoholPercent() for cocktail nr. 2")
    public void testGetAlcoholPercent2() {
        assertEquals(41.68,cocktail2.getAlcoholPercent(), 0.01,
                "Expected 41.68, but was " + cocktail2.getAlcoholPercent());
    }

    /**
     * Test isAlcohol() of Cocktail 1
     */
    @Test
    @DisplayName("Testing isAlcohol() for cocktail nr. 1")
    public void testIsAlcoholic1() {
        assertEquals(true,cocktail1.isAlcoholic(),
                "Expected true, but is " + cocktail1.isAlcoholic());
    }

    /**
     * Test isAlcohol() of Cocktail 2
     */
    @Test
    @DisplayName("Testing isAlcohol() for cocktail nr. 2")
    public void testIsAlcoholic2() {
        assertEquals(true,cocktail2.isAlcoholic(),
                "Expected true, but is " + cocktail2.isAlcoholic());
    }
}