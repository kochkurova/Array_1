import java.util.Scanner;

public class Array {

    public static void main (String [] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Введи число");

        int maxNum = in.nextInt();
        long result = 1;



        for (int i = 1; i < maxNum +1; i++) {
            result = result * i;

        }

        System.out.println(result);
    }
}
