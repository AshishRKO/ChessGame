/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

/**
 * @author Ashish Barthwal
 * @version $Id: Square.java, v 0.1 2019-03-11 2:16 PM Ashish Barthwal $$
 */
public class Square {

    private int x;

    private int y;

    private Piece piece; // Nullable for Empty Squares


    public Square(int x, int y, Piece piece) {
        this.x = x;
        this.y = y;
        this.piece = piece;
    }

    /**
     * Getter method for property <tt>x</tt>.
     *
     * @return property value of x
     */
    public int getX() {
        return x;
    }

    /**
     * Setter method for property <tt>x</tt>.
     *
     * @param x value to be assigned to property x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Getter method for property <tt>y</tt>.
     *
     * @return property value of y
     */
    public int getY() {
        return y;
    }

    /**
     * Setter method for property <tt>y</tt>.
     *
     * @param y value to be assigned to property y
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * Getter method for property <tt>piece</tt>.
     *
     * @return property value of piece
     */
    public Piece getPiece() {
        return piece;
    }

    /**
     * Setter method for property <tt>piece</tt>.
     *
     * @param piece value to be assigned to property piece
     */
    public void setPiece(Piece piece) {
        this.piece = piece;
    }
}