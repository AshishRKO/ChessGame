/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

import java.util.List;

/**
 * @author Ashish Barthwal
 * @version $Id: Player.java, v 0.1 2019-03-11 2:37 PM Ashish Barthwal $$
 */
public class Player {

    private User person;

    private Color color;

    private List<Piece> pieceList; // Piece that player owns

    /**
     * Getter method for property <tt>person</tt>.
     *
     * @return property value of person
     */
    public User getPerson() {
        return person;
    }

    /**
     * Setter method for property <tt>person</tt>.
     *
     * @param person value to be assigned to property person
     */
    public void setPerson(User person) {
        this.person = person;
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
     * Getter method for property <tt>pieceList</tt>.
     *
     * @return property value of pieceList
     */
    public List<Piece> getPieceList() {
        return pieceList;
    }

    /**
     * Setter method for property <tt>pieceList</tt>.
     *
     * @param pieceList value to be assigned to property pieceList
     */
    public void setPieceList(List<Piece> pieceList) {
        this.pieceList = pieceList;
    }
}