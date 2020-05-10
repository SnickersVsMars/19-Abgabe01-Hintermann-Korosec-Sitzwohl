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
        ArrayList<Liquid> liquids1 = new ArrayList<>();
        liquids1.add(new Liquid("Rum", 0.3, 44.4));
        liquids1.add(new Liquid("Wein", 0.2, 11));
        cocktail1 = new Cocktail("Rum-Wein", liquids1);

        ArrayList<Liquid> liquids2 = new ArrayList<>();
        liquids2.add(new Liquid("Rum", 0.3, 44.4));
        liquids2.add(new Liquid("Wein", 0.2, 11));
        liquids2.add(new Liquid("Tequilla",1,47));
        cocktail2 = new Cocktail("Rum-Wein-Tequilla", liquids2);
    }

    @Test
    @DisplayName("Testing ckeckOverallVolume()")
    void checkOverallVolume() {
        assertEquals("NormalSize",cocktail1.checkOverallVolume());
        assertEquals("PartySize",cocktail2.checkOverallVolume());
    }

    @Test
    @DisplayName("Testing addLiquid()")
    void addLiquid() {
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
    void getVolume() {
        assertEquals(0.5,cocktail1.getVolume());
        assertEquals(1.5,cocktail2.getVolume());
    }

    @Test
    @DisplayName("Testing getAlcoholPercent()")
    void getAlcoholPercent() {
        assertEquals(55.4,cocktail1.getAlcoholPercent());
        assertEquals(102.4,cocktail2.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing isAlcohol()")
    void isAlcoholic() {
        assertEquals(true,cocktail1.isAlcoholic());
        assertEquals(true,cocktail2.isAlcoholic());
    }
}