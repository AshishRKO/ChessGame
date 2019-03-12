/**
 * Alipay.com Inc.
 * Copyright (c) 2004-2019 All Rights Reserved.
 */

/**
 * @author Ashish Barthwal
 * @version $Id: Game.java, v 0.1 2019-03-11 12:25 PM Ashish Barthwal $$
 */


import java.util.ArrayList;
import java.util.List;

/**
 * (1) Undo a move
 * (2) Redo a move
 * (3) Game is a driver program for our application
 * (4) Board should execute moves, not player, not Board
 */
public class Game {

    private Board board;
    private Player whitePlayer;
    private Player blackPlayer;
    private Player turnPlayer;// We can also keep color only
    private List<Move> movesList;
    private GameStatus gameStatus;

    /**
     * Getter method for property <tt>gameStatus</tt>.
     *
     * @return property value of gameStatus
     */
    public GameStatus getGameStatus() {
        return gameStatus;
    }

    /**
     * Setter method for property <tt>gameStatus</tt>.
     *
     * @param gameStatus value to be assigned to property gameStatus
     */
    public void setGameStatus(GameStatus gameStatus) {
        this.gameStatus = gameStatus;
    }

    public Game(Player p1, Player p2) {

        board = new Board();

        if(p1.getColor() == Color.WHITE) {
            this.turnPlayer = p1;
            whitePlayer = p1;
        } else {
            this.turnPlayer = p2;
            blackPlayer = p2;
        }

        movesList = new ArrayList<>();
        gameStatus = GameStatus.ACTIVE;
    }


    public boolean playerMove(Player player, Square start, Square end) {
        Move move = new Move(player, start, end);
        movesList.add(move);
        //return this.makeMove(move, player);

        start.getPiece().isValidMove(board, start, end);

        if (end.getPiece() != null && end.getPiece() instanceof King) {
            if(player.getColor() == Color.WHITE) {
                this.setGameStatus(GameStatus.WHITE_WIN);
            } else {
                this.setGameStatus(GameStatus.BLACK_WIN);
            }
        }

        changeTurn();

        return false;


    }


    public void changeTurn()
    {
        // set the current turn to the other player
        if(this.turnPlayer == whitePlayer) {
            this.turnPlayer = blackPlayer;
        } else {
            this.turnPlayer = whitePlayer;
        }
    }


    public boolean checkCheckMate()
    {
        return false;
    }

}