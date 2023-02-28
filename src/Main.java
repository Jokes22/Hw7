public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int bank = 15000;
        int total = 0;
        int i = 0;
        while (total < 2_459_000) {
            i = i + 1;
            total = total + bank;

            System.out.println("Месяц " + i + " сумма накоплений равна " + total + " рублей");

        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int number = 0;
        int i = 1;
        while (number < 10) {
            number = number + i;

            System.out.print(number + " ");
        }
        System.out.println();
        int a = 1;
        for (int s = 10; s > 0; s = s - a) {
            System.out.print(s + " ");

        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");

        int people = 12_000_000;
        int natality = 17;
        int death = 8;
        int people2 = 1000;
        int growth = 0;
        growth = people / people2 * natality - (people / people2 * death);

        for (int i = 0; i < 10; i = i + 1) {
            people = people + growth;
            System.out.println("Год " + i + " численность населения составляет " + people);
        }
    }

    public static void task4() {
        System.out.println("Задача 4");
        int deposit = 15000;
        int a = 0;
        int total = 0;
        total = total + deposit;
        while (total < 12_000_000) {
            total = total + total / 100 * 7;
            a = a + 1;
            System.out.println("Месяц " + a + " сумма накопления " + total);

        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int deposit = 15000;
        int a = 0;
        int total = 0;
        total = total + deposit;
        while (total < 12_000_000) {
            total = total + total / 100 * 7;
            a = a + 1;
            if (a % 6 == 0)
            System.out.println("Месяц " + a + " сумма накопления " + total);

        }
    }

    public static void task6() {
        System.out.println("Задача 6");
        int deposit = 15000;
        int total = 0;
        total = total + deposit;
        int a = 0;
        while (a < 109) {
        a= a +1;
            total = total + total / 100 * 7;
            if (a % 6== 0)
                System.out.println("Месяц " + a + " сумма накопления " + total);
            }
    }



    public static void task7() {
        System.out.println("Задача 7");
        int Friday = 3;
        int month = 31;
        for (int number = 3; number <32; number = number + 7 ) {
            System.out.println("Сегодня пятница " + number + ". Необходимо подготовить отчет ");
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        int comet = 79;
        for(;comet < 2123; comet = comet + 79){
            if (comet > 1823 && comet < 2123){
                System.out.println(comet);
            }
        }
    }
}