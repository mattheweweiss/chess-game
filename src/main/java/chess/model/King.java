package chess.model;

/**
 * Class for King chess piece.
 */
class King extends AbstractChessPiece {

  King(Color color) {
    super(color);
  }

  @Override
  public String toString() {
    return "K";
  }

}
