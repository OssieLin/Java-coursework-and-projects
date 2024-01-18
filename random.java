import java.util.Random;

class random{
public static void main(String[] args){
Random random=new Random();
int[]a=new int[5];
int number;

	for (int i=0; i<a.length; i++){

	a[i]=random.nextInt(6);

	
	System.out.println(" array with duplicated"+a[i]);

 for(int j=0; j<i;j++){
 if(a[i]==a[j]){

i--;
break;

}//if
}//for2
}//for1

for(int i =0; i < a.length; i++){
System.out.println("without duplicated: "+a[i]);
}

}//main

}//class