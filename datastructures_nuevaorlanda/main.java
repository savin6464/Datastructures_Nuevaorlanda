import java.util.Scanner;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

public class Main {

    // --- 5. Tree (Binary Search Tree - Custom Class) ---
    // This custom class is used to demonstrate the hierarchical structure.
    static class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;

        public TreeNode(int data) {
            this.data = data;
        }

        public void insert(int value) {
            if (value < this.data) {
                if (this.left == null) this.left = new TreeNode(value);
                else this.left.insert(value);
            } else if (value > this.data) {
                if (this.right == null) this.right = new TreeNode(value);
                else this.right.insert(value);
            }
        }
    }
    // ----------------------------------------------------


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";

        // Main program loop
        while (true) {
            displayMenu();
            System.out.print("\nEnter your choice (1-5) or 'exit' to quit: ");
            choice = scanner.nextLine().trim().toLowerCase();

            if (choice.equals("exit")) {
                System.out.println("\nShutting down the Data Structures Demo. Goodbye!");
                break;
            }

            switch (choice) {
                case "1": showArrayListDemo(scanner); break;
                case "2": showLinkedListDemo(scanner); break;
                case "3": showStackDemo(scanner); break;
                case "4": showQueueDemo(scanner); break;
                case "5": showTreeDemo(scanner); break;
                default:
                    System.out.println("Invalid choice. Please select 1, 2, 3, 4, 5, or 'exit'.");
                    break;
            }
        }
        scanner.close();
    }
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void displayMenu() {
        System.out.println("\n" + "=".repeat(40));
        System.out.println("      DATA STRUCTURES INTERACTIVE DEMO");
        System.out.println("=".repeat(40));
        System.out.println("1. Array List (ArrayList)");
        System.out.println("2. Linked List (LinkedList)");
        System.out.println("3. Stack (LIFO)");
        System.out.println("4. Queue (FIFO)");
        System.out.println("5. Tree (Binary Search Tree)");
    }

    // --- DEMO METHODS ---

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void showArrayListDemo(Scanner scanner) {
        System.out.println("\n--- 1. Array List (Dynamic Array) Demo ---");
        System.out.println("Function: Fast O(1) random access, but slow O(N) middle insertions/deletions.");

        // Demonstration code
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dog");
        arrayList.add("Cat");
        arrayList.add("Bird");

        System.out.println("\n// Array List in Java (ArrayList<String>)");
        System.out.println("Current List: " + arrayList);
        System.out.println("// O(1) Access: Getting element at index 1");
        System.out.println("Element at index 1: " + arrayList.get(1));

        System.out.println("// O(N) Insertion: Inserting 'NEW' at index 1 (requires shifting 'Cat' and 'Bird')");
        arrayList.add(1, "NEW");
        System.out.println("After Insertion: " + arrayList);

        waitForExit(scanner);
    }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void showLinkedListDemo(Scanner scanner) {
        System.out.println("\n--- 2. Linked List (Node-Based) Demo ---");
        System.out.println("Function: Efficient O(1) insertions/deletions at the ends, but slow O(N) access.");

        // Demonstration code
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addFirst("Z");
        linkedList.addFirst("Y");
        linkedList.addLast("A");

        System.out.println("\n// Linked List in Java (LinkedList<String>)");
        System.out.println("Current List: " + linkedList);
        System.out.println("// O(1) Insertion: Inserting 'X' at the head");
        linkedList.addFirst("X");
        System.out.println("After addFirst: " + linkedList);

        System.out.println("// O(1) Deletion: Removing from the head");
        String removed = linkedList.removeFirst();
        System.out.println("Removed Head: " + removed);
        System.out.println("Current List: " + linkedList);

        System.out.println("// O(N) Access: To get element at index 1, the list must traverse from the start.");
        System.out.println("Element at index 1: " + linkedList.get(1));

        waitForExit(scanner);
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void showStackDemo(Scanner scanner) {
        System.out.println("\n--- 3. Stack (LIFO) Demo ---");
        System.out.println("Function: Last-In, First-Out (LIFO). All operations happen at the 'Top'.");

        // Demonstration code
        Stack<Integer> stack = new Stack<>();

        System.out.println("\n// Stack in Java (Stack<Integer>)");
        System.out.println("// PUSH (O(1)): Adding items to the Top");
        stack.push(10); // First in
        stack.push(20);
        stack.push(30); // Last in
        System.out.println("Stack: " + stack);

        System.out.println("// POP (O(1)): Removing the last item added");
        int lastIn = stack.pop();
        System.out.println("POPped (Last-In): " + lastIn);

        System.out.println("// PEEK (O(1)): Viewing the new top element");
        System.out.println("New Top (PEEK): " + stack.peek());

        System.out.println("Stack remaining: " + stack);

        waitForExit(scanner);
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void showQueueDemo(Scanner scanner) {
        System.out.println("\n--- 4. Queue (FIFO) Demo ---");
        System.out.println("Function: First-In, First-Out (FIFO). Items added at Rear (offer), removed from Front (poll).");

        // Demonstration code
        Queue<String> queue = new LinkedList<>(); // LinkedList implements the Queue interface

        System.out.println("\n// Queue in Java (implemented by LinkedList)");
        System.out.println("// OFFER (Enqueue, O(1)): Adding items to the Rear");
        queue.offer("Print Job 1"); // First in
        queue.offer("Print Job 2");
        queue.offer("Print Job 3"); // Last in
        System.out.println("Queue: " + queue);

        System.out.println("// POLL (Dequeue, O(1)): Removing the first item added");
        String firstIn = queue.poll();
        System.out.println("POLLed (First-In): " + firstIn);

        System.out.println("// PEEK (O(1)): Viewing the new front element");
        System.out.println("New Front (PEEK): " + queue.peek());

        System.out.println("Queue remaining: " + queue);

        waitForExit(scanner);
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    private static void showTreeDemo(Scanner scanner) {
        System.out.println("\n--- 5. Tree (Binary Search Tree) Demo ---");
        System.out.println("Function: Hierarchical structure, great for fast O(log N) searching and sorting.");

        // Demonstration code
        TreeNode root = new TreeNode(50);
        root.insert(30);  // Left Subtree
        root.insert(70);  // Right Subtree
        root.insert(20);
        root.insert(40);

        System.out.println("\n// Tree Structure (TreeNode)");
        System.out.println("Inserting: 50, 30, 70, 20, 40 (Respects BST Rule: Left < Parent < Right)");
        System.out.println("Root Node: " + root.data);
        System.out.println("Root's Left Child (less than 50): " + root.left.data + " (30)");
        System.out.println("Root's Right Child (greater than 50): " + root.right.data + " (70)");
        System.out.println("30's Left Child (less than 30): " + root.left.left.data + " (20)");
        System.out.println("This structure allows for fast searching by eliminating half the data at each step.");

        waitForExit(scanner);
    }

///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // Utility function to handle the 'exit' loop
    private static void waitForExit(Scanner scanner) {
        System.out.println("\n" + "-".repeat(40));
        System.out.println("Type 'exit' to return to the main menu.");
        String input;
        do {
            System.out.print("> ");
            input = scanner.nextLine().trim().toLowerCase();
        } while (!input.equals("exit"));
        System.out.println("-".repeat(40) + "\n");
    }
}