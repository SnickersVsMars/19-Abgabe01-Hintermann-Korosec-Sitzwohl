package at.fhj.msd;

import at.fhj.msd.exceptions.RadlerException;

/**
 * Class represents a long drink containing two different
 * liquids - one alcoholic and one non-alcoholic
 *
 * @author      Marian Korosec
 * @author      Christian Sitzwohl
 * @version     %I%, %G%
 * @since       1.1
 */
public class LongDrink extends Drink {

    /**
     * alcoholic liquid of the long drink
     */
    private Liquid alcohol;
    /**
     * non-alcoholic liquid of the long drink
     */
    private Liquid nonAlcohol;

    /**
     * Creates a new LongDrink object consisting of the given
     * name and two content liquids
     *
     * @param name name of the drink
     * @param alcohol alcoholic component of the long drink
     * @param nonAlcohol non-alcoholic component of the long drink
     */
    public LongDrink(String name, Liquid alcohol, Liquid nonAlcohol) {
        super(name);
        this.alcohol = alcohol;
        this.nonAlcohol = nonAlcohol;
    }

    /**
     * Checks if the conditions for a long drink are fulfilled
     *
     * @throws  IllegalArgumentException    If any of the inputs are
     *                                      invalid (e.g. 2 alcoholic)
     * @throws  RadlerException             If beer is mixed with a
     *                                      non-alcoholic drink
     */
    public void validateLiquids()
    throws IllegalArgumentException, RadlerException {
        if(alcohol.getVolume() <= 0)
        {
            throw new IllegalArgumentException("The alcoholic liquid must contain alcohol!");
        }

        if(nonAlcohol.getVolume() >= 0)
        {
            throw new IllegalArgumentException("The non-alcoholic liquid must be non-alcoholic!");
        }
    }

    // JavaDoc from abstract method will be used here
    @Override
    public double getVolume() {
        return alcohol.getVolume() + nonAlcohol.getVolume();
    }

    // JavaDoc from abstract method will be used here
    @Override
    public double getAlcoholPercent() {
        // TODO
        return 0.0;
    }

    // JavaDoc from abstract method will be used here
    // a correct long drink should always return true
    @Override
    public boolean isAlcoholic() {
        // TODO
        return false;
    }
}
