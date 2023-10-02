public class Main {
    public static void main(String[] args) {
        int a = 100;
        byte b = 10;
        short c = 10000;
        long d = 100000;
        float e = 1;
        double f = 2;
        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);
        System.out.println();
        byte apple = 67;
        double oranges = 2.786;
        short rubles = 27897;
        long dollars = 987678965549L;
        double milk = 27.12;
        double sugar = 2.786;
        int water = -159;
        System.out.println();
        byte classA = 23;
        byte classB = 27;
        byte classC = 30;
        short paper = 480;
        int totalOne = 480 / (classA + classB + classC);
        System.out.println("На каждого ученика рассчитано " + totalOne + " листов бумаги");
        System.out.println();
        byte bottle = 16;
        int bottleMinutes = bottle / 2;
        int period = bottleMinutes * 20;
        int day = bottleMinutes * 1440;
        int day3 = day * 3;
        int month = day * 30;
        System.out.println("За 20 минут машина произвела " + period + " штук бутылок");
        System.out.println("За сутки машина произвела " + day + " штук бутылок");
        System.out.println("За три дня машина произвела " + day3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + month + " штук бутылок");


    }
}