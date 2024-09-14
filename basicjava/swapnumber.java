package co.in.basicjava;

public class swapnumber {
public static void main(String[] args)
{
int a=10;
int b=20;
a=a+b;
b=a-b;
a=a-b;
System.out.println("without using third veriable");
System.out.println("a="+a);
System.out.println("b="+b);
}
}
