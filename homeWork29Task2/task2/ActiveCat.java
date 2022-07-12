package kz.attractor.java;



    // код можно менять только в особо отмеченных местах этого файла.
    // то есть там, где написаны три знака вопроса "???"
    // так же возможно вам понадобится добавить что-то в 
    // блок import и поменять имя пакета
    // в остальных местах этого файла код менять не разрешается.

import java.util.List;
import java.util.Random;

public final class ActiveCat {
    private static final Random r = new Random();
    private static final List<String> names = List.of("Peach", "Ginger", "Toby", "Seth", "Tibbles", "Tabby", "Poppy", "Millie", "Daisy", "Jasper", "Misty", "Minka");
    private final String name;
    
    private ActionableCatable action;

    public ActiveCat(ActionableCatable action) {
        name = names.get(r.nextInt(names.size()));
        this.action = action;
    }

    public final String getName() {
        return name;
    }
    
    public void doAction() {
        System.out.printf("Я %s. %s%n", name, action.perform());
    }

    /*****/
    // Действия доступные для котов

    public static String jump() {
        return "I am jumping!";
    }

    public static String sleep() {
        return "I am sleeping!";
    }

    public static String eat() {
        return "I am eating!";
    }
    public static String robAnotherCat(){
        return "I am robbing another cat!";
    }

    public static String escapePolice(){
        return "I am escaping from police!";
    }
}
