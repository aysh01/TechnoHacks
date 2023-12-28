import java.util.*;

class simple {
    void simple() {
        System.out.println(
                "-======-----------======\n Welcome, To Our World Famous Simple - To - Do List App..\n-======-----------======");
    }
}

class add extends simple {
    static int value;

    void display() { // Add Items in the List
        System.out.println("1. Add ..");
        // display();
    }

    void value(int x) {
        this.value = x;
    }
}

class remove extends add { // Remove Items from the List
    void remove() {
        System.out.println("2. Remove ..");
    }
}

class view extends remove { // View Items in the List
    void view() {
        System.out.println("3. View ..");
    }
}

public class Simple__To_Do_List extends view {
    public static void main(String[] args) {
        Scanner S = new Scanner(System.in);
        Random rd = new Random();
        String[] list = new String[10];
        Simple_To_Do_List sim = new Simple_To_Do_List();

        sim.simple();
        System.out.println("What Would You Like To Do...?");
        sim.display(); // 1. Add Items in the List
        sim.remove(); // 2. Remove Items from the List
        sim.view(); // 3. View Items in the List

        for (int i = 0; i < list.length; i++) {
            list[i] = ""; // Initialize each element with an empty string
        }
        int itemCount = 0;

        while (true) {
            System.out.println("Add, Remove or View Items ?");
            String input = S.next(); // Select Operation

            if (input.toLowerCase().equals("add")) {
                if (itemCount < list.length) {
                    System.out.print("Enter item to add: ");
                    String add = S.next();

                    if (!add.isEmpty()) {
                        list[itemCount] = add;
                        itemCount++;
                        System.out.println("List Updated..");
                    } else {
                        System.out.println("Item cannot be empty. Please enter a valid item.");
                    }
                }
            } else if (input.toLowerCase().equals("remove")) {
                if (itemCount == 0) {
                    System.out.println("The, List is Already Empty..\nKindly, Insert Elements..");
                    continue;
                } else if (itemCount == list.length) {
                    System.out.println("The, List is Already Empty..\nKindly, Insert Elements..");
                    continue;
                } else {
                    // int random_element = rd.nextInt(list.length);
                    System.out.println(
                            "Do, You Want to Remove \n-======-----------======or \nYour Specified Element..?");
                    System.out.println("Type Specified..");
                    String index__remove = S.next(); // User Input - Random / Specified
                    if (index__remove.toLowerCase().equals("specified")) {
                        System.out.print("Enter index of item to remove: ");
                        int remove = S.nextInt();// User Specified - Input..
                        for (int x = remove; x < list.length - 1; x++) {
                            list[x] = list[x + 1];
                            itemCount--;
                            break;
                        }
                    } else {
                        System.out.println("Wrong - Input");
                        // System.out.println("TRY AGAIN..");
                        continue;
                    }
                }
                continue;
            } else if (input.equalsIgnoreCase("view")) {
                if (itemCount == 0) {
                    System.out.println("The, List is Already Empty..\nKindly, Insert Elements..");
                    continue;
                } else {
                    System.out.println("Your list of items:");
                    for (int i = 0; i < itemCount; i++) {
                        System.out.println((i + 1) + ". " + list[i]);
                    }
                }
            } else {
                System.out.println("Wrong - Input");
                System.out.println("TRY AGAIN..");
                continue;
            }
        }
    }
}
