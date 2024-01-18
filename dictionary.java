import  java.util.Scanner;
public class dictionary{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
int i=0;
String [] x= {"resilient", "important", "bad", "huge"};
String [] y= {"flexible", "vital", "adverse", "profound"};
System.out.println("This is a program for you to learn synonyms.");
System.out.println("Please type in resilient, important, bad, or huge to get its synonym.");

while(true){
System.out.println("Type a mentioned word:");
String s1=input.nextLine();
if (s1.equals(x[0])){
System.out.println("The synonym for "+x[0]+" is "+y[0]);
}

if (s1.equals(x[2])){
System.out.println("The synonym for "+x[2]+" is "+y[2]);
}

if (s1.equals(x[1])){
System.out.println("The synonym for "+x[1]+" is "+y[1]);
}

if (s1.equals(x[3])){
System.out.println("The synonym for "+x[3]+" is "+y[3]);
}



}

}//main
}//class