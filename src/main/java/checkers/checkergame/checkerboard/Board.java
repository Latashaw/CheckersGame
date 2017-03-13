package checkers.checkergame.checkerboard;

import java.util.ArrayList;

/**
 * @description A checkerboard is a 8 by 8 grid
 * with colors alternating in a pattern such that
 * no two tiles of the same color touch
 *
 * @purpose The checkerboard is represented as an ArrayList of Space objects,
 * each of which has a distinct location
 */
public class Board {
    private static ArrayList<Space> spaces = createSpaces();

    /**  a checker board is 8 units wide
     *   a checker board is 8 units tall */
    private static ArrayList<Space> createSpaces() {
        ArrayList<Space> spaces = new ArrayList<Space>();
        for (int rowLocation = 0; rowLocation < 8; rowLocation++) {
            for (int columnLocation = 0; columnLocation < 8; rowLocation++) {
                Space space = new Space(rowLocation, columnLocation);
                spaces.add(space);
            }
        }
        return spaces;
    }

    /** @param rowLocation - row of the desired Space
     *  @param columnLocation - column of the desired Space
     *  @return respective Space on board */
    public static Space getSpace(int rowLocation, int columnLocation) {
        /** search through ArrayList for checker-Space that fulfills specified parameters */
        for (Space space : spaces) {
            boolean isInRow = space.getRow() == rowLocation;
            boolean isInColumn = space.getColumn() == columnLocation;
            if (isInRow && isInColumn) {
                return space;
            }
        }
        return null;
    }
}
