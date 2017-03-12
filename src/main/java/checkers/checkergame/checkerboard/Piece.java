package checkers.checkergame.checkerboard;

import java.awt.*;

/**
 * @description pieces have a distinct color; can move on the board diagonally left and right.
 */
abstract public class Piece {
    private final Color color;
    private Space location;

    public Piece(Color color) {
        this.color = color;
    }

    protected final void moveLeft(int numberOfSpaces) {
        // TODO - Implement logic
        /**
         * @param numberOfSpaces : this value must range between 1 and -1
         *                  moveLeft(1) moves the piece one Space forward diagonally to the left
         *                  moveLeft(-1) moves the piece one Space backwards diagonally to the left
         *                  moveLeft(0) moves the piece 0 spaces forwards.
         */
        setLocation(0,0);
    }


    protected final void moveRight(int numberOfSpaces) {
        // TODO - Implement logic
        /**
         * @param numberOfSpaces : this value must range between 1 and -1
         *                  moveRight(1) moves the piece one Space forward diagonally o the right
         *                  moveRight(-1) moves the piece one Space backwards diagonally to the right
         *                  moveRight(0) moves the piece 0 spaces forwards.
         * @description
         * if a piece is jumped in the process of a move,
         * then capture the piece that is being jumped.
         *
         */
        boolean capturedPiece = false;
        Piece captive = null;
        if(capturedPiece) {
            capture(captive);
        }
        setLocation(0,0);
    }

    /**
     * @param captive : the Piece to be captured
     *                - remove captive from board
     *                - increase points of player who owns piece
     */
    private void capture(Piece captive) {
        // TODO - Implement logic
    }

    /** @param row : row to move piece to
     *  @param column : column to move piece to */
    private final void setLocation(int row, int column) {
        Space desiredLocation = Board.getSpace(row,column);
        setLocation(desiredLocation);
    }

    /** @param spaceToOccupy : the checker-Space to occupy */
    private final void setLocation(Space spaceToOccupy) {
        this.location = spaceToOccupy;
    }

    protected abstract boolean canMove(Space space);
}