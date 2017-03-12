package checkers.checkergame.checkerboard;

import java.awt.*;

/**
 * @description A king can do everything a pawn can do, as well as move backwards
 * @note King extends Pawn
 */
public class King extends Pawn {
    public King(Color color) {
        super(color);
    }

    public void moveBackwardRight() {
        super.moveRight(-1);
    }

    public void moveBackwardLeft() {
        super.moveLeft(-1);
    }

    @Override
    protected boolean canMove(Space space) {
        // TODO - Implement logic
        return true;
    }
}
