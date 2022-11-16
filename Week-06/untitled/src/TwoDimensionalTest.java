public class TwoDimensionalTest {
    public static void main(String[] args) {
        Board board1 = new Board(5);
        board1.print();
// find max value in third row (first row is at 0)
        System.out.println("\nmax in row 2: " + board1.findMaxInRow(2));
// find max value in third column (first column is at 0)
        System.out.println("\nmax in column 2: " + board1.findMaxInColumn(2));
// find max in all diagonals (max of array)
        System.out.println("\nmax in board: " + board1.findMaxInDiagonal());
    }

}
