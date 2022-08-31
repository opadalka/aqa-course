package main;

public class Main {

    /*
        someMethod();
        someMethod("new string", 1, true);

        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();

         A.smth -> B
         C.smth -> smth v2.0
         C -> D smth2.0
         D.smth2.0

        a.smth();
        b.smth();
        c.smth();
        d.smth();
     */

    /*
    MyObject objectOne = new MyObject();
        MyObject objectTwo = new MyObject();

        objectOne.increase();
        objectTwo.decrease();

        objectOne.mySecondObject.decrease();
        objectOne.mySecondObject.decrease();

        objectTwo.mySecondObject.increase();
        objectTwo.mySecondObject.increase();

        System.out.println(objectOne.index);
        System.out.println(objectOne.mySecondObject.innerIndex);
        System.out.println(objectTwo.index);
        System.out.println(objectTwo.mySecondObject.innerIndex);

        try {
            objectOne.stackedMethod();
        } finally {
            System.out.println("This code is always executed");
        }

        System.out.println("after exception");
     */

    public static void main(String... args) throws InterruptedException {
        MyConditionalClass myConditionalClass = new MyConditionalClass();
//        myConditionalClass.myConditionTest("a");
//        myConditionalClass.myConditionTest("aa");
//        myConditionalClass.myConditionTest(null);

//        myConditionalClass.complicateCounter(99);
//        myConditionalClass.complicateCounter(9000);

//        myConditionalClass.whileCycle(16);
        myConditionalClass.switchAction("a");
        myConditionalClass.switchAction("c");
        myConditionalClass.switchAction("d");
    }


    public static void someMethod() {
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