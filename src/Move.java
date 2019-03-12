/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

/**
 * @author Ashish Barthwal
 * @version $Id: Move.java, v 0.1 2019-03-12 1:38 AM Ashish Barthwal $$
 */
public class Move {

    private Player player;

    private Square start;

    private Square end;

    private Piece pieceMoved;

    private Piece pieceCaptured;


    public Move(Player player, Square start, Square end) {
        this.player = player;
        this.start = start;
        this.end = end;
        this.pieceMoved = start.getPiece();
        this.pieceCaptured = end.getPiece();
    }

    /**
     * Getter method for property <tt>player</tt>.
     *
     * @return property value of player
     */
    public Player getPlayer() {
        return player;
    }

    /**
     * Setter method for property <tt>player</tt>.
     *
     * @param player value to be assigned to property player
     */
    public void setPlayer(Player player) {
        this.player = player;
    }

    /**
     * Getter method for property <tt>start</tt>.
     *
     * @return property value of start
     */
    public Square getStart() {
        return start;
    }

    /**
     * Setter method for property <tt>start</tt>.
     *
     * @param start value to be assigned to property start
     */
    public void setStart(Square start) {
        this.start = start;
    }

    /**
     * Getter method for property <tt>end</tt>.
     *
     * @return property value of end
     */
    public Square getEnd() {
        return end;
    }

    /**
     * Setter method for property <tt>end</tt>.
     *
     * @param end value to be assigned to property end
     */
    public void setEnd(Square end) {
        this.end = end;
    }

    /**
     * Getter method for property <tt>pieceMoved</tt>.
     *
     * @return property value of pieceMoved
     */
    public Piece getPieceMoved() {
        return pieceMoved;
    }

    /**
     * Setter method for property <tt>pieceMoved</tt>.
     *
     * @param pieceMoved value to be assigned to property pieceMoved
     */
    public void setPieceMoved(Piece pieceMoved) {
        this.pieceMoved = pieceMoved;
    }

    /**
     * Getter method for property <tt>pieceCaptured</tt>.
     *
     * @return property value of pieceCaptured
     */
    public Piece getPieceCaptured() {
        return pieceCaptured;
    }

    /**
     * Setter method for property <tt>pieceCaptured</tt>.
     *
     * @param pieceCaptured value to be assigned to property pieceCaptured
     */
    public void setPieceCaptured(Piece pieceCaptured) {
        this.pieceCaptured = pieceCaptured;
    }
}