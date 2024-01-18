import java.util.Scanner;

public class score2{
   public static void main(String[] args){
System.out.println("This is a program that allows you to input a set of scores and in turn shows you some relevant data of the scores. ");

//declartion
int n, max,low, s; //numbers of scores in total, highest score, lowest score, score 
double mean;
int total=0, pass=0, a=0;
String rank1="",rank2="";
Scanner inp=new Scanner(System.in);


do{
System.out.println("Input the numbers of scores you want to calculate:");
n=inp.nextInt();

int []score=new int[n];

for(int i=0;i<=n-1;i++){
System.out.println("Input the score: ");
s=inp.nextInt();
total=total+s;
score[i]=s;
if(s>60){pass=pass+1;}
if(s>90){a=a+1;}

if(s<=100&&s>=0){

switch((s-50)/10){
case 5:
case 4: rank1="A+";break;
case 3: rank1="A" ;break;
case 2: rank1="B" ;break;
case 1: rank1="C" ;break;
case 0: rank1="D"; break;
default:
rank1="E";break;

}//switchcase
System.out.println("The student's grade is "+rank1+".");
}//if

else
System.out.println("N/A");

}//for loop

int tmp;// using to swap two numbers
for(int i=0;i<=n-2;i++){// selection sort
  for(int j=i+1;j<=n-1;j++){
if(score[i]<score[j]){
tmp=score[i];
score[i]=score[j];
score[j]=tmp;
}//if
}//for loop j
}//for loop i

max=score[0];
low=score[n-1];
mean=total/n;

int mean_1=(int)Math.ceil(mean);

switch((mean_1-50)/10){
case 5:
case 4: rank2="A+";break;
case 3: rank2="A" ;break;
case 2: rank2="B" ;break;
case 1: rank2="C" ;break;
case 0: rank2="D"; break;
default:
rank2="E";break;

}//switchcase
for(int i=0;i<=n-1;i++){
System.out.println(score[i]);}
System.out.println(a+","+pass);

System.out.println("Report: ");
System.out.println("Average is "+ mean +".");
System.out.println("\n");
System.out.println("Average is of ABC scale is "+ rank2 +".");
System.out.println("\n");
System.out.println("Highest score is "+ max +".");
System.out.println("\n");
System.out.println("Lowest score is "+low+".");
System.out.println("Rate of people getting A+ is "+ (double)a/n+".");
System.out.println("\n");
System.out.println("Rate of people passing is "+ (double)pass/n+".");
System.out.println("\n");


 System.out.print("Do you want to do another calculation? (yes/no): ");
            String choice = inp.next();

            if (choice.equalsIgnoreCase("no")) {
                System.out.println("Program exited.");
                break;
}

}while(true);//do while

}//main
}//class