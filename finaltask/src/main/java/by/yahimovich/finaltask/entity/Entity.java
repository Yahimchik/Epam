package by.yahimovich.finaltask.entity;

import java.io.Serializable;

/**
 * Entity class.
 *
 * @author Egor Yahimovich
 * @version 1.0
 * @see Serializable
 * @see Cloneable
 */

public abstract class Entity implements Serializable, Cloneable {

    /**
     * Override method clone.
     */

    @Override
    public Entity clone() {
        try {
            return (Entity) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}
