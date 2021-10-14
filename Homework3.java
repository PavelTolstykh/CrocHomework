import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] array = scanner.nextLine().split(" ");
        int index = -1;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int el = Integer.parseInt(array[i]);
            if (el < min) {
                min = el;
                index = i;
            }
        }
        String tmp = array[0];
        array[0] = String.valueOf(min);
        array[index] = tmp;
        for (int i = 0; i < array.length; i++) {
            int el = Integer.parseInt(array[i]);
            if (el > min) {
                min = el;
                index = i;
            }
        }
        tmp = array[array.length - 1];
        array[array.length - 1] = String.valueOf(min);
        array[index] = tmp;
        for (String s : array) {
            System.out.print(s + " ");
        }
    }
}
