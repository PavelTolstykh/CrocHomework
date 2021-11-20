public class IllegalMoveException extends Exception {
    public IllegalMoveException(ChessPosition prev, ChessPosition next) {
        System.out.println("конь так не ходит: " + prev + " -> " + next);
    }
}
