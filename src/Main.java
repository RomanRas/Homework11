import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }
    public static void task1() {
        System.out.println("Задача 1");
        int year = 2200;
        checkForYearLeap(year);
        System.out.println();
    }

    public static void task2() {
        System.out.println("Задача 2");
        int currentYear = LocalDate.now().getYear();
        int operatingSystem = 0;
        checkForYearAndOS(currentYear, operatingSystem);
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int distance = 103;
        if (calculateDeliveryTime(distance) == 0) {
            System.out.println("Доставки нет");
        } else {
            System.out.println("Потребуется дней: " + calculateDeliveryTime(distance));
        }
    }
    public static void checkForYearLeap(int year) {
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }
    }
    public static void checkForYearAndOS(int year, int OS) {
        if (year < 2015) {
            if (OS == 0) {
                System.out.println("Установите облегченную версию для iOS по ссылке");
            } else {
                System.out.println("Установите облегченную версию для Android по ссылке");
            }
        } else {
            if (OS == 0) {
                System.out.println("Установите версию для iOS по ссылке");
            } else {
                System.out.println("Установите версию для Android по ссылке");
            }
        }
    }

    public static int calculateDeliveryTime(int distance) {
        if (distance <= 20) {
            return 1;
        } else if (distance <= 60){
            return 2;
        } else if (distance <= 100) {
            return 3;
        } else {
            return 0;
        }
    }
}