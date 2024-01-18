import java.util.*;  
class Triangle  
{     
static String triangleType(int a, int b, int c) //function to find type of triangle  
{  
    if (a == b && b == c)  
        return "Equilateral";  
    else if (a == b || b == c || a == c)  
        return "Isosceles";  
    else  
        return "Scalene";  
  
}  
static String angleType(int a, int b, int c) //function to find angle  
{  
int x = a * a;  
int y = b * b;  
int z = c * c;  
if(a>b && a>c) // when largest side is 'a'  
{  
    if(x == y + z)  
    return "right-angled";  
    else if(x < y + z)  
    return "acute-angled";  
    else  
    return "obtuse-angled";  
      
}  
else if(b>a && b>c) // when largest side is 'b'  
{  
   if(y == x + z)  
    return "right-angled";  
    else if(y < x + z)  
    return "acute-angled";  
    else  
    return "obtuse-angled";  
}  
else // when largest side is 'c'  
{  
    if(z == x + y)  
    return "right-angled";  
    else if(z < x + y)  
    return "acute-angled";  
    else  
    return "obtuse-angled";  
  
}  
}  
static void triangle(int a, int b, int c)  
{  
System.out.println("Triangle is " + triangleType(a, b, c)+".");  
System.out.println("Triangle is " + angleType(a, b, c)+".");
}  
                  
public static void main(String[] args)  
{  
    int a, b, c;  
    System.out.println("Enter the sides of triangle: ");  
    Scanner sc = new Scanner(System.in);  
    a = sc.nextInt();  
    b = sc.nextInt();  
    c = sc.nextInt();  
    if(a == 0 || b == 0 || c == 0) // to check whether length of any side is 0 or not  
      System.out.println("Triangle cannot be formed");  
    else  
      triangle(a, b, c);  
int s=(a+b+c);
int k=(a+b+c)/2 ;
System.out.println("Perimeter is: "+s);
double h=k*(k-a)*(k-b)*(k-c);
double X=Math.sqrt(h);
System.out.println("Area is: "+X);
}  
}  
