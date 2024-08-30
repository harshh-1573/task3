
import java.util.Scanner;

class Atm {

    public float balance;
    private float ammount;

    public void Enter() {
        System.out.println("Enter 1 to Check balance");
        System.out.println("Enter 2 to Deposite money");
        System.out.println("Enter 3 to Widthraw money");
        System.out.println("Enter 4 to Exit");

        int choice;
        Scanner m = new Scanner(System.in);
        choice = m.nextInt();
        //1 System.out.println("Enter your choice"+choice); 
        switch (choice) {
            case 1:
                checkBalance();
                Enter();
                break;
            case 2:
                Deposite(ammount);
                Enter();
                break;
            case 3:
                Widthraw(ammount);
                Enter();
                break;
            case 4:
                Exit();
                break;
        }
    }

    public int checkBalance() {
        System.out.println("your balance is:- " + balance);
        return 0;

    }

    public int Widthraw(float ammount) {
        System.out.println("Enter the money you want widhdraw");
        Scanner Sc = new Scanner(System.in);
        ammount = Sc.nextFloat();
        if (ammount >= balance) {

            balance = balance - ammount;
        } else {
            System.out.println("Your balance is not sufficient");
        }
        return 0;
    }

    public int Deposite(float ammount) {
        System.out.println("Enter the money you want to deposite");
        Scanner sc = new Scanner(System.in);
        ammount = sc.nextFloat();
        balance = balance + ammount;
        return 0;
    }

    public void Exit() {
        System.out.println("Thank you for visiting");
    }
}

public class Bankaccount extends Atm {

    public static void main(String[] args) {
        Bankaccount t = new Bankaccount();
        t.Enter();
    }

}