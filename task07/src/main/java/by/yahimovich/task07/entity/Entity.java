package by.yahimovich.task07.entity;

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

//    public Integer getId() {
//        return null;
//    }
//
//    public String getEmail() {
//        return null;
//    }
//
//    public String getPassword() {
//        return null;
//    }
//
//    public String getRole() {
//        return null;
//    }
//
//    public String getFirstName() {
//        return null;
//    }
//
//    public String getSecondName() {
//        return null;
//    }
//
//    public String getLastName() {
//        return null;
//    }
//
//    public String getAddress() {
//        return null;
//    }
//
//    public String getPhoneNumber() {
//        return null;
//    }
}
