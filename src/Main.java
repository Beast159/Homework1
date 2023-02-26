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
        friend = friend+2;
        System.out.println(friend);
        friend = friend/7;
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
        System.out.println( "Всего работников в компании " + employee + " человек");
        var moreemployee = employee + 94;
        System.out.println(moreemployee);
        var newTime = work / moreemployee;
        System.out.println( "Если в компании работает " + moreemployee + " человек, то всего " + newTime + " часов работы может быть поделено между сотрудниками");

        byte a = 1;
        System.out.println(a);
        short b = 555;
        System.out.println(b);
        int c = 2000000;
        System.out.println(c);
        long d = 500_000_000L;
        System.out.println(d);
        float e = 31.2f;
        System.out.println(e);
        double f = 555.123456789;
        System.out.println(f);


        byte g = 67;
        System.out.println(g);

        short h = -159;
        System.out.println(h);

        int i = 569;
        System.out.println(i);

        int j = 27897;
        System.out.println(j);

        long k = 987_678_965_549L;
        System.out.println(k);

        float l = 27.12f;
        System.out.println(l);

        double m = 2.786;
        System.out.println(m);



        int teacherLydmilaPavlodna = 23;
        int teacherAnnaSergeevna = 27;
        int teacherEkaterinaAndreevna = 30;
        int sheet = 480;
        int totalStudents = teacherLydmilaPavlodna + teacherAnnaSergeevna + teacherEkaterinaAndreevna;
        System.out.println(totalStudents);
        int sheetsToEach = sheet / totalStudents;
        System.out.println("На каждого ученика рассчитано " + sheetsToEach + " листов бумаги" );


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


        int color = 120;
        int jarsOnOneClass = 2  + 4 ;
        System.out.println(jarsOnOneClass);
        int howClasses = color / jarsOnOneClass;
        System.out.println(howClasses);
        int whiteColor = howClasses * 2;
        System.out.println(whiteColor);
        int brownColor = howClasses * 4;
        System.out.println(brownColor);
        System.out.println("В школе, где " + howClasses + " классов, нужно " + whiteColor + " банок белой краски и " + brownColor + " банок коричневой краски");


        float weightBanana = 5 * 80;
        float weightMilk = 2*105;
        float weightAceCream = 2 * 100;
        float weightEgg = 4 * 70;
        float breakfast = weightBanana + weightMilk + weightAceCream + weightEgg + weightEgg;
        System.out.println("Вес всего завтрака " + breakfast + " грамм");
        float breakfastKg = breakfast / 1000;
        System.out.println("Вес всего завтрака " + breakfastKg + " кг");


        int loseWeightGr = 7 * 1000;
        System.out.println(loseWeightGr);
        int loseWeightSlow = loseWeightGr / 250;
        System.out.println(loseWeightSlow + " дней потребуется на похудение если скидывать по 250 гр в день");
        int loseWeightFast = loseWeightGr / 500;
        System.out.println(loseWeightFast + " дней потребуется на похудение если скидывать по 500 гр в день");
        int loseWeightAverage = loseWeightGr / ((250 + 500) / 2);
        System.out.println(loseWeightAverage + " дней потребуется на похудение в среднем");


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



    }
}
