import java.util.*;
import java.util.Scanner;
public class loop{
public static void main(String args[]){
int i=0 ;//j=numbers for character, c for space
Scanner input=new Scanner(System.in);

System.out.print("Please input an odd number for the layers of the pyramid:"+'\n');
int x=input.nextInt();

System.out.print("Please type in * or # to decide the types of pyramid you want: "+'\n');
char a=input.next().charAt(0);

System.out.println("Right align(1) or Left align(2)");
int b=input.nextInt();

int k=(x+1)/2;


while (i<k) {
i++; 
int j=0;
while (j<i) { 
j++;
System.out.print(a);
}
System.out.println("");
}//out-while

while (i>1) {
i--; 
int c=0;
while (c<i) { 
c++;
System.out.print(a);
}
System.out.println("");
}//out-while



}//main()
}//class