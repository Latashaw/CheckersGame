package checkers.checkergame.checkerboard;

import java.awt.*;

/**
 * @description Basic checker-piece; Can only move forward
 */
public class Pawn extends Piece {
    public Pawn(Color color) {
        super(color);
    }

    public final void moveForwardRight() {
        super.moveRight(1);
    }

    public final void moveForwardLeft() {
        super.moveLeft(1);
    }

    @Override
    protected boolean canMove(Space space) {
        // TODO - Implement logic
        return true;
    }
}
