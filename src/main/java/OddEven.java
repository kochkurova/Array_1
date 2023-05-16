import java.util.Scanner;

public class OddEven {
    public static void main (String [] args) {
        int oddEven [] = new int [10];

        Scanner in = new Scanner(System.in);

        int sum = 0;
        int decr = 0;

        System.out.println("Программа сложения четных и нечетный чисел");

        for (int i = 0; i < 10; i++) {
            System.out.println("Введи " + (i+1) + " число");
            oddEven [i] = in.nextInt();
        }

        for (int i = 0; i < 10; i = i+2) {
            sum = sum + oddEven[i];
        }

        for (int i = 1; i < 10; i = i+2) {
            decr = decr - oddEven[i];
        }

        System.out.println("Сумма четных элементов массива " + sum + " разница нечетных элементов массива " + decr);


    }



}
