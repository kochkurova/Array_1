import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int min, max, minI, minJ, maxI, maxJ;
        minI = minJ = maxI = maxJ = 0;
        int [][] array = new int [4][4];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.println("Введите значение элемента массива с индексом [" + i + "][" + j + "]");

                array [i][j] = scanner.nextInt();
            }
        }

        min = max = array [0][0];

        System.out.println();
        System.out.println();
        System.out.println("Заполненный массив: ");

        for (int i = 0; i < array.length; i ++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    minI = i;
                    minJ = j;
                }
                if (array[i][j] > max) {
                    max = array [i][j];
                    maxI = i;
                    maxJ = j;
                }
            }
        }
        System.out.println("Минимальное значение: " + min + " с индексом [" + minI + "][" + minJ + "]");
        System.out.println("Максимальное значение: " + max + " с индексом [" + maxI + "][" + maxJ + "]");
        System.out.println();

        array [minI][minJ] = max;
        array [maxI][maxJ] = min;

        System.out.println("Измененный массив: ");

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
    }
}