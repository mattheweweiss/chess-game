package chess.model;

import chess.Color;

/**
 * Class for Bishop chess piece.
 */
class Bishop extends AbstractChessPiece {

  Bishop(Color color) {
    super(color);
  }

  @Override
  public String toString() {
    return "B";
  }

}
