package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing LongDrink implementation")
public class LongDrinkTest {
    private Liquid lA, lN, lN2, lBeer;

    /**
     * inits an alcoholic and nonalcoholic liquid for each test
     */
    @BeforeEach
    public void setup() {
        lN = new Liquid("Coca Cola", 0.3, 0);
        lN2 = new Liquid("Fanta", 0.3, 0);
        lA = new Liquid("Havana White Rum", 0.04, 40);
        lBeer = new Liquid("Heineken Beer", 0.5, 5.1);
    }

    @Test
    @DisplayName("Testing constructor with valid long drink")
    public void testConstructorAlcoholic() {
        LongDrink longDrink = new LongDrink("Havana Cola", lA, lN);

        assertEquals("Havana Cola", longDrink.name,
                "Expected the name to be \"Havana Cola\", but was " + longDrink.name);
        assertEquals(0.34, longDrink.getVolume(), 0.001,
                "Expected a volume of .34l, but was " + longDrink.getVolume());
        assertEquals(4.705, longDrink.getAlcoholPercent(), 0.001,
                "Expected an alcohol percentage of 4.705, but was " + longDrink.getAlcoholPercent());
        assertTrue(longDrink.isAlcoholic(), "A valid long drink should be alcoholic!");

        assertDoesNotThrow(() -> {
            longDrink.validateLiquids();
        });
    }

    @Test
    @DisplayName("Testing constructor with non-valid long drink")
    public void testConstructorNonAlcoholic() {
        LongDrink longDrink = new LongDrink("Spezi", lN, lN2);

        assertEquals("Spezi", longDrink.name,
                "Expected the name to be \"Spezi\", but was " + longDrink.name);
        assertEquals(0.6, longDrink.getVolume(), 0.001,
                "Expected a volume of .6l, but was " + longDrink.getVolume());
        assertEquals(0, longDrink.getAlcoholPercent(), 0.001,
                "Expected an alcohol percentage of 0.0, but was " + longDrink.getAlcoholPercent());

        assertThrows(IllegalArgumentException.class, () -> {
            longDrink.validateLiquids();
        });
    }

    @Test
    @DisplayName("Testing constructor with special cases containing beer")
    public void testConstructorContainingBeer() {
        LongDrink longDrink = new LongDrink("U-Boot", lBeer, lA);

        assertEquals("U-Boot", longDrink.name,
                "Expected the name to be \"U-Boot\", but was " + longDrink.name);
        assertEquals(0.54, longDrink.getVolume(), 0.001,
                "Expected a volume of .54l, but was " + longDrink.getVolume());
        assertEquals(7.685, longDrink.getAlcoholPercent(), 0.001,
                "Expected an alcohol percentage of 7.685, but was " + longDrink.getAlcoholPercent());
        assertTrue(longDrink.isAlcoholic(), "A valid long drink should be alcoholic!");

        assertDoesNotThrow(() -> {
            longDrink.validateLiquids();
        });
    }
}
