package com.fibo;

public class FibonicSeries {
	
	
public static void fiboSeries(int n) {
	int a=0,b=1,c=0;
	
	for(int i=0;i<n;i++) {
		a=b;
		b=c;
		c=a+b;
		System.out.print(c+", ");
		}
	
}
public static void main(String[] args) {
	int n=10;
	fiboSeries(n);
}
}
