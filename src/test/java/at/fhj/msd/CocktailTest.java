package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

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

    @Test
    @DisplayName("Testing ckeckOverallVolume()")
    public void getCocktailSize() {
        assertEquals("NormalSize",cocktail1.getCocktailSize());
        assertEquals("PartySize",cocktail2.getCocktailSize());
    }

    @Test
    @DisplayName("Testing cocktail size getter with unspecified volume")
    public void testCocktailSizeGetter() {
        // manipulate liquid volume, so the cocktail's volume doesn't add up to match any of the sizes
        cocktail1.getLiquids().get(0).setVolume(0.5);
        cocktail2.getLiquids().get(0).setVolume(0.5);
        assertEquals("neither normal nor partysize", cocktail1.getCocktailSize(),
                "Expected size to be \"neither normal nor partysize\", but was "
                        + cocktail1.getCocktailSize());
        assertEquals("neither normal nor partysize", cocktail2.getCocktailSize(),
                "Expected size to be \"neither normal nor partysize\", but was "
                        + cocktail2.getCocktailSize());
    }


    @Test
    @DisplayName("Testing addLiquid()")
    public void addLiquid() {
        cocktail1.addLiquid(new Liquid("Saft",1,0));
        ArrayList<Liquid> testList = new ArrayList<>();
        testList.add(new Liquid("Rum", 0.3, 44.4));
        testList.add(new Liquid("Wein", 0.2, 11));
        testList.add(new Liquid("Saft",1,0));
        assertEquals(testList.contains(new Liquid("Saft",1,0)),
                cocktail1.getLiquids().contains(new Liquid("Saft",1,0)));
    }

    @Test
    @DisplayName("Testing getVolume()")
    public void getVolume() {
        assertEquals(0.5,cocktail1.getVolume());
        assertEquals(1.5,cocktail2.getVolume());
    }

    @Test
    @DisplayName("Testing getAlcoholPercent()")
    public void getAlcoholPercent() {
        assertEquals(31.04,cocktail1.getAlcoholPercent(), 0.01);
        assertEquals(41.68,cocktail2.getAlcoholPercent(), 0.01);
    }

    @Test
    @DisplayName("Testing isAlcohol()")
    public void isAlcoholic() {
        assertEquals(true,cocktail1.isAlcoholic());
        assertEquals(true,cocktail2.isAlcoholic());
    }
}