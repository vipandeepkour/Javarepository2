package mypackagenew;
import java.util.Scanner;
public class Primeornot {
public static void main(String[] args) {
		int input;
						Scanner sc= new Scanner(System.in);
						int counter =0;
						System.out.println("Enter any number:");
						input= sc.nextInt();
						for(int i=1; i<=input; i++)
						{			
							if (input%i==0)
						counter++;
						}
						if (counter ==2)
							System.out.println("Prime");
						else
							System.out.println("Not Prime");
					}
					
	

	}