package battleship;

public class Game {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Game game = new Game();
        Board board = new Board(10);

        board.printBoard();
    }
}