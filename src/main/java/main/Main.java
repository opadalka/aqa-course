package main;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;

public class Main {


    public static void main(String... args) {

        ArrayList<String> stringSet = new ArrayList<>();

        stringSet.add("a");
        stringSet.add("a");
        stringSet.add("a");
        stringSet.add("a");
        stringSet.add("b");

        System.out.println(stringSet.size());
    }

    public static void someMethod() throws FileNotFoundException {
        someMethod("some_string");
    }

    public static void someMethod(String input) {
        someMethod(input, 0);
    }

    public static void someMethod(String input, int amount) {
        someMethod(input, amount, false);
    }

    public static void someMethod(String input, int amount, boolean isTrue) {
        System.out.println(input);
        System.out.println(amount);
        System.out.println(isTrue);
    }

    public static class A {
        public void smth() {
            System.out.println("this is A");
        }
    }

    public static class B extends A {

    }

    public static class C extends B {
        @Override
        public void smth() {
            System.out.println("this is C");
        }
    }

    public static class D extends C {

    }
}