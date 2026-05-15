package chess.model;

import chess.Color;

/**
 * Class for Knight chess piece.
 */
class Knight extends AbstractChessPiece {

  Knight(Color color) {
    super(color);
  }

  @Override
  public String toString() {
    return "N";
  }

}
