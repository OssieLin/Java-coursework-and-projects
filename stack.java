import java.util.Stack;
public class stack{
public static void main(String[]args){

Stack<String> stack=new Stack<String>();

//System.out.println(stack.empty());

stack.push("Minecraft");
stack.push("FFVII");
stack.push("NBA 2k");
stack.push("GTA");
stack.push("PUBG");
//using stack.push to input a stack;

stack.pop();
//to remove the top item of the stack;

System.out.println(stack);

String myFavGame=stack.pop();

System.out.println(stack);
System.out.println(stack.peek());
System.out.println(myFavGame);


}
}