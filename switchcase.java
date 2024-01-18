import java.util.Scanner;
public class switchcase{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Please type in the number of people in the class: ");
        int x=input.nextInt();
        String rank1="";
        double mean;
        int max=0, total=0;

        for(int i=1;i<=x;i++){
        System.out.println("Input the score of student "+i+".");
        int y=input.nextInt();
        total=total+y;
        max=(max<y)?y:max;
            if(y<=100&&y>=0){

                switch((y-50)/10){
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
        mean=total/x;
        System.out.println("Average is "+ mean +".");

        System.out.println("Highest score is "+ max +".");
    }//main
}//class