package kz.attractor.java;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        var cats = Cat.makeCats(10);
//        Printer.print(cats);
        Comparator<Cat> cmp = Comparator.comparing(Cat::getName);
        cats.sort(cmp);
        Printer.print(cats);


        // А сюда добавьте код, который будет сортировать коллекцию котов
        // используйте лямбда-выражения и ссылки на методы
        //cats.sort(?);
        //Printer.print(cats);
    }


}
