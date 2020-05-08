package at.fhj.msd;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("Testing Liquid implementation")
public class LiquidTest {
	private Liquid lN, lA;

	/**
	 * inits an alcoholic and nonalcoholic liquid for EACH test
	 */
	@BeforeEach
	void setup() {
		// SETUP PHASE
		lN = new Liquid("Wasser", 0.3, 0);
		lA = new Liquid("Wein", 0.125, 13);
	}

	@Test
	@DisplayName("Testing constructor non alcoholic")
	public void testConstructorNonAlcoholic(){
		assertEquals("Wasser", lN.getName());
		assertEquals(0.3, lN.getVolume(), 0.001);
		assertEquals(0, lN.getAlcoholPercent(), 0.001);
	}

	@Test
	@DisplayName("Testing constructor alcoholic")
	public void testConstructorAlcoholic(){
		assertEquals("Wein", lA.getName());
		assertEquals(0.125, lA.getVolume(), 0.001);
		assertEquals(13, lA.getAlcoholPercent(), 0.001);
	}

	@Test
	@DisplayName("Test name setter")
	public void testNameSetter(){
		lN.setName("Granderwasser");
		assertEquals("Granderwasser", lN.getName());
	}

	@Test
	@DisplayName("Testing volume setter")
	public void testVolumeSetter(){
		lN.setVolume(0.5);
		assertEquals(0.5, lN.getVolume(), 0.001);
	}

	@Test
	@DisplayName("Testing alcoholPercent setters")
	public void testAlcoholPercentSetter(){
		lN.setAlcoholPercent(3.2);
		assertEquals(3.2, lN.getAlcoholPercent(), 0.001);
	}
}
