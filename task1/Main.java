package kz.attractor.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
        Printer.print(cats);

        System.out.println("--------sort by breed---------");

        Comparator<Cat> cmp = Comparator.comparing(Cat::getBreed);
        cats.sort(cmp);
        Printer.print(cats);

        System.out.println("--------sort by breed/second variant---------");

        cats.sort(Cat :: sortByBreed);
        Printer.print(cats);

        System.out.println("--------sort by name--------");

        cats.sort(Cat :: sortByName);
        Printer.print(cats);

        System.out.println("------------sort by age--------------");

        Comparator<Cat> cmp1 = Comparator.comparingInt(Cat::getAge);
        cats.sort(cmp1);
        Printer.print(cats);

        System.out.println("--------sort by color/except silver--------");

        Cat.Color color = Cat.Color.SILVER;
        cats.removeIf(cat -> Cat.isSortedByColor(color, cat));
        Printer.print(cats);

        System.out.println("--------sort by nameLength--------");

        cats.removeIf(Cat :: isSortedByNameLengthEqualsFive);
        Printer.print(cats);




        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        //cats.sort(?);
        //Printer.print(cats);
    }


}
