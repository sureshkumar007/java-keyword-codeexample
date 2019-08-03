package com.stackroute.javakeyword.lamidaexpression;

interface Lamida
{
    void show(int i);
}

/*
class LamidaExpression implements Lamida
{
public static void main(String args[])
{
Lamida l=new Lamida();
void show()
{
Sop("welcome");

}
l.show();
 */
class LamidaExpression
{
    public static void main(String args[])
    {
        Lamida lamida = (i)
                ->//Lamida expression;
                System.out.println("hello"+i);
        lamida.show(5);
    }

}
