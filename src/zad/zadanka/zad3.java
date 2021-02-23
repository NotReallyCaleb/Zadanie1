package zad.zadanka;

import java.util.Scanner;

public class zad3
{
    public static void main(String[]args){

        double f;

        Scanner in = new Scanner(System.in);
        System.out.println("Podaj stopnie w Celsjuszach: ");
        int c = in.nextInt();

        f = (c * 1.8) + 32;
        System.out.println("To " + f + " w Fahrenheitach");
    }
}
