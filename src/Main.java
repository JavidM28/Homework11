import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        leapYearCheck(1900);
        deviceCompatibilityChecker(0, 2015);
        deliveryDayCheck(95);
    }
    //TASK 1
    public static void leapYearCheck(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год — високосный год");
        } else {
            System.out.println(year + " год — невисокосный год");
        }
    }

    //TASK 2
    public static void deviceCompatibilityChecker(int clientOSNew, int clientDeviceYear){
        int currentYear = LocalDate.now().getYear();
        if (clientOSNew == 0 && clientDeviceYear < currentYear) {
            System.out.println("Установите облегченную версию приложения для IOS по ссылке.");
        }
        else if (clientOSNew == 0 && clientDeviceYear >= currentYear)
        {
            System.out.println("Установите версию приложения для IOS по ссылке.");
        }
        else if (clientOSNew == 1 && clientDeviceYear < currentYear)
        {
            System.out.println("Установите облегченную версию приложения для Android по ссылке.");
        }
        else
        {
            System.out.println("Установите версию приложения для Android по ссылке.");
        }
    }

    public static void deliveryDayCheck(int deliveryDistance){
        if (deliveryDistance <= 20)
        {
            System.out.println("Потребуется дней: 1");
        }
        else if (deliveryDistance > 20 && deliveryDistance <= 60)
        {
            System.out.println("Потребуется дней: 2");
        }
        else if (deliveryDistance > 60 && deliveryDistance <= 100)
        {
            System.out.println("Потребуется дней: 3");
        }
        else
        {
            System.out.println("Доставка недоступна.");
        }
    }
}