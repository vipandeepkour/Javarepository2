package mypackagenew;
import java.util.Scanner;
public class Factorsofn {

	public static void main(String[] args) {
			System.out.println("Enter any number");
					int num;
					Scanner sc= new Scanner(System.in);
					num=sc.nextInt();
					int i;
					System.out.println("Factors of "+num+" are");
					for (i=1;i<=num;i++)
					{
						if(num%i==0)
							System.out.println(i); //+",");
							//System.out.println("Factors are" +i);
						//System.out.println(i);
						
					}
					}
														
			


	}


