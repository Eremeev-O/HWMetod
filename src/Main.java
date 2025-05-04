import java.time.LocalDate;

public class Main {
    // метод для задания №1
    public static boolean checkYear (int year) {
        int yearVis = 1584;
        int a = (year - yearVis ) % 4;
        int b = (year - yearVis ) % 100;
        int c = (year - yearVis ) % 400;
        return year >= yearVis && (a == 0 || c == 0) && b != 0;
    }
    // метод для задания №2
    public static void installationOfTheApplication (int os, int year) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0) {
            if (currentYear > year) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
        if (os == 1) {
            if (currentYear > year) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }

        }
    }
    // метод для задания №3
    public static int deliveryTime ( int delDist) {
        int daySum = 0;
        if (delDist < 100 ) {
            if (delDist < 20) {
                daySum = 1;
            }
            if (delDist >= 20 && delDist < 60) {
                daySum = 2;
            }
            if (delDist >= 60 && delDist < 100) {
                daySum = 3;
            }
            return daySum;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello, World!");
//Задание №1
        System.out.println("Задание №1");
        int year = 1988;
        if (checkYear(year)) {
            System.out.println(year + " год - високосный год");
        } else {
            System.out.println(year + " год  - не високосный год");
        }
//Задание №2
        System.out.println("Задание №2");
        int clientOs = 0;
        int clientDeviceYear = 2021;
        installationOfTheApplication(clientOs, clientDeviceYear);
//Задание №3
        System.out.println("Задание №3");
        int deliveryDistance = 100;
        int daysOfDelivery = deliveryTime(deliveryDistance);
        if (daysOfDelivery != 0) {
            System.out.println("Потребуется дней: " + daysOfDelivery);
        } else {
            System.out.println("Доставка невозможна");
        }
    }
}