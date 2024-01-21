public class Main {
    public static void main(String[] args) {

        //Задача 1

        int total = 0;
        int cash = 15_000;
        int mouth = 0;
        while (total <= 2_459_000) {
            total = total + cash;
            total = total + total/100;
            mouth = mouth + 1;
            System.out.println("Месяц " + mouth + " сумма накоплений равна " + total + " рублей");
        }

        //Задача 2

        int i = 0;
        while (i <= 9) {
            i = i + 1;
            System.out.print(i + " ");
        } System.out.println(" ");
        for (int b = 10; b >= 1 ; b--) {
                System.out.print(b + " ");
        }

        //Задача 3

        System.out.println(" ");

        int population = 12_000_000;
        int birtRate = 17;
        int mortality = 8;
        for (int year = 1; year <= 10; year++) {
            population = population + population * (birtRate - mortality) / 1000;
            System.out.println("Год " + year + " численность населения составляет " + population);
        }

        //Задача 5

        int contribution = 15000;
        int month = 0;
        do {
            contribution = contribution + contribution / 100 * 7;
            month = month + 1;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма наколпений составила " + contribution);
            }
        }
        while (contribution <= 12000000);
    }
}