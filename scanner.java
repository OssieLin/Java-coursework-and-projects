import java.util.*;
import java.util.Scanner;
public class scanner{
public static void main(String args[]){
Scanner input=new Scanner(System.in);
System.out.print("type something"+'\n');
String x=input.nextLine();
System.out.print("You just typed: "+x+'\n');
System.out.print("type an integer:"+'\n');
int y=input.nextInt();
System.out.print("You just typed: "+y);
}//main()
}//class