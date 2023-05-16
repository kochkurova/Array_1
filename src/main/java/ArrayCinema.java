import java.util.Scanner;
public class ArrayCinema {
    public static void main(String[] args) {
        // создали обьект для ввода кол - ва человек желающих купить билеты
        Scanner scan = new Scanner(System.in);

        int check;

        // создаем array cinema [][];
        int [][] cinema = {{1,1,1,0,1,0,0,0,0,0},
                           {0,0,1,0,0,1,0,0,1,0},
                           {0,0,0,0,1,1,1,1,1,0},
                           {0,1,1,1,1,0,0,0,0,0},
                           {0,0,0,0,0,0,0,1,1,0},
                           {0,1,1,1,1,1,0,0,0,0},
                           {0,0,1,1,1,0,1,0,1,0},
                           {1,1,1,0,0,0,0,0,0,0},
                           {1,1,1,1,1,1,0,0,0,0},
                           {0,1,1,1,1,1,0,0,0,0}
        };
        // вывод array cinema [][] для просмотра свободных мест
        System.out.println("Зал кинотеатра \n 1 - занято \n 0 - место свободно\n");
        for (int i = 0; i < cinema.length; i++) {
            for (int j = 0; j < cinema.length; j++) {
                System.out.print(cinema [i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("------------------- \n \t   экран\n");

        // запрос на кол - во человек желающих купить билет
        System.out.println("Для выхода из программы введите 0");
        System.out.print("Укажите количество человек для покупки билетов: ");

        int people = scan.nextInt();
        if (people == 0) return;

        nextI:
        for (int i = 0; i < cinema.length; i++) {
            nextJ:
            for (int j = 0; j < cinema.length; j++) {
                // поиск свободного места
                if (cinema [i][j] == 0) {
                    // проверка на вмещаемость введенного кол - ва человек
                    if (cinema.length - people >= j) {
                        check = 0;
                        // проверка на наличие свободных мест подряд
                        for (int checkJ = j; checkJ < j + people; checkJ++) {
                            // проверка свободного места
                            if (cinema[i][checkJ] == 0) {
                                continue;
                            }
                            else check ++;
                        }
                        // места найдены
                        if (check == 0) {
                           for (int checkJ = j; checkJ < j + people; checkJ++) {
                               cinema[i][checkJ] = 1;
                           }
                            System.out.println("Выбранные места проданы. Стоимость билетов " + people * 100 + " рублей." );
                            // вывод array cinema [][] для просмотра свободных мест
                            System.out.println("Зал кинотеатра \n 1 - занято \n 0 - место свободно\n");
                            for (int i2 = 0; i2 < cinema.length; i2++) {
                                for (int j2 = 0; j2 < cinema.length; j2++) {
                                    System.out.print(cinema [i][j] + " ");
                                }
                                System.out.println();
                            }
                            System.out.println();
                            System.out.println("------------------- \n \t   экран\n");
                            return;
                        }
                        // места не найдены
                        else continue nextJ;
                    }
                    else continue nextI;
                }
            }
        }
    }
}