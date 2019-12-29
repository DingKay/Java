package com.dk.basis.internalclass.deep.anonymous;

/**
 * @author DingKai
 * @version 1.0
 */
public abstract class AbstractAnimal {
    /**
     * Animal's Name
     */
    protected String name;

    public String getName() {
        return name;
    }

    /**
     * Animal's abstract Method
     * @return java.lang.String
     */
    public abstract String eatFood();
}
