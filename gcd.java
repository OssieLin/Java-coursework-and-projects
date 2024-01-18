import java.util.Scanner;
public class gcd{
public static void main(String[]args){

Scanner inp= new Scanner(System.in);

System.out.println("This is a program that helps to find GCD.");

boolean quit=false;
while(true){


int gcd=1, i=1;
System.out.println("Type in two integers to find their greatest common divisor: ");

int n1=inp.nextInt();
int n2=inp.nextInt();
do{

if(n1%i==0 && n2%i==0)
gcd=i;
i++;

}while(i<=n1 && i<=n2);

System.out.println("GCD of "+n1+" and "+n2+" is "+ gcd+".");
}
System.out.println("Type \"quit\" to quit the GCD calculator, otherwise the program will continue on.");
String quitornot=inp.nextLine();

}//main
}//class