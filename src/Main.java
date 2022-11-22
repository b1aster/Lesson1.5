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

        // Разделитель
        System.out.println();

        // Задание 5
        int monthNumber = 3;

        switch (monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println(monthNumber + " месяц принадлежит к сезону зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println(monthNumber + " месяц принадлежит к сезону весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println(monthNumber + " месяц принадлежит к сезону лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println(monthNumber + " месяц принадлежит к сезону осень");
                break;
            default:
                System.out.println("Номер месяца больше 13");
                break;
        }
    }
}