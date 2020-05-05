package at.fhj.msd;

import java.util.ArrayList;

/**
 * Class represents a mixture of liquids resembling a cocktail.
 * Cocktails must consist of at least one non-alcoholic component
 * and are limited by volume, depending of the type of cocktail.
 *
 * @author      Tobias Hintermann
 * @author      Marian Korosec
 * @version     %I%, %G%
 * @since       1.1
 */
public class Cocktail extends Drink {

    /**
     * list of liquids contained in the cocktail
     */
    private ArrayList<Liquid> liquids;
    /**
     * defines whether the cocktail is normal or party sized
     * normal: 0.5l
     * party size: 1.5l
     */
    private boolean isPartySize;

    /**
     * Creates a new Cocktail object consisting of the given
     * name and list of liquids
     *
     * @param name name of the drink
     * @param liquids list of liquids in the cocktail
     */
    public Cocktail(String name, ArrayList<Liquid> liquids, boolean isPartySize) {
        super(name);
        this.liquids = liquids;
        this.isPartySize = isPartySize;
    }

    /**
     * Checks if the cocktail's overall volume matches its
     * given size
     */
    public void checkOverallVolume() {
        //TODO
    }

    /**
     * Adds a liquid to the cocktail and then recalculates its
     * properties.
     */
    public void addLiquid(Liquid l) {
        //TODO
    }

    // JavaDoc from abstract method will be used here
    @Override
    public double getVolume() {
        // TODO
        return 0.0;
    }

    // JavaDoc from abstract method will be used here
    @Override
    public double getAlcoholPercent() {
        // TODO
        return 0.0;
    }

    // JavaDoc from abstract method will be used here
    @Override
    public boolean isAlcoholic() {
        // TODO
        return false;
    }
}
