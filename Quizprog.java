package mypackagenew;
import java.util.Scanner;
public class Quizprog {
public static void main(String[] args) {
int n;
Scanner sc = new Scanner(System.in );
while (true) {
	System.out.println("Who is the founder of Blue Horizon?");
	System.out.println("1. Jeff Bezoz\n2. Bill Gates\n3.Nadella\n4.Tim Cook\n5. Exit");
	System.out.println("Enter the right answer");

	n=sc.nextInt();
	if(n==1) {
	System.out.println("Well done");
	}

	else if (n==5 ){
		break;
	}

	else {
	System.out.println("Try again");
	}
	}
	}
	
	}

