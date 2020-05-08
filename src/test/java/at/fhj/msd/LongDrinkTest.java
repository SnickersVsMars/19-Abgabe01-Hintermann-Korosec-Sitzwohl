package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing LongDrink implementation")
public class LongDrinkTest {
    private Liquid lA, lN, lBeer;

    /**
     * inits an alcoholic and nonalcoholic liquid for each test
     */
    @BeforeEach
    public void setup() {
        lN = new Liquid("Coca Cola", 0.3, 0);
        lA = new Liquid("Havana White Rum", 0.04, 40);
        lBeer = new Liquid("Heineken Beer", 0.5, 5.1);
    }

    @Test
    @DisplayName("Testing constructor with valid long drink")
    public void testConstructorAlcoholic() {
        LongDrink longDrink = new LongDrink("Havana Cola", lA, lN);

        assertEquals("Havana Cola", longDrink.name,
                "Expected the name to be \"Havana Cola\", but was" + longDrink.name);
        assertEquals(0.34, longDrink.getVolume(), 0.001,
                "Expected a volume of .34l, but was" + longDrink.getVolume());
        assertEquals(4.705, longDrink.getAlcoholPercent(), 0.001,
                "Expected an alcohol percentage of 4.705, but was" + longDrink.getAlcoholPercent());
        assertTrue(longDrink.isAlcoholic(), "A valid long drink should to be alcoholic!");
    }

    @Test
    @DisplayName("Testing constructor with non-valid long drink")
    public void testConstructorNonAlcoholic() {
        //TODO
    }

    @Test
    @DisplayName("Testing constructor with special cases containing beer")
    public void testConstructorContainingBeer() {
        //TODO
    }
}
