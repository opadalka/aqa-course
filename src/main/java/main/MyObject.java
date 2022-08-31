package main;

public class MyObject {

    public int index = 0;
    public MySecondObject mySecondObject = new MySecondObject();

    public void increase() {
        index = index + 1;
    }

    public void decrease() {
        index = index - 1;
    }

    public void stackedMethod() {
        try {
            System.out.println("this is pre exception");
            innerStackedMethod();
            System.out.println("this is post exception");
        } catch (Throwable e) {
            System.out.println(e.getMessage());
        }
    }

    private void innerStackedMethod() {
        innerExceptionThrower();
    }

    private void innerExceptionThrower() {
        throw new NullPointerException("this is NPE!");
    }
}
