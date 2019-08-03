package com.stackroute.javakeyword.interfacedemo;
import com.stackroute.javakeyword.interfacedemo.BiycleParts;
public class BicycleImp implements BiycleParts
{
int a;
int b;
    @Override
    public void bySpeed(int a)
    {
      this.a=a;

    }

    @Override
    public void byTime(int b)
    {
        this.b=b;

    }

    @Override
    public String toString() {
        return "BicycleImp{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    public static void main(String args[])
    {
        BicycleImp bicycleImp=new BicycleImp();
        bicycleImp.bySpeed(10);
        bicycleImp.byTime(20);
        System.out.println(bicycleImp.toString());

    }
}
