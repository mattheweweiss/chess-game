package chess;

/**
 * Implementation for ChessBoard.
 */
public class ChessBoardImpl implements ChessBoard {

  private final String[][] board;

  /**
   * Constructor for chess board implementation.
   * Sets dimensions of chess board.
   */
  public ChessBoardImpl() {
    board = new String[8][8];
  }

  @Override
  public void buildBoard() {
    System.out.println("Building Board");
  }

  @Override
  public String visualizeBoard() {
    return "";
  }

  @Override
  public String[][] getBoard() {
    return this.board;
  }
}
