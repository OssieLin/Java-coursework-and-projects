import java.util.*;
public class score1{
public static void main(String args[]){
 Scanner inp=new Scanner(System.in);
 System.out.print("Please input your Math score:");
 int a=inp.nextInt();
 System.out.print("Please input your Chinese score:");
 int b=inp.nextInt();
 System.out.print("Please input your English score:");
 int c=inp.nextInt();
 System.out.print("Please input your Science score:");
 int d=inp.nextInt();
 String a1,a2,a3,a4="";
 if(a<60)
   a1="MATH Failed TдT";
 else
   a1="MATH Passed:)";
if(b<60)
   a2="CHINESE Failed TдT";
 else
   a2="CHINESE Passed:)";
if(c<60)
   a3="ENGLISH Failed TдT";
 else
   a3="ENGLISH Passed:)";
if(d<60)
   a4="SCIENCE Failed TдT";
 else
   a4="SCIENCE Passed:)";
 int a5=(a+b+c+d);
 double a6=a5/4;
System.out.print("Your total score is "+a5+"."+" Your average is "+a6+"."+"\n");
System.out.print("Result:"+" "+a1+" "+a2+" "+a3+" "+a4+"\n");
if ((a >= b) && (a >= c) && (a >= d))
    System.out.println ("The highest is: " + "Math");
 else if ((b >= c) && (b >= d))    
    System.out.println ("The highest is: " + "Chinese");
 else if ((c >= d))                 
    System.out.println ("The highest is: " + "English");
 else                                 
    System.out.println ("The highest is: " + "Science");
if ((a <= b) && (a <= c) && (a <= d))
    System.out.println ("The lowest is: " + "Math");
 else if ((b <= c) && (b <= d))    
    System.out.println ("The lowest is: " + "Chinese");
 else if ((c <= d))                
    System.out.println ("The lowest is: " + "English");
 else                                 
    System.out.println ("The l#Xowest is: " + "Science");
}//main()
}