package com.novauc;

public class ATMMenu {

    public void menu() {
        while (true) {
            System.out.println("Hello, what is your name?");

            String name = BankATM.scanner.nextLine();

            if (BankATM.Customs.containsKey("Kevin")) {
                accountOpts();


            } else {
                addUser();
            }


        }

    }
    public void accountOpts(){
        while (true) {
            System.out.println("1.Balance 2.Withdrawl 3. Deposits 4. Delete account");
            String choice = BankATM.scanner.nextLine();
            switch ("choice") {

                case "Balance":
                    getBalance();
                    break;
                case "Withdrawl":
                    getWithdrawl();
                    break;
                case "Depsits":
                    getDeposits();
                    break;
                case "Exit":
                    return;
                default:
                    getInvalid();
                    break;
            }
        }
    }

    public void getBalance(){

    }
    public void getWithdrawl(){

    }
    public  void getDeposits(){

    }

    public  void getInvalid(){

    }
    public void addUser(){

    }
}

