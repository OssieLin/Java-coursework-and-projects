import java.util.*; 
import java.security.SecureRandom;
public class game_1{ 
public static void main(String args[]){ 
SecureRandom sr= new SecureRandom();
Scanner input = new Scanner(System.in);
int n1=0, n2=0;
int ans=0, score=0, i=1, cnt=0;
String error="";
n1=sr.nextInt(899)+100;
n2=sr.nextInt(100);

while(i<=10){
//i=i+1;
//n1=sr.nextInt(899)+100;
//n2=sr.nextInt(100);
System.out.print("Problem"+i+":"+n1+"-"+n2+"=");
ans = input.nextInt ();
if (ans== n1-n2) {
   score=score+ (10-cnt);
   System.out.println("Correct!"+"Score: "+score);
   n1=sr.nextInt(899)+100;
   n2=sr.nextInt(100);
   cnt=0;
   i=i+1;
   }
 else{
     error=error+"Problem: "+i+" "+n1+"-"+n2+"=\n";
     cnt++;
     System.out.println("Wrong. Score:"+score);
    System.out.println("Answer wrong for "+cnt+" time(s)");
   //i=i+1;
   }
   }//while
   int w=10-cnt;
   double j=w/10;
   System.out.println("Correction rate: "+j);
   System.out.println("Wrong answers: "+error);
 }//main()
}//class
