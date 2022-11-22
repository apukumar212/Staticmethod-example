package com.pack1;

public class Staticmethod 
{
int a;
static int b;
void meth1() //Normal / Instance / Non-static / concrete method.
{
	System.out.println("meth1() called");
	System.out.println("Instance variable:"+a);
	System.out.println("static variable:"+b);
}
static void meth2() //static method
{
	System.out.println("meth2() called");
	System.out.println("Instance variable:"+new Staticmethod().a);
	System.out.println("static variable:"+b);
}
public static void main(String[] args) 
{
	Staticmethod aobj=new Staticmethod();
	aobj.meth1();
	//Staticmethod.meth1(); //compile time error bcz we cant call non static methods with the class name
	System.out.println("-----------");
	aobj.meth2();
	System.out.println("============");
	Staticmethod.meth2();
	System.out.println("=-=-=-=-=-=-=");
	meth2();
}
}