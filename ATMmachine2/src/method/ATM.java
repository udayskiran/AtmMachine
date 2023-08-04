package method;

import java.util.Scanner;

public class ATM {
	private long balance;
	private int pinnumber;
	public ATM() {
        balance = 100000; 
        pinnumber=4545;
    }

    public void checkBalance(Scanner scanner) {
    	System.out.println("Enter any two digit number from 1-100:");
    	int Number=scanner.nextInt();
    	if(Number<100) {
    	   	System.out.println("Enter your pin number:");
        	int Pinnumber=scanner.nextInt();
      
        	if(Pinnumber==pinnumber) {
        		System.out.println("Your balance is: $" + balance);
        		System.out.println("Please Take out your Card..!");
        	}else {
            	System.out.println("Incorrect pin number..");
            }
    	}else {
    		System.out.println("Incorrect Input..");
    	}
  
    }

    public void withdrawAmount(Scanner scanner) {
    	System.out.println("Enter any two digit number from 1-100:");
    	int Number=scanner.nextInt();
    	if(Number<100) {
    		System.out.print("Enter the amount to withdraw: $");
            long amount = scanner.nextInt();
            System.out.println("Enter the pin number:");
            int PInnumber=scanner.nextInt();
            if(PInnumber==pinnumber) {
            	 if (amount <= balance) {
                     balance -= amount;
                     System.out.println("Amount withdrawn: $" + amount);
                     System.out.println("Remaining balance: $" + balance);
                     System.out.println("Please Take out your Card..!");
                 } else {
                     System.out.println("Insufficient funds!");
                 }
            }else {
            	System.out.println("Incorrect pin number..");
            }

    	}else {
    		System.out.println("Incorrect Input..");
    	}
        
    }

    public void depositAmount(Scanner scanner) {
    	System.out.println("Enter your account number:");
    	long AccNum=scanner.nextLong();
    	System.out.println("Re-enter your accoumt number:");
    	long accnum=scanner.nextLong();
    	if(AccNum==accnum) {
    		 System.out.print("Enter the amount to deposit: $");
    	        long amount = scanner.nextInt();

    	        balance += amount;
    	        System.out.println("Amount deposited: $" + amount);
    	        System.out.println("Updated balance: $" + balance);
    	        System.out.println("Please Take out your Card..!");
    	}else {
        	System.out.println("Account numbers mismatched..");
        }
    }
    public void changePin(Scanner scanner) {
    	System.out.println("Enter your old pin number:");
    	int Pinnumber=scanner.nextInt();
    	if(Pinnumber==pinnumber) {
    		System.out.println("Enter new pin number");
    		int PINnumber=scanner.nextInt();
    		System.out.println("Re-Enter pin number");
    		int PINNUMBER=scanner.nextInt();
    		if(PINnumber==PINNUMBER) {
    			System.out.println("Successfully changed your pin number..");
    			System.out.println("Please Take out your Card..!");
    			pinnumber=PINnumber;
    		}else {
    			System.out.println("Pin numbers mismatched.");
    		}
    	}else {
        	System.out.println("Incorrect pin number..");
        }
    }
}
