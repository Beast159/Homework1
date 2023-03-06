public class Main {
    public static void main(String[] args) {
        System.out.println("Дратуйте))");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxerAli = 78.2;
        var boxerMike = 82.7;
        var totalWeight = boxerAli + boxerMike;
        System.out.println(totalWeight);
        var weightDifference = boxerMike - boxerAli;
        System.out.println(weightDifference);
        var weightDiffer = boxerMike % boxerAli;
        System.out.println(weightDiffer);

        var work = 640;
        var time = 8;
        var employee = work / time;
        System.out.println("Всего работников в компании " + employee + " человек");
        var moreemployee = employee + 94;
        System.out.println(moreemployee);
        var newTime = work / moreemployee;
        System.out.println("Если в компании работает " + moreemployee + " человек, то всего " + newTime + " часов работы может быть поделено между сотрудниками");


        // Task 1
        byte a = 1;
        System.out.println("Значение переменной a с типом  byte равно " + a);
        short b = 555;
        System.out.println("Значение переменной b с типом  short равно " + b);
        int c = 2000000;
        System.out.println("Значение переменной c с типом  int равно " + c);
        long d = 500_000_000_000L;
        System.out.println("Значение переменной d с типом  long равно " + d);
        float e = 31.2f;
        System.out.println("Значение переменной e с типом  float равно " + e);
        double f = 555.123456789;
        System.out.println("Значение переменной f с типом  double равно " + f);

        // Task 2
        byte g = 67;
        short h = -159;
        int ii = 569;
        int j = 27897;
        long k = 987_678_965_549L;
        float l = 27.12f;
        double m = 2.786;


        // Task 3
        int teacherLydmilaPavlodna = 23;
        int teacherAnnaSergeevna = 27;
        int teacherEkaterinaAndreevna = 30;
        int sheet = 480;
        int totalStudents = teacherLydmilaPavlodna + teacherAnnaSergeevna + teacherEkaterinaAndreevna;
        System.out.println(totalStudents);
        int sheetsToEach = sheet / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsToEach + " листов бумаги");

        // Task 4
        int productivity = 16;
        int inAMinute = productivity / 2;
        System.out.println(inAMinute);
        int bottleAtMinutes20 = inAMinute * 20;
        System.out.println("За 20 минут " + " машина произвела " + bottleAtMinutes20 + " бутылок");
        int bottleDay = inAMinute * 1440;
        System.out.println("За сутки " + " машина произвела " + bottleDay + " бутылок");
        int bottleThreeDay = bottleDay * 3;
        System.out.println("За 3 дня " + " машина произвела " + bottleThreeDay + " бутылок");
        int bottleMonth = bottleDay * 30;
        System.out.println("За месяц " + " машина произвела " + bottleMonth + " бутылок");

        // Task 5
        int totalColor = 120;
        int jarsOnOneClass = 2 + 4;
        System.out.println(jarsOnOneClass);
        int howClasses = totalColor / jarsOnOneClass;
        System.out.println(howClasses);
        int whiteColor = howClasses * 2;
        System.out.println(whiteColor);
        int brownColor = howClasses * 4;
        System.out.println(brownColor);
        System.out.println("В школе, где " + howClasses + " классов, нужно " + whiteColor + " банок белой краски и " + brownColor + " банок коричневой краски");

        // Task 6
        float weightBanana = 5 * 80;
        float weightMilk = 2 * 105;
        float weightAceCream = 2 * 100;
        float weightEgg = 4 * 70;
        float breakfast = weightBanana + weightMilk + weightAceCream + weightEgg + weightEgg;
        System.out.println("Вес всего завтрака " + breakfast + " грамм");
        float breakfastKg = breakfast / 1000;
        System.out.println("Вес всего завтрака " + breakfastKg + " кг");

        // Task 7
        int loseWeightGr = 7 * 1000;
        System.out.println(loseWeightGr);
        int loseWeightSlow = loseWeightGr / 250;
        System.out.println(loseWeightSlow + " дней потребуется на похудение если скидывать по 250 гр в день");
        int loseWeightFast = loseWeightGr / 500;
        System.out.println(loseWeightFast + " дней потребуется на похудение если скидывать по 500 гр в день");
        int loseWeightAverage = loseWeightGr / ((250 + 500) / 2);
        System.out.println(loseWeightAverage + " дней потребуется на похудение в среднем");

        // Task 8
        int salaryMasha = 67760;
        int newSalaryMasha = salaryMasha + (salaryMasha / 10);
        int annualIncomeMashaOld = 67760 * 12;
        int annualIncomeMashaNew = newSalaryMasha * 12;
        int annualIncomeGrowthMasha = annualIncomeMashaNew - annualIncomeMashaOld;
        System.out.println("Маша теперь получает " + newSalaryMasha + " рублей");
        System.out.println("Годовой доход Маши вырос на " + annualIncomeGrowthMasha + " рублей");

        int salaryDenis = 83690;
        int newSalaryDenis = salaryDenis + (salaryDenis / 10);
        int annualIncomeDenisOld = 83690 * 12;
        int annualIncomeDenisNew = newSalaryDenis * 12;
        int annualIncomeGrowthDenis = annualIncomeDenisNew - annualIncomeDenisOld;
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей");
        System.out.println("Годовой доход Дениса вырос на " + annualIncomeGrowthDenis + " рублей");

        int salaryKristina = 76230;
        int newSalaryKristina = salaryKristina + (salaryKristina / 10);
        int annualIncomeKristinaOld = 76230 * 12;
        int annualIncomeKristinaNew = newSalaryKristina * 12;
        int annualIncomeGrowthKristina = annualIncomeKristinaNew - annualIncomeKristinaOld;
        System.out.println("Кристина теперь получает " + newSalaryKristina + " рублей");
        System.out.println("Годовой доход Кристины вырос на " + annualIncomeGrowthKristina + " рублей");


        // Условный оператор:  Task 1
        int age = 22;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ты совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то ты не достиг совершеннолетия, нужно немного подождать");
        }
        int age1 = 15;
        if (age1 >= 18) {
            System.out.println("Если возраст человека равен " + age1 + ", то ты совершеннолетний ");
        } else {
            System.out.println("Если возраст человека равен " + age1 + ", то ты не достиг совершеннолетия, нужно немного подождать");
        }


        // Task 2
        int temperature = 15;
        if (temperature <= 5) {
            System.out.println("На улице " + temperature + ", нужно надеть шапку ");
        } else {
            System.out.println("На улице " + temperature + ", можно идти без шапки");
        }
        int temperature1 = 2;
        if (temperature1 <= 5) {
            System.out.println("На улице " + temperature1 + ", нужно надеть шапку ");
        } else {
            System.out.println("На улице " + temperature1 + ", можно идти без шапки");
        }

        // Task 3
        int speed = 75;
        if (speed >= 60) {
            System.out.println("Если скорость " + speed + ", придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", можно ездить спокойно");
        }
        int speed1 = 49;
        if (speed1 >= 60) {
            System.out.println("Если скорость " + speed1 + ", придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed1 + ", можно ездить спокойно");
        }
        // Task4
        int age2 = 26;
        if (age2 > 2 && age2 < 6) {
            System.out.println("Если тебе сейчас " + age2 + ", то тебе нужно ходить в детский сад");
        } else {
            if (age2 > 7 && age2 < 18) {
                System.out.println("Если тебе сейчас " + age2 + ", то тебе нужно ходить в школу");
            } else {
                if (age2 > 18 && age2 < 24) {
                    System.out.println("Если тебе сейчас " + age2 + ", то тебе нужно ходить в университет");
                } else {
                    if (age2 > 24) {
                        System.out.println("Если тебе сейчас " + age2 + ", то лафа закончилась - иди работай");
                    }
                }

            }
        }

        //Task 5

        int age3 = 4;
        if (age3 < 5) {
            System.out.println("Если тебе сейчас " + age3 + ", то тебе нельзя кататься на аттракционе");
        } else {
            if (age3 > 5 && age3 < 14) {
                System.out.println("Если тебе сейчас " + age3 + ", можно кататься на аттракционе в сопровождении");
            } else {
                if (age3 > 14) {
                    System.out.println("Если тебе сейчас " + age3 + ", то тебе можно без сопровождения взрослого");
                }

            }
        }

        //Task 6
        int passengers = 110;
        if (passengers < 60) {
            System.out.println("Есть сидячие места");
        } else {
            if (passengers > 60 && passengers < 102) {
                System.out.println("Есть стоячие места");
            } else {
                if (passengers > 102) {
                    System.out.println("Местов нема");
                }

            }
        }
        // Task 7
        int one = 2332;
        int two = 4553;
        int three = 5455474;
        if (three > two) {
            System.out.println("Максимальное число " + three);
        } else {
            if (two > one) {
                System.out.println("Максимальное число " + two);
            } else {
                System.out.println("Максимальное число " + one);
            }
        }




        // условный опертор 2 Задание 1
        int clientOS = 1;
        if (clientOS < 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android  по ссылке");
        }


        //  Задание 2
        int clientOS1 = 0;
        int clientDeviceYear = 2014;
        if (clientOS1 == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else {
            if (clientOS1 == 0 && clientDeviceYear >= 2015) {
                System.out.println("Установите обычную версию приложения для iOS  по ссылке");
            }
            if (clientOS1 == 1 && clientDeviceYear < 2015) {
                System.out.println("Установите облегченную версию приложения для Android  по ссылке");
            } else {
                if (clientOS1 == 1 && clientDeviceYear >= 2015) {
                    System.out.println("Установите обычную версию приложения для Android  по ссылке");
                }
            }
        }


        //  Задание3
        int year = 2024;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year + " год не является високосным");
        }



        // Задание 4
        int deliveryDistance = 95;
        if (deliveryDistance < 20) {
            System.out.println("Потребуются сутки для доставки");
        } else {
            if (deliveryDistance > 21 && deliveryDistance < 60) {
                System.out.println("Потребуется двое суток для доставки");
            } else {
                if (deliveryDistance > 61 && deliveryDistance < 100) {
                    System.out.println("Потребуется трое суток для доставки");
                } else {
                    System.out.println("Досавки нет");
                }
            }
        }


        // Задание 5
        int monthNumber  = 13;
        switch (monthNumber ) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


        // Циклы Task 1.

        for(int i = 1; i < 11; i++){
            System.out.println("Итерация цикла " + i);
        }


        //Task 2
        for(int i = 10; i > 0; i--) {
            System.out.println("Итерация цикла " + i);
        }


        // Task 3
        for(int i = 0; i < 17 ; i = i + 2) {
            System.out.println("Итерация цикла " + i);
        }


        // Task 4
        for(int i = 10; i > -10; i--) {
            System.out.println("Итерация цикла " + i);
        }


        //Task 5
        for(int i = 1904; i < 2096 ; i = i + 4) {
            System.out.println(i + " високосный год" );
        }


        //Task 6
        for(int i = 7; i <= 98 ; i = i + 7) {
            System.out.println("Итерация цикла " + i);
        }




        //Task 7
        for(int i = 1; i <= 512 ; i = i * 2) {
            System.out.println("Итерация цикла " + i);
        }


    }
}

















