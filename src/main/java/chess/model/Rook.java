package chess.model;

/**
 * Class for Rook chess piece.
 */
class Rook extends AbstractChessPiece {

  Rook(Color color) {
    super(color);
  }

  @Override
  public String toString() {
    return "R";
  }

}
