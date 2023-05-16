public class NewArray {

    public static void main (String [] args) {

        int nums [] [] = {{16,28,37,46},{55,64,73,66},{82,91,10,84}, {21,51,85,33}};

        System.out.println("Исходный двухмерный массив: ");

        for (int i = 0; i < nums.length; i++ ) {
            for (int j = 0; j < nums.length; j++){
                System.out.print(nums [i] [j] + " ");

            }
            System.out.println();
        }

        System.out.println();
        System.out.println("Исправленный двухмерный массив, с значением 0 по диагонали: ");
        System.out.println();

        for (int i = 0; i < nums.length; i++ ) {
            for (int j = 0; j < nums.length; j++){
                nums [0][0] = 0;
                nums [1][1] = 0;
                nums [2][2] = 0;
                nums [3][3] = 0;

                nums [0][3] = 0;
                nums [1][2] = 0;
                nums [2][1] = 0;
                nums [3][0] = 0;

                System.out.print(nums [i] [j] + " ");

            }
            System.out.println();
        }




    }
}
