import java.util.Scanner;
public class comb {
   static int factorial(int n) {
      int fact = 1;
      int i = 1;
      while(i <= n) {
         fact *= i;
         i++;
      }
      return fact;
   }
   public static void main(String args[]) {
   while (true){   

System.out.println("This is a calculator for combination and permutation.");
 int n ,r, comb, per;
System.out.println("Input the total number: ");

Scanner inp=new Scanner(System.in);
n=inp.nextInt();
System.out.println("Input the selected number you want to do: ");
r=inp.nextInt();
      per = factorial(n) / factorial(n-r);
      System.out.println("Permutation: " + per);
      comb = factorial(n) / (factorial(r) * factorial(n-r));
      System.out.println("Combination: " + comb);
}   
}//main

}//class