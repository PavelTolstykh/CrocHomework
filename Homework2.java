import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] dimensions = new String[] {"B", "KB", "MB", "GB", "TB"};
        double bytes = scanner.nextDouble();
        int count = 0;
        while (bytes >= 1024) {
            count++;
            bytes /= 1024;
        }
        System.out.println(String.format("%.1f", bytes) + " " + dimensions[count]);
    }
}
