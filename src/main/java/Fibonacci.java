import java.util.Scanner;

public class Fibonacci {
    public static void main (String args []) {
        Scanner in = new Scanner(System.in);

        int fib [] = new int [100];

        int num1, num2, num3;
        num1 = 1;
        num2 = 1;

        // запрос чисела для расчета
        System.out.println("Сколько чисел Фибонначи вам вывести ");
        int numI = in.nextInt();

        // проверка на число < 1

        if (numI < 1) {
            System.out.println("Так не надо!");
        }

        // проверка на число 1

        if (numI == 1) {

            System.out.println (num1);
        }

        // проверка на число 1

        if (numI == 2) {
            System.out.println(num1 + num2);
        }

        // проверка на числа > 2

        if (numI > 2) {

            // начало цикла с 1 1

            System.out.print(num1 + " " + num2 + " ");

            // цикл выполняющий расчет

            for (int i = 3; i < numI + 1 ; i ++) {

                num3 = num1 + num2;

                System.out.print(num3 + " ");

                num1 = num2;
                num2 = num3;

            }
        }
    }
}
