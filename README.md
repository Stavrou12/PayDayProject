# PayDayProject

This repository contains a Java-based desktop application that implements the classic board game "Pay Day". The game is built using Java Swing for the graphical user interface and follows a Model-View-Controller (MVC) architectural pattern. This version features card descriptions and game text primarily in Greek.

## Gameplay Overview

PayDayProject is a two-player game where the objective is to manage your finances and end the game with the most money. Players navigate a game board representing a calendar month, encountering various financial events by drawing cards and landing on different spaces.

The game ends after a pre-determined number of "months" (laps around the board). The winner is the player with the highest net worth after paying off all bills and loans.

## Features

*   **Complete Digital Board Game:** A full implementation of the Pay Day board game for two players.
*   **Graphical User Interface:** An interactive and visual game board built with Java Swing.
*   **Dynamic Game Board:** The board positions (except for Start and Pay Day) are randomized at the beginning of each game for high replayability.
*   **Card-Driven Events:** Game events are managed through two decks of cards:
    *   **Mail Cards:** These can be bills to pay, advertisements to sell for quick cash, charity donations to the jackpot, events that involve the other player, or instructions to move to a new board position.
    *   **Deal Cards:** These are investment opportunities that a player can choose to buy. They can be sold later at a "Buyer" position for a potential profit.
*   **Financial Management:** Players must manage their money, pay bills, and take out loans when necessary.
*   **Jackpot:** A central pot of money that accumulates through certain cards and events, which can be won by landing on a specific space with a lucky roll.
*   **Customizable Game Length:** Players can choose to play for 1, 2, or 3 months before the game starts.

## How to Play

1.  **Start the Game:** Run the `GUI.java` class. A dialog will prompt you to select the number of months the game will last.
2.  **Determine First Player:** Both players roll the die. The player with the higher roll goes first.
3.  **Take Your Turn:**
    *   Roll the die by clicking your designated dice button.
    *   Your pawn will move the corresponding number of spaces on the board.
4.  **Perform Actions:** Based on the space you land on, perform the required action:
    *   **Mail Space:** Draw the indicated number of Mail Cards and follow their instructions.
    *   **Deal Space:** Draw a Deal Card. You have the option to buy it if you have enough money (or can take a loan).
    *   **Buyer Space:** If you own any Deal Cards, you can sell your highest-value deal.
    *   **Sweepstakes/Radio/Casino:** Follow the on-screen instructions for a chance to win money.
    *   **Pay Day:** When you reach or pass the final space, the month ends. You collect a salary of €3500, pay all your accumulated bills, and pay 10% interest on your outstanding loan. You also have the option to pay back all, part, or none of your loan principal.
5.  **End of Game:** The game concludes after both players have completed the selected number of months.
6.  **Declare the Winner:** The final scores are calculated (Cash - Bills - Loans). The player with the highest final score wins!

## Project Structure

The project is organized using the Model-View-Controller (MVC) design pattern:

*   **Model (`/src/model`)**: Contains the core game logic and data structures.
    *   `Player`: Manages a player's state, including money, loans, bills, and cards.
    *   `Cards`: Defines the structure and behavior for all card types (Deal, Bill, Charity, etc.).
    *   `Position`: Represents the different types of spaces on the game board.
    *   `Jackpot`: Manages the central jackpot funds.
    *   `Zari`: Represents the game die.
*   **View (`/src/view`)**: Manages the graphical user interface.
    *   `GUI.java`: The main class that builds and displays the entire game window, including the board, player info panels, and card stacks.
    *   Other classes like `loan.java`, `lottery.java`, and `payday.java` create the interactive dialog boxes for specific game events.
*   **Controller (`/src/controller`)**: Acts as the bridge between the Model and the View.
    *   `Controller.java`: Initializes the game state, processes user actions (like button clicks) from the View, updates the Model accordingly, and instructs the View on how to refresh.
*   **Resources (`/src/resources`)**: Contains all non-code assets.
    *   `images/`: Stores all the images used for the game board, cards, pawns, and logo.
    *   `*.csv`: The `dealCards.csv` and `mailCards.csv` files contain the data for all the game's cards, which are loaded at runtime.

## How to Run

1.  Clone the repository to your local machine:
    ```sh
    git clone https://github.com/stavrou12/PayDayProject.git
    ```
2.  Open the project in a Java-compatible IDE (e.g., Eclipse, IntelliJ IDEA).
3.  Ensure the `src/resources` directory is included in the project's build path so the images and CSV files can be located.
4.  Locate and run the `main` method in the `view/GUI.java` file.

https://drive.google.com/drive/folders/1DoD822bNsGKFhMdyUH-rZfayfTz1jDsh?usp=sharing
