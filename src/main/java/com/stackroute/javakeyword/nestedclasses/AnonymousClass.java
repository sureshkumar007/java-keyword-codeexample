package com.stackroute.javakeyword.nestedclasses;

abstract class TestingFile
{
    abstract void clean();
}
public class AnonymousClass
{
    public static void main(String args[]) {


        TestingFile testingFile = new TestingFile() {
            @Override
            void clean() {
                System.out.println("Anonymous class without extending the class");
            }

        };
        testingFile.clean();
    }
}
