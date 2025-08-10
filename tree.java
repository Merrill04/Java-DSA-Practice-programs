import java.util.Scanner;

import static java.lang.System.in;

public class tree {

    public static void main(String args[]){
        Scanner sc = new Scanner(in);
        inserttree(sc);
    }

    public static treenode root;

    static void inserttree(Scanner sc){
        System.out.println("Enter value of root node: ");
        int a = sc.nextInt();
        root = new treenode(a);
        populate(sc, root);
    }

    static void populate(Scanner sc, treenode node) {
        System.out.println("Do you want to insert to the left of " + node.data + "? (true/false)");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the element to insert at left of " + node.data + ": ");
            int value = sc.nextInt();
            node.left = new treenode(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to insert to the right of " + node.data + "? (true/false)");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the element to insert at right of " + node.data + ": ");
            int value = sc.nextInt();
            node.right = new treenode(value);
            populate(sc, node.right);
        }
    }

}
