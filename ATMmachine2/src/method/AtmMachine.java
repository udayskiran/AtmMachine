package method;

import java.util.Scanner;

public class AtmMachine {
	ATM atm = new ATM();
	public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ATM atm = new ATM();
        while (true) {
            displayMenu();
            int option = s.nextInt();

            if (option == 1) {
                atm.checkBalance(s);
            } else if (option == 2) {
                atm.withdrawAmount(s);
            } else if (option == 3) {
                atm.depositAmount(s);
            } else if (option == 4) {
                atm.changePin(s);
            } else if(option==5){
            	System.out.println("Last Transaction is canceled...!");
            }else {
                System.out.println("Invalid option! Please try again.");
            }
            break;
        }
        
    }

    private static void displayMenu() {
    	int pinnum=4545;
    	int acc=12345;
    	long cardNumber=987654321;
    	
    	Scanner s=new Scanner(System.in);
    	System.out.println("Enter the Card Number:");
    	long cardnumber=s.nextLong();
    	System.out.println("Enter your Accoumt Number:");
    	int Acc=s.nextInt();
    	if((cardnumber==cardNumber)&& (Acc==acc)){
    		System.out.println("");
            System.out.println("ATM Demo");
            System.out.println("1. Check Balance");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Deposit Amount");
            System.out.println("4. Change Pin Number");
            System.out.println("5. Cancel Transaction");
            System.out.print("Choose an option: ");
            
    	}else {
    		System.out.println("Invalid Card Number inp or Account number");
    	}
    
    }

}
