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
        System.out.println();
        byte jar = 120;
        byte white = 2;
        byte brown = 4;
        int classRoom = 120 / (white + brown);
        int whiteJar = classRoom * white;
        int brownJar = classRoom * brown;
        System.out.println("В школе, где " + classRoom + " классов, нужно " + whiteJar + " банок белой краски и " + brownJar + " банок коричневой краски");
        System.out.println();
        int bananas = 80 * 5;
        int milk1 = 105 * 2;
        int iceCream = 100 * 2;
        int eggs = 70 * 4;
        int totalWeight = bananas + milk1 + iceCream + eggs;
        float weightKg = totalWeight / 1000;
        System.out.println("Вес такого спортзавтрака " + totalWeight + " или " + weightKg + "кг");
        System.out.println();
        int sportsmanWeight = 7 * 1000;
        int day1 = sportsmanWeight / 500;
        int day2 = sportsmanWeight / 250;
        System.out.println("Спортсмену потребуется " + day1 + " дней если, спортсмен будет терять каждый день по 500 грамм или " + day2 + " дней, если каждый день он будет худеть на 250 грамм.");
        System.out.println();
        int Masha = 67760;
        int Denis = 83690;
        int Kristina = 76230;
        double MashaNew = Masha * 0.1 + Masha;
        double DenisNew = Denis * 0.1 + Denis;
        double KristinaNew = Kristina * 0.1 + Kristina;
        double MashaYear = (MashaNew) * 12 - (Masha * 12);
        double DenisYear = (DenisNew * 12) - (Denis * 12);
        double KristinaYear = (KristinaNew * 12) - (Kristina * 12);
        System.out.println("Маша теперь получает " + MashaNew + " рублей. Годовой доход вырос на " + MashaYear + " рублей");
        System.out.println("Денис теперь получает " + DenisNew + " рублей. Годовой доход вырос на " + DenisYear + " рублей");
        System.out.println("Кристина теперь получает " + KristinaNew + " рублей. Годовой доход вырос на " + KristinaYear + " рублей");









    }
}