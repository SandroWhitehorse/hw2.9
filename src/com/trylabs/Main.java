package com.trylabs;

public class Main {

    public static void main(String[] args) {
	double a=123.44444;
	double b=3243.33434;
	double temp=(a+b)/2;
	if (a>=b) {
        a=2*a*b;
        b=temp;
            }
            else
    {
        b=2*a*b;
        a=temp;

    }
System.out.println(a);
	System.out.println(b);

    }
}
