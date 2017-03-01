package com.theironyard.novauc;



import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Scanner scannerInt = new Scanner(System.in);
        int balance = 100;
        int withdraw = 100 - 50;
        double take = 50;
        // write your code here

        HashMap<String, Double> bank = new HashMap();
        bank.put("Micheal", new Double(500));
        bank.put("Jeffery", new Double(700));
        bank.put("Jordan", new Double(75));
        bank.put("Junior", new Double(200));


            System.out.println("Hello, how are you? Please enter your name.");
            String name = scanner.nextLine();
            bank.get(name);


            if (bank.containsKey(name)) {
                //name in hash

                System.out.println("Please select following options. 1.balance 2.Withdrawl funds 3 cancel 4 remove Account");


            } else {
                bank.put(name, 100.00);
                System.out.println("For a $100  minimum would you like to open an account?");

            }

            int option = scannerInt.nextInt();


            while (true) {

                switch (option) {
                    case 1:
                        System.out.println("Your balance " + bank);// print specfic name balance
                        break;
                    case 2:
                        System.out.println(("How much would you like to withdraw?"));
                        String money = scanner.nextLine();
                        int withdrawl = Integer.valueOf(money);


                        System.out.println("Thank you, please take your money ");
                        System.out.println("Withdraw money " + withdraw);
                        System.out.println("Your new balance is " + take);
                        break;
                    case 3:
                        System.out.println("Thank you please come again.");


                    case 4:
                        bank.remove(name);
                        System.out.println("Account has been removed");


                }
                break;




            }

        }

    }