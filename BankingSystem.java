import java.util.Scanner;
class bankException extends Exception{

}
class Account {
    private int pin;
    int a=10;
    private double balance;
    private double firstdeposit;
    public void setPin(int pin) {
        this.pin = pin;
    }

    int getPin() {
        return pin;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    double getBalance() {
        return balance;
    }

    void setFirstdeposit(double deposit) {
        double balance = 0;
        firstdeposit = balance + deposit;
    }

    double getFirstdeposit() {
        return firstdeposit;
    }
}
    class AccountNo extends Account{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountNo ac = new AccountNo();
        System.out.println("Enter AccountNo. : ");
        int accountno = sc.nextInt();
        System.out.println("Enter 1 to set pin : ");
        System.out.println("Enter 2 to deposit : ");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("Set pin : ");
            int pins = sc.nextInt();
            ac.setPin(pins);
            System.out.println("Enter 0 to exit or enter 1 to deposit money : ");
            int exit = sc.nextInt();
            if (exit == 0) {
                return;
            }
            if (exit == 1) {
                System.out.println("Re-enter your pin number : ");
                int confirmPin = sc.nextInt();
                if (confirmPin == pins) {
                    double dep;
                    System.out.println("Enter your first deposit : ");
                    dep = sc.nextDouble();
                    ac.setFirstdeposit(dep);
                    System.out.println("Enter 1 to view balance or 0 to exit : ");
                    int input = sc.nextInt();
                    if (input == 1) {
                        System.out.println("Your balance is : " + ac.getFirstdeposit());
                    } else if (input == 0) {
                        return;
                    }
                } else {
                    try {
                        throw new bankException();
                    } catch (bankException e) {
                        System.out.println("Wrong pin no.");
                    }
                }
            } else {
                try {
                    throw new bankException();
                } catch (Exception a) {
                    System.out.println("Wrong input.");
                }
            }
        }
            if (num == 2) {
                System.out.println("Enter amount to deposit : ");
                double setbal = sc.nextDouble();
                ac.setBalance(setbal);
                System.out.println("your current balance is : "+ac.getBalance());
            }
    }}
