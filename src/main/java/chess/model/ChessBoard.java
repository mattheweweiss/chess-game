package chess.model;

/**
 * Interface dictating methods for chess board implementation.
 */
interface ChessBoard {

  /**
   * Initializes chess game -- sets up pieces in correct places.
   */
  void buildBoard();

  /**
   * Returns visual representation of the chess board.
   *
   * @return String of board to print to player(s)
   */
  String visualizeBoard();

  /**
   * Returns chess board as data structure.
   *
   * @return 2d ChessPiece array of the board
   */
  ChessPiece[][] getBoard();

}
