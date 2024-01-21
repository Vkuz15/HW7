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
    }
}