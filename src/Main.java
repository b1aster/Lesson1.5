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

    }
}