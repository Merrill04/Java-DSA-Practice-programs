import java.util.Scanner;

public class ATM {
    Scanner sc = new Scanner(System.in);
    int bankbalance;
    int amounttoenter;
    int amounttowithdraw;

    public void checkbalance(){
        System.out.print("Enter your current bank balance: ");
        bankbalance = sc.nextInt();

        if(bankbalance == 0){
            bankbalance = amounttoenter;
            System.out.print("Your current bankbalance is: "+bankbalance);
        }
        else{
            bankbalance = bankbalance+amounttoenter;
            System.out.print("Your current bankbalance is: "+bankbalance);
        }
    }

    public void withdraw(){
        System.out.print("Enter your current bank balance: ");
        bankbalance = sc.nextInt();

        System.out.print("Enter your amount that is to be withdrawn: ");
        amounttowithdraw = sc.nextInt();

        bankbalance = bankbalance-amounttowithdraw;
        System.out.print("The bankbalance after the amount is withdrawn is: "+bankbalance);
    }


}
