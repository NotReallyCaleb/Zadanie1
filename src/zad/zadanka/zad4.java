package zad.zadanka;
import java.util.Scanner;

public class zad4 {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj bok A: ");
        int a =scanner.nextInt();
        System.out.println("Podaj bok B: ");
        int b =scanner.nextInt();
        System.out.println("Podaj bok C: ");
        int c =scanner.nextInt();

        if (a +b > c){
            System.out.println("Trójkąt jest prawidłowy");
        } else {
            System.out.println("Trójkąt nie jest prawidłowy");
        }
    }
}
