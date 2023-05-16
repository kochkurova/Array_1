public class ArrayNormal {
    public static void main (String [] args) {

        int nums [] [] = {{16,28,37,46},{55,64,73,66},{82,91,10,84}, {21,51,85,33}};

        System.out.println("Исходный массив: ");

        for (int i = 0; i < nums.length; i++ ) {
            for (int j = 0; j < nums.length; j++){
                System.out.print(nums [i] [j] + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Исправленный массив, с значением 0 по диагонали: ");
        System.out.println();

        int num1, num2;
        num1 = 0;
        num2 = 3;

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i == j) {
                    nums[i][j] = 0;
                }

                if (i == num1 & j == num2) {
                    nums [i][j] = 0;
                    num1 ++;
                    num2 --;
                }
            }
        }
        for (int i = 0; i < nums.length; i++ ) {
            for (int j = 0; j < nums.length; j++){
                System.out.print(nums [i] [j] + " ");
            }
            System.out.println();
        }
    }
}
