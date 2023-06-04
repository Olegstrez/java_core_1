package ru.geekbrains.lesson1.sample;

import ru.geekbrains.lesson1.regular.Decorator;
import ru.geekbrains.lesson1.regular.otherclass;

public class Main {

    public static void main(String[] args) {

        int result = otherclass.add(2,3);
        System.out.println(Decorator.decorate(result));
        result = otherclass.div(3,3);
        System.out.println(Decorator.decorate(result));
        result = otherclass.mul(3,1);
        System.out.println(Decorator.decorate(result));
        result = otherclass.sub(3,3);
        System.out.println(Decorator.decorate(result));

    }
}
