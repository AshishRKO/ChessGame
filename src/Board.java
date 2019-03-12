/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

import java.util.List;

/**
 * @author Ashish Barthwal
 * @version $Id: Board.java, v 0.1 2019-03-11 12:49 PM Ashish Barthwal $$
 */

/**
* One new Game will contain new Board
* Board should initialize pieces, not player
 */
public class Board {

    private int N;

    private Square[][] squares = new Square[N][N];

    private List<Piece> availablePieces;// To keep track of availablePieces

    private List<Piece> removedPieces;// To keep track of removedPieces

    public Board()
    {
        // initialize remaining boxes without any piece
        for(int i=0; i < 8; i++) {
            for(int j=0; j < 8; j++) {
                squares[i][j] = new Square(i, j, null);
            }
        }

        // initialize white pieces
        squares[0][0].setPiece(new Rook(Color.WHITE,squares[0][0]));
        squares[0][1].setPiece(new Knight(Color.WHITE,squares[0][1]));
        squares[0][2].setPiece(new Bishop(Color.WHITE,squares[0][2]));
        squares[0][3].setPiece(new Queen(Color.WHITE,squares[0][3]));
        squares[0][4].setPiece(new King(Color.WHITE,squares[0][4]));
        squares[0][5].setPiece(new Bishop(Color.WHITE,squares[0][5]));
        squares[0][6].setPiece(new Knight(Color.WHITE,squares[0][6]));
        squares[0][7].setPiece(new Rook(Color.WHITE,squares[0][7]));


        // 8 Pawns
        squares[1][0].setPiece(new Pawn(Color.WHITE,squares[1][0]));
        squares[1][1].setPiece(new Pawn(Color.WHITE,squares[1][1]));
        squares[1][2].setPiece(new Pawn(Color.WHITE,squares[1][2]));
        squares[1][3].setPiece(new Pawn(Color.WHITE,squares[1][3]));
        squares[1][4].setPiece(new Pawn(Color.WHITE,squares[1][4]));
        squares[1][5].setPiece(new Pawn(Color.WHITE,squares[1][5]));
        squares[1][6].setPiece(new Pawn(Color.WHITE,squares[1][6]));
        squares[1][7].setPiece(new Pawn(Color.WHITE,squares[1][7]));
        //...

        // initialize black pieces
        squares[7][0].setPiece(new Rook(Color.BLACK,squares[7][0]));
        squares[7][1].setPiece(new Knight(Color.BLACK,squares[7][1]));
        squares[7][2].setPiece(new Bishop(Color.BLACK,squares[7][2]));
        squares[7][3].setPiece(new King(Color.BLACK,squares[7][3]));
        squares[7][4].setPiece(new Queen(Color.BLACK,squares[7][4]));
        squares[7][5].setPiece(new Bishop(Color.BLACK,squares[7][5]));
        squares[7][6].setPiece(new Knight(Color.BLACK,squares[7][6]));
        squares[7][7].setPiece(new Rook(Color.BLACK,squares[7][7]));


        // 8 Pawns
        squares[7][0].setPiece(new Pawn(Color.BLACK,squares[7][0]));
        squares[7][1].setPiece(new Pawn(Color.BLACK,squares[7][1]));
        squares[7][2].setPiece(new Pawn(Color.BLACK,squares[7][2]));
        squares[7][3].setPiece(new Pawn(Color.BLACK,squares[7][3]));
        squares[7][4].setPiece(new Pawn(Color.BLACK,squares[7][4]));
        squares[7][5].setPiece(new Pawn(Color.BLACK,squares[7][5]));
        squares[7][6].setPiece(new Pawn(Color.BLACK,squares[7][6]));
        squares[7][7].setPiece(new Pawn(Color.BLACK,squares[7][7]));
    }
}