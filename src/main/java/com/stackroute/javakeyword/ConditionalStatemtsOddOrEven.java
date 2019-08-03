package com.stackroute.javakeyword;

import java.util.Scanner;

public class ConditionalStatemtsOddOrEven
{
    public static void main(String args[]) {
        /*
        Taking local variables
         */
        int num;
        int review;
        char ch;
        System.out.println("Enter number to check even or odd");
        Scanner scanner = new Scanner(System.in);
        num = scanner.nextInt();
        evenOrOddCheck(num);
        feedBackTaking(num);
        /*
        Creating object using Class name
         */
//        ConditionalAndLooping conditionalAndLooping=new ConditionalAndLooping();
//         /*
//         Calling two methods;;;;
//          */
//        conditionalAndLooping.evenOrOddCheck(num);
//        conditionalAndLooping.feedBackTaking(num);


    }
/*
Even or odd checking method
 */
    public static void evenOrOddCheck(int num) {


        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println(num + "Even number");
            } else {
                System.out.println(num + "odd number");
            }
        }
    }
    /*
    Taking feedback from the user
     */
    public static void feedBackTaking(int num)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Plz give feed back 1->Good, 2->Average, 3->Bad");
        num=scanner.nextInt();
        switch (num)
        {
            case 1:
                System.out.println("Thank you");
                break;
            case 2:
                System.out.println("Thank you and we will happy next time");
                break;
            case 3:
                System.out.println("Sorry for this,");
                break;
            default:
                System.out.println("plz enter between 1 And 3");

        }


    }
}

