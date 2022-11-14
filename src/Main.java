public class Main {
    public static void main(String[] args) {
        int age = 8;
        if (age > 18) {
            System.out.println("Ты должен праздновать");
            if (age < 21) {
                System.out.println("Выпей сливочного пива");
            } else {
                System.out.println("Иди куда хочешь и пей что хочешь");
            }
        } else if (age > 7) {
            System.out.println("Иди в школу");
        } else {
            System.out.println("Иди в детский сад");
        }

        int age1 = 18;
        if (age1 == 18) {
            System.out.println("С окончанием школы");
        } else if (age1 == 21) {
            System.out.println("Теперь тебе можно пить алкоголь");
        } else if (age1 == 7) {
            System.out.println("Иди в школу");
        } else {
            System.out.println("Пока сказать нечего");
        }

        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        int clientOS1 = 0;
        var clientDeviceYear = 2018;
        if (clientOS1 == 0 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите версию облегченную приложения для iOS по ссылке");
        }
        if (clientOS1 == 1 && clientDeviceYear > 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
        if (clientOS1 == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите версию облегченную приложения для Android по ссылке");
        }

        int year = 400;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год " + year + " является високосным");
        } else {
            System.out.println("Год " + year + " является невисокосным");
        }

        int delieveryDistance = 30;
        if (delieveryDistance < 20) {
            System.out.println("Потребуется сутки");
        }
        if (delieveryDistance > 20 && delieveryDistance < 60) {
            System.out.println("Потребуется двое суток");
        }
        if (delieveryDistance > 60 && delieveryDistance < 100) {
            System.out.println("Потребуется трое суток");
        }

        int monthNumber = 9;

        switch (monthNumber) {
            case 1:
                System.out.println("Месяц № " + monthNumber + " зимний месяц");
                break;
            case 2:
                System.out.println("Месяц № " + monthNumber + " зимний месяц");
                break;
            case 3:
                System.out.println("Месяц № " + monthNumber + " весенний месяц");
                break;
            case 4:
                System.out.println("Месяц № " + monthNumber + " весенний месяц");
                break;
            case 5:
                System.out.println("Месяц № " + monthNumber + " весенний месяц");
                break;
            case 6:
                System.out.println("Месяц № " + monthNumber + " летний месяц");
                break;
            case 7:
                System.out.println("Месяц № " + monthNumber + " летний месяц");
                break;
            case 8:
                System.out.println("Месяц № " + monthNumber + " летний месяц");
                break;
            case 9:
                System.out.println("Месяц № " + monthNumber + " осенний месяц");
                break;
            case 10:
                System.out.println("Месяц № " + monthNumber + " осенний месяц");
                break;
            case 11:
                System.out.println("Месяц № " + monthNumber + " осенний месяц");
                break;
            case 12:
                System.out.println("Месяц № " + monthNumber + " зимний месяц");
                break;
            default:
                System.out.println("Такого дня не существует");
        }


    }
}