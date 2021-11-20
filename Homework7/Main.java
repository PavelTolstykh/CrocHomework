public class Main {
    public static void main(String[] args) throws IllegalPositionException, IllegalMoveException {
//        System.out.println(new ChessPosition(-1, 1));
        ChessPosition[] knightPositions  = new ChessPosition[args.length];
        for (int i = 0; i < args.length; i++) {
            knightPositions[i] = Utils.parse(args[i]);
        }
        if (checkMovesKnight(knightPositions)) {
            System.out.println("OK");
        }
    }

    public static boolean checkMovesKnight(ChessPosition[] positions) throws IllegalMoveException{
        for (int i = 0; i < positions.length - 1; i++) {
            if (!positions[i].checkMoveKnight(positions[i + 1])) {
                throw new IllegalMoveException(positions[i], positions[i + 1]);
            }
        }
        return true;
    }
}
