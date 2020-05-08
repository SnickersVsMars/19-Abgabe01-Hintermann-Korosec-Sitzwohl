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

    @Test
    @DisplayName("Testing constructor with alcoholic drink")
    public void testConstructorAlcoholic() {
        assertEquals("Shiner Bock", dA.name);
        assertEquals(0.5, dA.getVolume());
        assertEquals(4.4, dA.getAlcoholPercent());
        assertTrue(dA.isAlcoholic());
    }

    @Test
    @DisplayName("Testing constructor with non-alcoholic drink")
    public void testConstructorNonAlcoholic() {
        assertEquals("Apple Juice", dN.name);
        assertEquals(0.3, dN.getVolume());
        assertEquals(0, dN.getAlcoholPercent());
        assertFalse(dN.isAlcoholic());
    }
}
