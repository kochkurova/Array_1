public class Bubble {
    public static void main (String [] args) {

        int size;
        size = 10;

        int nums [] = {8, 5, -2, 12, 14, -555, 21, -5, 9, 15};

        System.out.print("Исходный массив: ");

        for (int i = 0; i < size; i++) {
            System.out.print(nums [i] + " ");

        }

        System.out.println();



        for (int j = 0; j < size; j++) {
            for (int i = 1; i < size; i++) {
                if (nums [i] < nums [i - 1]) {
                    int a;
                    a = nums [i];
                    nums [i] = nums [i - 1];
                    nums [i - 1] = a;
                }
            }

        }

        System.out.print("Массив после сортировки: ");
        for (int i = 0; i < size; i++) {
            System.out.print(nums [i] + " ");

        }





    }
}
