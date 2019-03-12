/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

/**
 * @author Ashish Barthwal
 * @version $Id: User.java, v 0.1 2019-03-12 2:33 AM Ashish Barthwal $$
 */
public class User {

    private String name;

    private int wins;

    private int losses;

    /**
     * Getter method for property <tt>name</tt>.
     *
     * @return property value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Setter method for property <tt>name</tt>.
     *
     * @param name value to be assigned to property name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Getter method for property <tt>wins</tt>.
     *
     * @return property value of wins
     */
    public int getWins() {
        return wins;
    }

    /**
     * Setter method for property <tt>wins</tt>.
     *
     * @param wins value to be assigned to property wins
     */
    public void setWins(int wins) {
        this.wins = wins;
    }

    /**
     * Getter method for property <tt>losses</tt>.
     *
     * @return property value of losses
     */
    public int getLosses() {
        return losses;
    }

    /**
     * Setter method for property <tt>losses</tt>.
     *
     * @param losses value to be assigned to property losses
     */
    public void setLosses(int losses) {
        this.losses = losses;
    }
}