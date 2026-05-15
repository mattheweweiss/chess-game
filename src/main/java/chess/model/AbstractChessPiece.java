package chess.model;

import chess.Color;

/**
 * Abstract class implementing methods for ChessPiece implementors with same implementation.
 */
class AbstractChessPiece implements ChessPiece {
  Color color;

  AbstractChessPiece(Color color) {
    this.color = color;
  }

  @Override
  public Color getColor() {
    return color;
  }

}
