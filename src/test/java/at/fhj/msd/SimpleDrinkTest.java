package at.fhj.msd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("Testing SimpleDrink implementation")
public class SimpleDrinkTest {
    private SimpleDrink dA, dN;

    /**
     * inits an alcoholic and nonalcoholic liquid for each test
     */
    @BeforeEach
    public void setup() {
        dA = new SimpleDrink("Shiner Bock", new Liquid("Beer", 0.5, 4.4));
        dN = new SimpleDrink("Apple Juice", new Liquid("Juice", 0.3, 0));
    }

    /**
     * Test constructor of an alcoholic drink
     */
    @Test
    @DisplayName("Testing constructor with alcoholic drink")
    public void testConstructorAlcoholic() {
        assertEquals("Shiner Bock", dA.name,
                "Expected the name to be \"Shiner Bock\", but was " + dA.name);
        assertEquals(0.5, dA.getVolume(), 0.001,
                "Expected a volume of .5l, but was " + dA.getVolume());
        assertEquals(4.4, dA.getAlcoholPercent(), 0.001,
                "Expected an alcohol percentage of 4.4, but was " + dA.getAlcoholPercent());
        assertTrue(dA.isAlcoholic(), "Beer should be alcoholic!");
    }

    /**
     * Test constructor of a mon-alcoholic drink
     */
    @Test
    @DisplayName("Testing constructor with non-alcoholic drink")
    public void testConstructorNonAlcoholic() {
        assertEquals("Apple Juice", dN.name,
                "Expected the name to be \"Apple Juice\", but was " + dN.name);
        assertEquals(0.3, dN.getVolume(), 0.001,
                "Expected a volume of .3l, but was " + dN.getVolume());
        assertEquals(0, dN.getAlcoholPercent(), 0.001,
                "Expected an alcohol percentage of 4.4, but was " + dN.getAlcoholPercent());
        assertFalse(dN.isAlcoholic(), "Apple juice should not be alcoholic!");
    }
}
