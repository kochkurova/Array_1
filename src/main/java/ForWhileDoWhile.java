public class ForWhileDoWhile {


    public static void main (String [] args) {
        for (int i = 1; i <= 10; i += 2) {

            System.out.println(i);

        }
        System.out.println();

        for (int i = 100; i > 10; i -= 10) {

            System.out.println(i);

        }

        System.out.println();

        int i = 10;

        while (i < 20) {

            System.out.println(i);

            i++;

        }

        System.out.println();


        boolean isTrue = true;
        int j = 0;
        while (isTrue) {

            System.out.println(j);

            j += 2;

            if (j > 10) {
                isTrue = false;
            }

        }

        System.out.println();

        int z = 0;

        do {
            System.out.println(z);
            z ++;
        } while (z < 0);


        System.out.println();

        int b = 15;

        do {
            System.out.println(b);

            b --;
        } while (b > 13);


    }
}
