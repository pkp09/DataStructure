package com.prashant.java8.example;

@FunctionalInterface
public interface MyFirstFunctionalInterface 
{
    public void firstWork();
 
    @Override
    public String toString();                //Overridden from Object class
 
    @Override
    public boolean equals(Object obj);        //Overridden from Object class
}