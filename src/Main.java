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
        System.out.println( "Всего работников в компании-" + employee + "человек");
        var moreemployee = employee + 94;
        System.out.println(moreemployee);
        var newTime = work / moreemployee;
        System.out.println( "Если в компании работает" + moreemployee + "человек, то всего" + newTime + "часов работы может быть поделено между сотрудниками");


    }
}