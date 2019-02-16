import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Driver {
    //Run this class to begin the quiz
    //Note: each method body contains the answer

    public static void main(String[] args) {
        question0_10(); //correct
        question0_20(); //incorrect. should be runtime.
        question0_21(); //correct
        question1(); //correct
        question2(); //correct
        question3_10(); //correct
        question3_11(); //correct
        question3_20(); //correct
        question3_21(); //correct
        question4(); //correct
        question5(); //correct
        question6(); //correct
        question7(); //correct
        question8(); //correct
        question9(); //correct
        question10(); //correct
        question11(); //runtime (at line 7)
        question12(); //correct

    }












    private static void question0_10() {
        String answer = "compilation";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type2 a = new Type1();");

        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question0_10();
        }

    }

    private static void question0_20() {
        String answer = "runtime";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type2 a = (Type2) new Type1();");

        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question0_20();
        }

    }

    private static void question0_21() {
        String answer = "runtime";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type2 a = (Type2) new Type1();");
        System.out.println("a.method();");

        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question0_21();
        }

    }


    private static void question1() {
        String answer = "compilation";

        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type1 a = new Type1();");
        System.out.println("Type2 b = new Type2();");
        System.out.println("a.method();\n");
        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: the Type1 Class does not have method().");
            pause(3);
            question1();
        }
    }

    private static void pause(int sec) {
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (InterruptedException e) {
            System.out.println("Something went wrong.");
        }

    }

    private static void question2() {
        String answer = "method";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type1 a = new Type1();");
        System.out.println("Type2 b = new Type2();");
        System.out.println("b.method();\n");
        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question2();
        }

    }

    private static void question3_10() {
        String answer = "";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type1 a = new Type1();");
        System.out.println("Type2 b = new Type2();");
        System.out.println("a = (Type1) b;\n");

        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question3_10();
        }

    }

    private static void question3_11() {
        String answer = "compilation";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type1 a = new Type1();");
        System.out.println("Type2 b = new Type2();");
        System.out.println("a = (Type1) b;");
        System.out.println("a.method();");


        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question3_11();
        }

    }

    private static void question3_20() {
        String answer = "runtime";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type1 a = new Type1();");
        System.out.println("Type2 b = new Type2();");
        System.out.println("b = (Type2) a;");


        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question3_20();
        }

    }

    private static void question3_21() {
        String answer = "runtime";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type1 a = new Type1();");
        System.out.println("Type2 b = new Type2();");
        System.out.println("b = (Type2) a;");
        System.out.println("b.method();");


        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question3_21();
        }

    }

    private static void question4() {
        String answer = "";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type1 a = new Type1();");
        System.out.println("Type2 b = new Type2();");
        System.out.println("a = b;\n");

        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question4();
        }

    }

    private static void question5() {
        String answer = "compilation";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type1 a = new Type1();");
        System.out.println("Type2 b = new Type2();");
        System.out.println("b = a;\n");

        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question5();
        }

    }

    private static void question6() {
        String answer = "";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type1 a = new Type1();");
        System.out.println("Type1 b = new Type2();");
        System.out.println("b = a;\n");

        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question6();
        }

    }

    private static void question7() {
        String answer = "compilation";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type1 a = new Type1();");
        System.out.println("Type1 b = new Type2();");
        System.out.println("b = a;");
        System.out.println("b.method();");


        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question7();
        }

    }

    private static void question8() {
        String answer = "runtime";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type1 a = new Type1();");
        System.out.println("Type1 b = new Type2();");
        System.out.println("((Type2) a).method();");


        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question8();
        }

    }

    private static void question9() {
        String answer = "compilation";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type1 a = new Type1();");
        System.out.println("Type1 b = new Type2();");
        System.out.println("b.method();");


        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question9();
        }

    }

    private static void question10() {
        String answer = "runtime";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type1 a = new Type1();");
        System.out.println("Type1 b = new Type2();");
        System.out.println("b = a;");
        System.out.println("((Type2) b).method();");


        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question10();
        }

    }


    private static void question11() {
        String answer = "runtime";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type1 a = new Type1();");
        System.out.println("Type1 b = new Type2();");
        System.out.println("b = (Type2) a;");
        System.out.println("((Type2) b).method();");


        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question11();
        }

    }

    private static void question12() {
        String answer = "compilation";


        pause(2);
        System.out.println("Consider the following code:");
        System.out.println("Type1 a = new Type1();");
        System.out.println("Type1 b = new Type2();");
        System.out.println("a = b;");
        System.out.println("a.method();");


        System.out.println("What would be the output? (If error, state whether it is at 'compilation' or 'runtime')");

        Scanner in = new Scanner(System.in);
        if (in.nextLine().equals(answer)) {
            System.out.println("Correct!");
            return;
        } else {
            System.out.println("Incorrect.");
            System.out.println("Hint: Look in the Type2 Class!");
            pause(3);
            question12();
        }

    }

}
