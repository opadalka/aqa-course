package main;

public class MyConditionalClass {

    public void myConditionTest(String input) {
        if ("a".equals(input)) {
            System.out.println("Input was a!");
        } else {
            System.out.println("Input was not a!");
        }
    }

    public void countTo(int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(i);
        }
    }

    public void complicateCounter(int limit) {
        for (int i = 0; i <= limit; ) {
            if (limit < 100) {
                i += 5;
            } else {
                i += 100;
            }
            System.out.println(i);
        }
    }

    public void whileCycle(int index) {
        do {
            System.out.println(index);
            index++;

            if (index > 100) {
                break;
            }
        } while (index > 15);

        while (index > 15) {
            System.out.println(index);
            index++;

            if (index > 100) {
                break;
            }
        }
    }

    public void switchAction(String input) {
        switch (input) {
            case "a":
                System.out.println("this is a!");
                break;
            case "b":
                System.out.println("this is b!");
                break;
            case "c":
                System.out.println("this is c!");
                break;
            default:
                System.out.println("this it neither a nor b nor c!");
                break;
        }
    }
}
