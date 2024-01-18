import java.util.Scanner;
public class hextodec {
 public static void main(String[] args) {
 Scanner input = new Scanner(System.in);
 while (true){
 System.out.print("Enter a Hex number: ");
 String hex = input.nextLine();
 int decimalValue = 0,tmp;//tmp=temporary
 char hexchar;
 for (int i = 0; i < hex.length(); i++) {
     hexchar = hex.charAt(i);
     System.out.println(hexchar);
     //if (hexchar >='A' && hexchar <='F')
     //  tmp= 10+hexchar-'A';
     //else // ch is '0', '1', ..., or '9'
     //  tmp= hexchar-'0'; 
     tmp=(hexchar >='A' && hexchar <='F')?10+hexchar-'A': hexchar-'0';
     decimalValue = decimalValue * 16 + tmp;
  }
 System.out.println("The decimal value for hex number " + hex + " is " +decimalValue);
 if (decimalValue==0) System.exit(-1); 
}//while
// System.out.println("The decimal value for hex number " + hex + " is " + hexToDecimal(hex.toUpperCase()));
 }
 public static int hexToDecimal(String hex) {
 int decimalValue = 0;
 for (int i = 0; i < hex.length(); i++) {
     char hexChar = hex.charAt(i);
     decimalValue = decimalValue * 16 + hexCharToDecimal(hexChar);
     }
  return decimalValue;
 }
 public static int hexCharToDecimal(char ch) {
 if (ch >='A' && ch <='F')
     return 10+ch-'A';
 else // ch is '0', '1', ..., or '9'
     return ch+'0';  
   }
}//class