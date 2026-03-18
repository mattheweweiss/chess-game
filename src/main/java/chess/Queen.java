package chess;

/**
 * Class for Queen chess piece.
 */
class Queen extends AbstractChessPiece {

  Queen(Color color) {
    super(color);
  }

  @Override
  public String toString() {
    return "Q";
  }

}
