import java.util.Scanner;

public class ArraySpiral {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size, i, j, x;
        i = 0;
        j = 0;
        x = 1;

        System.out.println("Введи размер массива: ");

        size = scan.nextInt(); // переменная для ввода длинны массива

        int [][] spiral = new int[size][size];

         // массив заполненный нулями
        for (int numI = 0; numI < spiral.length; numI++) {
            for (int numJ = 0; numJ < spiral.length; numJ++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (; ;) {

            // Заполнение направо
            for (;;) {
                if (spiral[i][j] == 0) {
                    spiral[i][j] = x;
                    x++;
                }
                else {
                    j--;
                    break;
                }

                if (j == size - 1) {
                    break;
                }
                else j++;
            }
            i++;

            if (x > size * size)
                break;

            // Заполнение вниз

            for (;;) {
                if (spiral[i][j] == 0) {
                    spiral[i][j] = x;
                    x++;
                }
                else {
                    i--;
                    break;
                }
                if (i == size - 1) {
                    break;
                }
                else i++;
            }
            j--;

            if (x > size * size)
                break;

            // Заполнение налево

            for (;;) {
                if (spiral[i][j] == 0) {
                    spiral[i][j] = x;
                    x++;
                }
                else {
                    j++;
                    break;
                }
                if (j == 0) {
                    break;
                }
                else j--;
            }
            i--;

            if (x > size * size)
                break;

            // заполнение наверх

            for (;;) {
                if (spiral[i][j] == 0) {
                    spiral[i][j] = x;
                    x++;
                }
                else {
                    i++;
                    break;
                }
                if (i == 0) {
                    break;
                }
                else i--;
            }
            j++;

            if (x > size * size)
                break;
        }
        for (i = 0; i < spiral.length; i++) {
            for (j = 0; j < spiral.length; j++) {
                System.out.print(spiral[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
