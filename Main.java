import java.util.Scanner;

public class Main{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        ATM imp = new ATM();
        int choice;
        System.out.print("Enter 1. To check balance  else Enter 2. To withdraw money. 3. Exit");
        choice = sc.nextInt();
        while(true){
            switch(choice){
                case 1:
                    imp.checkbalance();
                    break;

                case 2:
                    imp.withdraw();
                    break;

                default:
                    System.out.println("Invalid input");
            }
        }

    }
}