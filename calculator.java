import java.util.*;

//Calculator App
class amount {
    static int x, y;
    static String op;

    public void welcome() {
        System.out.println(
                "-======-----------======\n Welcome, To Our World Famous Calculator App..\n-======-----------======");
        input();
    }

    void input() {
        try {
            Scanner S = new Scanner(System.in);
            System.out.println("Enter First Number: ");
            x = S.nextInt();
            System.out.println("Enter Second Number: ");
            y = S.nextInt();
            System.out.println("Perform Any Operation (+,-,/,*): ");
            op = S.next(); // Operator
        } catch (Exception e) {
        }
    }
}

class calculator extends amount {
    public static void main(String[] args) {
        calculator c = new calculator();
        // c.addition();
        // c.substraction();
        c.welcome();

        if (op.equalsIgnoreCase("+")) {
            System.out.println("You, chose Addition operator (" + op + ").");
            addition();
        } else if (op.equalsIgnoreCase("-")) {
            System.out.println("You, chose Substraction operator (" + op + ").");
            substraction();
        } else if (op.equalsIgnoreCase("*")) {
            System.out.println("You, chose Multiplication operator (" + op + ").");
            multiplication();
        } else if (op.equalsIgnoreCase("/")) {
            System.out.println("You, chose Division operator (" + op + ").");
            division();
        }
    }

    static void addition() {
        int add = x + y;
        System.out.println("|=======================|");
        System.out.println("|     " + x + "     " + op + "     " + y + "     ");
        System.out.println("|=======================|");
        System.out.println("|         =" + add + "            ");
        System.out.println("|=======================|");
    }

    static void substraction() {
        int substract = x - y;
        System.out.println("|=======================|");
        System.out.println("|     " + x + "     " + op + "     " + y + "     ");
        System.out.println("|=======================|");
        System.out.println("|         =" + substract + "           ");
        System.out.println("|=======================|");
    }

    private static void multiplication() {
        int multiply = x * y;
        System.out.println("|=======================|");
        System.out.println("|     " + x + "     " + op + "     " + y + "     ");
        System.out.println("|=======================|");
        System.out.println("|         =" + multiply + "           ");
        System.out.println("|=======================|");
    }

    private static void division() {
        int division = x / y;
        System.out.println("|=======================|");
        System.out.println("|     " + x + "     " + op + "     " + y + "     ");
        System.out.println("|=======================|");
        System.out.println("|         =" + division + "            ");
        System.out.println("|=======================|");
    }
}
