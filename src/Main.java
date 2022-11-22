public class Main {
    public static void main(String[] args) {

        // Задание 1
        int clientOS = 0;

        if (clientOS == 0){
            System.out.println("Установите версию приложения для iOS по ссылке ...");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке ...");
        }

        // Разделитель
        System.out.println();

        // Задание 2
        int clientDeviceYear = 2013;

        if (clientDeviceYear < 2015){

            if (clientOS == 0){
                System.out.println("Установите облегченную версию приложения для iOS по ссылке ...");
            } else if (clientOS == 1){
                System.out.println("Установите облегченную версию приложения для Android по ссылке ...");
            }

        } else {

            if (clientOS == 0){
                System.out.println("Установите версию приложения для iOS по ссылке ...");
            } else if (clientOS == 1){
                System.out.println("Установите версию приложения для Android по ссылке ...");
            }

        }

        // Разделитель
        System.out.println();

        // Задание 3
        int year = 2012;
        boolean leap = false;

        if (year % 4 == 0){

            if (year % 100 == 0) {

                if (year % 400 == 0)
                    leap = true;
                else
                    leap = false;

            } else {
                leap = true;
            }

        } else {
            leap = false;
        }

        if (leap){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }

        // Разделитель
        System.out.println();

        // Задание 4
        int deliveryDistance = 95;
        int daysAmount = 0;

        if (deliveryDistance < 20){
            daysAmount = 1;
        } else {
            daysAmount = ((deliveryDistance + 20) / 40) + 1;
        }

        System.out.println("Потребуется дней: " + daysAmount);

    }
}