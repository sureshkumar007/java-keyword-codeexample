package com.stackroute.javakeyword;

public class LoopingStatements
{
public static void main(String  args[])
{
    /*
    Taking numbers from local level
     */
    int num=121;
    int rev=0;
    int number=2;
    int temp=num;
    int j=0;
    System.out.println("Checking reverse number");
    /*
    Reverse the number and palindrome checking
     */
    while(num!=0) {
        rev = rev * 10+ num % 10;
        num = num / 10;
    }
    /*
    comparing palindrome or not
     */
    if(temp==rev)
    {
        System.out.println("palindrome " +rev);
    }
    else {
        System.out.println("not palindrome babai "+rev);
    }
    /*
    Printing table
     */
    for(int i=1;i<=10;i++)
    {

        System.out.println(number+"*"+i+"="+number*i);
    }
    /*
    checking do while condition
     */
    do {
        System.out.println("Thank you babai");
        j++;
        }while(j==1);
    }

}
