package zad.zadanka;
import java.util.Arrays;
import java.util.Scanner;

public class zad6 {
    public static void main(String[]args) {
        int[] array = new int[3];
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++){
            System.out.println("Podaj liczbę na pozycji " + i);
            array[i] = scanner.nextInt();

        }
        Arrays.sort(array);
        for (int i = 0; i < 3; i++) {
            System.out.println(array[i]);
        }
    }
}
