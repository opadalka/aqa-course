package main;

import java.io.FileNotFoundException;

public class Main {

    public static void main(String... args) {
        SystemUser admin = new SystemUser("Admin", 33);
        SystemUser nonAdminUser = new SystemUser("Joanne", 33);
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