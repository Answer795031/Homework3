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

    public static void task1 () {
        System.out.println("Задача 1");

        /*
        Объявите переменные типа int, byte, short, long, float, double.
        Название переменных может быть любым, но если состоит из двух слов и более, должно соответствовать правилу camelCase.
        Выведите в консоль значение каждой переменной в формате «Значение переменной … с типом … равно …».
         */

        byte number = 9;
        short bigNumber = 24257;
        int veryBigNumber = 1398764;
        long prettyDamnBigNumber = 490298549396374L;
        float pi = 3.14F;
        double correctPi = 3.1415926535897992984626433832795028841971;

        System.out.println("Значение переменной number " + "с типом byte равно " + number);
        System.out.println("Значение переменной bigNumber " + "с типом short равно " + bigNumber);
        System.out.println("Значение переменной veryBigNumber " + "с типом int равно " + veryBigNumber);
        System.out.println("Значение переменной prettyDamnBigNumber " + "с типом long равно " + prettyDamnBigNumber);
        System.out.println("Значение переменной pi " + "с типом float равно " + pi);
        System.out.println("Значение переменной correctPi " + "с типом double равно " + correctPi);

        System.out.println(" ");
    }

    public static void task2 () {
        System.out.println("Задача 2");

        /*
        Ниже дан список различных значений. Инициализируйте переменные, используйте изученные ранее типы переменных.
        Значения:
        27.12
        987 678 965 549
        2.786
        569
        -159
        27897
        67
         */

        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786F;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        // Хоть по задаче этого и не требуется, сделал вывод переменных на экран

        System.out.println("Значение переменной a равно " + a);
        System.out.println("Значение переменной b равно " + b);
        System.out.println("Значение переменной c равно " + c);
        System.out.println("Значение переменной d равно " + d);
        System.out.println("Значение переменной e равно " + e);
        System.out.println("Значение переменной f равно " + f);
        System.out.println("Значение переменной g равно " + g);

        System.out.println(" ");

    }

    public static void task3 () {
        System.out.println("Задача 3");

        /*
        Три школьных учителя, Людмила Павловна, Анна Сергеевна и Екатерина Андреевна, ведут три класса.
        У Людмилы Павловны — 23 ученика , у Анны Сергеевны — 27 учеников, у Екатерины Андреевны — 30 учеников.
        Три учительницы закупили все вместе 480 листов бумаги на все три класса. Посчитайте, сколько достанется листов каждому ученику.
        Результат задачи выведите в консоль в формате: «На каждого ученика рассчитано … листов бумаги».
        Для объявления переменных не используйте тип var.
         */

        byte classLyudmila = 23, classAnna = 27, classEkaterina = 30;
        short totalSheets = 480;

        int totalStudents = classLyudmila + classAnna + classEkaterina;

        int sheetsPerStudent = totalSheets / totalStudents;

        System.out.println("На каждого ученика рассчитано " + sheetsPerStudent + " листов бумаги");

        System.out.println(" ");

    }

    public static void task4 () {
        System.out.println("Задача 4");

        /*
        Производительность машины для изготовления бутылок — 16 бутылок за 2 минуты. Какая производительность машины будет:

        за 20 минут,
        в сутки,
        за 3 дня,
        за 1 месяц?

        Рассчитывайте производительность работы машины в том случае, если она работает без перерыва заданный промежуток времени.
        Результаты подсчетов выведите в консоль в формате: «За … машина произвела … штук бутылок».
        Для объявления переменных не используйте тип var.
         */

        byte bottles = 16;
        byte minutes = 2;

        int bottlesPerMinute = bottles / minutes;   // производительность за 1 мин

        short day = 60 * 24;                        // минут в сутках
        int threeDays = day * 3;                    // минут в трех сутках
        int  month = day * 30;                      // минут в месяце

        int event1 = bottlesPerMinute * 20;         // за 20 мин
        int event2 = bottlesPerMinute * day;        // за сутки
        int event3 = bottlesPerMinute * threeDays;  // за 3 дня
        int event4 = bottlesPerMinute * month;      // за месяц

        System.out.println("За 20 минут машина произвела " + event1 + " штук бутылок");
        System.out.println("За сутки машина произвела " + event2 + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + event3 + " штук бутылок");
        System.out.println("За месяц машина произвела " + event4 + " штук бутылок");

        System.out.println(" ");

    }

    public static void task5 () {
        System.out.println("Задача 5");

        /*
        На ремонт школы нужно 120 банок краски двух цветов: белой и коричневой. На один класс уходит 2 банки белой
        и 4 банки коричневой краски. Сколько банок каждой краски было куплено?
        Выведите результат задачи в консоль в формате: «В школе, где … классов, нужно … банок белой краски и … банок коричневой краски».
        Для объявления переменных не используйте тип var.
         */

        byte totalJars = 120;
        byte whiteColorJar = 2;
        byte brownColorJar = 4;

        // Если на каждый класс уходит по 6 банок краски, то посчитаем общее количество классов,
        // зная общее количество банок, необходимых для ремонта школы

        int totalClasses = totalJars / (whiteColorJar + brownColorJar);

        int totalWhiteColorJars = totalClasses * whiteColorJar;         // общее количество банок с белой краской
        int totalBrownColorJars = totalClasses * brownColorJar;         // общее количество банок с коричневой краской

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteColorJars + " банок белой краски и " + totalBrownColorJars + " банок коричневой краски");

        System.out.println(" ");

    }

    public static void task6 () {
        System.out.println("Задача 6");

        /*
        Спортсмены следят за своим весом и тщательно относятся к тому, что и сколько они съедают.

        Вот один из рецептов, по которому спортсмен готовит себе завтрак:

        Бананы — 5 штук (1 банан — 80 грамм).
        Молоко — 200 мл (100 мл = 105 грамм).
        Мороженое-пломбир — 2 брикета по 100 грамм.
        Яйца сырые – 4 яйца (1 яйцо — 70 грамм).
        Смешать всё в блендере — и готово.

        Подсчитайте вес (количество граммов) такого спортзавтрака, а затем переведите его в килограммы.

        Результат в граммах и килограммах напечатайте в консоль.
         */

        byte banana = 5;
        byte bananaWeight = 80;
        short milk = 200;
        float milkWeight100 = 105F;                           // на 100 гр
        float milkWeight200 = milkWeight100 / 100 * milk;      // на 200 гр
        byte iceCream = 2;
        byte iceCreamWeight = 100;
        byte egg = 4;
        byte eggWeight = 70;

        double cocktailWeightGrams = (banana * bananaWeight) + milkWeight200 + (iceCream * iceCreamWeight) + (egg * eggWeight);

        System.out.println("Суммарный вес завтрака равен " + cocktailWeightGrams + "г.");

        double cocktailWeightKilo = cocktailWeightGrams / 1000;

        System.out.println("Суммарный вес завтрака " + cocktailWeightKilo + "кг.");

        System.out.println(" ");

    }

    public static void task7 () {
        System.out.println("Задача 7");

        /*
        Правила соревнований обновились, и спортсмену, чтобы оставаться в своей весовой категории, нужно сбросить 7 кг.
        Тренер скорректировал рацион так, чтобы спортсмен мог терять в весе от 250 до 500 грамм в день.

        Посчитайте, сколько дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм,
        а сколько — если каждый день будет худеть на 500 грамм.

        Посчитайте, сколько может потребоваться дней в среднем, чтобы добиться результата похудения.

        Результаты всех подсчетов выведите в консоль.
         */

        byte targetKg = 7;
        short lowerEdge = 250;
        short higherEdge = 500;

        int targetG = targetKg * 1000;

        int days250 = targetG / lowerEdge;
        int days500 = targetG / higherEdge;

        int middleEdge = (lowerEdge + higherEdge) / 2;

        int daysMiddle = targetG / middleEdge;

        System.out.println("Если сбрасывать по " + lowerEdge + " грамм в день, то цель будет достигнута за " + days250 + " дней");
        System.out.println("Если сбрасывать по " + higherEdge + " грамм в день, то цель будет достигнута за " + days500 + " дней");
        System.out.println("В среднем может потребоваться около " + daysMiddle + " дней");

        System.out.println(" ");

    }

    public static void task8 () {
        System.out.println("Задача 8");

        /*
        Представим, что мы работаем в большой компании, штат которой состоит из нескольких сотен сотрудников.
        В компании есть правило: чем дольше сотрудник работает в компании, тем ценнее он для бизнеса. Поэтому сотрудники,
        которые работают в компании дольше 3 лет, получают повышение зарплаты раз в год. Каждый год повышение составляет 10% от текущей зарплаты.

        К вам пришел руководитель с задачей автоматизировать повышение зарплаты, а также провести расчет для следующих сотрудников:

        Маша получает 67 760 рублей в месяц.
        Денис получает 83 690 рублей в месяц.
        Кристина получает 76 230 рублей в месяц.
        Каждому нужно увеличить зарплату на 10% от текущей месячной.
        Дополнительно руководитель попросил посчитать разницу между годовым доходом с нынешней зарплатой и после повышения.

        Посчитайте, сколько будет получать каждый из сотрудников, а также разницу между годовым доходом до и после повышения.

        Выведите в консоль информацию по каждому сотруднику. Например: «Маша теперь получает ... рублей. Годовой доход вырос на ... рублей».
         */

        float oldSalaryMasha = 67760f;
        float oldSalaryDenis = 83690f;
        float oldSalaryKristina = 76230f;

        double newSalaryMasha = oldSalaryMasha + (oldSalaryMasha / 100 * 10);
        double newSalaryDenis = oldSalaryDenis + (oldSalaryDenis /100 * 10);
        double newSalaryKristina = oldSalaryKristina + (oldSalaryKristina / 100 * 10);

        double yearSalaryMasha = (newSalaryMasha * 12) - (oldSalaryMasha * 12);
        double yearSalaryDenis = (newSalaryDenis * 12) - (oldSalaryDenis * 12);
        double yearSalaryKristina = (newSalaryKristina * 12) - (oldSalaryKristina * 12);

        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей. Годовой доход вырос на " + yearSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей. Годовой доход вырос на " + yearSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей. Годовой доход вырос на " + yearSalaryKristina + " рублей");

    }
}