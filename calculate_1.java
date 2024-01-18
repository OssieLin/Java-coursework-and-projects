import java.util.*; 
public class calculate_1{ 
public static void main(String args[]){ 
  int n1, n2, n3, n4, n6,n7,n8;
  double n5;
  Scanner keyb;
  String msg1, msg2, msg3, msg4,msg5,msg6;
  keyb = new Scanner(System.in);//產生Scanner物件 
  System.out.println("Please type in an integer:");//printf()
  n1 = keyb.nextInt();//scanf()
  System.out.println("Hi, please type in another integer:");
  n2 = keyb.nextInt();
  System.out.println("Calculating!");
  n3 = n1+n2;
  n4 = n1-n2;
  n5 = n1/n2;
  n6 = n1%n2;
  n7 = n1*n1;
  n8 = n2*n2;
  msg1="Integer1 + Integer2="+n3;
  msg2="Integer1 - Integer2="+n4; 
  msg3="Integer1 / Integer2="+n5;
  msg4="The remainder of Integer1 / Integer2="+n6;
  msg5="Square of integer 1 is "+n7;
  msg6="Square of integer 2 is "+n8;
  System.out.println(msg1);
  System.out.println(msg2);
  System.out.println(msg3);
  System.out.println(msg4);
 System.out.println(msg5);
 System.out.println(msg6);
 }//main()
}//class
