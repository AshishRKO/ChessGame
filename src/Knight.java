/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

/**
 * @author Ashish Barthwal
 * @version $Id: Knight.java, v 0.1 2019-03-12 2:34 AM Ashish Barthwal $$
 */
public class Knight extends Piece {
    public Knight(Color color, Square location) {
        super(color, location);
    }

    @Override
    public boolean isValidMove(Board board, Square start, Square end) {
        return false;
    }
}