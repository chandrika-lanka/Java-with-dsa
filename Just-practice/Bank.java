import java.util.*;
class ATM{
        Scanner sc = new Scanner(System.in);
        long pinnumber;
        long amount;
        long[] pin_number = {1234, 1245, 1256, 1267};
        long[] Account_number;
        long Account_num;
        

    void action(){
                System.out.println(" Select the action: ");        
        }
    }
class withdraw extends ATM{
    withdraw(boolean status){
        System.out.println(" Enter the amount");
        amount = sc.nextInt();
       
        if (amount >0){
            System.out.println("Enter the pin: ");
            pinnumber = sc.nextInt();
            for (int i = 0; i< pin_number.length; i++){
                if (pin_number[i]== pinnumber){
                    status = true;
                }
            }
            if (status==true){
                System.out.println("The money is debited");
            }
            else {
                System.out.println("Entered invalid pin");
            }
        }else {
            System.out.println("The is invalid");
        }
    }
}
class Credit extends ATM{
    Credit(boolean status){
        System.out.println("Enter the amount: ");
        amount = sc.nextInt();
        
        if (amount>0){
            System.out.println("Enter the pin: ");
            pinnumber = sc.nextInt();
            for (int i = 0; i< pin_number.length; i++){
                if (pin_number[i] == pinnumber){
                    status = true;
                }
            }
            if (status == true){
                System.out.println("Amount is credited");
            }
            else {
                    System.out.println("Entered pin is invalid");
                }
        }else {
            System.out.println("Entered the wrong amount ");
        }
    }
}
class ChangePin extends ATM{
    ChangePin(boolean status){
        System.out.println("Enter the new pin pin: ");
        long newpin = sc.nextInt();
        for (int i = 0; i<pin_number.length;i++){
            if (pin_number[i] == newpin){
                status = false;
            }
        }
        if (status == false){
            System.out.println("The new pin can't be same as old pin");
        }else {
            System.out.println("The pin has been changed");
        }
    }
}
class Bank{
    public static void main(String[] args){
        // ATM atm;
        ATM atm = new ATM();
        Scanner sc = new Scanner(System.in);
        long[] Account_number = {123456789, 123456780, 123456788, 123456777};
        
        System.out.println("Enter the Account_number: ");
        
        long Account_num = sc.nextLong();
        boolean status = false;
        for (int i = 0; i<Account_number.length; i++){
            if (Account_number[i] == Account_num){
                status = true;
            }
        }
        if (status == true){
            atm.action();
                System.out.println("1. Withdraw");
                System.out.println("2. Credit");
                System.out.println("3. ChangePin");
                int choice = sc.nextInt();
                switch(choice){
                    case 1:
                        atm = new withdraw(status);
                        break;
                    case 2:
                        atm = new Credit(status);
                        break;
                    case 3: 
                        atm = new ChangePin(status);
                        break;
                    default: 
                        System.out.print("Invalid");
                        break;
                } 
        }else{
            System.out.println("Enter the valid Account Number");
        }
    sc.close();
}
}
