import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int size, i, j, x;
        i = 0;
        j = 0;
        x = 1;

        System.out.println("Введи размер массива: ");

        size = scan.nextInt(); // переменная для ввода длинны массива

        int [][] array = new int[size][size];

        // массив заполненный нулями
        for (int numI = 0; numI < array.length; numI++) {
            for (int numJ = 0; numJ < array.length; numJ++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();


        for (;;) {
            for (;;) {
                // заполнение направо
                if (array[i][j] == 0) {
                    array[i][j] = x;
                    x++;
                }
                else break;
                if (j == size - 1) {
                    break;
                }
                else j++;
            }
            i++;

            if (x > size * size)
                break;
            // Заполнение налево

            for (;;) {
                if (array[i][j] == 0) {
                    array[i][j] = x;
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
            i++;

            if (x > size * size)
                break;

        }

        System.out.println("Исправленный массив:");

        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
