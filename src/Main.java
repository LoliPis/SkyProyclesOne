public class Main {
    public static void main(String[] args) {
        System.out.println("Домашнее задание - 1");
        //Ex1
        System.out.println("Задание номер один");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        //Ex2
        System.out.println("\nЗадание номер два");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }
        //Ex3
        System.out.println("\nЗадание номер три");
        for (int i = 0; i < 17; i += 2) {
            System.out.println(i);
        }
        //Ex4
        System.out.println("\nЗадание номер четыре");
        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }

        System.out.println("\nДомашнее задание - 2");
        //Ex1
        System.out.println("Задание номер один");
        for (int i = 1904; i <= 2096; i += 4) {
            System.out.println(i + " год является високосным");
        }
        //Ex2
        System.out.println("\nЗадание номер два");
        for (int i = 7; i <= 98; i += 7) {
            System.out.println(i);
        }
        //Ex3
        System.out.println("\nЗадание номер три");
        for (int i = 1; i <= 512; i += i) {
            System.out.println(i);
        }

        System.out.println("\nДомашнее задание - 3");
        //Ex1
        System.out.println("Задание номер один");
        int paymentPerMounth = 29_000;
        int accumulation = 0;
        for (int i = 0; i <= 12; i++) {
            accumulation += paymentPerMounth;
            System.out.println("Месяц " + i + " сумма накоплений равна " + accumulation + " рублей");
        }
        //Ex2
        System.out.println("\nЗадание номер два");
        int paymentPerMounth2 = 29_000;
        int accumulation2 = 0;
        for (int i = 0; i <= 12; i++) {
            accumulation2 = accumulation2 + accumulation2/100;
            accumulation2 += paymentPerMounth2;
            System.out.println("Месяц " + i + " сумма накоплений равна " + accumulation2 + " рублей");
        }
    }
}