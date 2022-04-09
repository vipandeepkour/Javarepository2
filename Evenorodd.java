package mypackagenew;
import java.util.Scanner;
public class Evenorodd {

	public static void main(String[] args) {
		

System.out.println(" What is  the number?");
int n;
Scanner sc =new  Scanner (System.in);
n= sc.nextInt();
//String result;
if (n%2 == 0)
{
	System.out.println("Number is Even");
	}
	else { System.out.println("Number is odd");
}
/*result = (n %2 == 0)?"Even": "Odd";//ternary operator 
System.out.println(result);*/
	}
	
}
