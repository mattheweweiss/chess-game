package chess.model;

import chess.Color;

/**
 * Implementation for ChessBoard.
 */
class ChessBoardImpl implements ChessBoard {

  private final ChessPiece[][] board;

  /**
   * Constructor for chess board implementation.
   * Sets dimensions of chess board.
   */
  public ChessBoardImpl() {
    board = new ChessPiece[8][8];
    buildBoard();
  }

  private void buildWhite() {

    board[0][0] = new Rook(Color.WHITE);
    board[0][1] = new Knight(Color.WHITE);
    board[0][2] = new Bishop(Color.WHITE);
    board[0][3] = new Queen(Color.WHITE);
    board[0][4] = new King(Color.WHITE);
    board[0][5] = new Bishop(Color.WHITE);
    board[0][6] = new Knight(Color.WHITE);
    board[0][7] = new Rook(Color.WHITE);
    for (int j = 0; j < 8; j++) {
      board[1][j] = new Pawn(Color.WHITE);
    }

  }

  private void buildBlack() {

    for (int j = 0; j < 8; j++) {
      board[6][j] = new Pawn(Color.BLACK);
    }
    board[7][0] = new Rook(Color.BLACK);
    board[7][1] = new Knight(Color.BLACK);
    board[7][2] = new Bishop(Color.BLACK);
    board[7][3] = new Queen(Color.BLACK);
    board[7][4] = new King(Color.BLACK);
    board[7][5] = new Bishop(Color.BLACK);
    board[7][6] = new Knight(Color.BLACK);
    board[7][7] = new Rook(Color.BLACK);

  }

  @Override
  public void buildBoard() {
    buildWhite();
    buildBlack();
  }

  @Override
  public String visualizeBoard() {
    StringBuilder builder = new StringBuilder();

    for (int i = 7; i >= 0; i--) {

      builder.append(" ");

      for (int j = 0; j < 8; j++) {

        if (board[i][j] != null) {

          if (board[i][j].getColor() == Color.WHITE) {
            builder.append("\u001B[37m");
            builder.append(board[i][j].toString());
            builder.append("\u001B[0m");
          } else if (board[i][j].getColor() == Color.BLACK) {
            builder.append("\u001B[30m");
            builder.append(board[i][j].toString());
            builder.append("\u001B[0m");
          }

        } else {
          builder.append(" ");
        }
        builder.append(" ");

      }

      builder.append(" ").append(System.lineSeparator());

    }

    return builder.toString();
  }

  @Override
  public ChessPiece[][] getBoard() {
    return this.board;
  }
}
