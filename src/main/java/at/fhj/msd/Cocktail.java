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
    private boolean isNormalSize;

    /**
     * Creates a new Cocktail object consisting of the given
     * name and list of liquids
     *
     * @param name name of the drink
     * @param liquids list of liquids in the cocktail
     */
    public Cocktail(String name, ArrayList<Liquid> liquids) {
        super(name);
        this.liquids = liquids;
    }

    /**
     * Checks if the cocktail's overall volume matches its
     * given size
     * @return
     */
    public boolean checkOverallVolume() {
        if (getVolume() == 0.5) {
            return isNormalSize;        //Change method to if getVolume() return 1.5 or 0.5, return "isNormal" "isParty"
        } else if(getVolume() == 1.5) {
            return isPartySize;
        }
        return false;
    }

    /**
     * Adds a liquid to the cocktail and then recalculates its
     * properties.
     */
    public void addLiquid(Liquid l) { liquids.add(l); }

    // JavaDoc from abstract method will be used here
    @Override
    public double getVolume() {
        double volume = 0;
        for (Liquid liquid: liquids) {
           volume += liquid.getVolume();
        }
        return volume;
    }

    // JavaDoc from abstract method will be used here
    @Override
    public double getAlcoholPercent() {
        double alcoholPercentage = 0;
        for (Liquid liquid: liquids) {
            alcoholPercentage += liquid.getAlcoholPercent();
        }
        return alcoholPercentage;
    }

    // JavaDoc from abstract method will be used here
    @Override
    public boolean isAlcoholic() { return true; }
}
