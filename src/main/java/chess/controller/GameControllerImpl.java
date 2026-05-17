package chess.controller;

import chess.model.Game;
import java.util.NoSuchElementException;
import java.util.Scanner;

/**
 * Implementation for game controller.
 */
public class GameControllerImpl implements GameController {

  private Game model;

  /**
   * Initializes game controller with model.
   *
   * @param game Game model
   */
  public GameControllerImpl(Game game) {
    model = game;
  }

  @Override
  public void run() {
    boolean exit = false;
    String command;
    String action;
    Scanner input = new Scanner(System.in);

    while (!exit) {
      try {
        command = input.nextLine().strip();
        action = command.split(" ")[0].toUpperCase();
      } catch (NoSuchElementException e) {
        break;
      }

      try {
        Command.valueOf(action);

        switch (action) {
          case "EXIT":
            exit = true;
            break;
        }

      } catch (IllegalArgumentException iae) {

      }
    }

    System.exit(0);
  }

}
