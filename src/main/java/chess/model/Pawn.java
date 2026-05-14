package chess.model;

/**
 * Class for Pawn chess piece.
 */
class Pawn extends AbstractChessPiece {

  Pawn(Color color) {
    super(color);
  }

  @Override
  public String toString() {
    return "p";
  }

}
