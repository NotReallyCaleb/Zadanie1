package zad.zadanka;
import java.util.Scanner;
import static java.lang.Math.*;

public class zad7 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj x1: ");
        int x1 = scanner.nextInt();
        System.out.println("Podaj y1: ");
        int y1 = scanner.nextInt();
        System.out.println("Podaj x2: ");
        int x2 = scanner.nextInt();
        System.out.println("Podaj y2: ");
        int y2 = scanner.nextInt();

        System.out.println(sqrt((Math.pow(x2-x1, 2))+ (Math.pow(y2-y1, 2))));
    }
}
