/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

import java.util.List;

/**
 * @author Ashish Barthwal
 * @version $Id: Piece.java, v 0.1 2019-03-11 2:17 PM Ashish Barthwal $$
 */
public abstract class Piece {

    private Color color;

    private boolean isAvailable; // to check whether alive or not

    private Square location;

    // Given a situation on a Board, is the move Valid ot not
    public abstract boolean isValidMove(Board board, Square start, Square end);


    public Piece(Color color, Square location) {
        this.color = color;
        this.isAvailable = true;
        this.location = location;
    }

    /**
     * Getter method for property <tt>color</tt>.
     *
     * @return property value of color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Setter method for property <tt>color</tt>.
     *
     * @param color value to be assigned to property color
     */
    public void setColor(Color color) {
        this.color = color;
    }


    /**
     * Getter method for property <tt>isAvailable</tt>.
     *
     * @return property value of isAvailable
     */
    public boolean isAvailable() {
        return isAvailable;
    }

    /**
     * Setter method for property <tt>available</tt>.
     *
     * @param available value to be assigned to property available
     */
    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    /**
     * Getter method for property <tt>location</tt>.
     *
     * @return property value of location
     */
    public Square getLocation() {
        return location;
    }

    /**
     * Setter method for property <tt>location</tt>.
     *
     * @param location value to be assigned to property location
     */
    public void setLocation(Square location) {
        this.location = location;
    }
}