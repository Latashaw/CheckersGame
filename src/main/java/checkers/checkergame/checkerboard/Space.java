package checkers.checkergame.checkerboard;

import java.awt.*;

/**
 * Spaces are used to represent the individual squares a checker-piece can occupy.
 */
public class Space {
    private final int rowLocation;
    private final int columnLocation;
    private final Color color;
    private Piece occupant = null;

    /** @param row - the board's respective row location
     *  @param column - the board's respective column location */
    public Space(int row, int column) {
        this.rowLocation = row;
        this.columnLocation = column;
        this.color = createColor();
    }

    /** @param piece - the checker piece to occupy this Space */
    public void setOccupant(Piece piece) {
        this.occupant = piece;
    }

    /** @return the potential Piece occupying this Space */
    public Piece getOccupant() {
        return this.occupant;
    }

    /** @return this Space's respective row location */
    public int getRow() {
        return this.rowLocation;
    }

    /** @return this Space's respective column location */
    public int getColumn() {
        return this.columnLocation;
    }

    /** @return true if a piece is currently occupying this Space */
    public boolean isOccupied() {
        return getOccupant() != null;
    }

    /** @return respective color of this Space
     *  color of Space can be determined by board location
     *  #this method is only called during instantiation of a space */
    private Color createColor() {
        boolean rowIsEven = rowLocation%2 == 0;
        boolean columnIsEven = columnLocation%2 == 0;
        if(rowIsEven && columnIsEven) {
            return Color.RED;
        } else  {
            return Color.BLUE;
        }
    }

    /** @return the respective Color of this Space */
    public Color getColor() {
        return color;
    }

    /** represents the space's location on the board*/
    @Override
    public String toString() {
        return "( " + getRow() + ", " + getColumn() + " ]";
    }
}
