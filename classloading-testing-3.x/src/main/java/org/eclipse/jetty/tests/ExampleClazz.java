package org.eclipse.jetty.tests;

public class ExampleClazz
{
    public static void main(String[] args)
    {
        System.out.println("This reports as " + new ExampleClazz());
    }

    @Override
    public String toString()
    {
        return ExampleClazz.class.getName() + "[3.x]";
    }
}
