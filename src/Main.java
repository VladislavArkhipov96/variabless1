//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.


        //task1
        System.out.println("task1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task2
        System.out.println("task2");
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //task3
        System.out.println("task3");
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;

        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        //task4
        System.out.println("task4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        //task5
        System.out.println("task5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        //task6
        System.out.println("task6");
        var weightBoxer = 78.2;
        var weightBoxer2 = 82.7;
        var sum = weightBoxer + weightBoxer2;
        var diff = weightBoxer2 - weightBoxer;
        System.out.println("сумма" + sum);
        System.out.println("разница" + diff);

        //task7
        System.out.println("task7");
        var diff1 = weightBoxer2 % weightBoxer;
        System.out.println("остаток от деления" + diff1);

        //task8
        System.out.println("task8");
        var worksHours = 640;
        var hoursPerEmployee = 8.0;

        var countOfEmployee = worksHours / hoursPerEmployee;
        System.out.println("Всего работников в компании — " + countOfEmployee + " … человек");

        countOfEmployee = countOfEmployee + 94;
        var newWorsHours = countOfEmployee * hoursPerEmployee;

        System.out.println("Если в компании работает " + countOfEmployee + " человек, " +
                "то всего " + newWorsHours + " часов работы может быть поделено между сотрудниками");
    }

}
