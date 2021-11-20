public class Utils {
    private final static String[] letters = new String[] {"a", "b", "c", "d", "e", "f", "g", "h"};

    public static String number2string(int number) {
        return letters[number];
    }

    public static ChessPosition parse(String position) throws IllegalPositionException {
        String[] parseArr = position.split("");
        int x = -1;
        for (int i = 0; i < letters.length; i++) {
            if (letters[i].equals(parseArr[0])) {
                x = i;
            }
        }
        return new ChessPosition(x, Integer.parseInt(parseArr[1]) - 1);
    }
}
