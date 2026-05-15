package chess.model;

public class GameImpl implements Game {

  private ChessBoard board;

  /**
   * Constructor for game implementation.
   * Initializes chess board.
   */
  public GameImpl() {
    board = new ChessBoardImpl();
  }

}
