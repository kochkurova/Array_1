import java.util.Scanner;
public class MinMax {
    public static void main (String args []) {
        Scanner in = new Scanner(System.in);

        int nums [] = new int [5];
        int max, min, minAddress, maxAddress;
        min = 2147483647;
        max = -2147483648;
        minAddress = - 1;
        maxAddress = -1;

        for(int i = 0; i < 5; i++) {
            System.out.println("Введи " + (i+1) + " число");
            nums[i] = in.nextInt();

            if (nums [i] < min) {
                min = nums[i];
                minAddress = i;
            }

            if (nums [i] > max) {
                max = nums [i];
                maxAddress = i;
            }
        }

        System.out.println("Максимальное число " + max + " с порядковым номером " + maxAddress);
        System.out.println("Минимальное число " + min + " с порядковым номером " + minAddress);
    }
}
