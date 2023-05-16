import java.util.Scanner;
public class ArrayStar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // обьявляем сканнер

        System.out.println("Введи длинну массива, число не должно быть чётным: ");

        int size = scan.nextInt(); // обьявляем переменную для ввода длинны массива

        char [][] array = new char [size][size]; // обьявляем массив char размером в size

        // создание переменных для заполнения массива по диагоналям символом *
        int numI, numJ;
        numI = 0;
        numJ = size-1;

        // проверка на введение нечётного числа1
        if (size % 2 != 0) {
            // создаем цикл для заполнения массива array
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                     // заполнение по диагонали начиная с индекса [0][0]
                    if (i == j) {
                        array[i][j] = '*';
                    }
                    // заполнение по диагонали начиная с индекса [0][size]
                    if (i == numI & j == numJ) {
                        array[i][j] = '*';
                        numI++;
                        numJ--;
                    }
                    // заполнение массива символом * по горизонтали
                    if (size / 2 == i) {
                        array[i][j] = '*';
                    }
                    // заполнение массива символом * по вертикали
                    if (size / 2 == j) {
                        array[i][j] = '*';
                    }
                }
            }
            // создаем цикл для выведения заполненного массива в консоль
            System.out.println("Заполненный массив: ");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    System.out.print(array[i][j] + " ");
                }
                System.out.println();
            }
        }
        else System.out.println("Введи нечётное число!");
    }
}