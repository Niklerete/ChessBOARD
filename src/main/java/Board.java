public class Board extends main {


    public Board() {
        this.vertical = new StringBuilder();
    }



    public static void main(String[] args) {
        Board board = new Board();
        System.out.println(board.paintNormal(10, 6));


    }

}