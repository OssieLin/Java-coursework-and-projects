import java.util.Scanner;
import java.util.Random;
public class phrase{
public static void main(String []args){

//the random number generator with no duplicated 

Random random=new Random();
int[]a=new int[5];
int number;

	for (int i=0; i<a.length; i++){

	a[i]=random.nextInt(5);

 for(int j=0; j<i;j++){
 if(a[i]==a[j]){

i--;
break;

}//if
}//for2
}//for1


String ans,ques;
String [] p={"under the weather", "hit the sack", "break a leg", "call it a day", "better late than never"};//p stands for problems 
String [] h={"sick", "take a nap", "good luck", "finish a work", "doing it is better than not doing it at all"};
System.out.println("This is a game that helps you with your English phrases.");


Scanner str = new Scanner(System.in);
		
		
	for (int i=0;i<5;i++){
	
String q=p[a[i]];//using q to replace p[a[i]]
String d=h[a[i]];//using d to replace h[a[i]]


System.out.println(i+"."+"The meaning of the phrase is "+ d+"."+" The first character and the last one is "+q.charAt(0)+"..."+q.charAt(q.length()-1));
ans=str.nextLine();

if(ans.equals(q)){
System.out.println("Congrats!");
}

}//for i


}//main
}//class