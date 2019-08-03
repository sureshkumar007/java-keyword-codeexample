package com.stackroute.javakeyword.nestedclasses;

public class InnerClass
{
    private int data=10;
    class InnerClassOfOuterclass
    {
        public void msg()
        {
            System.out.println(data+" Acccesed from the outer class");
        }
    }
    public static void main(String args[])
    {
        InnerClass innerClass=new InnerClass();
        InnerClass.InnerClassOfOuterclass innerClassOfOuterclass=innerClass.new InnerClassOfOuterclass();
        innerClassOfOuterclass.msg();
    }
}
