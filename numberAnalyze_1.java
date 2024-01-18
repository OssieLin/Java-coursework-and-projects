import java.util.Scanner;

public class numberAnalyze_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueOrNot;
System.out.println("This is a program where you can type in an integer n, and after that it will do a bunch of analysis on the integer n and other numbers as well! Just wait and see.");
        while(true) {
            System.out.print("Enter an integer (n): ");
            int n = scanner.nextInt();
            scanner.nextLine(); 

            if (n <= 0) {
                System.out.println("Invalid input! Please enter a positive integer.");
                continue;
            }

            System.out.println("Prime Factorization Results:");
            for (int i = 2; i <= n; i++) {
                int[] factors = primeFactors(i);
                if (factors.length > 0) {
                    System.out.print(i + ": ");
                    for (int factor : factors) {
                        System.out.print(factor + " ");
                    }
                    System.out.println();
                }
            }

            int sum = sumOfFactors(n);
            System.out.println("Number Analysis of "+n+":");
            System.out.println("Sum of factors: " + sum);

            if (sum < n) {
                System.out.println(n + " is a deficient number.");
            } else if (sum == n) {
                System.out.println(n + " is a perfect number.");
            } else {
                System.out.println(n + " is an abundant number.");
            }

            if (n % 2 == 0) {
                System.out.println(n + " is an even number.");
            } else {
                System.out.println(n + " is an odd number.");
            }
System.out.print("Type \"quit\" to quit the program, otherwise the program will go on.");
                String quit=scanner.nextLine(); 
       if(quit.equalsIgnoreCase("quit")){
	System.out.println("Program exited.");
      continueOrNot=false;
	System.exit(0);
        }

   
    }
   
      
	}

    private static int[] primeFactors(int n) {
        int[] factors = new int[n];
        int index = 0;

        while (n % 2 == 0) {
            factors[index++] = 2;
            n /= 2;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            while (n % i == 0) {
                factors[index++] = i;
                n /= i;
            }
        }

        if (n > 2) {
            factors[index++] = n;
        }

        // Trim the array to the actual number of factors
        int[] trimmedFactors = new int[index];
        System.arraycopy(factors, 0, trimmedFactors, 0, index);

        return trimmedFactors;
    }

    private static int sumOfFactors(int n) {
        int sum = 1;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                if (i == (n / i)) {
                    sum += i;
                } else {
                    sum += (i + n / i);
                }
            }
        }

        return sum;
    }
}//main