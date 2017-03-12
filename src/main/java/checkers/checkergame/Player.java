package checkers.checkergame;

import checkers.checkergame.checkerboard.King;
import checkers.checkergame.checkerboard.Pawn;
import checkers.checkergame.checkerboard.Piece;
import utils.FrontEnd;

import java.awt.*;

public class Player {
    private Piece selectedPiece;
    private Color color;
    private final long id;
    private final String name;

    public Player(String name, long id) {
        this.name = name;
        this.id = id;
    }

    public void selectPiece(Piece piece) {
        // TODO - Implement logic
        /**
         * @param piece - desired checker piece to select
         * @description - if I own this checker piece,
         *      then make this the selected checker piece
         */
        this.selectedPiece = piece;
    }

    /** move the selected piece forward and to the right diagonally */
    private void movePieceForwardRight() {
        getPawn().moveForwardRight();
    }

    /** move the selected piece forward and to the left diagonally */
    private void movePieceForwardLeft() {
        getPawn().moveForwardLeft();
    }

    /** @return currently selected checker piece as pawn */
    private Pawn getPawn() {
        return (Pawn)this.selectedPiece;
    }

    /** @return currently selected checker piece as king*/
    private King getKing() {
        return (King)this.selectedPiece;
    }

    /** sets the color this player will be using */
    public final void setColor(Color color) {
        FrontEnd.println("Assinging color [ %s ] to player [ %s ]", color.toString(), getName());
        this.color = color;
    }

    /** @return this player's name */
    public final String getName() {
        return this.name;
    }

    /** @return this player's id */
    public final long getId() {
        return this.id;
    }
}
