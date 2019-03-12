/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

/**
 * @author Ashish Barthwal
 * @version $Id: King.java, v 0.1 2019-03-12 2:25 AM Ashish Barthwal $$
 */
public class King extends Piece {

    public King(Color color, Square location) {
        super(color, location);
    }

    @Override
    public boolean isValidMove(Board board, Square start, Square end) {

        if(start.getPiece().getColor() == end.getPiece().getColor()) {
            return false;
        }

        int x = Math.abs(start.getX() - end.getX());
        int y = Math.abs(start.getY() - end.getY());
        if(x + y == 1) {
            // check if this move will not result in king being attacked, if so return true
            return true;
        }

        return false;
    }

}