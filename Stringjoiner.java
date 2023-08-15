package student;

import java.util.Scanner;

public class Stringjoiner {
	public static void main(String[]args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter your first name");
		String firstname=scan.next();
		System.out.println("Enter your second name");
		String secondname=scan.next();
		System.out.println(joinStrings(firstname,secondname));
		
	}

	public static String joinStrings(String str1,String str2)
	{
		return str1+str2;
	}
}
