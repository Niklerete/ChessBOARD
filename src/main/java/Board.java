public class Board extends main {


    public Board() {
        this.vertical = new StringBuilder();
    }



    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.paintSmall(5, 4));

        System.out.println(board.paintSmall(9, 8));

        System.out.println(board.paintSmall(15, 14));

    }

}