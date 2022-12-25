import java.util.Scanner;

public class Main {
    private  static  Feed feed;
    public static Scanner scanner = new Scanner(System.in);

    static{
        feed = new Feed();
        feed.add(new Republic());
        feed.add(new Federation());
        feed.add(new Monarchies());
    }

    //республика, монархия, федерация, государство
    //делаем информационное приложение про строи государств
    public static void main(String[] args){


        int choice = -1;
        do{
            System.out.println("1/ Добавить республику в список"); //менб создания страны
            System.out.println("2/ Добавить монархию в список"); //менб создания страны
            System.out.println("3/ Добавить федерацию в список"); //менб создания страны
            System.out.println("4/ Удалить страну из списка"); //нужно будет создать список
            System.out.println("5/ Вывести все");
            System.out.println("0/ Выход");

            choice = readInt();

            switch (choice){
                case 1:
                    System.out.println("Введите необходимые данные для Республики:");

                    System.out.println("Введите название страны: ");
                    String govermentName = scanner.nextLine();

                    System.out.println("Введите срок выборов: ");
                    int electionDeadline = readInt();

                    System.out.println("Введите количество партий: ");
                    int numberBatches = readInt();

                    feed.add(new Republic(govermentName, electionDeadline, numberBatches));
                    break;

                case 2:
                    System.out.println("Введите необходимые данные для Монархии:");

                    System.out.println("Введите название страны: ");
                    govermentName = scanner.nextLine();

                    System.out.println("Введите срок выборов: ");
                    electionDeadline = readInt();

                    System.out.println("Введите количество партий: ");
                    int timePower = readInt();

                    feed.add(new Monarchies(govermentName, electionDeadline, timePower));
                    break;

                case 3:
                    System.out.println("Введите необходимые данные для Федерации:");

                    System.out.println("Введите название страны: ");
                    govermentName = scanner.nextLine();

                    System.out.println("Введите срок выборов: ");
                    electionDeadline = readInt();

                    System.out.println("Введите количество партий: ");
                    int numberSubjects = readInt();

                    feed.add(new Federation(govermentName, electionDeadline, numberSubjects));
                    break;

                case 5:
                    feed.print();


            }


        }while (choice != 0);
        System.exit(0);


        feed.print();

    }

    private static int readInt() {
        int readed = -1;

        try {
            readed = Integer.parseInt(scanner.nextLine());
        }catch (NumberFormatException e){
            System.out.println("Вводите только числа");
            readed = readInt(); //рекурсия)
        }

        return readed;
    }


}