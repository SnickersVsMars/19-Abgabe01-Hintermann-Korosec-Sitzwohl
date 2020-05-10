package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing Cocktail implementation")
class CocktailTest {

    private ArrayList<Liquid> liquids;
    private Cocktail cocktail1;

    /**
     * inits an alcoholic liquid List for each cocktail
     * inits a cocktail for each test
     */
    @BeforeEach
    public void setup() {
        ArrayList<Liquid> liquids = new ArrayList<>();
        liquids.add(new Liquid("Rum", 0.3, 44.4));
        liquids.add(new Liquid("Wein", 0.2, 11));
        cocktail1 = new Cocktail("Wein-Rum-Cabana", liquids);
    }

    @Test
    @DisplayName("Testing ckeckOverallVolume()")
    void checkOverallVolume() {
        assertEquals("NormalSize",cocktail1.checkOverallVolume());
    }

    @Test
    @DisplayName("Testing addLiquid()")
    void addLiquid() {
    }

    @Test
    @DisplayName("Testing getVolume()")
    void getVolume() {
        assertEquals(0.5,cocktail1.getVolume());
    }

    @Test
    @DisplayName("Testing getAlcoholPercent()")
    void getAlcoholPercent() {
        assertEquals(55.4,cocktail1.getAlcoholPercent());
    }

    @Test
    @DisplayName("Testing isAlcohol()")
    void isAlcoholic() {
        assertEquals(true,cocktail1.isAlcoholic());
    }
}